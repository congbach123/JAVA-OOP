import java.util.Scanner;
import java.lang.*;
class NV{

    String ma,ten,gt,ns,dc,th,ky;
    NV(){
        this.ten=""; this.gt=""; ns=""; dc=""; th=""; ky="";
    }
    NV( String ten, String gt, String ns, String dc, String th, String ky) {

        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.th = th;
        this.ky = ky;
    }
    public NV input(Scanner sc) {


        this.ten = sc.nextLine();
        this.gt = sc.nextLine();
        this.ns = sc.nextLine();
        this.dc = sc.nextLine();
        this.th = sc.nextLine();
        this.ky = sc.nextLine();
        return new NV(this.ten, this.gt, this.ns, this.dc, this.th, this.ky);
    }
    public String toString(){
        return this.ma +" " + this.ten +" " + this.gt +" " + this.ns +" " + this.dc +" " + this.th +" " + this.ky;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        NV [] a = new NV[n];
        for (int i=0;i<n;i++){
            a[i] = new NV();
            a[i].ma=String.format("%05d",i+1);
            a[i].input(sc);
        }
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}