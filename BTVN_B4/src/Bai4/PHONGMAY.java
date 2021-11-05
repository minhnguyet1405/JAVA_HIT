/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class PHONGMAY {
    Scanner sc= new Scanner(System.in);
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private QUANLY x=new QUANLY();
    private MAY y[];
    private int n;
    
    public void Nhap()
    {
        System.out.print("Nhap ma phong   : ");
        maPhong=sc.nextLine();
        System.out.print("Nhap ten phong  : ");
        tenPhong=sc.nextLine();
        System.out.print("Nhap dien tich  : ");
        dienTich=sc.nextDouble();
        x.Nhap();
        System.out.print("Nhap so luong may : ");
        n=sc.nextInt();
        y=new MAY[n];
        for(int i=0;i<n;i++)
        {
            y[i]=new MAY();
            System.out.println("Nhap thong tin may thu "+(i+1));
            y[i].Nhap();
        }
        
    }
    public void Xuat()
    {
        System.out.println("Ma phong    : "+maPhong);
        System.out.println("Ten phong   : "+tenPhong);
        System.out.println("Dien tich   : "+dienTich);
        x.Xuat();
        for(int i=0;i<n;i++)
        {
            System.out.println("MAY "+(i+1));
            y[i].Xuat();
        }
    }
}
