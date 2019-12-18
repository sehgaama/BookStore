/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.controller;

import ca.sheridancollege.model.EditRecordDatabase;
import ca.sheridancollege.model.EditRecordModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 14372
 */
@WebServlet(name = "EditRecordsServlet", urlPatterns = {"/EditRecordsServlet"})
public class EditRecordsServlet extends HttpServlet {

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
            out.println("<title>Servlet EditRecordsServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditRecordsServlet at " + request.getContextPath() + "</h1>");
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
        
        EditRecordDatabase da = new EditRecordDatabase();
        PrintWriter out = response.getWriter();
        
        id = request.getParameter("id");
        title= request.getParameter("title");
        author = request.getParameter("author");
        price = Double.parseDouble(request.getParameter("price"));
        inventoryQuantity = Integer.parseInt(request.getParameter("quantity"));
        listOfCourses = request.getParameter("courses");
        
        EditRecordModel b = new EditRecordModel( id, title, author, price, inventoryQuantity, listOfCourses);
        
        if(id!=null){
        if(request.getParameter("campus").equals("Oakville")){
        da.editBookOakville(b);
        response.sendRedirect("editRecord.jsp");
        }
        if(request.getParameter("campus").equals("Brampton")){
        da.editBookBrampton(b);
        response.sendRedirect("editRecord.jsp");
        }
        if(request.getParameter("campus").equals("Mississauga")){
        da.editBookMississauga(b);
        response.sendRedirect("editRecord.jsp");
        }
        }
        else{
            response.sendRedirect("editRecord1.jsp");
            
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
