/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Employee {
    Scanner sc=new Scanner(System.in);
    protected int code;
    protected String surname;
    protected String name;
    protected Date dateOfBirth=new Date();
    protected int yearWorking;
    
    public void input(){
        System.out.println("Enter code : ");
        code=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter surname: ");
        surname=sc.nextLine();
        System.out.println("Enter name : ");
        name=sc.nextLine();
        System.out.println("Enter day : ");
        dateOfBirth.setDay(sc.nextInt());
        System.out.println("Enter month: ");
        dateOfBirth.setMonth(sc.nextInt());
        System.out.println("Enter year : ");
        dateOfBirth.setYear(sc.nextInt());
    }
    public void output(){
        System.out.println("Code : "+code);
        System.out.println("Surname : "+surname);
        System.out.println("Name : "+name);
        System.out.println("Date : "+dateOfBirth.getDay()+"/"+dateOfBirth.getMonth()+"/"+dateOfBirth.getYear());
        System.out.println("Year working : "+yearWorking);
        
    }

    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getYearWorking() {
        return yearWorking;
    }

    public void setYearWorking(int yearWorking) {
        this.yearWorking = yearWorking;
    }
    
}
