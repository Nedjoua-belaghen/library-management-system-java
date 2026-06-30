/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import javax.swing.*;

import java.awt.Color;

public class Search extends JFrame {
    private Library lib ;
    private JTextField textField;
    private JButton SearchButton ;
    private JTextArea resltArea ;
    
  public Search (Library lib){
   this.lib=lib ;
   
   setTitle("Search Book");
   setSize(400 , 300);
   setLayout(null);
   getContentPane().setBackground(new Color(166,131,99));
  
  
   
        textField = new JTextField();
        textField.setBounds(50, 30, 200, 30);
        add(textField);

        
        SearchButton = new JButton("Search");
        SearchButton.setBounds(260, 30, 80, 30);
        add(SearchButton);

        
        resltArea= new JTextArea();
        resltArea.setBounds(50, 80, 290, 150);
        resltArea.setEditable(false); 
        add( resltArea);

        
       SearchButton.addActionListener(e -> searchBook());

        setVisible(true);
    }

    private void searchBook() {
        String name = textField.getText().trim(); 
        boolean found = false;

        for (Book b : lib.Books) {
            if (b.name.equalsIgnoreCase(name)) {
            resltArea.setText("Found:\nID: " + b.id +
                                   "\nName: " + b.name +
                                   "\nType: " + b.type);
             found = true;
                break;
            }
        }

        if (!found) {
            resltArea.setText("Book not found");
        }
    }
}
   
  

    
