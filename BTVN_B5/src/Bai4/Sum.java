/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author Asus
 */
public class Sum<T> {
    private T soA;
    private T soB;
    
    public Sum(){
        
    }
    public Sum(T soA, T soB) {
        this.soA = soA;
        this.soB = soB;
    }

    public T getSoA() {
        return soA;
    }

    public void setSoA(T soA) {
        this.soA = soA;
    }

    public T getSoB() {
        return soB;
    }

    public void setSoB(T soB) {
        this.soB = soB;
    }
    
    
}
