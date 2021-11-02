/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Person a=new Person("Nguyet",19,"Nu","Xem phim");
        Person b=new Person();
        System.out.print("Enter name : ");
        b.setname(sc.nextLine());
        System.out.println("Enter age: ");
        b.setage(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter gender: ");
        b.setgender(sc.nextLine());
        System.out.println("Enter hobbies:");
        b.sethobby(sc.nextLine());
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
