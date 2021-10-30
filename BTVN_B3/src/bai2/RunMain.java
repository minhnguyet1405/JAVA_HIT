/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Asus
 */
public class RunMain {
    public static void main(String[] args) {
        Array arr1=new Array();
        Array arr2=new Array();
        
        //mang1
        arr1.InputData();
        arr1.Show();
        System.out.println("Sum1 = "+arr1.Sum());
        arr1.Filter(true);
        
        //mang2
        arr2.InputData();
        arr2.Show();
        System.out.println("Sum2 = "+ arr2.Sum());
        arr2.Filter(!true);
        
        if(arr1.TBC()>arr2.TBC())
            System.out.println("Mang 1 lon hon mang 2");
        else if(arr1.TBC()< arr2.TBC())
            System.out.println("Mang 2 lon hon mang 1");
        else
            System.out.println("Bye");
    }
}
