/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author Asus
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private String hobby;
    
    public Person(){
        name="";
        age=0;
        gender=hobby="";
    }
    public Person(String name,int age,String gender,String hobby){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.hobby=hobby;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setage(int age){
        this.age=age;
    }
    public int getage(){
        return age;
        
    }
    public void setgender(String gender){
        this.gender=gender;
    }
    public String getgender(){
        return gender;
    }
    public String sethobby(String hobby){
        this.hobby=hobby;
    }
    public String gethobby(){
        return hobby;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", gender=" + gender + ", hobby=" + hobby + '}';
    }
    
}
