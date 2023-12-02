import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        String s = sc.next();
        int flag=1,flag2=1;
        int check = 1;
        char b = s.charAt(s.length() - 1);
        char a = s.charAt(5);

        if(s.charAt(s.length()-1) <=  s.charAt(s.length()-2)) {
            check =0;
        }
        if(!(s.charAt(6) > s.charAt(5) &&  s.charAt(6) < s.charAt(7)))
        {
            check =0;
        }
        for(int i=5;i<=7;i++){
            if(s.charAt(i) != a ){
                check =0 ;
            }
        }
        if(s.charAt(s.length()-2) != b){
            check =0 ;
        }
        if(flag == 1) check =1;

        // 3 so = nhau
        for(int i=5;i<s.length();i++){
            if(s.charAt(i) != '6' &&  s.charAt(i) != '8' &&  s.charAt(i) != '.'){
                check =0;
            }
        }

        if(check == 1) System.out.println("YES");
        else System.out.println("NO");


    }
}