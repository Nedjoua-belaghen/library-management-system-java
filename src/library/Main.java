/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library;

/**
 *
 * @author Dell
 */
public class Main {

  
   
    public static void main (String[] args){
    Library lib =new Library();
    
     lib.addBook(new Book(1, "Java Programming", "Programming"));
     lib.addBook(new Book(2, "Python Basics", "Programming"));
     lib.addBook(new Book(3, "Artificial Intelligence", "Technology"));
     lib.addBook(new Book(4, "Data Structures", "Computer Science"));
     lib.addBook(new Book(5,"Operating Systems", "Computer Science"));
     lib.addBook(new Book(6,"Database Systems", "IT"));
     lib.addBook(new Book(7,"Machine Learning", "AI"));
     lib.addBook(new Book(8,"Deep Learning", "AI"));
     lib.addBook(new Book(9,"Networks", "IT"));
     lib.addBook(new Book(10,"Cyber Security", "Security"));

     
     lib.saveToFile("Library.txt");
     lib.ShowBooks();
    }
     }



