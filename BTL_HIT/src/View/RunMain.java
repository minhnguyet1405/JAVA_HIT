package View;

import Controller.FileController;
import Model.Account;
import Model.Bill;
import Model.Customer;
import Model.Product;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

public class RunMain {

    static Scanner sc = new Scanner(System.in);
    static List<Account> accounts = new ArrayList<>();
    static List<Customer> customers = new ArrayList<>();
    static List<Product> products = new ArrayList<>();
    static List<Bill> bills=new ArrayList<>();
    static FileController file = new FileController();
    static Pattern pattern;
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(" dd/MM/yyyy HH:mm:ss");






    public static void main(String[] args) {

        menu();
    }
    public static void menu(){
        int choose;
        do {
            System.out.println("_______________________________________");
            System.out.println("|               Menu                   |");
            System.out.println("|             1.Đăng ký                |");
            System.out.println("|             2.Đăng nhập              |");
            System.out.println("|             0.Thoát                  |");
            System.out.println("|______________________________________|");
            System.out.println("Mời nhập lựa chọn của bạn : ");
            choose=sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    CreateAccount();
                    break;
                case 2:
                    Login();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }while (choose!=0);
    }

    public static void CreateAccount() {

        boolean check;
        String fullname, userName, password, email, createAt, rePassword;
        boolean  checkUser,checkExistusername, checkpassword, checkEmail;
        String regUserName = "^[\\w]{6,}$";
        String regPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=])[A-Za-z0-9@#$%^&+=]{8,}$";
        String regPhone = "^[0-9\\-\\+]{9,15}$";
        String regEmail = "[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}";
//        boolean checkidAcc = false;
//        if (!checkidAcc) {
//            checkIdAcc(file, "ACCOUNT.txt");
//            checkidAcc = true;
//        }

        System.out.println("Enter fullName: ");fullname=sc.nextLine();
        do{
            System.out.println("Enter username : ");userName=sc.nextLine();
            pattern=Pattern.compile(regUserName);
            checkUser=pattern.matcher(userName).find();
            if(!checkUser){
                System.out.println("Username khong hop le !");

            }else{
                if(checkExistUser(userName)){
                    System.out.println("Username da ton tai !");
                }
            }

        }while (checkExistUser(userName)||!checkUser);
        do {
            System.out.println("enter email: ");
            email = sc.nextLine();
            pattern = Pattern.compile(regEmail);
            checkEmail = pattern.matcher(email).find();
            if (!checkEmail)
                System.out.println("Email khong hop le!");
            else
                break;
        } while (!checkEmail);
        do {
            check=false;
            System.out.println("enter password: ");
            password = sc.nextLine();
            System.out.println("enter rePassword: ");
            rePassword = sc.nextLine();
            pattern = Pattern.compile(regPassword);
            checkpassword = pattern.matcher(password).find();
            if (!checkpassword) {
                System.out.println("password invailid");
            } else {
                if (password.compareTo(rePassword) != 0){
                    System.out.println("Password and rePassword not match");
                }
                else
                    check=true;

            }
        } while (!checkpassword || !check );
        //email

        Date date=new Date();
        createAt=simpleDateFormat.format(date);
        Account account=new Account(0,fullname,userName,email,password,createAt);
        accounts.add(account);
        file.writeAccountToFile(account,"ACCOUNT.txt");
        System.out.println("Dang ki thanh cong!");

    }
    public static boolean checkExistUser(String userName) {
        accounts=file.readAccountFromFile("ACCOUNT.txt");
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUserName().compareTo(userName) == 0)
                return true;
        }
        return false;
    }
    public static void Login(){
        accounts=file.readAccountFromFile("ACCOUNT.txt");
        String email,password;
        System.out.println("Nhap email: ");
        email=sc.nextLine();
        System.out.println("Nhap password: ");
        password=sc.nextLine();
        boolean check=false;
        for(int i=0;i<accounts.size();i++){
            if(accounts.get(i).getEmail().compareTo(email)==0 && accounts.get(i).getPassword().compareTo(password)==0){
                check=true;
            }
        }
        if(check){
            int choice;
            do {

                System.out.println();
                System.out.println("==========================================");
                System.out.println("||                   Menu                ||");
                System.out.println("||               1.Khach hang            ||");
                System.out.println("||               2.Admin                 ||");
                System.out.println("||               4.Thoat                 ||");
                System.out.println("===========================================");
                System.out.println("Moi nhap lua chon : ");
                choice=sc.nextInt();
                sc.nextLine();
                switch (choice){
                    case 1:
                        CustomerManagement();
                        break;
                    case 2:
                        Admin();
                        break;
                    case 3:
                        break;
                }

            }while (choice!=0);
        }else
            System.out.println("Email hoac password khong hop le!");
    }

    private static void Admin() {
        int choice;
        do {
            System.out.println("=============================================");
            System.out.println("||                  MENU                    ||" );
            System.out.println("|| 0.Thoat                                  ||");
            System.out.println("|| 1.Xem thong tin khach hang               ||");
            System.out.println("|| 2.Tim kiem khach hang theo id            ||");
            System.out.println("|| 3.Tim kiem khach hang theo ten           ||");
            System.out.println("|| 4.Sap xep khach hang theo ten            ||");
            System.out.println("|| 5.Them san pham vao danh sach            ||");
            System.out.println("|| 6.Xoa san pham khoi danh sach            ||");
            System.out.println("|| 7.Sap xep danh sach san pham             ||");
            System.out.println("|| 8.Xem danh sach san pham                 ||");
            System.out.println("||                                          ||");
            System.out.println("==============================================");

            System.out.println("Moi ban nhap lua chon : ");
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0:
                    break;
                case 1:
                    ShowCustomer();
                    break;
                case 2:
                    SearchCustomerById();
                    break;
                case 3:
                    SearchCustomerByName();
                    break;
                case 4:
                    SortCusByName();
                    break;
                case 5:
                    AddProduct();
                    break;
                case 6:
                    deleteProduct();
                    break;
                case 7:
                    SortCusByName();
                    break;
                case 8:
                    ShowProduct();
                    break;
                default:
                    System.out.println("lua chon khong hop le!");
                    break;


            }
        }while (choice!=0);
    }




    private static void ShowProduct() {
        products = file.readProductFromFile("PRODUCT.txt");
        System.out.println("Danh sach san pham : ");
        System.out.printf("%-15S %-15S %-15S %-15S\n", "idPro", "nameProduct", "quality", "price");
        for (int i = 0; i < products.size(); i++) {
            products.get(i).output();
        }
    }

    private static void AddProduct() {
        boolean checkPro = false;
        if (!checkPro) {
            checkId(file, "PRODUCT.txt");
            checkPro = true;
        }
        String namePro;
        int quatity, price;
        System.out.println("Nhap loai hang can them : ");
        namePro = sc.nextLine();
        System.out.println("Nhap so luong : ");
        quatity = sc.nextInt();
        System.out.println("Nhap gia : ");
        price = sc.nextInt();
        Product product = new Product(0, namePro, quatity, price);
        products.add(product);
        file.writeProductToFile(product, "PRODUCT.txt");

    }

    private static void checkId(FileController file, String fileName) {
        products = file.readProductFromFile(fileName);
        Product.setId(products.get(products.size() - 1).getIdPro() + 1);

    }
    public static void checkIdCustomer(FileController file,String fileName){
        customers=file.readCustomerFromFile(fileName);
        Customer.setId(customers.get(customers.size()-1).getIdCus()+1);
    }
    public static void checkIdAcc(FileController file,String fileName){
        accounts=file.readAccountFromFile(fileName);
        Account.setIdAc(accounts.get(accounts.size()-1).getIdAc()+1);
    }

    private static boolean checkIdExist(long id) {
        products = file.readProductFromFile("PRODUCT.txt");
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getIdPro() == id)
                return true;
        }
        return false;
    }

    private static void deleteProduct() {
        products = file.readProductFromFile("PRODUCT.txt");
        String name;
        boolean check = false;
        System.out.println("Nhap ten san pham ban muon xoa khoi danh sach : ");
        name = sc.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getNameProduct().compareToIgnoreCase(name) == 0) {
                check = true;
                products.remove(i);

            }
        }
        file.UpdateProductFile(products,"PRODUCT.txt");
        if(!check)
            System.out.println("Khong ton tai ten ban muon xoa!");
        else
            System.out.println("Xoa thanh cong!");

}

    private static void SearchProduct() {
        products = file.readProductFromFile("PRODUCT.txt");
        long id;
        String name;
        int choice;
        do {
            System.out.println("=================================");
            System.out.println("||              Menu           ||");
            System.out.println("|| 1.Tim kiem theo id          ||");
            System.out.println("|| 2.Tim kiem theo ten         ||");
            System.out.println("|| 0.Thoat                     ||");
            System.out.println("||                             ||");
            System.out.println("=================================");
            System.out.println("Lua chon cua ban la : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("Nhap id san pham ban muon tim kiem : ");
                        id = sc.nextLong();
                        if (!checkIdExist(id))
                            System.out.println("Khong ton tai id nay! Moi ban nhap lai !");
                    } while (!checkIdExist(id));
                    System.out.println("======================================");
                    for (int i = 0; i < products.size(); i++)
                        if (products.get(i).getIdPro() == id)
                            products.get(i).output();

                    break;
                case 2:
                    boolean check;
                    do {
                        check = false;
                        System.out.println("Nhap ten san pham ban muon tim kiem : ");
                        name = sc.nextLine();
                        for (int i = 0; i < products.size(); i++) {
                            if (products.get(i).getNameProduct().compareToIgnoreCase(name) == 0) ;
                            {
                                products.get(i).output();
                                check = true;

                            }
                        }
                        if (!check)
                            System.out.println("Khong ton tai ten san pham nay !");

                    } while (!check);
                    break;
                case 0:
                    break;

            }
        } while (choice != 0);
    }

    private static void SortProduct() {
        products = file.readProductFromFile("PRODUCT.txt");

        Collections.sort(products);
        System.out.println("_______________________________");
        System.out.println("Danh sach sau khi sap xep la!");
        for (int i = 0; i < products.size(); i++) {
            products.get(i).output();
        }
    }
    public static void buyPro(){
        products=file.readProductFromFile("PRODUCT.txt");
        long idbuy;
        int quality;
        boolean check=false,k=false;
        System.out.println("Nhap id san pham ban muon mua : ");
        idbuy=sc.nextLong();
        for(int i=0;i<products.size();i++){
            if(products.get(i).getIdPro()==idbuy){
                check=true;
            }
        }
        if(check){
            System.out.println("Nhap so luong san pham muon mua : ");
            quality=sc.nextInt();
            System.out.println(products.size());
            for(int i=0;i<products.size();i++){
                if(quality<=products.get(i).getQuality() && products.get(i).getIdPro()==idbuy){

                    products.get(i).setQuality(products.get(i).getQuality()-quality);

                    file.UpdateProductFile(products,"PRODUCT.txt");

                }
            }
            System.out.println("Mua thanh cong ");

        }else
            System.out.println("khong ton tai id nay!");


    }
    public static void CustomerManagement(){
        int choice;
        do {
            System.out.println("=============================================");
            System.out.println("||                  Menu                    ||");
            System.out.println("|| 0.Thoat                                  ||");
            System.out.println("|| 1.Xem danh sach san pham                 ||");
            System.out.println("|| 2.Tim kiem san pham                      ||");
            System.out.println("|| 3.Thay doi thong tin                     ||");
            System.out.println("|| 4.Mua hang                               ||");
            System.out.println("||                                          ||");
            System.out.println("==============================================");
            System.out.println("Lua chon cua ban la : ");
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0:
                    break;
                case 1:
                    ShowProduct();
                    break;
                case 2:
                    SearchProduct();
                    break;
                case 3:
                    ChangeCustomer();
                    break;
                case 4:
                    buyPro();
                    break;
                default:
                    System.out.println("Lua chon khong ton tai!");
                    break;
                    
            }
            
        }while (choice!=0);
    }

    public static void ShowCustomer() {
        customers=file.readCustomerFromFile("CUSTOMER.txt");
        System.out.println("Thong tin khach hang !");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n","idCus",  "nameCus",  "ageCus",  "genderCus",  "addressCus",  "phoneCus");
        for(int i=0;i<customers.size();i++){
            customers.get(i).output();
        }
    }

    public static boolean CheckIdCus(long id){
        customers=file.readCustomerFromFile("CUSTOMER.txt");
        for(int i=0;i<customers.size();i++){
            if(customers.get(i).getIdCus()==id)
                return true;

        }
        return false;

    }

    public static void SearchCustomerById() {
        customers=file.readCustomerFromFile("CUSTOMER.txt");
        long id;
        System.out.println("Nhap id khach hang ban muon tim kiem : ");
        do {
            id=sc.nextInt();
            if(!CheckIdCus(id))
                System.out.println("Khong ton tai id nay. Yeu cau ban nhap lai id!");
        }while (!CheckIdCus(id));
        for(int i=0;i<customers.size();i++)
        {
            if(customers.get(i).getIdCus()==id)
                customers.get(i).output();
        }

    }

    private static void SearchCustomerByName() {
        customers=file.readCustomerFromFile("CUSTOMER.txt");
        String name;
        boolean check;
        System.out.println("Nhap ten khach hang ban muon tim kiem : ");
        do {
            check=false;
            name=sc.nextLine();
            for(int i=0;i<customers.size();i++){
                if(customers.get(i).getNameCus().compareToIgnoreCase(name)==0){
                    customers.get(i).output();
                    check=true;
                }
            }
            if(!check)
                System.out.println("Khong ton tai ten khach hang ban muon tim kiem !");
        }while (!check);

    }

    private static void ChangeCustomer() {
        customers=file.readCustomerFromFile("CUSTOMER.txt");
        long id;
        System.out.println("Nhap id khach hang ban muon sua doi : ");
        do {
            id=sc.nextInt();
            if(!CheckIdCus(id))
                System.out.println("khong ton tai id nay ! Yeu cau nhap lai !");
        }while (!CheckIdCus(id));
        int choice;
        do {
            System.out.println("===========================================");
            System.out.println("||                 Menu                  ||");
            System.out.println("|| 0.Thoat                               ||");
            System.out.println("|| 1.Sua ten                             ||");
            System.out.println("|| 2.Sua Dia chi                         ||");
            System.out.println("|| 3.Sua so dien thoai                   ||");
            System.out.println("||                                       ||");
            System.out.println("===========================================");
            System.out.println("lua chon cua ban la : ");
            choice=sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 0:
                    break;
                case 1:
                    for(int i=0;i<customers.size();i++){
                        if(customers.get(i).getIdCus()==id){
                            System.out.println("Nhap ten moi cua ban : ");
                            customers.get(i).setNameCus(sc.nextLine());

                        }
                    }
                    file.UpdateCustomerFile(customers,"CUSTOMER.txt");
                    break;
                case 2:
                    for(int i=0;i<customers.size();i++){
                        if(customers.get(i).getIdCus()==id){
                            System.out.println("Nhap dia chi moi cua ban : ");
                            customers.get(i).setAddressCus(sc.nextLine());
                        }
                    }
                    file.UpdateCustomerFile(customers,"CUSTOMER.txt");
                    break;
                case 3:
                    for(int i=0;i<customers.size();i++){
                        if(customers.get(i).getIdCus()==id){
                            System.out.println("Nhap so dien thoai moi : ");
                            customers.get(i).setPhoneCus(sc.nextLine());
                        }
                    }
                    file.UpdateCustomerFile(customers,"CUSTOMER.txt");
                    break;

            }
        }while (choice!=0);
    }

    private static void SortCusByName() {
        customers=file.readCustomerFromFile("CUSTOMER.txt");
        for(int i=0;i<customers.size();i++){
            for(int j=i+1;j<customers.size();j++){
                if(customers.get(i).getNameCus().compareToIgnoreCase(customers.get(j).getNameCus())>0){
                    Customer tmp=customers.get(i);
                    customers.set(i,customers.get(j));
                    customers.set(j,tmp);
                }
            }
        }
    }
    public static void add(){
        String nameCus, ageCus,  genderCus,  addressCus,  phoneCus;
        boolean checkcus = false;
        if (!checkcus) {
            checkIdCustomer(file, "PRODUCT.txt");
            checkcus = true;
        }
        System.out.println("Nhap ten khach hang : ");nameCus=sc.nextLine();
        System.out.println("Nhap tuoi khach hang : ");ageCus=sc.nextLine();
        System.out.println("Nhap gioi tinh khach hang : ");genderCus=sc.nextLine();
        System.out.println("Nhap dia chi khach hang : ");addressCus=sc.nextLine();
        System.out.println("Nhap so dien thoai : ");phoneCus=sc.nextLine();
        Customer customer=new Customer(0,nameCus,ageCus,genderCus,addressCus,phoneCus);
        customers.add(customer);
        file.writeCustomertoFile(customer,"CUSTOMER.txt");
    }
//    public void showBillCustomer(){
////        bills=file.readBillFromFile("BILL.txt");
//        long id;
//        System.out.println("Nhap id khach hang  : ");
//        do {
//            id=sc.nextInt();
//            if(!CheckIdCus(id))
//                System.out.println("Khong ton tai id nay. Yeu cau ban nhap lai id!");
//        }while (!CheckIdCus(id));
//        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n","idBill","idCus","idPro","nameProduct","quality","price","Total","createBill");
//        for(int i=0;i<bills.size();i++){
//            if(bills.get(i).getIdCus()==id)
//                bills.get(i).output();
//        }
//    }
//    public static void showBill(){
//        bills=file.readBillFromFile("BILL.txt");
//        System.out.println("Danh sach tat ca hoa don : ");
//        for(int i=0;i<bills.size();i++){
//            bills.get(i).output();
//        }
//    }
//    public static void sortBillByTotal(){
//        bills=file.readBillFromFile("BILL.txt");
//        Collections.sort(bills);
//        System.out.println("Danh sach bill sau khi sap xep la:");
//        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n","idBill","idCus","idPro","nameProduct","quality","price","Total","createBill");
//        for(int i=0;i<bills.size();i++){
//            bills.get(i).output();
//        }
//    }
//    public static void creatBill(){
//        products=file.readProductFromFile("PRODUCT.txt");
//
//    }



}
