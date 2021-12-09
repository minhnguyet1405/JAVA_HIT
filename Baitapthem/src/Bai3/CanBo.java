package Bai3;

import java.util.Scanner;

public class CanBo extends NhanSu {
    Scanner sc=new Scanner(System.in);

    private Phong phong;
    private  String chucVu;
    private double heSoLuong;
    private String xepLoai;
    private double luong;

    public CanBo(int maNs, String hoDem, String ten, int namSinh, String gioiTinh, Phong phong, String chucVu, double heSoLuong, String xepLoai) {
        super(maNs, hoDem, ten, namSinh, gioiTinh);

        this.phong = phong;
        this.chucVu = chucVu;
        this.heSoLuong = heSoLuong;
        this.xepLoai = xepLoai;

    }

    @Override
    public void input() {
        System.out.println("Nhap ma nhan su : "); maNs=sc.nextInt();
        System.out.println("Nhap ho dem : "); hoDem=sc.nextLine();
        System.out.println("Nhap ten : ");ten=sc.nextLine();
        System.out.println("Nhap nam sinh : "); namSinh=sc.nextInt();
        System.out.println("Nhap gioi tinh : ");gioiTinh=sc.nextLine();
        System.out.println("Nhap ten phong : ");phong.setTenPhong(sc.nextLine());
        System.out.println("Nhap ten truong phong : ");phong.setTruongPhong(sc.nextLine());
        System.out.println("Nhap chuc vu : ");chucVu=sc.nextLine();
        System.out.println("Nhap he so luogn : ");heSoLuong=sc.nextDouble();
        System.out.println("Nhap xep loai : ");xepLoai=sc.nextLine();
//        System.out.println("Nhap luong : ");luong=sc.nextDouble();

    }

    @Override
    public void output() {
        System.out.println("Ma nhan su : "+maNs);
        System.out.println("Ho dem : "+hoDem);
        System.out.println("Ten    : "+ten);
        System.out.println("Nam sinh : "+namSinh);
        System.out.println("Gioi tinh : "+gioiTinh);
        System.out.println("Phong : "+phong.getTenPhong());
        System.out.println("Truong phong : "+phong.getTruongPhong());
        System.out.println("Chuc vu : "+chucVu);
        System.out.println("He so luong : "+heSoLuong);
        System.out.println("Xep loai : "+xepLoai);
//        System.out.println("Luong : "+luong);

    }

    @Override
    public void tinhLuong() {
        if(xepLoai=="A"){
            luong=heSoLuong*1150000+1000000;
        }else if(xepLoai=="B"){
            luong=heSoLuong*1150000;
        }else if(xepLoai=="C"){
            luong=heSoLuong*1150000;
        }else{
            luong=heSoLuong*1150000-1000000;
        }
    }
}

