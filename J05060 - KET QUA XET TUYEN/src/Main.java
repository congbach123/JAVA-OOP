import java.util.Scanner;
import java.lang.*;
class XT{
    String id,name,dob;
    double lt,th,bonus,tb;
    String res;
    XT(String id,String name, String dob, double lt, double th){
        this.id=id;
        this.name=name;
        this.dob=dob;
        this.lt=lt;
        this.th=th;
        if (this.lt>=8 && this.th>=8) bonus=1;
        else if (this.lt>=7.5 && this.th>=7.5) bonus=0.5;
        else bonus=0;
        tb=Math.round(((this.lt+this.th)/2 + bonus)/10 * 10);
        if (tb>=10) tb=10;
        if (tb==9 || tb==10) res="Xuat sac";
        else if (tb==8) res="Gioi";
        else if (tb==7) res="Kha";
        else if (tb<=6 && tb>=5) res="Trung binh";
        else res="Truot";
    }
    public String toString(){
        if (tb-(int)tb==0) {
            return id + " " + name + " " + (2021 - Integer.parseInt(dob.substring(6))) + " " + (int) tb + " "+res;
        }
        else{
            return id + " " + name + " " + (2021 - Integer.parseInt(dob.substring(6))) + " " + String.format("%01f",tb) +" " +  res;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        XT [] a = new XT[n];
        for (int i=0;i<n;i++){
            a[i]=new XT("PH"+String.format("%02d",i+1),sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble());
            sc.nextLine();
        }
        for (XT x:a) System.out.println(x);
    }
}