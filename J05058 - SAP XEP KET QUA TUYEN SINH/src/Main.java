import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
class SV implements Comparable<SV>{
    private String ma,ten,trangthai;
    private double toan,ly,hoa,diem,uutien;
    private Scanner sc = new Scanner(System.in);
    SV(String ma, String ten, double toan, double ly, double hoa) {



        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;

        if (this.ma.contains("KV3")) {
            this.uutien = 2.5;
        } else if (this.ma.contains("KV2")) {
            this.uutien = 1.0;
        } else {
            this.uutien = 0.5;
        }
        this.diem = this.toan * 2.0 + this.ly + this.hoa + uutien;
        if (diem >= 24) {
            this.trangthai = "TRUNG TUYEN";
        } else {
            this.trangthai = "TRUOT";
        }
    }
    public String toString(){
        int ck= (int) this.diem;
        if (this.diem-ck==0){
            if (this.uutien==1.0) return this.ma + " " + this.ten + " " + (int)this.uutien +" " +(int)this.diem+" " +this.trangthai;
            else return this.ma + " " + this.ten + " " + this.uutien +" " + (int)this.diem+" "+ this.trangthai;
        }
        else{
            if (this.uutien==1.0) return  this.ma + " " + this.ten + " " + (int)this.uutien+" " + String.format("%.1f",this.diem) +" " + this.trangthai;
            return  this.ma + " " + this.ten + " " + this.uutien+" " + String.format("%.1f",this.diem) +" " + this.trangthai;
        }
    }
    public int compareTo(SV other){
        if (other.diem!=this.diem)
            return Double.compare(other.diem,this.diem);
        else {
            return this.ma.compareTo(other.ma);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        SV [] p = new SV[n];
        for (int i=0;i<n;i++){
            p[i] = new SV(sc.nextLine(), sc.nextLine(), sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
            sc.nextLine();
        }
        Arrays.sort(p);
        for (SV x:p) System.out.println(x);
    }
}