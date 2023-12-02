import java.util.Scanner;
import java.lang.*;
class SV{
    String msv,ten,lop,mail;
    SV(String msv, String ten, String lop, String mail){
        this.msv=msv;
        this.ten=ten;
        this.lop=lop;
        this.mail=mail;
    }
    public String toString(){
        return msv +" " + ten + " " + lop + " " + mail;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        SV [] p = new SV[n];
        for (int i=0;i<n;i++){
            String msv = sc.nextLine();
            String ten=sc.nextLine();
            String lop = sc.nextLine();
            String mail = sc.nextLine();
            p[i] = new SV(msv,ten,lop,mail);
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-->0){
            String lop=sc.next();
            System.out.println("DANH SACH SINH VIEN LOP " + lop + ":");
            for (SV x:p){
                if (x.lop.equals(lop)) System.out.println(x);
            }

        }
    }
}