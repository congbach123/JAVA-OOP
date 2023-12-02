import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
class SV{
    String msv,ten,lop,mail;
    SV(String ma, String ten, String lop, String mail){
        this.msv=ma;
        this.ten=ten;
        this.lop=lop;
        this.mail=mail;
    }
    public String toString(){
        return msv +" " + ten + " " + lop +" " + mail;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SV> a = new ArrayList<>();
        while (sc.hasNext()){
            a.add(new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for (int i=0;i<a.size()-1;i++){
            for (int j=0;j<a.size()-i-1;j++){
                if( a.get(j).msv.compareTo(a.get(j+1).msv)>0){
                    SV tmp = a.get(j);
                    a.set(j,a.get(j+1));
                    a.set(j+1,tmp);
                }
            }
        }
        for (SV x:a){
            System.out.println(x);
        }
    }
}