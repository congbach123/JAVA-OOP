import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
class DN implements Comparable<DN>{
    String ma, ten ;
    int no;
    DN(String ma, String ten, int no){
        this.ma=ma;
        this.ten=ten;
        this.no=no;
    }
    public String toString(){
        return ma+ " " + ten + " " + no;
    }
    public int compareTo(DN other){
        if (this.no < other.no) return 1;
        else if (this.no == other.no){
            if (this.ma.compareTo(other.ma)>0)
                return 1;
            else return -1;
        }

        else return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        DN [] a = new DN[n];
        for (int i=0;i<n;i++){
            a[i]=new DN(sc.nextLine(), sc.nextLine(), sc.nextInt());
            sc.nextLine();
        }
        Arrays.sort(a);
        for (DN x:a) System.out.println(x);
    }
}