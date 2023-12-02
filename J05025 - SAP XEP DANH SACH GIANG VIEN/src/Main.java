import java.util.ArrayList;
import java.util.Scanner;

class GV{
    String full,mon,ma;
    GV(String ten, String mon,String ma){
        this.full=ten;
        this.mon=mon;
        this.ma=ma;
    }
    public String toString(){
        return ma + " " + full + " " + mon;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        GV[] a = new GV[n];
        ArrayList <String> p = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = new GV(sc.nextLine(), sc.nextLine(),"GV"+String.format("%02d",i+1));
            String[] tmp = a[i].mon.split(" ");
            String tat = "";
            for (String x : tmp) {
                if (!x.isEmpty()) tat += x.charAt(0);
            }
            a[i].mon = tat.toUpperCase();
            String [] ten = a[i].full.split(" ");
            p.add(ten[ten.length-1]);
        }
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (p.get(j).compareTo(p.get(j+1))>0){
                    String tmp = p.get(j);
                    p.set(j,p.get(j+1));
                    p.set(j+1,tmp);
                    GV tmp1=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp1;
                }
                else if (p.get(j).equals(p.get(j+1))){
                    if (a[j].ma.compareTo(a[j+1].ma)>0){
                        GV tmp1=a[j];
                        a[j]=a[j+1];
                        a[j+1]=tmp1;
                    }
                }
            }
        }
        for (GV x:a) System.out.println(x);
    }
}