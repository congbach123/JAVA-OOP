import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
class MH implements Comparable<MH>{
    String ma,ten,dv;
    double nhap,num;
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
        ban = Math.round((tt+0.02*tt)/this.num);
        ban = Math.ceil(ban/100.0)*100.0;
    }
    public int compareTo(MH other){
        if (other.ban > this.ban) return 1;
        else return -1;
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
        Arrays.sort(a);
        for (MH x:a) System.out.println(x);
    }
}