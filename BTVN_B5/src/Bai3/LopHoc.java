/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class LopHoc {
    Scanner sc= new Scanner(System.in);
    private String maLH;
    private String tenLH;
    private String ngayMo;
    ArrayList<SinhVien> x=new ArrayList<>();
    private int n;
    private String giaoVien;
    
    public LopHoc(){
        maLH="";
        tenLH="";
        ngayMo="";
        x=null;
        n=0;
        giaoVien="";
    }

    @Override
    public String toString() {
        return "LopHoc{" + "sc=" + sc + ", maLH=" + maLH + ", tenLH=" + tenLH + ", ngayMo=" + ngayMo + ", x=" + x + ", n=" + n + ", giaoVien=" + giaoVien + '}';
    }

    

    public String getMaLH() {
        return maLH;
    }

    public void setMaLH(String maLH) {
        this.maLH = maLH;
    }

    public String getTenLH() {
        return tenLH;
    }

    public void setTenLH(String tenLH) {
        this.tenLH = tenLH;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public ArrayList<SinhVien> getX() {
        return x;
    }

    public void setX(ArrayList<SinhVien> x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }
            
}
