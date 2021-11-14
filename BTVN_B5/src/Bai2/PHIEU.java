/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class PHIEU {
    Scanner sc=new Scanner(System.in);
    private String maPH;
    private String tenPH;
    private DateTime a=new DateTime();
    ArrayList<SANPHAM> x=new ArrayList<>();
    private int n;
    
    public void InputPhieu(){
        System.out.print("Nhao ma phieu : ");
        maPH=sc.nextLine();
        System.out.print("Nhap ten phieu : ");
        tenPH=sc.nextLine();
        a.InputDate();
        System.out.print("Nhap so luong san pham : ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            SANPHAM sp=new SANPHAM();
            System.out.println("Nhap thong tin san pham thu : "+ (i+1));
            sp.InputSP();
            x.add(sp);
        }
        
    }
    public void OutputPhieu(){
        System.out.println("Ma phieu : "+maPH);
        System.out.println("TenPH: "+tenPH);
        a.OutputDate();
        for(int i=0;i<n;i++){
            System.out.println("San pham thu : "+(i+1));
            x.get(i).OutputSP();
            System.out.println("Thanh tien : "+x.get(i).Thanhtien());
        }
    }
    
    
}
