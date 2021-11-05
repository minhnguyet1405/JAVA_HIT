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
public class NHANSU {
    Scanner sc=new Scanner(System.in);
    private String maNhanSu;
    private String hoTen;
    private DATE NS=new DATE();
    
    public void Nhap()
    {
        System.out.print("Nhap ma nhan su : ");
        maNhanSu=sc.nextLine();
        System.out.print("Nhap ho ten : ");
        hoTen=sc.nextLine();
        NS.Nhap();
    }
    public void Xuat()
    {
        System.out.println("Ma nhan su      : "+maNhanSu);
        System.out.println("Ho ten          : "+hoTen);
        NS.Xuat();
    }
}
