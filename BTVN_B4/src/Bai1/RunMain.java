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
public class RunMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Nhap so luong sach : ");
        n=sc.nextInt();
        Sach[] a=new Sach[n];
        System.out.println("==========NHAP THONG TIN SACH===========");
        for(int i=0;i<n;i++)
        {
            a[i]=new Sach();
            System.out.println("Nhap thong tin sach thu " + (i+1));
            a[i].Nhap();
        }
        System.out.println("============THONG TIN SACH==============");
        for(int i=0;i<n;i++){
            System.out.println("==>SACH THU "+(i+1));
            a[i].Xuat();
        }
    }
}
