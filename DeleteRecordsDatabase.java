/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.model;

import ca.sheridancollege.controller.DeleteRecords;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DeleteRecordsDatabase {
    public static void main(String[]args){
        
    }
    
     public void deleteOakville(DeleteRecordsModel Id){
        try{
        //Create a connection to the JDBC Driver
        Class.forName("com.mysql.jdbc.Driver");
        //Create a connection to tthe mysql server
        Connection con = DriverManager.getConnection
                        //(database, username, password)
                ("jdbc:mysql://localhost/drinks", "root", "root");
        
        Statement st = con.createStatement();
        //MySQL query string        
        String query ="delete from Oakville where id= " +Id.getId()+ " ";
          
              
        //st.executeQuery(query)  //Return a table of information
        st.executeUpdate(query); //Change or add a row in the table
        
        //close our connection
        con.close();
        }catch(Exception e){
            System.out.println("Connection fail");
            System.out.println(e);
        }
    }
     
     public void deleteBrampton(DeleteRecordsModel Id){
        try{
        //Create a connection to the JDBC Driver
        Class.forName("com.mysql.jdbc.Driver");
        //Create a connection to tthe mysql server
        Connection con = DriverManager.getConnection
                        //(database, username, password)
                ("jdbc:mysql://localhost/drinks", "root", "root");
        
        Statement st = con.createStatement();
        //MySQL query string        
        String query =" delete from Brampton where id = " +Id.getId()+ " ";
               
        System.out.println("Record deleted successfully");
        
        //st.executeQuery(query)  //Return a table of information
        st.executeUpdate(query); //Change or add a row in the table
        
        //close our connection
        con.close();
        }catch(Exception e){
            System.out.println("Connection fail");
            System.out.println(e);
        }
    }
     
     public void deleteMississauga(DeleteRecordsModel Id){
        try{
        //Create a connection to the JDBC Driver
        Class.forName("com.mysql.jdbc.Driver");
        //Create a connection to tthe mysql server
        Connection con = DriverManager.getConnection
                        //(database, username, password)
                ("jdbc:mysql://localhost/drinks", "root", "root");
        
        Statement st = con.createStatement();
        //MySQL query string        
        System.out.println(Id);
        String query ="delete from Mississauga where id= " +Id.getId()+ " ";
               
        System.out.println("Records deleted successfully");
        
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
