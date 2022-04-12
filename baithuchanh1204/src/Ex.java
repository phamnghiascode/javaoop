
import shapes.HinhChuNhat;
import shapes.HinhTron;
import shapes.HinhTru;
import shapes.HinhVuong; 
public class Ex{
    public static void main(String[] args)
{
{
    HinhTron hinhTron = new HinhTron();
    hinhTron.xuatTen();
    hinhTron.nhapBanKinh();
    hinhTron.tinhChuVi();
    hinhTron.tinhDienTich();
    hinhTron.inChuVi();
    hinhTron.inDienTich();

    HinhChuNhat hcn = new HinhChuNhat();
    hcn.xuatTen();
    hcn.nhapChieuDai();
    hcn.nhapChieuRong();
    hcn.tinhChuVi();
    hcn.tinhDienTich();
    hcn.inChuVi();
    hcn.inDienTich();

    HinhTru ht = new HinhTru();
    ht.xuatTen();
    ht.nhapChieuCao();
    ht.tinhDienTich();
    ht.inTheTich();

    HinhVuong hv = new HinhVuong();
    hv.xuatTen();
    hv.nhapCanh();
    hv.tinhChuVi();
    hv.tinhDienTich();
    hv.inChuVi();
    hv.inDienTich();
    


    
}
}}