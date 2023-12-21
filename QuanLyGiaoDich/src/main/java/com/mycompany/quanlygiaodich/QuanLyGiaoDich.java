package com.mycompany.quanlygiaodich;

import java.util.Scanner;


public class QuanLyGiaoDich 
{

    public static void main(String[] args)
    {
//        DanhSachGD dsgd = new DanhSachGD();
        QuanLy ql = new QuanLy();
        Scanner s = new Scanner(System.in);
        int chon = 0;
        do {
            showMenu();
            try {
                chon = Integer.parseInt(s.nextLine());
                switch (chon) 
                {
                    case 1:
                        /*
                        dsgd.docFile("QLGD.txt");
                        for (GiaoDich gd : dsgd.a) {
                            System.out.println(gd.toString());
                        }
                        break;
                        */
                      ql.docFile("/Users/mac/Downloads/QLGD-main/QuanLyGiaoDich/QLGD.txt");
                        for (GiaoDich gd : ql.dsGiaoDich) {
                            System.out.println(gd.toString());
                        }
                        break;
                    case 2:
                        ql.ghiFile("/Users/mac/Downloads/QLGD-main/QuanLyGiaoDich/QD.txt");
                        break;
                    case 0:
                        System.out.println("Đã thoát!");
                        break;
                    default:
                        System.out.println("Vui lòng chọn lại!");
                        break;
                }
            } catch (Exception e)
            {
                System.out.println("Đã xảy ra lỗi! " + e.getMessage());
                Integer.parseInt(s.nextLine());
            }
        }
        while (chon != 0);
     
    }
        
        static void showMenu()
        {
            System.out.println("------ CHƯƠNG TRÌNH ------");    
            System.out.println("1. Đọc dữ liệu từ file");
            System.out.println("2. Ghi dữ liệu vào file");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");      
        }
}

