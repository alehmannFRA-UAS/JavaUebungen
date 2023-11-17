package edu.fra.uas;

public class Start {
    
    public static void main(String[] args) {
        Article a = new Article();
        Book b = new Book();

        a.setPrice(3.99);

        b.setPrice(12.43);

        a.print();
        b.print();

    }
}
