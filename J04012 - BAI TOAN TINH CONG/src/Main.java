import java.util.Scanner;

class NhanVien {
    static int id=1;
    String maNhanVien, hoTen ,chucVu;
    int luongCoBan, soNgayCong;
    int luongThang, thuong, phuCap, thuNhap;

    void input(Scanner sc) {
        if(id<10) {
            maNhanVien = "NV0";
        }
        else if(id<100) {
            maNhanVien = "NV";
        }
        maNhanVien+=Integer.toString(id++);
        hoTen = sc.nextLine();
        luongCoBan = sc.nextInt();
        soNgayCong = sc.nextInt();
        luongThang = luongCoBan * soNgayCong;
        if(soNgayCong >=25) {
            thuong = luongThang*20/100;
        }else if(soNgayCong>=22 && soNgayCong<25) {
            thuong = luongThang*10/100;
        }else if(soNgayCong <22) {
            thuong = 0;
        }


        sc.nextLine();
        chucVu = sc.nextLine();
        if(chucVu.equals("GD")) {
            phuCap = 250000;
        }else if(chucVu.equals("PGD")) {
            phuCap = 200000;
        }else if(chucVu.equals("TP")) {
            phuCap = 180000;
        }else if(chucVu.equals("NV")) {
            phuCap = 150000;
        }
        thuNhap = luongThang + thuong + phuCap;
    }

    void output() {
        System.out.printf("%s %s %d %d %d %d\n", maNhanVien, hoTen, luongThang, thuong, phuCap, thuNhap);
    }
}


public class test {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        NhanVien A = new NhanVien();
        A.input(sc);
        A.output();
    }
}