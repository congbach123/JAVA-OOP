import java.util.Scanner;
import java.lang.*;
class Point3D{
    int x,y,z;
    Point3D(int x, int y, int z){
        this.x=x; this.y=y; this.z=z;
    }
    public static boolean check(Point3D a, Point3D b, Point3D c, Point3D d){ // a=this
        Point3D AB = new Point3D(b.x-a.x, b.y-a.y, b.z-a.z);
        Point3D AC = new Point3D(c.x-a.x, c.y-a.y, c.z-a.z);
        Point3D AD = new Point3D(d.x-a.x, d.y-a.y, d.z-a.z);
        Point3D ABAC=new Point3D (AB.y*AC.z-AC.y*AB.z,AB.z*AC.x-AC.z*AB.x,AB.x*AC.y-AC.x*AB.y);
        int x = (AB.y*AC.z-AC.y*AB.z)*AD.x + (AB.z*AC.x-AC.z*AB.x)*AD.y+(AB.x*AC.y-AC.x*AB.y)*AD.z;
        return x==0;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());

            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
    public static void main4495719(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());

            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
