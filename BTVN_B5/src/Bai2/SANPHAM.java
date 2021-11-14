/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class SANPHAM {
    Scanner sc = new Scanner(System.in);
    private String maSP;
    private String tenSP;
    private int soLuong;
    private int donGia;
    
    public void InputSP(){
        System.out.print("Nhap ma SP : ");
        maSP=sc.nextLine();
        System.out.print("Nhap ten Sp : ");
        tenSP=sc.nextLine();
        System.out.print("Nhap so luong : ");
        soLuong=sc.nextInt();
        System.out.print("Nhao don gia : ");
        donGia=sc.nextInt();
    }
    public void OutputSP(){
        System.out.println("Ma SP : " + maSP);
        System.out.println("Ten SP : " + tenSP);
        System.out.println("So luong : "+soLuong);
        System.out.println("Don gia : "+donGia);
    }
    public int Thanhtien(){
        return soLuong*donGia;
    }
}
