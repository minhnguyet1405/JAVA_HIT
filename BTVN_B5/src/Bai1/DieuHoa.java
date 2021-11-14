/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author Asus
 */
public class DieuHoa extends SanPham {
    private double congSuat;
    private long gia;
    
    public void Nhap(){
        super.Nhap();
        System.out.print("Nhap cong suat : ");
        congSuat=sc.nextDouble();
        System.out.print("Nhap gia ban : ");
        gia=sc.nextLong();
    }
    public void Xuat(){
        super.Xuat();
        System.out.println("Cong suat : "+congSuat);
        System.out.println("Gia ban : "+gia);
        
    }

    public double getCongSuat() {
        return congSuat;
    }

    public long getGia() {
        return gia;
    }

    
    

    

    
    
}

