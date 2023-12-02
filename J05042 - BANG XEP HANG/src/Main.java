import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
class Code implements Comparable<Code>{
    String ten;
    int correct, submit;
    Code(String ten, int correct, int submit){
        this.ten=ten;
        this.correct=correct;
        this.submit=submit;
    }
    public int compareTo(Code other) {
        if (this.correct != other.correct) {
            return other.correct - this.correct; // Sắp xếp giảm dần theo số correct
        } else if (this.submit != other.submit) {
            return -other.submit + this.submit; // Nếu correct bằng nhau, sắp xếp giảm dần theo số submit
        } else {
            return this.ten.compareTo(other.ten); // Nếu cả correct và submit đều bằng nhau, sắp xếp theo tên
        }
    }
    public String toString(){
        return ten + " " + correct + " " + submit;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Code [] a = new Code[n];
        for (int i=0;i<n;i++){
            a[i]=new Code(sc.nextLine(),sc.nextInt(),sc.nextInt());
            sc.nextLine();
        }
        Arrays.sort(a);
        for (Code x:a) System.out.println(x);
    }
}