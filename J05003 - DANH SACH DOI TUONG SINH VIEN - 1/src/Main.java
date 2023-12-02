import java.util.Scanner;
import java.lang.*;
class SV{
    private String msv,ten,lop,ns;
    private double gpa;
    SV(){
        msv="";
        ten=""; lop=""; ns="";
        gpa=0.0;
    }
    SV(String msv,String ten, String lop, String ns, double gpa){
        this.msv=msv; this.ten=ten; this.lop=lop; this.ns=ns; this.gpa=gpa;
    }
    public String toString(){
        return this.msv +" " + this.ten +" " + this.lop +" " + this.ns +" " + String.format("%.2f",this.gpa);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        SV [] a = new SV[n+1];
        for (int i=1;i<=n;i++){
            String msv = "B20DCCN0";
            if (i<10) msv=msv+"0"+i;
            else msv = msv + i;
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String ns = sc.nextLine();
            if (ns.charAt(2)!='/'){
                ns="0"+ns;
            }
            if (ns.charAt(5)!='/'){
                ns=ns.substring(0,3)+"0"+ns.substring(3);
            }
            double gpa = sc.nextDouble();
            sc.nextLine();
            a[i] = new SV(msv,name,lop,ns,gpa);
        }
        for (int i=1;i<=n;i++){
            System.out.println(a[i]);
        }
    }
}