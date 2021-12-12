package Bai3;

import java.util.*;


public class RunMain {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<NhanSu> nhansu = new ArrayList<>();

    public static void main(String[] args) {
        nhansu.add(new CanBo(1, "minh", "e", 2002, "NU", new Phong("phong 1", "Hung"), "Can bo", 1.5, "A"));
        nhansu.add(new CongNhan(2, "minh", "b", 2002, "NAM", new XuongSX("xuong1", "nguyet", 2), "cong nhan", 5));
        nhansu.add(new CongNhan(2, "minh", "a", 2002, "NU", new XuongSX("xuong1", "nguyet", 2), "cong nhan", 2));
        nhansu.add(new CanBo(2, "minh", "d", 2002, "NU", new Phong("phong 1", "Hung"), "Can bo", 1.6, "A"));
        nhansu.add(new CanBo(2, "minh", "c", 2002, "NAM", new Phong("phong 1", "Hung"), "Can bo", 1.7, "A"));




        int choose;
        do {
            System.out.print("Nhap lua chon : ");
            choose = sc.nextInt();


        switch (choose) {
            case 1:
                System.out.println("DANH SÁCH NHÂN SỰ : ");
                titlecb();
                titlecn();
                break;
            case 2:
                System.out.println("DANH SÁCH CÔNG NHÂN NAM : ");
                show_Man();
                break;
            case 3:
                System.out.println("DANH SÁCH CÁN BỘ NỮ : ");
                show_Girls();
                break;
            case 4:
                System.out.println("CÁN BỘ CÓ LƯƠNG CAO NHẤT : ");
                MaxSalary();

                break;
            case 5:
                System.out.println("CÔNG NHÂN CÓ LƯƠNG THẤP NHẤT : ");
                MinSalary();
                break;
            case 6:
                System.out.println("TỔNG LƯƠNG CÁN BỘ : "+ SumSalaryCB());
                break;
            case 7:
                System.out.println("TỔNG LƯƠNG CÔNG NHÂN : "+SumSalaryCN());
                break;
            case 8:
                reserver();
                break;
            case 9:
                Sort();
                break;
            default:
                System.out.println("lua chon khong ton tai!!!");
                break;
        }
        }while (choose!=9);


    }

    public static void titlecb() {
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n","MaNS","Ho Dem","Ten","Nam Sinh","Gioi Tinh","Phong",
                "Truong phong","Chuc Vu","Hso Luong","Xep loai");
//

        for (int i = 0; i < nhansu.size(); i++) {
            if (nhansu.get(i) instanceof CanBo)
                nhansu.get(i).output();

        }

    }

    public static void titlecn() {
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n","MaNS","Ho Dem","Ten","Nam Sinh","Gioi Tinh","Xưởng",
                "Q.Đốc","Số CN","Công việc","Số Ngày Công");
//

        for (int i = 0; i < nhansu.size(); i++) {
            if (nhansu.get(i) instanceof CongNhan)
                nhansu.get(i).output();
        }

    }

    public static void show_Man() {
        for (int i = 0; i < nhansu.size(); i++) {
            if (nhansu.get(i) instanceof CongNhan && nhansu.get(i).gioiTinh == "NAM") {
                nhansu.get(i).output();
            }
        }
    }

    public static void show_Girls() {
        for (int i = 0; i < nhansu.size(); i++) {
            if (nhansu.get(i) instanceof CanBo && nhansu.get(i).gioiTinh == "NU") {
                nhansu.get(i).output();
            }
        }
    }

    public static void MaxSalary() {
        double max = nhansu.get(0).tinhLuong();
        for (int i = 0; i < nhansu.size(); i++) {
            if (nhansu.get(i) instanceof CanBo && nhansu.get(i).tinhLuong() > max) {
                max = nhansu.get(i).tinhLuong();

            }
        }

        for (int i=0;i<nhansu.size();i++){
            if(nhansu.get(i) instanceof CanBo && nhansu.get(i).tinhLuong()==max)
                nhansu.get(i).output();
        }


    }
    public static void MinSalary() {
        double min = nhansu.get(0).tinhLuong();
        for (int i = 0; i < nhansu.size(); i++) {
            if (nhansu.get(i) instanceof CongNhan && nhansu.get(i).tinhLuong() < min) {
                min=nhansu.get(i).tinhLuong();

            }
        }
        for (int i=0;i<nhansu.size();i++){
            if(nhansu.get(i) instanceof CongNhan && nhansu.get(i).tinhLuong()==min)
                nhansu.get(i).output();
        }

    }
    public static double SumSalaryCB(){
        double sum=0;
        for(int i=0;i<nhansu.size();i++){
            if(nhansu.get(i) instanceof CanBo){
                sum+=nhansu.get(i).tinhLuong();
            }
        }
        return sum;
    }
    public static double SumSalaryCN(){
        double sum=0;
        for(int i=0;i<nhansu.size();i++){
            if(nhansu.get(i) instanceof CongNhan){
                sum+=nhansu.get(i).tinhLuong();
            }
        }
        return sum;
    }


    public static void reserver(){
        ArrayList<NhanSu> a=new ArrayList<>();
        for(int i=0;i<nhansu.size();i++){
            if(nhansu.get(i) instanceof CongNhan){
                a.add(nhansu.get(i));
                nhansu.remove(i);
                i--;
            }
        }
        nhansu.addAll(a);

        for (int i=0;i<nhansu.size();i++){
            nhansu.get(i).output();
        }

    }

    public static void Sort(){
        for(int i=0;i<nhansu.size();i++){
            for(int j=i+1;j<nhansu.size();j++){
                if(nhansu.get(i).ten.compareToIgnoreCase(nhansu.get(j).ten)>0){
                    Collections.swap(nhansu,i,j);
                }
            }
        }
        System.out.println("DANH SÁCH SAU KHI SẮP XẾP LÀ : ");
        for(int i=0;i<nhansu.size();i++){
            nhansu.get(i).output();

        }
    }


}
