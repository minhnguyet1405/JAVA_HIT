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
public class Clazz {
    private String name;
    private ArrayList<student> a;
    private int n;
            
    
    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ten lop : "); name=sc.nextLine();
        System.out.println("Nhap so luong sinh vien : "); n=sc.nextInt();
        a=new ArrayList<>();
        for(int i=0;i<n;i++){
            student s= new student();
            sc.nextLine();
            System.out.println("Nhap ten : "); s.setName(sc.nextLine());
            System.out.println("Nhap tuoi: "); s.setAge(sc.nextInt());
            System.out.println("Nhap id : "); s.setId(sc.nextInt());
            System.out.println("Nhap nam : "); s.setYear(sc.nextInt());
            a.add(s);
        }
    }
    public void output(){
        System.out.printf("%-20s %-20s %-20s %-20s\n","Ten","Tuoi","Id","Year");
        for(int i=0;i<a.size();i++){
            System.out.printf("%-20s %-20d %-20d %-20d\n",a.get(i).getName(),a.get(i).getAge(),a.get(i).getId(),a.get(i).getYear());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<student> getA() {
        return a;
    }

    public void setA(ArrayList<student> a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
