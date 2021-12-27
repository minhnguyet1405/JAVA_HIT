import com.sun.security.jgss.GSSUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

public class RunMain {
    static Scanner sc = new Scanner(System.in);
    static List<Account> accounts = new ArrayList<>();
    static Account account=new Account();
    static Pattern pattern;
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(" dd/MM/yyyy HH:mm:ss");


    static String regUserName = "^[\\w]{6,}$";
    static String regPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=])[A-Za-z0-9@#$%^&+=]{8,}$";
    static String regPhone = "^[0-9\\-\\+]{9,15}$";
    static String regEmail = "[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}";

    public static void main(String[] args) throws IOException {

        int choose;
        do {
            System.out.println("-----------------------------------");
            System.out.println("|               Menu              |");
            System.out.println("| 1.Create new account            |");
            System.out.println("| 2.Login to an existing account  |");
            System.out.println("| 3.Sort account by userName      |");
            System.out.println("| 4.Exit                          |");
            System.out.println("-----------------------------------");

            System.out.print("Enter choose : ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    sortByUserName();
                    break;
                case 4:
                    System.out.println("exit");
                    break;

            }
        } while (choose != 4);
    }

    public static void createAccount() throws IOException {
        FileWriter fileWriter=new FileWriter("ACC.DAT",true);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        PrintWriter printWriter=new PrintWriter(bufferedWriter);
        long id;
        String fullName, userName, password, email, phone, createAt, rePassword;
        boolean checkId, checkUser, checpassword, checkEmail, checkPhone, checkCreateAt;
        do {
            System.out.println("enter id: ");
            id = sc.nextLong();
            account.setId(id);
            checkId = checkExistId(id);
            if (checkId)
                System.out.println("id already exist!");

        } while (checkId);
        sc.nextLine();
        System.out.println("Enter fullName: ");
        fullName = sc.nextLine();
        account.setFullName(fullName);
        //user
        do {
            System.out.println("enter username: ");
            userName = sc.nextLine();
            account.setUserName(userName);
            pattern = Pattern.compile(regUserName);
            checkUser = pattern.matcher(userName).find();
            if (!checkUser) {
                System.out.println("username invalid");
            } else {
                if (checkExistUser(userName)) {
                    System.out.println("user already exist!");
                }
            }
        } while (checkExistUser(userName) || !checkUser);
        //password

        do {
            System.out.println("enter password: ");
            password = sc.nextLine();
            account.setPassword(password);
            System.out.println("enter rePassword: ");
            rePassword = sc.nextLine();
            pattern = Pattern.compile(regPassword);
            checpassword = pattern.matcher(password).find();
            if (!checpassword) {
                System.out.println("password invailid");
            } else {
                if (password.compareTo(rePassword) != 0)
                    System.out.println("Password and rePassword not match");
                else
                    break;
            }

        } while (!checpassword);
        //email
        do {
            System.out.println("enter email: ");
            email = sc.nextLine();
            account.setEmail(email);
            pattern = Pattern.compile(regEmail);
            checkEmail = pattern.matcher(email).find();
            if (!checkEmail)
                System.out.println("Email invailid!");
            else
                break;
        } while (!checkEmail);

        //phone
        do {
            System.out.println("enter phone : ");
            phone = sc.nextLine();
            account.setPhone(phone);
            pattern = Pattern.compile(regPhone);
            checkPhone = pattern.matcher(phone).find();
            if (!checkPhone)
                System.out.println("Phone invalid");
            else
                break;
        } while (!checkPhone);

        Date date = new Date();
        createAt=simpleDateFormat.format(date);
        account.setCreateAt(createAt);
        accounts.add(account);
        printWriter.println(account.getId() + "|" + account.getFullName() + "|" + account.getUserName() + "|" + account.getPassword() + "|" + account.getEmail() + "|" + account.getPhone() + "|" + account.getCreateAt() + "|" );
//        Account account =new Account(id,fullName,userName,password,email,phone,createAt);
        printWriter.close();
        bufferedWriter.close();
        fileWriter.close();
        Scanner scanner =new Scanner(Paths.get("ACC.DAT"));
        scanner.close();


    }


    public static boolean checkExistId(long id) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkExistUser(String userName) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUserName().compareTo(userName) == 0)
                return true;
        }
        return false;
    }
    public static void login() throws IOException {
        Scanner scanner =new Scanner(Paths.get("ACC.DAT"));
        List<Account> accountList=new ArrayList<>();
        while (scanner.hasNext()){
            String s=scanner.nextLine();
            String []a=s.split("\\|");
            accountList.add(new Account(Integer.parseInt(a[0]),a[1],a[2],a[3],a[4],a[5],a[6]));

        }

        sc.nextLine();
        System.out.println("Enter username: ");
        String userName=sc.nextLine();
        System.out.println("Enter password: ");
        String password=sc.nextLine();
            for(int i=0;i<accountList.size();i++){
                if(accountList.get(i).getUserName().compareTo(userName) == 0 && accountList.get(i).getPassword().compareTo(password)==0)
                {
                    System.out.println("1. ShowInfo");
                    System.out.println("2. ChangePassword");
                    System.out.println("enter choose: ");
                    int choose =sc.nextInt();
                    switch (choose){
                        case 1:
                            accountList.get(i).toString();
                            break;
                        case 2:
                            System.out.println("Enter new password : ");
                            String newpassword=sc.nextLine();
                            accountList.get(i).setPassword(newpassword);
                            FileWriter fileWriter=new FileWriter("ACC.DAT",true);
                            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                            PrintWriter printWriter=new PrintWriter(bufferedWriter);
                            printWriter.println(accountList.get(i).getId() + "|" + accountList.get(i).getFullName() + "|" + accountList.get(i).getUserName() + "|" + accountList.get(i).getPassword() + "|" + accountList.get(i).getEmail() + "|" + accountList.get(i).getPhone() + "|" + accountList.get(i).getCreateAt() + "|" );
                            break;
                        case 3:
                            System.out.println("Exit");
                            break;
                    }

                }else
                    break;

            }
    }
        public static void sortByUserName() throws IOException {
            Scanner scanner =new Scanner(Paths.get("ACC.DAT"));
            List<Account> accountList=new ArrayList<>();
            while (scanner.hasNext()){
                String s=scanner.nextLine();
                String []a=s.split("\\|");
                accountList.add(new Account(Integer.parseInt(a[0]),a[1],a[2],a[3],a[4],a[5],a[6]));

            }
            Collections.sort(accountList, new Comparator<Account>() {
                @Override
                public int compare(Account o1, Account o2) {
                    return o1.getUserName().compareTo(o2.getUserName());
                }
            });
            for(int i=0;i<accountList.size();i++){
                System.out.println(accountList.get(i));
            }
        }

}


