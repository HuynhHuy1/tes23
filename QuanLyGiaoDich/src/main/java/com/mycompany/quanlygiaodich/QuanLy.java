package com.mycompany.quanlygiaodich;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class QuanLy {

    ArrayList<GiaoDich> dsGiaoDich = new ArrayList<>();
    DanhSachGD dsgd = new DanhSachGD();
    Scanner s = new Scanner(System.in);
    public String filePath;
    
    public void themVaoDS(GiaoDich gd){
        dsGiaoDich.add(gd);
    }
    public void ghiFile(String filePath) {
        try {
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println(dsgd.a());
            System.out.println("hello");
            for (GiaoDich gd : dsgd.a()) {
                bw.write(gd.toString());
                bw.newLine();
            }

            bw.close();
            fw.close();
            System.out.println("Ghi file thành công!");

        } catch (Exception e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
        //dsgd.ghiFile("GD.txt");
    }

    public void docFile(String filePath) {

        try {

            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                // GiaoDich gd = new GiaoDich();
                String maGD = fields[1];
                Date ngayGD = GiaoDich.chuyenChuoiThanhNgay(fields[2]);
                // GDVang gdv = new GDVang(line, maGD, ngayGD, 0, 0);
                GiaoDich giaoDich = new GDVang(line, maGD, ngayGD, 0, 0);
                themVaoDS(giaoDich);
//            gd.setLoai(fields[1]);
            }

            br.close();
            fr.close();

        } catch (Exception e) {

            System.out.println("Lỗi đọc file: " + e.getMessage());

        }

    }

    public void inDS() {
        for (GiaoDich gd : dsgd.a) {
            System.out.println(gd.toString());
        }
    }

    void filePath() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
