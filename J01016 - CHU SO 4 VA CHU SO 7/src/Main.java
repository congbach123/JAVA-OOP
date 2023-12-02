import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        long cnt1 =0, cnt2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '4') cnt1++;
            else if(s.charAt(i)== '7') cnt2++;
        }
        if((cnt1 + cnt2 == 4) || (cnt1 + cnt2 == 7))
            System.out.println("YES");
        else System.out.println("NO");
    }
}