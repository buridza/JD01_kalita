package com.it.JD01.chapter6.partA.task9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bookcase bookcase = new Bookcase("Железный");
        Bookcase bookcase1 = new Bookcase("Деревянный");
        Bookcase bookcase2 = new Bookcase("Стеклянный");
        /*for (int i = 0; i < 20; i++) {
            bookcase.store(new Book());
        }
        for (int i = 0; i < 15; i++) {
            bookcase.store(new Book());
        }*/
        ArrayList<Bookcase> bookcaseArrayList = new ArrayList<>();
        bookcaseArrayList.add(bookcase1);
        bookcaseArrayList.add(bookcase);
        bookcaseArrayList.add(bookcase2);
        for(int i=0;i<bookcaseArrayList.size();i++)
             System.out.println(bookcaseArrayList.get(i));
        bookcaseArrayList.sort(new BookcaseByIDComparator());
        for(int i=0;i<bookcaseArrayList.size();i++)
            System.out.println(bookcaseArrayList.get(i));
    }

}
