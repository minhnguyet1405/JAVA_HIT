/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chuoi : ");
        String s=sc.nextLine();
        //xoa khoang trang va chuyen ve chu thuong
        s=s.trim().toLowerCase();
        s=s.replaceAll("\\s+"," ");
        String[] arr=s.split(" ");
        s="";
        for(int i=0;i<arr.length;i++)
        {
            s+=String.valueOf(arr[i].charAt(0)).toUpperCase()+arr[i].substring(1);
            if(i<arr.length-1)
                s+=" ";
        }
        System.out.print("chuoi sau khi chuan hoa la : " + s);
        System.out.println("");
    }
}