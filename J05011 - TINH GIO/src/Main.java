import java.util.Scanner;
import java.lang.*;
class NET{
    String ma,ten,vao,ra;
    int h,m;
    NET(String ma, String ten, String vao, String ra){
        this.ma=ma;
        this.ten=ten;
        this.vao=vao;
        this.ra=ra;
    }
    public String toString(){
        return ma + "  " + ten +" " + h +" gio " + m +" phut ";
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        NET [] a = new NET[n];
        for (int i=0;i<n;i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String vao = sc.nextLine();
            String ra = sc.nextLine();
            a[i] = new NET(ma,ten,vao,ra);
            int giovao=Integer.parseInt(a[i].vao.substring(0,2));
            int phutvao=Integer.parseInt(a[i].vao.substring(3));
            int giora=Integer.parseInt(a[i].ra.substring(0,2));
            int phutra=Integer.parseInt(a[i].ra.substring(3));
            a[i].m = phutra-phutvao;
            if (a[i].m<0){
                a[i].m+=60;
                a[i].h=giora-giovao-1;
            }
            else{
                a[i].h=giora-giovao;
            }
        }
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (a[j].h < a[j+1].h){
                    NET tmp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
                else if (a[j].h == a[j+1].h){
                    if (a[j].m < a[j+1].m){
                        NET tmp = a[j];
                        a[j]=a[j+1];
                        a[j+1]=tmp;
                    }
                }
            }
        }
        for (NET x:a) System.out.println(x);
    }
}