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
public class DATE {
    Scanner sc=new Scanner(System.in);
    private int D,M,Y;
    
    public void Nhap(){
        System.out.print("Nhap ngay : ");
        D=sc.nextInt();
        System.out.print("Nhap thang: ");
        M=sc.nextInt();
        System.out.print("Nhap nam  : ");
        Y=sc.nextInt();
    }
    public void Xuat(){
        System.out.println("DATE    : "+ D +"/"+M+"/"+Y);
    }
}

