import java.math.BigInteger;
import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            BigInteger t1 = sc.nextBigInteger();
            BigInteger t2 = sc.nextBigInteger();
            System.out.println(t1.add(t2));
        }
    }
}