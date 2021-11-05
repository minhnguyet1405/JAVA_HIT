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
public class Sach {
    Scanner sc = new Scanner(System.in);
    private String maSach;
    private String tenSach;
    private String nxb;
    private int soTrang;
    private long giaTien;
    
    public void Nhap(){
        System.out.print("Nhap ma sach : ");
        maSach=sc.nextLine();
        System.out.print("Nhap ten sach : ");
        tenSach=sc.nextLine();
        System.out.print("Nhap nha xuat ban : ");
        nxb=sc.nextLine();
        System.out.print("Nhap so trang : ");
        soTrang=sc.nextInt();
        System.out.print("Nhap gia tien : ");
        giaTien=sc.nextLong();
        sc.nextLine();
    }
    public void Xuat(){
        System.out.println("Ma sach : "+ maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Nha xuat ban : "+nxb);
        System.out.println("So trang sach : "+soTrang);
        System.out.println("Gia tien : "+giaTien);
        
    }
    
}
