import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.*;
class Product implements Comparable<Product>{
    String id,name;
    double number,price;
    double chietkhau,finalPrice;
    double tienchietkhau;
    Product(String name, int number, int price){
        id="";
        this.name=name;
        this.number=number;
        this.price=price;
        if (this.number>10) chietkhau=0.05;
        else if (this.number<=10 && this.number>=8) chietkhau=0.02;
        else if (this.number<8 && this.number>=5) chietkhau=0.01;
        else chietkhau=0;
        tienchietkhau=this.price * this.number * chietkhau;
        finalPrice=this.price * this.number-tienchietkhau;
    }
    public String toString(){
        return id + " " + name + " " + (int)tienchietkhau +" " + (int)finalPrice;
    }
    public int compareTo(Product other){
        return (int)other.tienchietkhau-(int)this.tienchietkhau;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Product [] a = new Product[n];
        HashMap<String,Integer> mp = new HashMap<>();
        for (int i=0;i<n;i++){
            a[i]=new Product(sc.nextLine(), Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            String [] tmp = a[i].name.toUpperCase().split(" ");
            int cnt=0;

            for (String x:tmp){
                if (!x.isEmpty()){
                    if (cnt==2) break;
                    a[i].id+=x.charAt(0);
                    cnt++;
                }
            }
            if (mp.containsKey(a[i].id)){
                Integer dem = mp.get(a[i].id);
                if (dem!=null) mp.put(a[i].id,dem+1);
                else mp.put(a[i].id,1);
            }
            else mp.put(a[i].id,1);

            a[i].id+=String.format("%02d",mp.get(a[i].id));
        }
        Arrays.sort(a);
        for (Product x:a) System.out.println(x);

    }
}