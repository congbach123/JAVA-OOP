import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        BigInteger a = sc.nextBigInteger();
        String s = a.toString();
        int n = s.length();
        while (n!=1){
            String tmp1 = s.substring(0,n/2);
            String tmp2=s.substring(n/2);
            BigInteger so1= new BigInteger(tmp1);
            BigInteger so2 = new BigInteger(tmp2);
            a=so1.add(so2);
            System.out.println(a);
            s=a.toString();
            n=s.length();
        }
    }
}