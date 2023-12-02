import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
class NV implements Comparable<NV>{
    private Scanner sc = new Scanner(System.in);
    private String mnv,ten,chuc;
    int luong,ngay,phucap,finalSal;
    private int thuong;
    NV(String mnv, String ten, int luong, int ngay, String chuc ){
        this.mnv = mnv;
        this.ten=ten;
        this.luong=luong;
        this.ngay=ngay;
        this.chuc=chuc;
    }
    void nhap(){
        this.luong*=this.ngay;
        if (this.ngay>=25) this.thuong=this.luong*20/100;
        else if (this.ngay<25 && this.ngay>=22) this.thuong=this.luong*10/100;
        else this.thuong=0;



        if (this.chuc.equals("GD")) this.phucap=250000;
        else if (this.chuc.equals("PGD")) this.phucap=200000;
        else if (this.chuc.equals("TP")) this.phucap=180000;
        else this.phucap=150000;
        this.finalSal=this.luong+this.phucap+this.thuong;
    }
    void in(){
        System.out.println(this.mnv+" " + this.ten+" " + this.luong +" " + this.thuong+" " +this.phucap+" " + this.finalSal);
    }
    public int compareTo(NV other){
        if (other.finalSal > this.finalSal) return 1;
        else return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        NV [] a = new NV[n];
        for (int i=0;i<n;i++){

            a[i]= new NV("NV"+String.format("%02d",i+1),sc.nextLine(),sc.nextInt(), sc.nextInt(), sc.next());
            sc.nextLine();
            a[i].nhap();

        }
        Arrays.sort(a);
        for (NV x:a) x.in();
    }
}