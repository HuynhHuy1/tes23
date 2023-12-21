
package com.mycompany.quanlygiaodich;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GiaoDich {
    String maGD ;
    Date ngayGD;
    double donGia;
    int soLuong;    

    public GiaoDich() {
    }

    public GiaoDich(String maGD, Date ngayGD, double donGia, int soLuong) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.soLuong = soLuong;
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

    @Override
    public String toString() {
        return maGD +"\t" + ngayGD +"\t" + donGia +"\t\t" +soLuong; 
    }
    
    public static Date chuyenChuoiThanhNgay(String str){
        try {
            return new SimpleDateFormat("MM/dd/yyyy").parse(str);
        } catch (Exception e) {
        }
        return null;
    }

    void setmaGD(String field) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setLoai(String field) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
