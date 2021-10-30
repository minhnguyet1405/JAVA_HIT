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
        Random rd=new Random();
        Guns DiepBeDe=new Guns("AK",100);
        Guns DoanXinhGai=new Guns("AN",100);
//        DiepBeDe.setWeaponName("AK47");
//        DiepBeDe.setAmmoNumber(100);
//        DoanXinhGai.setWeaponName("AN");
//        DoanXinhGai.setAmmoNumber(100);
        
        
        while(DiepBeDe.getAmmoNumber()!=0 && DoanXinhGai.getAmmoNumber()!=0)
        {
            DiepBeDe.Shoot(rd.nextInt(10)+1);
            DoanXinhGai.Shoot(rd.nextInt(10)+1);
            if(DiepBeDe.getAmmoNumber()==0 && DoanXinhGai.getAmmoNumber()==0)
            {
                System.out.println("nap dan!");
                DiepBeDe.Load(rd.nextInt(10)+1);
                DoanXinhGai.Load(rd.nextInt(10)+1);
            }else{
                if(DiepBeDe.getAmmoNumber()==0 )
                {
                    System.out.println("Diep thua, Doan thang");
                    break;
                }
//                else
//                {
//                    System.out.println("Doan thua, Diep thang");
//                    break;
//                }
            }
        }
    
    }
}
