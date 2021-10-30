/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lythuyet;

/**
 *
 * @author Asus
 */
public class Person {
    private int id;
    public static int cnt=0;
    private String name;
    private int age;
    
    public Person(){
        id=0;
        name="";
        age=0;
    }
    public Person(String name,int age){
        cnt++;
        id=cnt;
        this.name=name;
        this.age=age;
                
    }
    public void setname(String name){
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
    public void setage(int age){
        this.age=age;
    }
    public int getage(){
        return age;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }
    
}
