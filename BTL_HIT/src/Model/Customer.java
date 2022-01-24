package Model;

import java.util.Scanner;

public class Customer   {
    private static long id=0;
    private long idCus;
    private String nameCus;
    private String ageCus;
    private String genderCus;
    private String addressCus;
    private String phoneCus;

    Scanner sc=new Scanner(System.in);

    public Customer() {
    }

    public Customer(long idCus, String nameCus, String ageCus, String genderCus, String addressCus, String phoneCus) {
        if(idCus==0)
            this.idCus=id++;
        else
            this.idCus = idCus;
        this.nameCus = nameCus;
        this.ageCus = ageCus;
        this.genderCus = genderCus;
        this.addressCus = addressCus;
        this.phoneCus = phoneCus;
    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Customer.id = id;
    }

    public long getIdCus() {
        return idCus;
    }

    public void setIdCus(long idCus) {
        this.idCus = idCus;
    }

    public String getNameCus() {
        return nameCus;
    }

    public void setNameCus(String nameCus) {
        this.nameCus = nameCus;
    }

    public String getAgeCus() {
        return ageCus;
    }

    public void setAgeCus(String ageCus) {
        this.ageCus = ageCus;
    }

    public String getGenderCus() {
        return genderCus;
    }

    public void setGenderCus(String genderCus) {
        this.genderCus = genderCus;
    }

    public String getAddressCus() {
        return addressCus;
    }

    public void setAddressCus(String addressCus) {
        this.addressCus = addressCus;
    }

    public String getPhoneCus() {
        return phoneCus;
    }

    public void setPhoneCus(String phoneCus) {
        this.phoneCus = phoneCus;
    }

    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten khach hang : ");nameCus=sc.nextLine();
        System.out.println("Nhap ngay sinh khach hang : ");ageCus=sc.nextLine();
        System.out.println("Nhap gioi tinh khach hang : "); genderCus=sc.nextLine();
        System.out.println("Nhap dia chi khach hang : ");addressCus=sc.nextLine();
        System.out.println("Nhap so dien thoai : ");phoneCus=sc.nextLine();

    }
    public void output(){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n",idCus,  nameCus,  ageCus,  genderCus,  addressCus,  phoneCus);
    }



}
