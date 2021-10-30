/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author Asus
 */
public class Guns {
    private String weaponName;
    private int ammoNumber;
    
    public void Load(int x){
        ammoNumber+=x;
        
    }
    public void Shoot(int x){
        if(ammoNumber-x>=0){
            ammoNumber-=x;
        }else
            System.out.println("Het dan");
    }
    public Guns(){
        weaponName="";
        ammoNumber=100;
               
    }
    public Guns(String weaponName,int ammoNumber){
        this.weaponName=weaponName;
        this.ammoNumber=ammoNumber;
    }
    public void setWeaponName(String weaponName){
        this.weaponName=weaponName;
    }
    public String getWeaponName(){
        return weaponName;
        
    }
    public void setAmmoNumber(int ammoNumber)
    {
        this.ammoNumber=ammoNumber;
    }
    public int getAmmoNumber(){
        return ammoNumber;
    } 
}
