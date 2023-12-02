import java.util.Scanner;
import java.lang.*;
class PS{
    long tu,mau;
    private Scanner sc = new Scanner(System.in);
    PS(){
        tu=0; mau=1;
    }

    long gcd(long a, long b){
        if (b==0) return a;
        return gcd(b,a%b);
    }
    void rutgon(){

        long uoc = gcd(this.tu, this.mau);
        this.tu /= uoc;
        this.mau /= uoc;

    }
    void solve(PS other){

        PS p=new PS(),q = new PS();
        p.tu=this.tu*other.mau+this.mau*other.tu;
        p.mau=this.mau*other.mau;
        p.rutgon();
        p.tu*=p.tu;
        p.mau*=p.mau;
        p.rutgon();

        q.tu=this.tu * other.tu * p.tu;
        q.mau = this.mau * other.mau*p.mau;
        q.rutgon();
        System.out.println(p.tu +"/" + p.mau +" "+q.tu+"/"+q.mau);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            PS a = new PS();

            PS b = new PS();
            a.tu=sc.nextLong();
            a.mau=sc.nextLong();
            b.tu=sc.nextLong();
            b.mau=sc.nextLong();


            a.solve(b);
        }
    }
}