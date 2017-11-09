package com.it.JD01.chapter6.partA.task9;

import java.util.ArrayList;
import java.util.Random;

public class Bookcase extends Cupboard {
    private int ID;
    private ArrayList<Book> allBook = new ArrayList<>();

    public Bookcase() {

        super();
        Random random = new Random();
        this.ID = random.nextInt(6000);

    }

    public Bookcase(String type) {
        super(type);
        Random random = new Random();
        this.ID = random.nextInt(6000);
    }

    public int getID() {
        return ID;
    }

    @Override
    public void store(Book book) {
        if(this.allBook.size()<14) {
            this.allBook.add(book);
            System.out.println("Книга добавлена");
        }
        else System.out.println("Больше места нет");
    }

    public ArrayList<Book> getAllBook() {
        return allBook;
    }
    public Book getBook(int index){
        Book book = this.allBook.get(index);
        allBook.remove(index);
        return book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Bookcase bookcase = (Bookcase) o;

        if (ID != bookcase.ID) return false;
        return allBook != null ? allBook.equals(bookcase.allBook) : bookcase.allBook == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + ID;
        result = 31 * result + (allBook != null ? allBook.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bookcase{" +
                "ID=" + ID +
                ", allBook=" + allBook +
                "} " + super.toString();
    }
}
