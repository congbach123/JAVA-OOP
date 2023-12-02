import java.util.Scanner;
import java.lang.*;
class Salary{
    String code,name,chuc;
    double phu;
    double sal;
    double days;
    double mainSal,ung,left;
    Salary(String code, String name, String chuc,double sal,double days ){
        this.code=code;
        this.name=name;
        this.chuc=chuc;
        this.sal=sal;
        this.days=days;
        if (this.chuc.equals("GD")) phu=500;
        else if (this.chuc.equals("PGD")) phu=400;
        else if (this.chuc.equals("TP")) phu=300;
        else if (this.chuc.equals("KT")) phu=250;
        else phu=100;

        mainSal=this.sal*this.days;
        if ((phu+mainSal)*2/3<25000) ung=Math.round((phu+mainSal)*2/3/1000)*1000;
        else ung=25000;
        left = mainSal-ung+phu;
    }
    public String toString(){
        return code + " " + name +" " + (int)phu + " " + (int)mainSal +" " + (int)ung +" " + (int)left;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Salary [] a = new Salary[n];
        for (int i=0;i<n;i++){
            a[i]=new Salary("NV"+String.format("%02d",i+1) ,sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble());
            sc.nextLine();
        }
        String chucvu = sc.nextLine();
        for (Salary x:a){
            if (x.chuc.equals(chucvu)) System.out.println(x);
        }
    }
}