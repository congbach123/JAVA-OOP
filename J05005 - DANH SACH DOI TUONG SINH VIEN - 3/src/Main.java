import java.util.Scanner;
import java.lang.*;
import java.util.Vector;

class SV{
    private String msv,ten,lop,ns;
    double gpa;
    SV(){
        msv="";
        ten=""; lop=""; ns="";
        gpa=0.0;
    }
    SV(String msv,String ten, String lop, String ns, double gpa){
        this.msv=msv; this.ten=ten; this.lop=lop; this.ns=ns; this.gpa=gpa;
    }
    public String toString(){
        return this.msv +" " + this.ten + this.lop +" " + this.ns +" " + String.format("%.2f",this.gpa);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        SV [] a = new SV[n];
        for (int i=0;i<n;i++){
            String msv = "B20DCCN0";
            if (i+1<10) msv=msv+"0"+(i+1);
            else msv = msv + (i+1);
            String name = sc.nextLine();
            name = name.toLowerCase();
            String[] ten = name.split("\\s+");
            String finalName="";

            for (int j=0;j< ten.length;j++){
                String x = ten[j];
                if (!x.isEmpty()) {
                    x = x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
                    finalName += x;
                }
            }



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
            a[i] = new SV(msv,finalName,lop,ns,gpa);
        }
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (a[j].gpa < a[j+1].gpa){
                    SV tmp;
                    tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}