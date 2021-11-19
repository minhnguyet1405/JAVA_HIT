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
public class Teacher extends Employee {
    Scanner sc = new Scanner(System.in);
    private Subject subject=new Subject();
    private double coefficientsSalary;
    private double salary;
    private int numberOfTeachingHours;
    
    public void input(){
        super.input();
        System.out.println("Enter code subject :");
        subject.setCode(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter name subject : ");
        subject.setName(sc.nextLine());
        System.out.println("Enter CoefficientsSalary: ");
        coefficientsSalary=sc.nextDouble();
        System.out.println("Enter salary : ");
        salary=sc.nextDouble();
        System.out.println("Enter number of teaching hours : ");
        numberOfTeachingHours=sc.nextInt();
    
    }
    public void output(){
        super.output();
        System.out.println("Code subject : "+subject.getCode());
        System.out.println("Name subject : "+subject.getName());
        System.out.println("CoefficientsSalary : "+coefficientsSalary);
        System.out.println("Salary : "+salary);
        System.out.println("Number of teaching hours : "+numberOfTeachingHours);
        
    }
    public double calcuSalary(){
        return coefficientsSalary*1150000+numberOfTeachingHours*6000;
        
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumberOfTeachingHours() {
        return numberOfTeachingHours;
    }

    public void setNumberOfTeachingHours(int numberOfTeachingHours) {
        this.numberOfTeachingHours = numberOfTeachingHours;
    }
}
