import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
class MH {
    String ma,ten,dv;
    int mua,ban;
    MH(){
        ma="MH0";
        ten=""; dv="";
        mua=0; ban=0;
    }


    public String toString(){
        return this.ma+" " + this.ten + " " + this.dv +" " + this.mua +" " + this.ban+ " " + (this.ban-this.mua);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        MH [] a = new MH[n];
        for (int i=0;i<n;i++){
            a[i] = new MH();
            if (i<9) a[i].ma = a[i].ma + "0" + String.valueOf(i+1);
            else a[i].ma = a[i].ma +  String.valueOf(i+1);
            a[i].ten=sc.nextLine();
            a[i].dv=sc.nextLine();
            a[i].mua = sc.nextInt();
            a[i].ban= sc.nextInt();
            sc.nextLine();
        }
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++) {
                if (a[j].ban - a[j].mua < a[j + 1].ban - a[j + 1].mua) {
                    MH tmp = new MH();
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
                else if (a[j].ban-a[j].mua == a[j+1].ban-a[j+1].mua){
                    if (a[j].ma.compareTo(a[j+1].ma)>0){
                        MH tmp = new MH();
                        tmp = a[j];
                        a[j]=a[j+1];
                        a[j+1]=tmp;
                    }
                }


            }
        }
        for (MH s:a){
            System.out.println(s);
        }
    }
}