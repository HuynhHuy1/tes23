
package com.mycompany.quanlygiaodich;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;import java.util.ArrayList;
import java.util.Date;

public class DanhSachGD {
    ArrayList<GiaoDich> a = new ArrayList<>();
    
    public void themVaoDS(GiaoDich gd){
        a.add(gd);
    }
    
    public void docFile(String tenFile){
        try {
            FileReader fr = new FileReader(tenFile);
            BufferedReader br = new BufferedReader(fr); 
            String line = "";
            while(true){
                line = br.readLine();
                if( line == null ){
                    break;
                }
                String s[] = line.split(",");
                //lay thong tin chung
                String maGD = s[1];
                Date ngayGD = GiaoDich.chuyenChuoiThanhNgay(s[2]);
                double donGia = Double.parseDouble(s[3]);
                int soLuong = Integer.parseInt(s[4]);
             
                //lay thong tin rieng 
                if(s[0].equalsIgnoreCase("1")){
                    String loai = s[5];
                    GDVang  gdv = new GDVang(loai, maGD, ngayGD, donGia, soLuong);
                    themVaoDS(gdv);
                }else{
                    String loaiTienTe = s[6];
                    double tiGia = Double.parseDouble(s[7]);
                    GDTienTe gdtt = new GDTienTe(loaiTienTe, tiGia, maGD, ngayGD, donGia, soLuong);
                    themVaoDS(gdtt);
                }
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
        public void ghiFile(String tenFile){
            try {
                FileWriter fw = new FileWriter(tenFile);
                BufferedWriter bw = new BufferedWriter(fw);
                for (GiaoDich gd : a) {
                    bw.write(gd.toString());
                    bw.newLine();
                }
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
        
        public boolean xoagd(String maGD){
            for (GiaoDich gd : a) {
                if(gd.getMaGD().equalsIgnoreCase(maGD)){
                    a.remove(gd);
                    return true;
                }
            }
            return false;
        }

    void inDS() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Iterable<GiaoDich> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Iterable<GiaoDich> a() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
        
    }



