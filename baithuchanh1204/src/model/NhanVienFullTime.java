package model;
import javax.crypto.Cipher;

import util.Configs;

public class NhanVienFullTime extends NhanVien {
    private int ngayLamThem;
    private int loaiChucVu;

    public void NhanVienFullTime(String ten){
        this.ten = ten;
    }
    public void NhanVienFullTime(String ten, int ngayLamThem){
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }
    public void setLoaiChucVu(int loaiChucVu){
        if (loaiChucVu == 2){
        @Override
        public String loaiNhanVien()
        {return "Nhan vien full time";}
        public void tinhLuong(){
            luong = Configs.LUONG_FULL_TIME * ngayLamThem;
        }
    }
        else {
        @Override
            public String loaiNhanVien(){
                return "Sep";
            }
            public void tinhLuong(){
                luong = Configs.LUONG_FULL_TIME_SEP *ngayLamThem;
            }
        }


    }
}
