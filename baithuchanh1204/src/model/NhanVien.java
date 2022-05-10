package model;

public class NhanVien {
    protected String ten;
    protected long luong;

    public NhanVien(){}
    public NhanVien(String ten){
        this.ten = ten;
    }
    protected String loaiNhanVien(){
        return "";
    }
    public void xuatThonTin(){
        System.out.println("Nhan vien: " + ten);
        System.out.println("Chuc vu: " + loaiNhanVien());
        System.out.println("Salary: " + luong);
    }
}
