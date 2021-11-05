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
public class MAY {
    Scanner sc= new Scanner(System.in);
    private String maMay;
    private String kieuMay;
    private String tinhTrang;
    
    public void Nhap(){
        System.out.print("Nhap ma may     : ");
        maMay=sc.nextLine();
        System.out.print("Nhap kieu may   : ");
        kieuMay=sc.nextLine();
        System.out.print("Nhap tinh trang : ");
        tinhTrang=sc.nextLine();
                
    }
    public void Xuat(){
        System.out.println("Ma may  : "+maMay);
        System.out.println("Kieu may   :"+kieuMay);
        System.out.println("Tinh trang  : "+tinhTrang);
        
        
    }
}
