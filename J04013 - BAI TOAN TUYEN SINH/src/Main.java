import java.util.Scanner;
import java.lang.*;
class SV{
    private String ma,ten,trangthai;
    private double toan,ly,hoa,diem,uutien;
    private Scanner sc = new Scanner(System.in);
    SV(){
        this.ma="";
        this.ten="";
        this.toan=0; this.ly=0; this.hoa=0;
    }
    void nhap(){
        this.ma = sc.nextLine();
        this.ten = sc.nextLine();
        this.toan=sc.nextDouble();
        this.ly=sc.nextDouble();
        this.hoa = sc.nextDouble();
        this.uutien=0;
        if (this.ma.contains("KV3")){
            this.uutien=2.5;
        }
        else if (this.ma.contains("KV2")){
            this.uutien=1.0;
        }
        else{
            this.uutien=0.5;
        }
        this.diem=this.toan*2.0+this.ly+this.hoa+uutien;
        if (diem>=24){
            this.trangthai="TRUNG TUYEN";
        }
        else{
            this.trangthai="TRUOT";
        }
        this.diem=this.toan*2.0+this.ly+this.hoa;
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
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SV p = new SV();
        p.nhap();
        System.out.println(p);
    }
}