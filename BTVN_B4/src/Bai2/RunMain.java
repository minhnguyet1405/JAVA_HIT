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
public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        NHANSU x=new NHANSU();
        System.out.println("-------NHAP THONG TIN NHAN SU---------");
        x.Nhap();
        System.out.println("-----------THONG TIN NHAN SU---------------");
        x.Xuat();
    }
}
