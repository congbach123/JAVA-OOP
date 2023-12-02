import java.util.Scanner;
import java.lang.*;
class SV{
    String msv,ten,lop,mail;
    SV(String ma, String ten, String lop, String mail){
        this.msv=ma;
        this.ten=ten;
        this.lop=lop;
        this.mail=mail;
    }
    public String toString(){
        return msv + " " + ten + " " + lop +" " + mail;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        SV [] a = new SV[n];
        for (int i=0;i<n;i++){
            a[i]=new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-->0){
            String nganh = sc.nextLine();
            nganh=nganh.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + nganh + ":");
            for (SV x:a){
                if (x.lop.charAt(0)=='E' &&(x.msv.charAt(5)=='C'||x.msv.charAt(5)=='A')) continue;
                if (nganh.charAt(0)==x.msv.charAt(5)) System.out.println(x);
            }
        }
    }
}