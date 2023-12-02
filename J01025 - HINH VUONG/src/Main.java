import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            solve(sc);

    }

    public static void solve(Scanner sc) {
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        int a1 = Math.min(x1, x3);
        int a2 = Math.min(y1, y3);
        int b1 = Math.max(x2,x4);
        int b2 = Math.max(y2,y4);

        int side = Math.max((b1 - a1), (b2 - a2));
        System.out.println(side*side);
    }
}