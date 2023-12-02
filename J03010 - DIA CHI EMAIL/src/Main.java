import java.util.HashMap;
import java.util.Scanner;
import java.lang.*;
import java.util.Vector;

public class Main {
    static HashMap<String, Integer> mp = new HashMap<>();

    static int cnt=1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String s = sc.nextLine();
            s=s.toLowerCase() +" ";
            String x = "";
            Vector <String> v = new Vector<>();
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)==' '){
                    if (x!=""){
                        v.add(x);
                        x="";
                    }
                }
                else{
                    x+=s.charAt(i);
                }
            }
            String tmp1="";

            for (int i=0;i<v.size()-1;i++){
                tmp1+=v.get(i).charAt(0);

            }
            if (mp.containsKey(tmp1)){
                Integer val = mp.get(tmp1);
                if (val!=null){
                    mp.put(tmp1,val+1);
                }
                else{
                    mp.put(tmp1,1);
                }
            }
            else mp.put(tmp1,1);
            System.out.print(v.get(v.size()-1));
            for (int i=0;i<v.size()-1;i++){
                System.out.print(v.get(i).charAt(0));
            }
            Integer val = mp.get(tmp1);
//            System.out.println(mp);
            if (val>1) System.out.print(val);
            System.out.println("@ptit.edu.vn");

        }
    }
}