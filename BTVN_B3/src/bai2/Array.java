/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Array {
    Scanner sc=new Scanner(System.in);
    private int n;
    private int[] a;
    
    public void InputData(){
        System.out.println("Nhap so phan tu cua mang : ");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Nhap mang : ");
        for(int i=0;i<n;i++)
        {
            System.out.print("a["+i+"] = ");
            a[i]=sc.nextInt();
        } 
        System.out.println("");
    }
    public void Show(){
        System.out.print("Mang vua nhap la : ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
    public int Sum(){
        int s=0;
        for(int i=0;i<n;i++){
            s+=a[i];
        }
        return s;
    }
    public void Filter(Boolean flag){
       
        if(flag==true){
            System.out.print("So chan : ");
            for(int i=0;i<n;i++)
            {
                if(a[i]%2==0)
                    System.out.print(a[i]+" ");
            }
            
        }else{
            System.out.print("So le : ");
            for(int i=0;i<n;i++){
                if(a[i]%2!=0)
                    System.out.print(a[i]+" ");
            }
        }
        System.out.println("");    
    }

    public Array(){
        n=0;
        a=null;
    }
    public Array(int n, int[] a) {
        this.n = n;
        this.a = a;
    }
    
    public void setN(int n) {
        this.n = n;
    }
    public int getN(){
        return n;
    }
    public void setA(int[] a) {
        this.a = a;
    }
    public int[] getA(){
        return a;
    }
    public double TBC(){
        int s=0,dem=0;
        
        for(int i=0;i<n;i++){
            s+=a[i];
            dem++;
        }
        return 1.0*s/dem;
    }

    
    
}
