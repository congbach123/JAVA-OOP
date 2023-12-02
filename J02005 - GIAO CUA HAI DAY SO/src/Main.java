import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            int n,m;
            n = sc.nextInt(); m = sc.nextInt();
            solve(n,m,sc);

    }

    public static void solve(int n, int m, Scanner sc) {
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        for(int i=0;i<n;i++){
            int input = sc.nextInt();
            a.add(input);
        }
        for(int i=0;i<m;i++){
            int input = sc.nextInt();
            b.add(input);
        }
        Set<Integer> c = new HashSet<>(a);
        c.retainAll(b);
        List<Integer> res = new ArrayList<>(c);
        Collections.sort(res);
        for(int i : res){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}