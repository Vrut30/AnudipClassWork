/* 4.Write a Java program to create a class called "Book" with attributes for title,author, and ISBN, and 
 methods to add and remove books from a collection.*/

package com.javacore.demo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Book 
{
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) 
    {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor() 
    {
        return author;
    }

    public void setAuthor(String author) 
    {
        this.author = author;
    }

    public String getISBN() 
    {
        return ISBN;
    }

    public void setISBN(String ISBN) 
    {
        this.ISBN = ISBN;
    }

    public static class BookCollection 
    {
        private List<Book> books = new ArrayList<>();

        public void addBook(Book book) 
        {
            books.add(book);
        }

        public void removeBook(Book book) 
        {
            books.remove(book);
        }

        public List<Book> getBooks() 
        {
            return books;
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        BookCollection collection = new BookCollection();

        // Add a book
        System.out.print("Enter the title of the book to add: ");
        String title = scanner.nextLine();

        System.out.print("Enter the author of the book to add: ");
        String author = scanner.nextLine();

        System.out.print("Enter the ISBN of the book to add: ");
        String ISBN = scanner.nextLine();

        Book newBook = new Book(title, author, ISBN);
        collection.addBook(newBook);
        System.out.println("New Book added - Title: " + newBook.getTitle() + ", Author: " + newBook.getAuthor() + ", ISBN: " + newBook.getISBN());

        // Remove a book
        System.out.print("Enter the title of the book to remove: ");
        String titleToRemove = scanner.nextLine();

        for (Book book : collection.getBooks()) {
            if (book.getTitle().equals(titleToRemove)) 
            {
                collection.removeBook(book);
                System.out.println("Book removed: " + book.getTitle());
                break;
            }
        }

        scanner.close();
    }
}