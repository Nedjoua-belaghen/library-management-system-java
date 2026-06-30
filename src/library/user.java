/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;


public class user {
    private String name ;
    private int id ;
  public user (String name ,int id ){
  this.id =id;
  this.name= name;
  }
  public String Asstring (){
      return "id"+id +"name"+name;
  }
  public void show (){
  System.out.println(this.Asstring());
  }
}
 interface Borrower{
 void borrowBook(String book);
 void returnBook(String book);
 }

interface Reviewer{
void SuggestBook(String book);
}