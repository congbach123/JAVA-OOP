import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length(), pos=0;
        while (pos<n){
            int last_pos=pos;
            char tmp=s.charAt(last_pos);
            for (int i=pos;i<n;i++){
                if (tmp<s.charAt(i)){
                    tmp=s.charAt(i);
                }
            }
            for (int i=pos;i<n;i++){
                if (tmp==s.charAt(i)){
                    System.out.print(tmp);
                    last_pos=i;
                }
            }
            pos=last_pos+1;
        }
        System.out.println();
    }
}