package com.company;

import java.util.Scanner;

public class Menu {
    static Scanner input=new Scanner(System.in);
    public static String add="1";
    public static String getSum="2";
    public static String remove="3";
    public static String getMoney="4";
    public static String searchID="5";
    public static String sort="6";
    public static String show="7";
    public static String exit="8";

    public static void menu(){
        while (true){
            welcome();
            String choise=input.nextLine();
            switch (choise{
                case add-> QLGD.themGiaoDich();
                case getSum-> QLGD.tinhTongGiaoDich();
                case remove-> QLGD.xoaGiaoDichTheoNgay();
                case getMoney-> QLGD.tinhTienGiaoDichTheoNgay();
                case searchID-> QLGD.timGiaoDichTheoMaGiaoDich();
                case sort-> QLGD.sapXepTheoMaGiaoDich();
                case show-> QLGD.hienThiTatCaGiaoDich();
                case exit-> System.exit(0);
                default-> System.out.println("Nhap lai");
            }
        }
    }
    private static void welcome() {
        System.out.println("Hệ thống quản lý giao dịch bất động sản");
        System.out.println("1. Thêm giao dịch");
        System.out.println("2. Tính tổng số lượng giao dịch");
        System.out.println("3. Xóa giao dịch theo ngày");
        System.out.println("4. Tính tiền giao dich theo ngày");
        System.out.println("5. Tìm giao dịch theo mã giao dịch");
        System.out.println("6. Sắp xếp giao dịch theo mã giao dịch");
        System.out.println("7. Hiển thị tất cả giao dịch");
        System.out.println("8. Thoát");
    }
}
