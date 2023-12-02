import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.lang.*;

public class Main {

    static int n;
    static boolean ok;
    public static void sinh(int x[]){
        int i = n;
        while (i>=1 && x[i]==1){
            x[i]=0;
            i--;
        }
        if (i==0) ok=false;
        else{
            x[i]=1;

        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        int [] a = new int[n+1];
        int [] x = new int[n+1];
        for (int i=1;i<=n;i++){
            x[i]=0;
            a[i]=sc.nextInt();
        }
//        Arrays.sort(a);
        ArrayList<String> ar = new ArrayList<>();
        ok=true;
        Vector <Integer> v = new Vector<>();
        while(ok){
            sinh(x);
            String s ="";
            int cnt=0;
            for (int i=1;i<=n;i++){
                if (x[i]==1) cnt++;

            }

            if (cnt>=2){

                for (int i=1;i<=n;i++){
                    if (x[i]==1){
                        v.add(a[i]);

                    }
                }
                if (increase(v)){
                    for (int i=1;i<=n;i++) {
                        if (x[i] == 1) {
                            String tmp = "";
                            tmp = String.valueOf(a[i]);
                            s += tmp + " ";
                        }
                    }
                    ar.add(s);
                }

            }
            v.clear();
        }
        Collections.sort(ar);
        for (String tmp:ar){
            System.out.println(tmp);
        }

    }
    public static boolean increase(Vector<Integer> v){
        for (int i=1;i<v.size();i++){
            if (v.get(i) < v.get(i-1)){
                return false;
            }
        }
        return true;
    }
}