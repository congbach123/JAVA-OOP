import java.util.Scanner;
import java.lang.*;
class HS{
    String ma,ten;
    double d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,tb;
    HS(String ma, String ten, double d1, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10){
        this.ma=ma; this.ten=ten;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        this.d4=d4;
        this.d5=d5;
        this.d6=d6;
        this.d7=d7;
        this.d8=d8;
        this.d9=d9;
        this.d10=d10;
    }
    public String toString(){
        if (tb >=9){
            return ma + " " + ten +" " +Math.round(tb*10.0)/10.0 +" " + "XUAT SAC";
        }
        else if (tb>=8 && tb<=8.9){
            return ma + " " + ten +" " + Math.round(tb*10.0)/10.0 +" " + "GIOI";

        }
        else if (tb>=7 && tb<=7.9){
            return ma + " " + ten +" " + Math.round(tb*10.0)/10.0 +" " + "KHA";

        }
        else if (tb>=5 && tb<=6.9){
            return ma + " " + ten +" " + Math.round(tb*10.0)/10.0  +" " + "TB";

        }
        else{
            return ma + " " + ten +" " + String.format("%.1f", tb) +" " + "YEU";

        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HS [] a = new HS[n];
        for (int i=0;i<n;i++){
            String ten = sc.nextLine();
            String ma = "HS" +String.format("%02d",i+1);
            double d1= sc.nextDouble();
            double d2= sc.nextDouble();
            double d3= sc.nextDouble();
            double d4= sc.nextDouble();
            double d5= sc.nextDouble();
            double d6= sc.nextDouble();
            double d7= sc.nextDouble();
            double d8= sc.nextDouble();
            double d9= sc.nextDouble();
            double d10= sc.nextDouble();
            sc.nextLine();
            a[i]=new HS(ma,ten,d1,d2,d3,d4,d5,d6,d7,d8,d9,d10);
            a[i].tb=(d1*2.0+d2*2.0+d3+d4+d5+d6+d7+d8+d9+d10)/12.0;
        }
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (a[j].tb < a[j+1].tb){
                    HS tmp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
                else if (a[j].tb == a[j+1].tb){
                    if (a[j].ma .compareTo(a[j+1].ma)>0){
                        HS tmp = a[j];
                        a[j]=a[j+1];
                        a[j+1]=tmp;
                    }
                }
            }
        }
        for (HS x:a) System.out.println(x);
    }
}