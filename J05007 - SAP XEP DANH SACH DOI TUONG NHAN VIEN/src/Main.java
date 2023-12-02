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
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                int d1=Integer.parseInt(a[j].ns.substring(0,2)); int d2=Integer.parseInt(a[j+1].ns.substring(0,2));
                int m1=Integer.parseInt(a[j].ns.substring(3,5)); int m2=Integer.parseInt(a[j+1].ns.substring(3,5));
                int y1=Integer.parseInt(a[j].ns.substring(6)); int y2=Integer.parseInt(a[j+1].ns.substring(6));
                if (y1>y2){
                    NV tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
                else if (y1==y2){
                    if (m1>m2){
                        NV tmp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=tmp;
                    }
                    else if (m1==m2){
                        if (d1>d2){
                            NV tmp=a[j];
                            a[j]=a[j+1];
                            a[j+1]=tmp;
                        }
                    }
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}