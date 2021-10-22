/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap chuoi : ");
        String s =sc.nextLine();
        int count=0,sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                sum+=s.charAt(i)-'0';
                count++;
            }
                
        }
        if(count == 0)
            System.out.println("False");
        else{
            System.out.println("true");
            System.out.println(1.0*sum/count);
        }
    }
     
}
