package com.example.iterator;

import java.util.Iterator;

public class Main {

  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("Around the World in 80 Days"));
    bookShelf.appendBook(new Book("Bible"));
    bookShelf.appendBook(new Book("Cinderella"));
    bookShelf.appendBook(new Book("Daddy-Long-Legs"));

    // 명시적 Iterator 사용
    Iterator<Book> it = bookShelf.iterator();
    while (it.hasNext()) {
      Book book = it.next();
      System.out.println(book.getName());
    }
    System.out.println();

    // 확장 for문을 사용
    for (Book book : bookShelf) {
      System.out.println(book.getName());
    }
    System.out.println();

  }
}
