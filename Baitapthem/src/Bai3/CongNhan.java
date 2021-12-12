package Bai3;

import java.util.Scanner;

public class CongNhan extends NhanSu {
    Scanner sc= new Scanner(System.in);
    private XuongSX xuongSX;
    private String congViec;
    private int soNgayCong;
    private double luong;

    public CongNhan(int maNs, String hoDem, String ten, int namSinh, String gioiTinh, XuongSX xuongSX, String congViec, int soNgayCong) {
        super(maNs, hoDem, ten, namSinh, gioiTinh);

        this.xuongSX = xuongSX;
        this.congViec = congViec;
        this.soNgayCong = soNgayCong;

    }

    @Override
    public void input() {
        System.out.println("Nhap ma nhan su : "); maNs=sc.nextInt();
        System.out.println("Nhap ho dem : "); hoDem=sc.nextLine();
        System.out.println("Nhap ten : ");ten=sc.nextLine();
        System.out.println("Nhap nam sinh : "); namSinh=sc.nextInt();
        System.out.println("Nhap gioi tinh : ");gioiTinh=sc.nextLine();
        System.out.println("Nhap ten xuong : ");xuongSX.setTenXuong(sc.nextLine());
        System.out.println("Nhap ten quan doc : ");xuongSX.setQuanDoc(sc.nextLine());
        System.out.println("Nhap so cong nhan : ");xuongSX.setSoCongNhan(sc.nextInt());
        System.out.println("Nhap cong viec : ");congViec=sc.nextLine();
        System.out.println("Nhap so ngay cong : ");soNgayCong=sc.nextInt();
//        System.out.println("Nhap luong : ");luong=sc.nextDouble();
    }

    @Override
    public void output() {
//        System.out.println("Ma nhan su : "+maNs);
//        System.out.println("Ho dem : "+hoDem);
//        System.out.println("Ten    : "+ten);
//        System.out.println("Nam sinh : "+namSinh);
//        System.out.println("Gioi tinh : "+gioiTinh);
//        System.out.println("Ten xuong : "+xuongSX.getTenXuong());
//        System.out.println("Ten quan doc : "+xuongSX.getQuanDoc());
//        System.out.println("So cong nhan : "+xuongSX.getSoCongNhan());
//        System.out.println("Cong viec : "+congViec);
//        System.out.println("So ngay cong : "+soNgayCong);
//        System.out.println("Luogn : "+luong);
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n",maNs,hoDem,ten,
                namSinh,gioiTinh,xuongSX.getTenXuong(),xuongSX.getQuanDoc(),xuongSX.getSoCongNhan(),congViec,soNgayCong);
    }

    @Override
    public double tinhLuong() {
        if(soNgayCong>=23){
            luong=soNgayCong*250000+500000;
        }else if(soNgayCong>=20){
            luong=soNgayCong*250000+300000;
        }else if(soNgayCong>=18){
            luong=soNgayCong*250000;
        }else{
            luong=soNgayCong*250000-200000;
        }
        return luong;
    }
}
