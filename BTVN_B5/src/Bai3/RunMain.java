/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LopHoc a=new LopHoc();
        System.out.print("Nhap ma lop hoc : ");
        String malh=sc.nextLine();
        a.setMaLH(malh);
        System.out.print("Nhap ten lop hoc : ");
        String tenlh=sc.nextLine();
        a.setTenLH(tenlh);
        System.out.print("Nhap ngay mo : ");
        String ngay=sc.nextLine();
        a.setNgayMo(ngay);
        System.out.print("Nhap giao vien : ");
        String giaovien=sc.nextLine();
        a.setGiaoVien(giaovien);
        System.out.print("Nhap n : ");
        int n=sc.nextInt();
        a.setN(n);
        ArrayList<SinhVien> sv=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            SinhVien y=new SinhVien();
            System.out.println("Nhap thong tin sinh vien thu "+(i+1));
            y.Nhap();
            System.out.print("Nhap ma SV : ");
            sc.nextLine();
            String masv=sc.nextLine();
            y.setMaSV(masv);
            System.out.print("Nhap nganh : ");
            String Nganh=sc.nextLine();
            y.setNganh(Nganh);
            System.out.print("Nhap khoa hoc : ");
            int khoahoc=sc.nextInt();
            y.setKhoaHoc(khoahoc);
            sv.add(y); 
        }

        
        System.out.println("Thong tin phieu: ");
        System.out.println("Ma lop hoc : "+a.getMaLH());
        System.out.println("Ten lop hoc : "+a.getTenLH());
        System.out.println("Ngay mo : "+a.getNgayMo());
        System.out.println("Giao vien : "+a.getGiaoVien());
        System.out.println("Thong tin sinh vien : ");
        for(int i=0;i<n;i++){
            
            System.out.println("SINH VIEN "+(i+1));
            sv.get(i).Xuat();
            System.out.println("Ma sinh vien : "+sv.get(i).getMaSV());
            System.out.println("Nganh : "+sv.get(i).getNganh());
            System.out.println("Khoa hoc : "+sv.get(i).getKhoaHoc());
        }
        
        int dem=0;
        for(int i=0;i<n;i++){
            if(sv.get(i).getKhoaHoc()==15)
                dem++;
        }
            System.out.println("So sinh vien khoa 15 la : "+dem);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(sv.get(i).getKhoaHoc()>sv.get(j).getKhoaHoc()){
                    Collections.swap(sv, i, j);
                }
                    
            }
        }
        for(int i=0;i<n;i++){
            
            System.out.println("SINH VIEN "+(i+1));
            sv.get(i).Xuat();
            System.out.println("Ma sinh vien : "+sv.get(i).getMaSV());
            System.out.println("Nganh : "+sv.get(i).getNganh());
            System.out.println("Khoa hoc : "+sv.get(i).getKhoaHoc());
        }
    }
    
    
}
