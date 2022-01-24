package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class Bill extends Product implements Comparator<Bill> {
    private static int id=0;
    private long idBill;
    private long idCus;
    private long totalMoney;
    //private String createBill;

    Scanner sc=new Scanner(System.in);
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat(" dd/MM/yyyy HH:mm:ss");

    public Bill() {
    }

    public Bill(long idBill, long idCus, long idPro, String nameProduct, int quality, int price, long totalMoney) {
        super(idPro, nameProduct, quality, price);
        this.idBill = idBill;
        this.idCus = idCus;
        this.totalMoney=totalMoney;


    }



    public long getIdBill() {
        return idBill;
    }

    public void setIdBill(long idBill) {
        this.idBill = idBill;
    }


    public long getIdCus() {
        return idCus;
    }

    public void setIdCus(long idCus) {
        this.idCus = idCus;
    }

    public long getTotalMoney() {
        return quality*price;
    }

    public void output(){
        System.out.println("Hoa don ");
        //
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",idBill,idCus,idPro,nameProduct,quality,price,totalMoney);


    }


    @Override
    public int compare(Bill o1, Bill o2) {
        return o1.getPrice()*o1.getQuality()-o2.getPrice()*o2.getQuality();
    }
}
