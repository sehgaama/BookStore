/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author 14372
 */
public class EditRecordDatabase {
    
    public static void main(String[]args){
        
    }
    
    public void editBookOakville(EditRecordModel book){
        try{
        //Create a connection to the JDBC Driver
        Class.forName("com.mysql.jdbc.Driver");
        //Create a connection to tthe mysql server
        Connection con = DriverManager.getConnection
                        //(database, username, password)
                ("jdbc:mysql://localhost/drinks", "root", "root");
        
        Statement st = con.createStatement();
        //MySQL query string        
        String query ="update Oakville set Title = '" +book.getTitle()+ "', Author = '" +book.getAuthor()+ "', Price = '"+book.getPrice()+ "'"
                + ", Inventory_Quantity = '" +book.getInventoryQuantity()+ "', List_of_Courses = '" +book.getListOfCourses()+ "' where id = " +book.getId()+ "";
                
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
    
    public void editBookBrampton(EditRecordModel book){
        try{
        //Create a connection to the JDBC Driver
        Class.forName("com.mysql.jdbc.Driver");
        //Create a connection to tthe mysql server
        Connection con = DriverManager.getConnection
                        //(database, username, password)
                ("jdbc:mysql://localhost/drinks", "root", "root");
        
        Statement st = con.createStatement();
        //MySQL query string        
        String query ="update Brampton set Title = '" +book.getTitle()+ "', Author = '" +book.getAuthor()+ "', Price = '"+book.getPrice()+ "'"
                + ", Inventory_Quantity = '" +book.getInventoryQuantity()+ "', List_of_Courses = '" +book.getListOfCourses()+ "' where id = " +book.getId()+ "";
                
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
    
    public void editBookMississauga(EditRecordModel book){
        try{
        //Create a connection to the JDBC Driver
        Class.forName("com.mysql.jdbc.Driver");
        //Create a connection to tthe mysql server
        Connection con = DriverManager.getConnection
                        //(database, username, password)
                ("jdbc:mysql://localhost/drinks", "root", "root");
        
        Statement st = con.createStatement();
        //MySQL query string        
        String query ="update Mississauga set Title = '" +book.getTitle()+ "', Author = '" +book.getAuthor()+ "', Price = '"+book.getPrice()+ "'"
                + ", Inventory_Quantity = '" +book.getInventoryQuantity()+ "', List_of_Courses = '" +book.getListOfCourses()+ "' where id = " +book.getId()+ "";
                
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
