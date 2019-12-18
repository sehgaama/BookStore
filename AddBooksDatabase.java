/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.database;

import ca.sheridancollege.beans.AddBooks;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author 14372
 */
public class AddBooksDatabase {
    
    public static void main(String[]args){
        
    }
    
    public void addBookOakville(AddBooks book){
        try{
        //Create a connection to the JDBC Driver
        Class.forName("com.mysql.jdbc.Driver");
        //Create a connection to tthe mysql server
        Connection con = DriverManager.getConnection
                        //(database, username, password)
                ("jdbc:mysql://localhost/drinks", "root", "root");
        
        Statement st = con.createStatement();
        //MySQL query string        
        String query ="INSERT INTO Oakville(Title, Author, Price, Inventory_Quantity, List_of_Courses) VALUES "
                + "('" + book.getTitle() + "',"
                + "'" + book.getAuthor() + "',"
                + "'" + book.getPrice() + "',"
                + "'" + book.getInventoryQuantity() + "',"
                + "'" + book.getListOfCourses() + "')" ;
        System.out.println(query);
        
        //st.executeQuery(query)  //Return a table of information
        st.executeUpdate(query); //Change or add a row in the table
        
        //close our connection
        con.close();
        }catch(Exception e){
            System.out.println("Connection fail");
            System.out.println(e);
        }
    }
    
    public void addBookBrampton(AddBooks book){
        try{
        //Create a connection to the JDBC Driver
        Class.forName("com.mysql.jdbc.Driver");
        //Create a connection to tthe mysql server
        Connection con = DriverManager.getConnection
                        //(database, username, password)
                ("jdbc:mysql://localhost/drinks", "root", "root");
        
        Statement st = con.createStatement();
        //MySQL query string        
        String query ="INSERT INTO Brampton(Title, Author, Price, Inventory_Quantity, List_of_Courses) VALUES "  
                + "(' " + book.getTitle() + "',"
                + "' " + book.getAuthor() + "',"
                + "' " + book.getPrice() + "',"
                + "' " + book.getInventoryQuantity() + "',"
                + "' " + book.getListOfCourses() + "')" ;
        System.out.println(query);
        
        //st.executeQuery(query)  //Return a table of information
        st.executeUpdate(query); //Change or add a row in the table
        
        //close our connection
        con.close();
        }catch(Exception e){
            System.out.println("Connection fail");
            System.out.println(e);
        }
    }
    
    public void addBookMississauga(AddBooks book){
        try{
        //Create a connection to the JDBC Driver
        Class.forName("com.mysql.jdbc.Driver");
        //Create a connection to tthe mysql server
        Connection con = DriverManager.getConnection
                        //(database, username, password)
                ("jdbc:mysql://localhost/drinks", "root", "root");
        
        Statement st = con.createStatement();
        //MySQL query string        
        String query ="INSERT INTO Mississauga(Title, Author, Price, Inventory_Quantity, List_of_Courses) VALUES "                
                + "(' " + book.getTitle() + "',"
                + "' " + book.getAuthor() + "',"
                + "' " + book.getPrice() + "',"
                + "' " + book.getInventoryQuantity() + "',"
                + "' " + book.getListOfCourses() + "')" ;
        System.out.println(query);
        
        //st.executeQuery(query)  //Return a table of information
        st.executeUpdate(query); //Change or add a row in the table
        
        //close our connection
        con.close();
        }catch(Exception e){
            System.out.println("Connection fail");
            System.out.println(e);
        }
    }
    
}
