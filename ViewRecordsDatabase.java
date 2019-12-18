/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.database;

import ca.sheridancollege.beans.AddBooks;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 14372
 */
public class ViewRecordsDatabase {
    
    public ArrayList<AddBooks> viewBooksOakville(HttpServletRequest request, HttpServletResponse response){
ArrayList<AddBooks> books = new ArrayList<AddBooks>();
try {
Class.forName("com.mysql.jdbc.Driver");
Connection conn = null;
conn = DriverManager.getConnection
("jdbc:mysql://localhost/drinks", "root", "root");

String Query = "SELECT * FROM Oakville";

Statement st = conn.createStatement();

ResultSet rs = st.executeQuery(Query);

while (rs.next()) {
int id = rs.getInt(1);
String title = rs.getString(2);
String author = rs.getString(3);
double price = rs.getDouble(4);
int inventoryQuantity = rs.getInt(5);
String listOfCourses = rs.getString(6);

AddBooks d = new AddBooks(title, author, price, inventoryQuantity, listOfCourses);
books.add(d);
}
conn.close();
}
catch (Exception e) {
System.out.println(e);
}
return books;
}
    
    public static ArrayList<AddBooks> viewBooksBrampton(HttpServletRequest request, HttpServletResponse response){
ArrayList<AddBooks> books = new ArrayList<AddBooks>();
try {
Class.forName("com.mysql.jdbc.Driver");
Connection conn = null;
conn = DriverManager.getConnection
("jdbc:mysql://localhost/drinks", "root", "root");

String Query = "SELECT * FROM Brampton";

Statement st = conn.createStatement();

ResultSet rs = st.executeQuery(Query);

while (rs.next()) {
int id = rs.getInt(1);
String title = rs.getString(2);
String author = rs.getString(3);
double price = rs.getDouble(4);
int inventoryQuantity = rs.getInt(5);
String listOfCourses = rs.getString(6);

AddBooks d = new AddBooks(title, author, price, inventoryQuantity, listOfCourses);
books.add(d);
}
conn.close();
}
catch (Exception e) {
System.out.println(e);
}
return books;
}
    
    public static ArrayList<AddBooks> viewBooksMississauga(HttpServletRequest request, HttpServletResponse response){
ArrayList<AddBooks> books = new ArrayList<AddBooks>();
try {
Class.forName("com.mysql.jdbc.Driver");
Connection conn = null;
conn = DriverManager.getConnection
("jdbc:mysql://localhost/drinks", "root", "root");

String Query = "SELECT * FROM Mississauga";

Statement st = conn.createStatement();

ResultSet rs = st.executeQuery(Query);

while (rs.next()) {
int id = rs.getInt(1);
String title = rs.getString(2);
String author = rs.getString(3);
double price = rs.getDouble(4);
int inventoryQuantity = rs.getInt(5);
String listOfCourses = rs.getString(6);

AddBooks d = new AddBooks(title, author, price, inventoryQuantity, listOfCourses);
books.add(d);
}
conn.close();
}
catch (Exception e) {
System.out.println(e);
}
return books;
}
    
}
