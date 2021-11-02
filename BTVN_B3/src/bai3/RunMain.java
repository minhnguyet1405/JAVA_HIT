/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Random;

/**
 *
 * @author Asus
 */
public class RunMain {

    public static void main(String[] args) {
        Random rd = new Random();
        Guns DiepBeDe = new Guns("AK", 100);
        Guns DoanXinhGai = new Guns("AN", 100);

        while (true) {
            DiepBeDe.Load(rd.nextInt(10) + 1);
            DoanXinhGai.Load(rd.nextInt(10) + 1);

            DiepBeDe.Shoot(rd.nextInt(10) + 1);
            DoanXinhGai.Shoot(rd.nextInt(10) + 1);

            System.out.println(DiepBeDe.getAmmoNumber() + "-" + DoanXinhGai.getAmmoNumber());
            if (DiepBeDe.getAmmoNumber() == 0 && DoanXinhGai.getAmmoNumber() == 0) {
                System.out.println("hoa");
                break;

            } else if (DiepBeDe.getAmmoNumber() == 0) {
                System.out.println("Diep thua");
                break;
            } else if (DoanXinhGai.getAmmoNumber() == 0) {
                System.out.println("Doan thua");
                break;
            }
        }

    }
}
