package test;

import java.util.*;

public class J01022 {
    static long[] F = new long[93];

    public static int Try(int n, long k){
        if(n==1) return 0;
        if(n==2) return 1;
        if(k>F[n-2]) return Try(n-1,k-F[n-2]);
        else return Try(n-2,k);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        F[0]=0;
        F[1]=1;
        for(int i=2;i<93;i++){
            F[i]=F[i-1]+F[i-2];
        }
        while(t-->0){
            int n=in.nextInt();
            long k=in.nextLong();
            System.out.println(Try(n,k));
        }
    }
}