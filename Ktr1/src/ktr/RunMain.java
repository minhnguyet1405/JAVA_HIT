/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ktr;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class RunMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        int n;
        System.out.println("enter n : ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Book a = new Book();
            System.out.println("Enter id : ");
            a.setId(sc.nextInt());
            sc.nextLine();
            System.out.println("Enter name: ");
            a.setName(sc.nextLine());
            System.out.println("Enter publisher: ");
            a.setPublisher(sc.nextLine());
            System.out.println("Enter price: ");
            a.setPrice(sc.nextLong());
            System.out.println("Enter number of page : ");
            a.setNumberOfPage(sc.nextInt());
            sc.nextLine();
            System.out.println("Enter author : ");
            a.setAuthor(sc.nextLine());
            books.add(a);
        }
        int choose;
        do {
            System.out.println("------------Menu----------------");
            System.out.println("| 1.Add a book                  |");
            System.out.println("| 2.Edit book by id             |");
            System.out.println("| 3.Delete book by id           |");
            System.out.println("| 4.Sort books by name          |");
            System.out.println("| 5.Sort books by price         |");
            System.out.println("| 6.Show all books              |");
            System.out.println("| 7.Exit                        |");
            System.out.println("--------------------------------");
            System.out.println("Enter your choose : ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    Add(books);
                    break;
                case 2:
                    EditByID(books);
                    break;
                case 3:
                    DeleteById(books);
                    break;
                case 4:
                    Sortbyname(books);
                    break;
                case 5:
                    SortByPrice(books);
                    break;
                case 6:
                    Showall(books);
                    break;
                case 7:
                    System.out.println("exit");
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong hop le ");
                    break;

            }
        } while (choose != 7);

    }

    public static void Add(ArrayList<Book> books) {
        Scanner sc = new Scanner(System.in);
        Book a = new Book();
        System.out.println("Enter id : ");
        a.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter name: ");
        a.setName(sc.nextLine());
        System.out.println("Enter publisher: ");
        a.setPublisher(sc.nextLine());
        System.out.println("Enter price: ");
        a.setPrice(sc.nextLong());
        System.out.println("Enter number of page : ");
        a.setNumberOfPage(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter author : ");
        a.setAuthor(sc.nextLine());
        books.add(a);

    }

    public static void EditByID(ArrayList<Book> books) {
        Scanner sc = new Scanner(System.in);
        Book s = new Book();
        System.out.println("Enter id : ");
        s.setId(sc.nextInt());
        System.out.println("Enter name: ");
        s.setName(sc.nextLine());
        System.out.println("Enter publisher: ");
        s.setPublisher(sc.nextLine());
        System.out.println("Enter price: ");
        s.setPrice(sc.nextLong());
        System.out.println("Enter new id : ");
        int id=sc.nextInt();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.set(i, s);
            }
        }
    }

    public static void DeleteById(ArrayList<Book> books) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new id : ");
        int id=sc.nextInt();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.remove(i);
            }
        }
    }

    public static void Sortbyname(ArrayList<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            for (int j = i + 1; j < books.size(); j++) {
                String name1 = books.get(i).getName();
                String name2 = books.get(j).getName();
                if (name1.compareToIgnoreCase(name2) > 0) {
                    Book tmp = books.get(i);
                    books.set(i, books.get(j));
                    books.set(j, tmp);
                }
            }
        }
    }

    public static void SortByPrice(ArrayList<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            for (int j = i + 1; j < books.size(); j++) {
                if (books.get(i).getPrice() < books.get(j).getPrice()) {
                    Book tmp = books.get(i);
                    books.set(i, books.get(j));
                    books.set(j, tmp);
                }
            }
        }
    }

    public static void Showall(ArrayList<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Id : " + books.get(i).getId());
            System.out.println("Name: " + books.get(i).getName());
            System.out.println("Publisher: " + books.get(i).getPublisher());
            System.out.println("Price : " + books.get(i).getPrice());
            System.out.println("Number of page : " + books.get(i).getNumberOfPage());
            System.out.println("Author : " + books.get(i).getAuthor());
        }
    }

}
