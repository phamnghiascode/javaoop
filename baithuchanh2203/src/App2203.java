public class App2203{
    public void main(String[] args)
    {
        // Hinh chu nhat
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhaphcn();
        System.out.println("Dien tich hcn: " + hcn.dienTich());
        System.out.println("Chu vi hcn: " + hcn.chuVi());

        // Nguoi
        Person nguoi = new Person();
        nguoi.input();
        nguoi.output();

        //Sinh vien
        SinhVien sv = new SinhVien();
        sv.input();
        sv.output();

        // pt bac 2

        PhuongTrinhBacHai pt = new PhuongTrinhBacHai();
        pt.nhapAB();
        pt.ketQua();

    }
}


