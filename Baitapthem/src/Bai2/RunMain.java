/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Clazz clazz=new Clazz();
        clazz.input();
        clazz.output();
        //sort
        int choose;
        do{
            System.out.println("Nhap lua chon : ");choose=sc.nextInt();
            switch(choose){
                case 1:
                    Sort(clazz);
                    clazz.output();
                    break;
                case 2:
                    Delete(clazz,1);
                    clazz.output();
                    break;
                case 3:
                    Edit(clazz,"nguyet");
                    clazz.output();
                    break;
                case 4:
                    System.out.println("Dung chuong trinh!");
                    break;
                default:
                    System.out.println("lua chon khong ton tai");
                    
            }
        }while(choose!=4);
    
        
        //delete
        
        //edit
        
    }
    public static void Sort(Clazz clazz){
        for(int i=0;i<clazz.getA().size();i++){
            for(int j=i+1;j<clazz.getA().size();j++){
                if(clazz.getA().get(i).getAge()>clazz.getA().get(j).getAge()){
                student tmp=clazz.getA().get(i);
                clazz.getA().set(i, clazz.getA().get(j));
                clazz.getA().set(j, tmp);
                }
                
            }
        }
    }
    public static void Delete(Clazz clazz,int id){
        for(int i=0;i<clazz.getA().size();i++){
            if(clazz.getA().get(i).getId()==id){
                clazz.getA().remove(i);
            }
        }
    }
    public static void Edit(Clazz clazz,String name){
        Scanner sc=new Scanner(System.in);
        student s=new student();
        System.out.println("Nhap ten : "); s.setName(sc.nextLine());
            System.out.println("Nhap tuoi: "); s.setAge(sc.nextInt());
            System.out.println("Nhap id : "); s.setId(sc.nextInt());
            System.out.println("Nhap nam : "); s.setYear(sc.nextInt());
        for(int i=0;i<clazz.getA().size();i++){
            if(clazz.getA().get(i).getName().compareToIgnoreCase(name)==0){
                clazz.getA().set(i, s);
            }
        }
    }
   
}
