package org.example.Zadania_Zaawansowana.Books;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public BookRepository(Book book) {
        this.books.add(book);
    }

    public BookRepository() {

    }

    public void addBook(String book, String author, String ibsn, int year) {
    }

    public void removeBook(String book) {
    }


    public void findIdBook(String id) {
    }

    public void removeIdBook(String isbn) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                books.remove(book);
                return;
            }
        }
        throw new NoBookFoundException("Can't remove book with isbn -> " + isbn);
    }

    public void findBook(String author) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) ;
            books.contains(book);
            return;
        }
        throw new NoBookFoundException("We found book author ->" + author);
    }

    public List<Book> findByName(String name) throws NoBookFoundException {
        List<Book> booksByName = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(name)) {
                booksByName.add(book);
            }
        }
        if (booksByName.isEmpty()) {
            throw new NoBookFoundException("Can't find book with name: " + name);
        }
        return booksByName;
    }
    public Book findByIsbn(String isbn) throws NoBookFoundException {
        for (Book ksiazka : books) {
            if (ksiazka.getISBN().equals(isbn)) {
                return ksiazka;
            }
        }
        throw new NoBookFoundException("Can't find book with isbn: " + isbn);
    }
}


