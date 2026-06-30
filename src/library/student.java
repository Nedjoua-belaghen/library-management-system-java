/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

public class student extends user implements Borrower {
    public student (String name ,int id){
    super (name ,id);
    }
  public void borrowBook(String book){
  System.out.println(  "borrowed"+ book );
  }
   public void returnBook(String book){
  System.out.println(  "return"+ book );
  }
}
