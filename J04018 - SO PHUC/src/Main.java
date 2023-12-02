import java.util.Scanner;
import java.lang.*;
class SP{
    private int a,b; // a: thuc, b: ao
    SP(){
        a=0; b=0;
    }
    SP(int a, int b){
        this.a = a; this.b=b;
    }
    void solve(SP other){
        SP c = new SP();
        SP d = new SP();
        c.a=this.a*this.a+this.a*other.a-this.b*this.b-this.b*other.b;
        c.b=2*this.a*this.b+this.b*other.a+this.a*other.b;
        if (c.b>0){
            System.out.print(c.a + " + " + c.b+"i, ");
        }
        else{
            System.out.print(c.a + " - " + (-c.b)+"i, ");
        }
        d.a=(this.a+other.a)*(this.a+other.a)-(this.b+other.b)*(this.b+other.b);
        d.b=2*(this.a+other.a)*(this.b+other.b);
        if (d.b>0) {
            System.out.println(d.a + " + " + d.b+"i");
        }
        else{
            System.out.println(d.a +" - " +(-d.b)+"i");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0){
            int a = sc.nextInt(); int b = sc.nextInt();
            SP p1 = new SP(a,b);
            a=sc.nextInt();
            b= sc.nextInt();
            SP p2 = new SP(a,b);
            p1.solve(p2);
        }

    }
}