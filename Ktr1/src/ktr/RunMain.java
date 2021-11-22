/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ktr;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Book> books=new ArrayList<>();
        int n;
        System.out.println("Nhap n = "); n=sc.nextInt();
        
        
    }
        public static void add(ArrayList<Book> books){
            Scanner sc= new Scanner(System.in);
            for(int i=0;i<books.size();i++){
            Book a = new Book();
            System.out.println("Nhap id : ");
            a.setId(sc.nextInt());
            sc.nextLine();
            System.out.println("Nhap name : ");
            a.setName(sc.nextLine());
            System.out.println("Nhap publisher: ");
            a.setPublisher(sc.nextLine());
            System.out.println("Nhap price: ");
            a.setPrice(sc.nextLong());
            books.add(a);
            }
        }
        public static void edit(ArrayList<Book> books){
            Scanner sc= new Scanner(System.in);
            int id;
        System.out.println("Nhap id : "); id=sc.nextInt();
        Book s =new Book();
        System.out.println("Nhap id : ");
            s.setId(sc.nextInt());
            sc.nextLine();
            System.out.println("Nhap name : ");
            s.setName(sc.nextLine());
            System.out.println("Nhap publisher: ");
            s.setPublisher(sc.nextLine());
            System.out.println("Nhap price: ");
            s.setPrice(sc.nextLong());
        for(int i=0;i<books.size();i++){
            if(books.get(i).getId()==id)
                books.set(i, s);
        }
        }
        public static void delete(ArrayList<Book> books,int id){
            for(int i=0;i<books.size();i++){
                if(books.get(i).getId()==id){
                    books.remove(i);
                }
            }
        }
        public static void Sortbyname(ArrayList<Book> books,String name){
            for(int i=0;i<books.size();i++){
                if(books.get(i).getName()==n)
            }
        }
    
    
}
