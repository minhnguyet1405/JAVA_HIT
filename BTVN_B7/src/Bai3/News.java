package Bai3;

import java.util.List;
import java.util.Scanner;

public class News implements INews {
    Scanner sc= new Scanner(System.in);
    private int id;
    private String title,publishDate,author,content;
    private float averageRate;
    private int[] rateList=new int[3];



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }


    @Override
    public void Display() {
        System.out.println("title : "+getTitle());
        System.out.println("PublishDate: "+getPublishDate());
        System.out.println("Author : "+getAuthor());
        System.out.println("Content: "+getContent());
        System.out.println("AverageRate: "+averageRate);
    }

    public void input(){
        for(int i=0;i<3;i++){
            
            rateList[i]=sc.nextInt();
        }
    }

    public void Calculate(){
        int s=0;
        for(int i=0;i<3;i++){
            s+=rateList[i];
        }
        averageRate=(float)s/3;

    }

}
