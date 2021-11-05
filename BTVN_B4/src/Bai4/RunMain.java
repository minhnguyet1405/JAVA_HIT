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
public class RunMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        PHONGMAY a=new PHONGMAY();
        System.out.println("NHAP THONG TIN PHONG MAY");
        a.Nhap();
        System.out.println("THONG TIN CUA PHONG MAY");
        a.Xuat();
    }
}
