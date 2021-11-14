/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sum<Integer> I=new Sum<>(1,2);
        System.out.println("Tong int : "+(I.getSoA()+I.getSoB()));
        Sum<Long> l=new Sum<>(10l,20l);
        System.out.println("Tong long : "+(l.getSoA()+l.getSoB()));
        Sum<Float> f=new Sum<>(1.2f,2.2f);
        System.out.println("Tong float : "+(f.getSoA()+f.getSoB()));
        Sum<Double> d=new Sum<>(10.2,20.2);
        System.out.println("Tong double : "+(d.getSoA()+d.getSoB()));
    }
}
