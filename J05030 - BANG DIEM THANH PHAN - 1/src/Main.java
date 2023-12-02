import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
class SV implements Comparable<SV>{
    String msv,ten,lop;
    double d1,d2,d3;
    SV(String msv,String ten,String lop, double d1, double d2, double d3){
        this.msv=msv;
        this.ten=ten;
        this.lop=lop;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
    }
    public int compareTo(SV other){
        if (this.msv.compareTo(other.msv)>0) return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return msv +" " + ten +" " + lop +" " + String.format("%.1f %.1f %.1f",d1,d2,d3);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        SV [] a = new SV[n];
        for (int i=0;i<n;i++){
            String msv = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            double d1= sc.nextDouble();
            double d2=sc.nextDouble();
            double d3= sc.nextDouble();
            sc.nextLine();
            a[i]=new SV(msv,ten,lop,d1,d2,d3);}
        Arrays.sort(a);
        for (int i=0;i<n;i++){
            System.out.print(i+1 +" ");
            System.out.println(a[i]);
        }
    }
}
