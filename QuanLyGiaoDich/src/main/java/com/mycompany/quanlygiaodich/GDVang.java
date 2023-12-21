    
package com.mycompany.quanlygiaodich;
    
import java.util.Date;

public class GDVang extends GiaoDich{
    String loai ; 

    public GDVang() {
    }

    public GDVang(String loai, String maGD, Date ngayGD, double donGia, int soLuong) {
        super(maGD, ngayGD, donGia, soLuong);
        this.loai = loai;
    }

    

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public Date getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(Date ngayGD) {
        this.ngayGD = ngayGD;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public double getThanhTien(){
        return soLuong * donGia ;
    }

    @Override
    public String toString() {
        return super.toString() +"\t"+ loai +"\t" +getThanhTien(); 
    }
    
    
}
