/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;


public class Book {
    int id;
    String name;
    String type;
    boolean borrowed;
   public Book(int id ,String name ,String type){
      this.id=id;
      this.name=name;
      this.type=type;
      this.borrowed= false;
   }
      public String toString() {
        return "ID: " + id + ", Name: " + name + ", Type: " + type;
    }
}

