import java.util.Scanner;
import java.lang.*;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        s= s.toLowerCase() +" ";
        String s;
        Vector<String> v = new Vector<>();
        while (sc.hasNext()){
            s = sc.next();
            s=s.toLowerCase();
            v.add(s);
        }

//        String x ="";
//        for (int i=0;i<s.length();i++){
//            if (s.charAt(i)==' '){
//                if (x!=""){
//                    v.add(x);
//                    x="";
//                }
//            }
//            else{
//                x+=s.charAt(i);
//            }
//        }
        int check=1;
        for (String tmp:v){
            if (tmp.charAt(tmp.length()-1)=='?'||tmp.charAt(tmp.length()-1)=='.'||tmp.charAt(tmp.length()-1)=='!'){
                if (check==1){
                    tmp=tmp.substring(0,1).toUpperCase()+tmp.substring(1);}
                tmp=tmp.substring(0,tmp.length()-1);
                if (!tmp.equals("")) System.out.print(tmp);
                System.out.println();
                check=1;

            }
            else {
                if (check == 1) {
                    tmp = tmp.substring(0, 1).toUpperCase() + tmp.substring(1);
                    System.out.print(tmp+" ");
                    check=0;
                }
                else {
                    System.out.print(tmp+" ");
                }
            }
        }
    }
}