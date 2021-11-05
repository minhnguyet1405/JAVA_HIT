/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

/**
 *
 * @author Asus
 */
public class RunMain {
    public static void main(String[] args) {
        System.out.println("int:"+isPrime(5));
        System.out.println("long:"+isPrime(10l));
        System.out.println("float:"+isPrime(3.0f));
        System.out.println("double:"+isPrime(3.0));
    }
        public static boolean isPrime(int n)
        {
            if(n<2)
                return false;
            for(int i=2;i<= Math.sqrt(n);i++)
                if(n%i==0)
                    return false;
            return true;
        }
        
        public static boolean isPrime(long n)
        {
            if(n<2)
                return false;
            for(int i=2;i<= Math.sqrt(n);i++)
                if(n%i==0)
                    return false;
            return true;
        }
        
        public static boolean isPrime(float n)
        {
            return false;
        }
        
        public static boolean isPrime(double n)
        {
            return false;
        }
}
