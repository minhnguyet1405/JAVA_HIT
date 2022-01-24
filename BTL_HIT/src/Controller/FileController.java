package Controller;

import Model.*;

import java.io.*;
import java.lang.reflect.Field;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileController {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    private Scanner scanner;

    public void openFleToWrite(String fileName) {
        try {
            fileWriter=new FileWriter(fileName,true);
            bufferedWriter=new BufferedWriter(fileWriter);
            printWriter=new PrintWriter(bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void closeFileAfterWrite(String fileName)  {
        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void writeAccountToFile(Account account, String fileName){
        openFleToWrite(fileName);

        printWriter.println(account.getId()+"|"+account.getFullName()+"|"+account.getUserName()+"|"+account.getEmail()+"|"+account.getPassword()+"|"+account.getCreaAt());
        closeFileAfterWrite(fileName);
    }
    public void writeCustomertoFile(Customer customer,String fileName){
        openFleToWrite(fileName);

        printWriter.println(customer.getIdCus()+"|"+customer.getNameCus()+"|"+customer.getAgeCus()+"|"+customer.getGenderCus()+"|"+customer.getAddressCus()+"|"+customer.getPhoneCus());
        closeFileAfterWrite(fileName);
    }
    public void writeEmployeeToFile(Employee employee,String fileName){
        openFleToWrite(fileName);
        printWriter.println(employee.getIdEmploy()+"|"+employee.getNameEmploy()+"|"+employee.getAgeEmploy()+"|"+employee.getGenderEmploy()+"|"+employee.getAddressEmploy()+"|"+employee.getPhoneEmploy());
        closeFileAfterWrite(fileName);
    }
    public void writeProductToFile(Product product,String fileName){
        openFleToWrite(fileName);
        printWriter.println(product.getIdPro()+"|"+product.getNameProduct()+"|" +
                product.getQuality()+"|"+product.getPrice());
        closeFileAfterWrite(fileName);
    }
    public void writeBillToFile(Bill bill,String fileName){
        openFleToWrite(fileName);

        printWriter.println(bill.getIdBill()+"|"+bill.getIdCus()+"|"+bill.getIdPro()+"|"+bill.getNameProduct()+"|"+bill.getQuality()+"|"+bill.getPrice()
                            +"|"+bill.getTotalMoney());
        closeFileAfterWrite(fileName);
    }
    public ArrayList<Bill> readBillFromFile(String fileName){
        openFileToRead(fileName);
        ArrayList<Bill> bills=new ArrayList<>();
        while (scanner.hasNextLine()){
            String data= scanner.nextLine();
            Bill bill=createBillFromData(data);
            bills.add(bill);
        }
        closeFileToRead(fileName);
        return bills;
    }

    private Bill createBillFromData(String data) {
        String[] datas=data.split("\\|");

        //String idBill, long idCus,long idPro, String nameProduct, int quality, int price,  long totalMoney, String createBill
        Bill bill =new Bill(Integer.parseInt(datas[0]),Integer.parseInt(datas[1]),Integer.parseInt(datas[2]),datas[3],Integer.parseInt(datas[4]),Integer.parseInt(datas[5]),Integer.parseInt(datas[6]));
        return bill;
    }
    public void UpdateBillFile(List<Bill> billList,String fileName){
        File file=new File(fileName);
        if(file.exists()){
            file.delete();
        }
        openFleToWrite(fileName);
        for(Bill bill : billList){
            printWriter.println(bill.getIdBill()+"|"+bill.getIdCus()+"|"+bill.getIdPro()+"|"+bill.getNameProduct()+"|"+bill.getQuality()+"|"+bill.getPrice()
                    +"|"+bill.getTotalMoney());
        }
        closeFileAfterWrite(fileName);
    }
    public void openFileToRead(String fileName){
        try{
            scanner=new Scanner(Paths.get(fileName));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void closeFileToRead(String fileName){
        try{
            scanner.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public ArrayList<Account> readAccountFromFile(String fileName){
        openFileToRead(fileName);
        ArrayList<Account> accounts=new ArrayList<>();
        while (scanner.hasNextLine()){
            String data= scanner.nextLine();
            Account account=createAccountFromData(data);
            accounts.add(account);
        }
        closeFileToRead(fileName);
        return accounts;
    }

    public Account createAccountFromData(String data) {
        String[] datas=data.split("\\|");

        Account account =new Account(Integer.parseInt(datas[0]),datas[1],datas[2],datas[3],datas[4],datas[5]);
        return account;
    }

    public ArrayList<Employee> readEmployeeFromFile(String fileName){
        openFileToRead(fileName);
        ArrayList<Employee> employees=new ArrayList<>();
        while (scanner.hasNextLine()){
            String data=scanner.nextLine();
            Employee employee=createEmployeeFromData(data);
        }
        closeFileToRead(fileName);
        return employees;
    }

    public Employee createEmployeeFromData(String data) {

        String[] datas=data.split("\\|");

        Employee employee =new Employee(Integer.parseInt(datas[0]),datas[1],datas[2],datas[3],datas[4],datas[5]);
        return employee;
    }



    public ArrayList<Customer> readCustomerFromFile(String fileName){
        openFileToRead(fileName);
        ArrayList<Customer> customers=new ArrayList<>();
        while (scanner.hasNextLine()){
            String data=scanner.nextLine();
            Customer customer=createCustomerFromData(data);
            customers.add(customer);
        }
        closeFileToRead(fileName);
        return customers;
    }

    public Customer createCustomerFromData(String data) {
        String[] datas=data.split("\\|");

        Customer customer=new Customer(Integer.parseInt(datas[0]),datas[1],datas[2],datas[3],datas[4],datas[5]);
        return customer;
    }
    public ArrayList<Product> readProductFromFile(String fileName){
        openFileToRead(fileName);
        ArrayList<Product> products=new ArrayList<>();
        while(scanner.hasNextLine()){
            String data=scanner.nextLine();
            Product product= createProductFromData(data);
            products.add(product);
        }
        closeFileToRead(fileName);
        return products;
    }

    public Product createProductFromData(String data) {
        String[] datas=data.split("\\|");
        Product product=new Product(Integer.parseInt(datas[0]),datas[1],Integer.parseInt(datas[2]),Integer.parseInt(datas[3]));
        return product;
    }
    public void UpdateProductFile(List<Product> listProduct,String fileName){
        File file=new File(fileName);
        if(file.exists()){
            file.delete();
        }
        openFleToWrite(fileName);
        for(Product pr : listProduct){
            printWriter.println(pr.getIdPro()+"|"+pr.getNameProduct()+"|" +
                    pr.getQuality()+"|"+pr.getPrice());
        }
        closeFileAfterWrite(fileName);
    }
    public void UpdateCustomerFile(List<Customer> listCus,String fileName){
        File file=new File(fileName);
        if(file.exists()){
            file.delete();
        }
        openFleToWrite(fileName);
        for(Customer cus : listCus){
            printWriter.println(cus.getIdCus()+"|"+cus.getNameCus()+"|"+cus.getAgeCus()+"|"+
                    cus.getGenderCus()+"|" +cus.getAddressCus()+"|"+cus.getPhoneCus());
        }
        closeFileAfterWrite(fileName);
    }
    public void UpdateAccountFile(List<Account> list, String fileName){
        File file = new File(fileName);
        if(file.exists()){
            file.delete();
        }
        openFleToWrite(fileName);
        for(Account acc : list){
            printWriter.println(
                    acc.getId() + "|" + acc.getFullName() + "|" + acc.getUserName() + "|" +
                            acc.getPassword() + "|" + acc.getEmail() + "|" +
                            acc.getCreaAt());
        }
        closeFileAfterWrite(fileName);
    }
}

