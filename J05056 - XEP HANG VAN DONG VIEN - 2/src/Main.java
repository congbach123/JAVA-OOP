import java.util.Scanner;
import java.lang.*;
class VDV{
    String id, name, bod, real, prio, finale;
    String sta,en;
    int rank;
    VDV (String id, String name, String bod, String sta, String en){
        this.id=id;
        this.name=name;
        this.bod=bod;
        this.sta=sta;
        this.en=en;
        int giobatdau=Integer.parseInt(this.sta.substring(0,2));
        int gioketthuc=Integer.parseInt(this.en.substring(0,2));
        int phutbatdau=Integer.parseInt(this.sta.substring(3,5));
        int phutketthuc=Integer.parseInt(this.en.substring(3,5));
        int giaybatdau=Integer.parseInt(this.sta.substring(6));
        int giayketthuc=Integer.parseInt(this.en.substring(6));
        int giayreal, gioreal, phutreal,giayuutien,phutuutien,giouutien,giayfina,giofina,phutfina;
        if (giayketthuc < giaybatdau) {
            giayreal = giayketthuc + 60 - giaybatdau;
            phutketthuc--;
        }
        else     {giayreal = giayketthuc-giaybatdau;
        }
        if (phutketthuc < phutbatdau){
            phutreal = phutketthuc-phutbatdau+60;
            gioketthuc--;
        }
        else phutreal = phutketthuc-phutbatdau;

        gioreal = gioketthuc-giobatdau;
        real = String.format("%02d",gioreal)+":"+String.format("%02d",phutreal)+":"+String.format("%02d",giayreal);
        if (2021 - Integer.parseInt(this.bod.substring(6))>=32){
            giayuutien=3;
            giouutien=0;
            phutuutien=0;
        }
        else if  (2021 - Integer.parseInt(this.bod.substring(6))>=25){
            giayuutien=2;
            giouutien=0;
            phutuutien=0;
        }
        else if  (2021 - Integer.parseInt(this.bod.substring(6))>=18){
            giayuutien=1;
            giouutien=0;
            phutuutien=0;
        }
        else{
            giayuutien=0;
            giouutien=0;
            phutuutien=0;
        }
        prio = String.format("%02d",giouutien)+":"+String.format("%02d",phutuutien)+":"+String.format("%02d",giayuutien);

        if (giayreal < giayuutien) {
            giayfina = giayreal + 60 - giayuutien;
            phutreal--;
        }
        else     {giayfina = giayreal-giayuutien;
        }
        if (phutreal < phutuutien){
            phutfina = phutreal-phutuutien+60;
            gioreal--;
        }
        else phutfina = phutreal-phutuutien;

        giofina = gioreal-giouutien;
        finale =  String.format("%02d",giofina)+":"+String.format("%02d",phutfina)+":"+String.format("%02d",giayfina);
    }
    public String toString(){
        return id + " " + name +" " + real + " " + prio + " " + finale +" " + rank;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        VDV [] a = new VDV[n];
        for (int i=0;i<n;i++){
            a[i]= new VDV("VDV"+String.format("%02d",i+1),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (a[j].finale.compareTo(a[j+1].finale)>0){
                    VDV tmp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        int no=1;
        for (int i=0;i<n;i++){
            a[i].rank=no;
            no++;
        }
        for (int i=0;i<n-1;i++){
            if (a[i].finale.equals(a[i+1].finale)){
                a[i+1].rank=a[i].rank;
            }
        }

        for (VDV x:a) System.out.println(x);
    }
}