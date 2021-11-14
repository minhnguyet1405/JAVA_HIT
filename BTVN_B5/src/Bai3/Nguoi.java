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
public class Nguoi {
    Scanner sc= new Scanner(System.in);

    protected String hoTen;
    protected String ngaySinh;
    protected String queQuan;
    
    public void Nhap(){
        System.out.print("Nhap ho ten : ");
        hoTen=sc.nextLine();
        System.out.print("Nhap ngay sinh : ");
        ngaySinh=sc.nextLine();
        System.out.print("Nhap que quan : ");
        queQuan=sc.nextLine();
        
    }
    public void Xuat(){
        System.out.println("Ho ten : "+hoTen);
        System.out.println("Ngay sinh : "+ngaySinh);
        System.out.println("Que quan : "+queQuan);
    }

    
}
