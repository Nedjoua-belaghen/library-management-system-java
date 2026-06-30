/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library;
import java.io.*;
import java.util.ArrayList;

public class Library {
   ArrayList<Book> Books=new ArrayList<>();
   
   public void addBook(Book book){
   Books.add(book);
  
   }
   
   public void serchBook(String name){
      for (Book b : Books){
      if (b.name.equalsIgnoreCase(name)){
          System.out.println("found "+b.name);
          return;
            }
          }
      System.out. println("book not found");
       } 
   
    public void removeBook(String name){
      Books.removeIf(b -> b.name.equalsIgnoreCase(name));
     System.out.println("Book removed"+name);
    }
    
    public void ShowBooks(){
    for (Book b : Books){
        System.out.println("id:"+b.id    
                +  "  name:"+b.name    
                +  "  type:"+b.type);
    }
    }
    
    
    public void borrowBook (String name){
     for(Book b:Books){
       if(b.name.equalsIgnoreCase(name)){
           if(!b.borrowed){
           b.borrowed=true;
           System.out.println("Book borrowed successfully");
           }else{
           System.out.println("Book already borrowed");
           }return;
         }
      }
     System.out.println("Book not found");
    }
     public void returnBook (String name){
     for(Book b:Books){
       if(b.name.equalsIgnoreCase(name)){
           if(b.borrowed){
           b.borrowed=false;
           System.out.println("Book return successfully");
           }else{
           System.out.println("this book was not borrowed");
           }return;
         }
      }
     System.out.println("Book not found");
    }
    
    
    public void saveToFile(String fileName){
        try ( FileWriter Writer= new FileWriter(fileName)){
        for(Book b : Books){
           Writer.write(b.toString()+"\n");
        }
        System.out.println("data has been successfully loaded from file");
        }catch (IOException e) {
        System.out.println("Error saving file");
        }
   
    }}

