package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        ArrayList<News> list = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int choose;
        do{
            System.out.println("Enter choose : ");
            System.out.println("1.Insert news");
            System.out.println("2.View list news");
            System.out.println("3.Average rate");
            System.out.println("4.Exit");
            choose=sc.nextInt();
            switch (choose){
                case 1:
                    News a= new News();
                    sc.nextLine();
                    System.out.print("Enter title: ");
                    a.setTitle(sc.nextLine());
                    System.out.print("Enter publishDate: ");
                    a.setPublishDate(sc.nextLine());
                    System.out.print("Enter author : ");
                    a.setAuthor((sc.nextLine()));
                    System.out.print("Enter content: ");
                    a.setContent(sc.nextLine());
                    System.out.println("Enter rate : ");
                    a.input();
                    list.add(a);
                    break;
                case 2:
                    for(int i=0;i<list.size();i++){
                        System.out.println("==================================");
                        list.get(i).Display();
                    }
                    break;
                case 3:
                    for(int i=0;i<list.size();i++){
                        list.get(i).Calculate();
                        System.out.println("==================================");
                        list.get(i).Display();
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    System.exit(0);

            }
        }while(choose!=4);
    }
}
