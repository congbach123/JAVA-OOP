import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(solve(n,sc));
        }
    }

    public static String solve(int n, Scanner sc) {
        long[] a = new long[105];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextLong();
        }
        int l=0,r=n-1;
        while(l<r){
            if(a[l] != a[r]){
                return "NO";
            }
            l++;
            r--;
        }
        return "YES";
    }
}