import java.util.HashSet;
import java.util.Scanner;
import java.lang.*;
class GV{
    String full,mon;
    GV(String ten, String mon){
        this.full=ten;
        this.mon=mon;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        GV [] a = new GV[n];
        for (int i=0;i<n;i++){
            a[i]=new GV(sc.nextLine(), sc.nextLine());
            String[] tmp = a[i].mon.split(" ");
            String tat = "";
            for (String x:tmp){
                if (!x.isEmpty()) tat+=x.charAt(0);
            }
            a[i].mon=tat.toUpperCase();
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-->0){
            String mon = sc.nextLine();

            String [] tmp = mon.split(" ");
            String tat="";
            for (String x:tmp){
                if (!x.isEmpty()){
                    tat+=x.charAt(0);
                }
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + tat.toUpperCase() +":");
            for (int i=0;i<n;i++){
                if (a[i].mon.equals(tat.toUpperCase())){
                    System.out.println("GV"+String.format("%02d",i+1) + " " + a[i].full +" " + a[i].mon);
                }
            }
        }
    }
}