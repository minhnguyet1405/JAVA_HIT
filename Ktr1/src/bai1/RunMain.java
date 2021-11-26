/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class RunMain {
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);
    
        System.out.println("Nhap chuoi: ");
        String s=sc.nextLine();
        int dem=0,sum=0,t=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                sum+=s.charAt(i)-'0';
                dem++;
            }
        }
        System.out.println("ky tu so la : "+ dem);
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
                if(sum%(s.charAt(i)-'0')==0)
                t*=s.charAt(i)-'0';
        }
        System.out.println("Tich : "+t);
    }
    
    
}
