import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
class Person implements Comparable<Person>{
    String ten,tuoi;
    Person(String ten, String tuoi){
        this.ten=ten; this.tuoi=tuoi;
    }
    public int compareTo(Person other){
        int d1=Integer.parseInt(this.tuoi.substring(0,2));
        int d2=Integer.parseInt(other.tuoi.substring(0,2));
        int m1=Integer.parseInt(this.tuoi.substring(3,5));
        int m2=Integer.parseInt(other.tuoi.substring(3,5));
        int y1=Integer.parseInt(this.tuoi.substring(6));
        int y2=Integer.parseInt(other.tuoi.substring(6));
        if (y1>y2) return 1;
        else if (y1==y2 && m1>m2) return 1;
        else if (y1==y2 && m1==m2 && d1>d2) return 1;
        else return -1;
    }
    public String toString(){
        return this.ten;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Person [] p = new Person[n];
        for (int i=0;i<n;i++){
            String ten = sc.next();
            String tuoi = sc.next();
            p[i]=new Person(ten,tuoi);
        }
        Arrays.sort(p);
        System.out.println(p[n-1]);
        System.out.println(p[0]);

    }
}