import slide71.HinhTron;
public class app71 {
    public static void main (String[] args)
    {
        HinhTron hinhTron  = new HinhTron();
        hinhTron.setBanKinh(10);
        float chuVi = hinhTron.tinhChuVi();
        float dienTich = hinhTron.tinhDienTich();
        System.out.println("Chu vi hinh tron: " + chuVi + " va dien tich: " + dienTich);
    }
}
