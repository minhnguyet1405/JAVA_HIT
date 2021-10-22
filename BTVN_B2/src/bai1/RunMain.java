/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;
import java.util.Scanner;


public class RunMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap a = ");
    int a=sc.nextInt();
    System.out.print("Nhap b = ");
    int b=sc.nextInt();
    System.out.print("Nhap c = ");
    int c=sc.nextInt();
        System.out.println("Max = "+max(a,b,c));
    }
    public static int max(int a,int b,int c) {
        int Max;
        if(a>b && a>c)
            Max=a;
        else if(a<b && c<b)
            Max=b;
        else
            Max=c;
        return Max;
    }
            
    
}
