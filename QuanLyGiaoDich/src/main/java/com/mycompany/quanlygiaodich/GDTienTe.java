
package com.mycompany.quanlygiaodich;

import java.util.Date;

public class GDTienTe extends GiaoDich{
    String loaiTienTe;
    double tiGia ;

    public GDTienTe() {
    }

    public GDTienTe(String loaiTienTe, double tiGia, String maGD, Date ngayGD, double donGia, int soLuong) {
        super(maGD, ngayGD, donGia, soLuong);
        this.loaiTienTe = loaiTienTe;
        this.tiGia = tiGia;
    }

    public String getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(String loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }

    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
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
        if(loaiTienTe.equalsIgnoreCase("USD")||loaiTienTe.equalsIgnoreCase("Euro")){
            return soLuong * donGia * tiGia;
        }else{
            return soLuong * donGia;
        }
    }
    @Override
    public String toString() {
        return super.toString() +"\t" +tiGia+"\t" +loaiTienTe +"\t" + getThanhTien(); 
    }
    
    
}
