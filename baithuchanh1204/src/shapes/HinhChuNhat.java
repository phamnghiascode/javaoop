package shapes;
import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {
    public float dai, rong;
    public HinhChuNhat()
    {
        ten = "Hinh chu nhat";
    }
    public void nhapChieuDai()
    {
        System.out.println("Chieu dai = ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
        sc.close();
    }
    public void nhapChieuRong()
    {
        System.out.println("Chieu rong = ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
        sc.close();
    }
    public void tinhChuVi(){
        chuVi = 2 * (dai + rong);
    }
    public void tinhDienTich()
    {
        dienTich = dai * rong;
    }
    
}
