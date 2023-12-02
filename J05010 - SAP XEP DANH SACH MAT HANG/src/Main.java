import java.util.Scanner;
import java.lang.*;
class MH{
    int ma;
    String ten,nhom;
    double mua,ban;
    MH(){
        ma=0; ten=""; nhom=""; mua=0;ban=0;
    }
    MH(int ma, String ten, String nhom, double mua, double ban){
        this.ma=ma; this.ten=ten; this.nhom=nhom; this.mua=mua; this.ban=ban;
    }
    public String toString(){
        return ma+" " + ten +" " + nhom +" " + String.format("%.2f",ban-mua);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        MH [] a = new MH[n];
        for (int i=0;i<n;i++){
            String ten = sc.nextLine();
            String nhom=sc.nextLine();
            double mua=sc.nextDouble();
            double ban = sc.nextDouble();
            sc.nextLine();
            a[i] = new MH(i+1,ten,nhom,mua,ban);
        }
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (a[j].ban-a[j].mua < a[j+1].ban-a[j+1].mua){
                    MH tmp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        for (MH x:a) System.out.println(x);
    }
}