import java.util.Scanner;
import java.lang.*;
class Elec{
    String type,id;
    double oldNum,newNum;
    double heso;
    double phutroi;
    double price,total;
    Elec(String id,String type, double oldNum, double newNum){
        this.id=id;
        this.type=type;
        this.oldNum=oldNum;
        this.newNum=newNum;
        if (this.type.contains("KD")) heso=3;
        else if (this.type.contains("NN")) heso=5;
        else if (this.type.contains("TT")) heso=4;
        else heso=2;
        price=(this.newNum-this.oldNum)*heso*550;
        if (this.newNum-this.oldNum<50) phutroi=0;
        else if (this.newNum-this.oldNum>=50 && this.newNum-this.oldNum<=100)
            phutroi=Math.round(price/100*35);
        else phutroi=price;

        total=price+phutroi;
    }
    public String toString(){
        return id+" "  + (int)heso + " " + (int) price + " " + (int) phutroi +" " + (int)total;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Elec [] a = new Elec[n];
        for (int i=0;i<n;i++){
            a[i]=new Elec("KH"+String.format("%02d",i+1),sc.nextLine(),sc.nextDouble(),sc.nextDouble());
            sc.nextLine();
        }
        for (Elec x:a) System.out.println(x);
    }
}