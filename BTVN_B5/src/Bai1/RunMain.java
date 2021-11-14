/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap n = ");
        n=sc.nextInt();
        ArrayList<DieuHoa> DieuHoaList=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            DieuHoa a=new DieuHoa();
            System.out.println("Nhap thong tin dieu hoa thu "+(i+1));
            a.Nhap();
            DieuHoaList.add(a);
        }
        int dem=0;
        System.out.println("Danh sach dieu hoa cos hang san xuat Electrolux :");
        for(int i=0;i<n;i++){
            if(DieuHoaList.get(i).getTenHangSX().equals("Electrolux")){
                DieuHoaList.get(i).Xuat(); 
                dem++;
            }
        }
        if(dem==0){
            System.out.println("Khong ton tai!");
        }
        long Min=DieuHoaList.get(0).getGia();
        for(int i=0;i<n;i++){
            if(DieuHoaList.get(i).getGia()<Min)
            {
                Min=DieuHoaList.get(i).getGia();
                
            }
            
        }
        System.out.println("Cac san pham co gia ban thap nhat : ");
        for(int i=0;i<n;i++)
        {
            if(DieuHoaList.get(i).getGia()==Min)
                DieuHoaList.get(i).Xuat();
        }
    }
    
}
