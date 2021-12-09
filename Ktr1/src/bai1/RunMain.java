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
//    ArrayList<Integer> nums=new ArrayList<>();
        System.out.println("Nhap chuoi: ");
        String s=sc.nextLine();
        int dem=0,sum=0,t=1;
        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
//                sum+=s.charAt(i)-'0';
//                dem++;
//            }
              if(Character.isDigit(s.charAt(i))){
                  dem++;
                  sum+=Character.getNumericValue(s.charAt(i));
              }

        }
        System.out.println("ky tu so la : "+ dem);
        
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)))
            {
                int x= Character.getNumericValue(s.charAt(i));
                if(x!=0 && sum%x==0)
                    t*=x;
            }
        }
        System.out.println("Tich : "+t);
    }
    
    
}
