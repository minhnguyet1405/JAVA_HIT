/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author Asus
 */
public class runmain {
    public static void main(String[] arge) {
        int m=5;
        int n=5;
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++) {
                if(i==1 || i==m || j==1 || j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
            
        }
    }
}
