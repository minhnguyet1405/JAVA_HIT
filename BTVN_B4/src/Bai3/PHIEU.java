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
public class PHIEU {
    Scanner sc=new Scanner(System.in);
    private String maPhieu;
    private HANG[] x ;
    private int n;
    
    public void Nhap(){
        System.out.println("Nhap ma phieu   : ");
        maPhieu=sc.nextLine();
        System.out.println("Nhap so luong hang : ");
        n=sc.nextInt();
        x=new HANG[n];
        for(int i=0;i<n;i++){
            x[i]=new HANG();
            System.out.println("Nhap thong tin hang thu "+ (i+1));
            x[i].Nhap();
            
        }
    }
    public void Xuat(){
        System.out.println("Ma phieu    : "+maPhieu);
        for(int i=0;i<n;i++)
        {
            System.out.println("HANG "+(i+1));
            x[i].Xuat();
        }
    }
    public int Sum(){
        int s=0;
        for(int i=0;i<n;i++)
        {
            s+= x[i].getDonGia();
        }
        return s;
    }
}
