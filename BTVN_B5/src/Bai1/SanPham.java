/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class SanPham {
    Scanner sc= new Scanner(System.in);
    private String maSP;
    private String tenSP;
    private String tenHangSX;
    private String ngayNhap;

    
    public void Nhap(){
        System.out.print("Nhap ma SP : ");
        maSP=sc.nextLine();
        System.out.print("Nhap ten SP : ");
        tenSP=sc.nextLine();
        System.out.print("Nhap ten hang SX : ");
        tenHangSX=sc.nextLine();
        System.out.print("Nhap ngay : ");
        ngayNhap=sc.nextLine();
        
    }
    public void Xuat(){
        System.out.println("Ma SP : " + maSP);
        System.out.println("Ten SP: "+tenSP);
        System.out.println("Ten hang SX : "+tenHangSX);
        System.out.println("Ngay nhap :"+ngayNhap);
    }

    public Scanner getSc() {
        return sc;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public String getTenHangSX() {
        return tenHangSX;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    @Override
    public String toString() {
        return "SanPham{" + "sc=" + sc + ", maSP=" + maSP + ", tenSP=" + tenSP + ", tenHangSX=" + tenHangSX + ", ngayNhap=" + ngayNhap + '}';
    }
        
    
}


