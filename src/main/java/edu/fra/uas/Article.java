package edu.fra.uas;

/**
 * Article class is the base class for all further articles.
 */
public class Article {
    
    private static long number = 0;
    private double price;
    private long id;

    public Article(){
        number++;
        this.id = number;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setPrice(int euro, int cent){
        this.price = euro + cent/100;
    }

    public void print(){
        System.out.println("Article: " + id + " " + price);
    }

}
