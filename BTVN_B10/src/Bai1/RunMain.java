package Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Person> person=new ArrayList<>();

        try {

        System.out.print("Input number person: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            Person a=new Person();
            System.out.print("Input id : "); a.setId(sc.nextInt());
            sc.nextLine();
            System.out.print("Input name: ");a.setName(sc.nextLine());
            System.out.print("Input address: ");a.setAddress(sc.nextLine());
            person.add(a);
        }
        }catch (Exception error){
            System.out.println("Nhap du lieu loi,vui long nhap lai !");
            return;
        }
        System.out.println("--------------SORT BY ID--------------------------");
        Collections.sort(person);

        for (Person i : person){
            System.out.println(i.toString());
        }
        System.out.println("--------------SORT BY NAME-------------------------");
        Collections.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getName().compareTo(o2.getName())==0)
                    return o2.getAddress().compareTo(o1.getAddress());
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Person i : person){
            System.out.println(i.toString());
        }
    }
}
