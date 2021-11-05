/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class HANG {
    Scanner sc=new Scanner(System.in);
    private String maHang;
    private String tenHang;
    private int donGia;

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    
    public void Nhap()
    {
        System.out.print("Nhap ma hang    : ");
        maHang=sc.nextLine();
        System.out.print("Nhap ten hang   : ");
        tenHang=sc.nextLine();
        System.out.print("Nhap don gia    : ");
        donGia=sc.nextInt();
        
    }
    public void Xuat()
    {
        System.out.println("Ma hang     : "+maHang);
        System.out.println("Ten hang    : "+tenHang);
        System.out.println("Don gia     : "+donGia);
    }
}
