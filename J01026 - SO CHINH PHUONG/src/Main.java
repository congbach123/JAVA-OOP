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
    public static boolean check(long n){
        long sqrt = (long) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        if(check(n)) System.out.println("YES");
        else System.out.println("NO");

    }
}