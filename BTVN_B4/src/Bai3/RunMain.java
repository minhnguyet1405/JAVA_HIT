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
public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PHIEU a=new PHIEU();
        System.out.println("---------NHAP THONG TIN PHIEU---------");
        a.Nhap();
        System.out.println("---------THONG TIN PHIEU-----------");
        a.Xuat();
        System.out.println("Tong tien phieu : "+ a.Sum());
    }
}
