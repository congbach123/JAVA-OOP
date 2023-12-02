import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(solve(s)) System.out.println("YES");
            else System.out.println("NO");

        }
    }
    public static boolean solve(String s){
        for(int i=1;i<s.length();i++){
            if(Math.abs(s.charAt(i) - s.charAt(i - 1)) != 1){
                return false;
            }
        }
        return true;
    }
}