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
        for(int i = 0;i< s.length(); i++){
            if(s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' ){

            }
            else{
                System.out.println("NO");
                return;

            }
        }
        System.out.println("YES");
    }
}