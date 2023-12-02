import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
class Product implements Comparable<Product>{
    String name, id;
    long price;
    int num;
    double discount;
    Product(String name, String id, long price, int num){
        this.name=name;
        this.id=id;
        this.price=price;
        this.num=num;
        if (this.id.charAt(this.id.length()-1)=='1'){
            discount=price*50/100.0*num;
        }
        else{
            discount=price*30/100.0*num;

        }
    }
    public int compareTo(Product other){
        return this.id.substring(1,4).compareTo(other.id.substring(1,4));
    }
    public String toString(){
        return name + " " + id + " " + id.substring(1,4) + " " + (int)discount + " " + (int)(price*num-discount);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Product [] a = new Product[n];
        for (int i=0;i<n;i++){
            a[i] = new Product(sc.nextLine(),sc.nextLine(),sc.nextLong(),sc.nextInt());
            sc.nextLine();
        }
        Arrays.sort(a);
        for (Product x:a) System.out.println(x);
    }
}