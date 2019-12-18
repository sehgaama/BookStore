/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PurchaseBooksDatabase {
    
    public static void main(String[]args){
        
    }
    
    
    public void purchaseBookOakville(PurchaseBooksModel book){
        try{
        //Create a connection to the JDBC Driver
        Class.forName("com.mysql.jdbc.Driver");
        //Create a connection to tthe mysql server
        Connection con = DriverManager.getConnection
                        //(database, username, password)
                ("jdbc:mysql://localhost/drinks", "root", "root");
        
        Statement st = con.createStatement();
        //MySQL query string        
        String query ="select * from Oakville_campus where id='" +book.getId()+ "'" ;
        ResultSet rs = st.executeQuery(query);
                    String id= rs.getString(1);
                    String title= rs.getString(2);
                    String author= rs.getString(3);
                    Double price=rs.getDouble(4);
                    int inventoryQuantity= rs.getInt(5);
                    String listOfCourses= rs.getString(6);
                    
        System.out.println(query);
        
        st.executeQuery(query);  //Return a table of information
        st.executeUpdate(query); //Change or add a row in the table
        
        //close our connection
        con.close();
        }catch(Exception e){
            System.out.println("Connection fail");
            System.out.println(e);
        }
    }
    
    public void purchaseBookBrampton(PurchaseBooksModel book){
        try{
        //Create a connection to the JDBC Driver
        Class.forName("com.mysql.jdbc.Driver");
        //Create a connection to tthe mysql server
        Connection con = DriverManager.getConnection
                        //(database, username, password)
                ("jdbc:mysql://localhost/drinks", "root", "root");
        
        Statement st = con.createStatement();
        //MySQL query string        
        String query ="select * from Brampton where id='" +book.getId()+ "'" ;
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
    
    public void purchaseBookMississauga(PurchaseBooksModel book){
        try{
        //Create a connection to the JDBC Driver
        Class.forName("com.mysql.jdbc.Driver");
        //Create a connection to tthe mysql server
        Connection con = DriverManager.getConnection
                        //(database, username, password)
                ("jdbc:mysql://localhost/drinks", "root", "root");
        
        Statement st = con.createStatement();
        //MySQL query string        
        String query ="select * from Mississauga where id='" +book.getId()+ "'" ;
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
