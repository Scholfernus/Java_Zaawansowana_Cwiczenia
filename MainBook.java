package org.example.Zadania_Zaawansowana.Books;

import java.util.List;

public class MainBook {
    public static void main(String[] args) throws NoBookFoundException {
    BookRepository bookRepository = new BookRepository();
    bookRepository.addBook("Klucz Jeff.", "Steve Berry", "987655-2g78", 2019);
    bookRepository.addBook("Wiedźmin","Sapkowski", "8971-h77890", 2017);
    //book.findBook("Steve Berry");
    bookRepository.findIdBook("987655-2g78");
        List<Book> bookList = bookRepository.findByName("Klucz Jeff");
        Book book1 = bookRepository.findByIsbn("8971-h77890");
        bookRepository.removeBook("Wiedźmin");
        bookList.add(1524,book1);
        System.out.println("Wiedźmin out");
    }
}
