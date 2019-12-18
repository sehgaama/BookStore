/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.controller;

import ca.sheridancollege.model.PurchaseBooksDatabase;
import ca.sheridancollege.model.PurchaseBooksModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 14372
 */
@WebServlet(name = "PurchaseBooksServlet", urlPatterns = {"/PurchaseBook"})
public class PurchaseBooksServlet extends HttpServlet {

    String id;
    String title;
    String author;
    double price;
    int inventoryQuantity;
    String listOfCourses;
        
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PurchaseBooksServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PurchaseBooksServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
         PrintWriter out=response.getWriter(); 
         id = request.getParameter("id");
         PurchaseBooksDatabase da = new PurchaseBooksDatabase();   
        if(request.getParameter("campus").equals("Oakville")){
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/drinks","root", "root");
                //ArrayList<PurchaseBooksModel> book = new ArrayList<PurchaseBooksModel>();
                String query = "select * from Oakville_campus where id='" +id+ "'" ;
                Statement st= con.createStatement();
                ResultSet rs = st.executeQuery(query);
                rs.next();
                    //id= rs.getString(1);
                    title= rs.getString(2);
                    author= rs.getString(3);
                    price=rs.getDouble(4);
                    inventoryQuantity= rs.getInt(5);
                    listOfCourses= rs.getString(6);
                   
                   PurchaseBooksModel d= new PurchaseBooksModel(id,title,author,price,inventoryQuantity,listOfCourses);
                  da.purchaseBookOakville(d);
                   
                request.setAttribute("book",d);
                RequestDispatcher rd=request.getRequestDispatcher("/PurchaseBook.jsp");
                 rd.forward(request,response);
                                 
            }
            catch(Exception e){
                System.out.println(e);
                
            }
            
}
        if(request.getParameter("campus").equals("Brampton")){
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/drinks","root", "root");
                //ArrayList<PurchaseBooksModel> book = new ArrayList<PurchaseBooksModel>();
                String query = "select * from Brampton where id='" +id+ "'" ;
                Statement st= con.createStatement();
                ResultSet rs = st.executeQuery(query);
                
                    //id= rs.getString(1);
                    title= rs.getString(2);
                    author= rs.getString(3);
                    price=rs.getDouble(4);
                    inventoryQuantity= rs.getInt(5);
                    listOfCourses= rs.getString(6);
                   
                   PurchaseBooksModel d= new PurchaseBooksModel(id,title,author,price,inventoryQuantity,listOfCourses);
                  da.purchaseBookOakville(d);
                   
                request.setAttribute("book",d);
                RequestDispatcher rd=request.getRequestDispatcher("PurchaseBook.jsp");
                 rd.forward(request,response);
                                
            }
            catch(Exception e){
                System.out.println(e);
                
            }
            
}
        if(request.getParameter("campus").equals("Mississauga")){
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/drinks","root", "root");
                //ArrayList<PurchaseBooksModel> book = new ArrayList<PurchaseBooksModel>();
                String query = "select * from Mississauga where id='" +id+ "'" ;
                Statement st= con.createStatement();
                ResultSet rs = st.executeQuery(query);
                
                    //id= rs.getString(1);
                    title= rs.getString(2);
                    author= rs.getString(3);
                    price=rs.getDouble(4);
                    inventoryQuantity= rs.getInt(5);
                    listOfCourses= rs.getString(6);
                   
                   PurchaseBooksModel d= new PurchaseBooksModel(id,title,author,price,inventoryQuantity,listOfCourses);
                  da.purchaseBookOakville(d);
                   
                request.setAttribute("book",d);
                RequestDispatcher rd=request.getRequestDispatcher("PurchaseBook.jsp");
                 rd.forward(request,response);
                                
            }
            catch(Exception e){
                System.out.println(e);
                
            }
            
}
    }
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
