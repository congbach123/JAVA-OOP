import java.util.Scanner;
import java.lang.*;
class SV{
    String ten, ns;
    double d1,d2,d3,d;
    int ma;
    SV(){
        ten=""; ns="";
        d1=0;d2=0;d3=0;
    }
    SV(int ma, String ten, String ns, double d1,double d2, double d3){
        this.ma=ma; this.ten=ten; this.ns=ns; this.d1=d1; this.d2=d2; this.d3=d3;
    }
    public String toString(){
        return ma+ " " + ten+" " + ns +" " + (d1+d2+d3);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        SV [] a = new SV[n];
        for (int i=0;i<n;i++){
            String ten = sc.nextLine();
            String ns = sc.nextLine();
            double d1= sc.nextDouble();
            double d2= sc.nextDouble();
            double d3= sc.nextDouble();
            sc.nextLine();
            a[i]= new SV(i+1,ten,ns,d1,d2,d3);
            a[i].d=a[i].d1+a[i].d2+a[i].d3;
        }
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (a[j].d < a[j+1].d){
                    SV tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        int cnt=1;
        for (int i=1;i<n;i++){
            if (a[i].d==a[0].d) cnt++;
        }
        if (cnt>=2){
            for (int i=0;i<cnt-1;i++){
                for (int j=0;j<cnt-i-1;j++){
                    if (a[j].ma > a[j+1].ma){
                        SV tmp = a[j];
                        a[j] = a[j+1];
                        a[j+1]=tmp;
                    }
                }
            }
            for (int i=0;i<cnt;i++){
                System.out.println(a[i]);
            }
        }
        else{
            System.out.println(a[0]);
        }
    }
}