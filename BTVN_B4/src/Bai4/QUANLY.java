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
public class QUANLY {
    Scanner sc=new Scanner(System.in);
    private String maQL;
    private String hoTen;
    
    public void Nhap(){
        System.out.print("Nhap ma quan ly     : ");
        maQL=sc.nextLine();
        System.out.print("Nhap ho ten         : ");
        hoTen=sc.nextLine();
    }
    public void Xuat()
    {
        System.out.println("Ma quan ly  : "+maQL);
        System.out.println("Ho Ten      : "+hoTen);
        
    }
}
