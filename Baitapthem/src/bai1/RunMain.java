/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        
        int n;
        System.out.println("Enter number teacher :  ");
        n=sc.nextInt();
        ArrayList<Teacher> teacher = new ArrayList<>(n);
        System.out.println("------------------ENTER LIST TEACHER----------------");
        for(int i=0;i<n;i++){
            Teacher a =new Teacher();
            System.out.println("Enter teacher "+(i+1));
            a.input();
            teacher.add(a);
        }
        
        System.out.println("---------LIST TEACHER-----------");
        for(int i=0;i<n;i++){
            System.out.println("-------------------------------");
            System.out.println("Teacher "+(i+1));
            teacher.get(i).output();
            System.out.println("Calculator Salary : "+teacher.get(i).calcuSalary());
            
        }
        
        //Hien thi danh sach co luong thap hon
        
        show(teacher);
        //them 1 teacher
        
        add(teacher);
        //Tong salary
        System.out.println("Tong salary : "+Sum(teacher));
        //hien thi teacher k co gio day xuong cuoi danh sach
        Change(teacher);
        //Sort
        Sort(teacher);
        
        
        
    }
    public static void show(ArrayList<Teacher> teacher){
        System.out.println("Salary<5000000");
        for(int i=0;i<teacher.size();i++){
            if(teacher.get(i).calcuSalary()<5000000)
                teacher.get(i).output();
        }
    }
    public static void add(ArrayList<Teacher> teacher){
        Teacher a=new Teacher();
        System.out.println("Add teacher : ");
        
        a.input();
        teacher.add(1, a);
        System.out.println("----------------------LIST TEACHER AFTER ADD--------------");
        for(int i=0;i<teacher.size();i++)
        {
            System.out.println("-------------------------------");
            System.out.println("Teacher "+(i+1));
            teacher.get(i).output();
        }
        
    }
    public static double Sum(ArrayList<Teacher> teacher){
        double s=0;
        for(int i=0;i<teacher.size();i++){
            s+=teacher.get(i).calcuSalary();
        }
        return s;
    }
    
    public static void Sort(ArrayList<Teacher> teacher){
        for(int i=0;i<teacher.size();i++){
            for(int j=i+1;j<teacher.size();j++){
                String name1=teacher.get(i).getName();
                String name2=teacher.get(j).getName();
                if(name1.compareToIgnoreCase(name2)>0){
                    Teacher x=teacher.get(i);
                    teacher.set(i,teacher.get(j));
                    teacher.set(j, x);
                }
            }
        }
        System.out.println("----------------LIST TEACHER AFTER SORT-------------");
        for(int i=0;i<teacher.size();i++){
            System.out.println("-------------------------------");
            System.out.println("Teacher "+(i+1));
            teacher.get(i).output();
        }
    }
    public static void Change(ArrayList<Teacher> teacher){
        ArrayList<Teacher>tmp=new ArrayList<>();
        for(int i=0;i<teacher.size();i++){
            if(teacher.get(i).getNumberOfTeachingHours()==0){
                tmp.add(teacher.get(i));
                
            }
        }
//        System.out.println("AFTER CHANGE");
//        for(int i=0;i<tmp.size();i++){
//            tmp.get(i).output();
//        }
        for(int i=0;i<teacher.size();i++){
            if(teacher.get(i).getNumberOfTeachingHours()==0)
                teacher.remove(i);
        }
        teacher.addAll(tmp);
        System.out.println("AFTER CHANGE");
        for(int i=0;i<tmp.size();i++){
            teacher.get(i).output();
        }
    }
}
