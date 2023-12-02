import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
class HS {
    private String name, id;
    private double ave;
    private String rank;
    private int no;
    HS(String id, String name, double ave){
        this.id=id;
        this.name=name;
        this.ave=ave;
        if (this.ave >=9) rank="Gioi";
        else if (this.ave >=7) rank = "Kha";
        else if (this.ave >=5) rank ="Trung Binh";
        else rank = "Yeu";
    }
    public String toString(){
        return id + " " + name + " " + String.format("%.1f",ave) +" " + rank +" " + no;
    }
    void setRank(String rank){
        this.rank=rank;
    }
    String getRank(){
        return rank;
    }
    void setAve(double ave){
        this.ave=ave;
    }
    double getAve(){
        return ave;
    }


    void setNo(int no){
        this.no=no;
    }
    int getNo(){
        return no;
    }
    void setId(String id){
        this.id=id;
    }
    String getId(){
        return id;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HS [] a = new HS [n];
        for (int i=0;i<n;i++){
            a[i] = new HS("HS" + String.format("%02d",i+1), sc.nextLine(), sc.nextDouble());
            sc.nextLine();
        }

        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (a[j].getAve()<a[j+1].getAve()){
                    HS tmp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        int no=1;
        for (int i=0;i<n;i++){
            a[i].setNo(no);
            no+=1;
        }
        for (int i=0;i<n-1;i++){
            if (a[i].getAve() == a[i+1].getAve()){
                a[i+1].setNo(a[i].getNo());
            }
        }
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (a[j].getId().compareTo(a[j+1].getId())>0){
                    HS tmp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        for (HS x:a) System.out.println(x);
    }
}