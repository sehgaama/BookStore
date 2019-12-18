/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.database;

import ca.sheridancollege.beans.AddBooks;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 14372
 */
@WebServlet(name = "ViewRecordsServlet", urlPatterns = {"/ViewRecordsServlet"})
public class ViewRecordsServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ViewRecordsServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ViewRecordsServlet at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        ViewRecordsDatabase view=new ViewRecordsDatabase();
        if(request.getParameter("campus").equals("Oakville")){
        ArrayList<AddBooks> books = view.viewBooksOakville(request, response);
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
        
        out.print("<!doctype html>\n" + 
			"<html>\n" + 
			"<head>\n" + 
			"<title>Oakville Book Store</title>\n" + 
                        "<style>table,td,th{padding:5px; border:1px dashed black; border-collapse:collapse;}</style>\n" +
			"</head>\n" + 
			"<body>\n" + 
			"  <table style='padding:5px; border:1px dashed black; border-collapse:collapse;'>");
			out.print("<tr><td> ID</td><td>Title</td><td>Author</td><td>Price</td><td>Inventory Quantity</td><td>List of courses</td></tr>");
			for(int i=0;i<books.size();i++) {

			out.print("<tr><td>"+ (i+1) +"</td><td>"+books.get(i).getTitle()+"</td><td>"+books.get(i).getAuthor()+"</td><td>"+books.get(i).getPrice()+"</td><td>"+books.get(i).getInventoryQuantity()+"</td><td>"+books.get(i).getListOfCourses()+"</td></tr>");
				}
			out.print("</table>");
			out.print("<div>" +
                                "<br><a href=\"index.html\">Home Page</a>\n" + 
				"<br>\n" + 
				"</div>\n" + 
				"</body>\n" + 
				"</html>");
	}
        
    
    if(request.getParameter("campus").equals("Brampton")){
        ArrayList<AddBooks> books = view.viewBooksBrampton(request, response);
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
        out.print("<!doctype html>\n" + 
			"<html>\n" + 
			"<head>\n" + 
			"<title>Brampton Book Store</title>\n" + 
                        "<style>table,td,th{padding:5px; border:1px dashed black; border-collapse:collapse;}</style>\n" +
			"</head>\n" + 
			"<body>\n" + 
			"  <table>");
			out.print("<tr><td> ID</td><td>Title</td><td>Author</td><td>Price</td><td>Inventory Quantity</td><td>List of courses</td></tr>");
			for(int i=0;i<books.size();i++) {

			out.print("<tr><td>"+ (i+1) +"</td><td>"+books.get(i).getTitle()+"</td><td>"+books.get(i).getAuthor()+"</td><td>"+books.get(i).getPrice()+"</td><td>"+books.get(i).getInventoryQuantity()+"</td><td>"+books.get(i).getListOfCourses()+"</td></tr>");
				}
			out.print("</table>");
			out.print("<div>" +
                                "<a href=\"index.html\">Home Page</a>\n" + 
				"<br>\n" + 
				"</div>\n" + 
				"</body>\n" + 
				"</html>");
	
        }

if(request.getParameter("campus").equals("Mississauga")){
        ArrayList<AddBooks> books = view.viewBooksMississauga(request, response);
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
        out.print("<!doctype html>\n" + 
			"<html>\n" + 
			"<head>\n" + 
			"<title>Mississauga Book Store</title>\n" +
                        "<style>table,td,th{padding:5px; border:1px dashed black; border-collapse:collapse;}</style>\n" +
			"</head>\n" + 
			"<body>\n" + 
			"  <table>");
			out.print("<tr><td> ID</td><td>Title</td><td>Author</td><td>Price</td><td>Inventory Quantity</td><td>List of courses</td></tr>");
			for(int i=0;i<books.size();i++) {

			out.print("<tr><td>"+ (i+1) +"</td><td>"+books.get(i).getTitle()+"</td><td>"+books.get(i).getAuthor()+"</td><td>"+books.get(i).getPrice()+"</td><td>"+books.get(i).getInventoryQuantity()+"</td><td>"+books.get(i).getListOfCourses()+"</td></tr>");
				}
			out.print("</table>");
			out.print("<div>" +
                                "<a href=\"index.html\">Home Page</a>\n" + 
				"<br>\n" + 
				"</div>\n" + 
				"</body>\n" + 
				"</html>");
	}
    } 
      
   
   
       
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
    