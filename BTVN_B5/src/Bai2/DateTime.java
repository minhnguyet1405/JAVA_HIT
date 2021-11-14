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
public class DateTime {
    Scanner sc = new Scanner(System.in);
    private int ngay;
    private int thang;
    private int nam;
    
    public void InputDate(){
        System.out.print("Nhap ngay : ");
        ngay=sc.nextInt();
        System.out.print("Nhap thang: ");
        thang=sc.nextInt();
        System.out.print("Nhap nam : ");
        nam=sc.nextInt();
        
    }
    public void OutputDate(){
        System.out.println("Date : "+ngay+"/"+thang+"/"+nam);
        
    }
}
