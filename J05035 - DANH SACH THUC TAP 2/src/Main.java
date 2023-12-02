import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
class SV implements Comparable<SV>{
    int stt;
    String msv,ten,lop,mail,dn;
    SV(int stt, String msv, String ten, String lop, String mail, String dn){
        this.stt=stt;
        this.msv=msv;
        this.ten=ten;
        this.lop=lop;
        this.mail=mail;
        this.dn=dn;
    }
    public String toString(){
        return stt + " " + msv + " " + ten +" " + lop +" " + mail + " " + dn;
    }
    public int compareTo(SV other){
        if (this.msv.compareTo(other.msv) >0) return 1;
        else return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        SV [] a = new SV[n];
        for (int i=0;i<n;i++){
            a[i] = new SV(i+1,sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        Arrays.sort(a);
        int q = sc.nextInt();

        while (q-->0){
            String dn = sc.next();
            for (SV x:a){
                if (dn.equals(x.dn)){
                    System.out.println(x);
                }
            }
        }
    }
}