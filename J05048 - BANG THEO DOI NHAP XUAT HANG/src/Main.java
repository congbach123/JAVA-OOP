import java.util.Scanner;
import java.lang.*;
class Product{
    double exp, imp;
    String id;
    double price,money,tax;
    Product(String id, double imp){
        this.id=id;
        this.imp=imp;
        if (this.id.charAt(0)=='A') exp=Math.round(0.6*this.imp);
        else if  (this.id.charAt(0)=='B') exp=Math.round(0.7*this.imp);
        if (this.id.charAt(this.id.length()-1)=='Y') price=110000;
        else if (this.id.charAt(this.id.length()-1)=='N') price=135000;
        money=exp*price;
        if (this.id.charAt(0)=='A' &&this.id.charAt(this.id.length()-1)=='Y' ) tax=0.08*money;
        else if (this.id.charAt(0)=='A' &&this.id.charAt(this.id.length()-1)=='N' ) tax=0.11*money;
        else if (this.id.charAt(0)=='B' &&this.id.charAt(this.id.length()-1)=='Y' ) tax=0.17*money;
        else tax=0.22*money;

    }
    public String toString(){
        return id + " " + (int)imp + " " + (int)exp + " " + (int)price +" " + (int)money + " " + (int)tax;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Product [] a = new Product[n];
        for (int i=0;i<n;i++) {
            a[i]=new Product(sc.nextLine(),Double.parseDouble(sc.nextLine()));
        }
        for (Product x:a) System.out.println(x);
    }
}