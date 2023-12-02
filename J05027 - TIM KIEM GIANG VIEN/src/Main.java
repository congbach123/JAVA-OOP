import java.util.Scanner;
import java.lang.*;
class GV{
    String ma,ten,mon,viettat;
    GV(String ma, String ten, String mon){
        this.ma=ma;
        this.ten=ten;
        this.mon=mon;
    }
    public String toString(){
        return this.ma + " " + ten + " " + viettat;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        GV [] a = new GV[n];
        for (int i=0;i<n;i++){
            a[i]= new GV("GV"+String.format("%02d",i+1),sc.nextLine(), sc.nextLine());
            String [] tmp = a[i].mon.toUpperCase().split(" ");
            String tmp1="";
            for (String x:tmp){
                if (!x.isEmpty()){
                    tmp1+=x.charAt(0);
                }
            }
            a[i].viettat = tmp1;
        }
        int q = sc.nextInt();
        while (q-->0){
            String word = sc.next();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + word +":");
            for (int i=0;i<n;i++){
                if (a[i].ten.toLowerCase().contains(word.toLowerCase())){
                    System.out.println(a[i]);
                }
            }
        }
    }
}