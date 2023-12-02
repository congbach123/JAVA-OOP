import java.util.Scanner;
import java.lang.*;
class MH{
    String ma,ten,dv;
    int nhap,num;
    double phi, tt;
    double ban;
    MH(String ma, String ten, String dv,int nhap, int num){
        this.ma=ma;
        this.ten=ten;
        this.dv=dv;
        this.nhap=nhap;
        this.num=num;
        phi=(1.0*this.nhap * this.num)*0.05;
        phi = Math.round((10*phi)/10);
        tt = this.nhap * this.num + phi;
        tt = Math.round(10*tt/10);
        ban = tt+0.02*tt;
        ban=Math.round(10*ban/10);
    }

    @Override
    public String toString() {
        return ma +" " + ten +" " + dv + " " + (int)phi + " " + (int)tt + " " + (int)ban;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        MH [] a = new MH[n];
        for (int i=0;i<n;i++){
            a[i] = new MH("MH"+String.format("%02d",i+1),sc.nextLine(),sc.nextLine(),sc.nextInt(), sc.nextInt());
            sc.nextLine();
        }
        for (MH x:a) System.out.println(x);
    }
}