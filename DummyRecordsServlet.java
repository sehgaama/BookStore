/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.database;

import ca.sheridancollege.beans.AddBooks;
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
@WebServlet(name = "DummyRecordsServlet", urlPatterns = {"/DummyRecordsServlet"})
public class DummyRecordsServlet extends HttpServlet {

    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DummyRecordsServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DummyRecordsServlet at " + request.getContextPath() + "</h1>");
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
        AddBooksDatabase da = new AddBooksDatabase();
                        
        AddBooks b = new AddBooks( "Health is wealth", "Arnold", 145, 100, "Kinesiology, Fat loss principles");
        da.addBookOakville(b);
        da.addBookBrampton(b);
        da.addBookMississauga(b);
        
        AddBooks c = new AddBooks( "Fitness guide", "Guru Mann", 165, 190, "Workout routines, Fat loss principles");
        da.addBookOakville(c);
        da.addBookBrampton(c);
        da.addBookMississauga(c);
        
        AddBooks ab = new AddBooks( "Kitchen recipies", "Anonymous", 175, 180, "Kitcheners, Fat loss principles, Health and exercise");
        da.addBookOakville(ab);
        da.addBookBrampton(ab);
        da.addBookMississauga(ab);
        
        AddBooks ba = new AddBooks( "Deal", "Arnold By", 135, 100, "Business");
        da.addBookOakville(ba);
        da.addBookBrampton(ba);
        da.addBookMississauga(ba);
        
        AddBooks bb = new AddBooks( "Baby Sitting", "Anonymous", 135, 90, "Medical");
        da.addBookOakville(bb);
        da.addBookBrampton(bb);
        da.addBookMississauga(bb);
        
        AddBooks bc = new AddBooks( "Avengers", "Gurleen", 145, 780, "Fiction");
        da.addBookOakville(bc);
        da.addBookBrampton(bc);
        da.addBookMississauga(bc);
        
        AddBooks bd = new AddBooks( "Avengers 2", "Gurleen", 145, 57, "Fiction");
        da.addBookOakville(bd);
        da.addBookBrampton(bd);
        da.addBookMississauga(bd);
        
        AddBooks be = new AddBooks( "Avengers 3", "Gurleen", 134, 63, "Fiction");
        da.addBookOakville(be);
        da.addBookBrampton(be);
        da.addBookMississauga(be);
        
        AddBooks bf = new AddBooks( "Avengers 4", "Gurleen", 136, 37, "Fiction");
        da.addBookOakville(bf);
        da.addBookBrampton(bf);
        da.addBookMississauga(bf);
        
        AddBooks bg = new AddBooks( "Avengers 5", "Gurleen", 127, 48, "Fiction");
        da.addBookOakville(bg);
        da.addBookBrampton(bg);
        da.addBookMississauga(bg);
        
        AddBooks bh = new AddBooks( "Avengers 6", "Gurleen", 167, 30, "Fiction");
        da.addBookOakville(bh);
        da.addBookBrampton(bh);
        da.addBookMississauga(bh);
        
        AddBooks bi = new AddBooks( "Avengers 7", "Gurleen", 193, 600, "Fiction");
        da.addBookOakville(bi);
        da.addBookBrampton(bi);
        da.addBookMississauga(bi);
        
        AddBooks bj = new AddBooks( "Avengers 8", "Gurleen", 158, 70, "Fiction");
        da.addBookOakville(bj);
        da.addBookBrampton(bj);
        da.addBookMississauga(bj);
        
        AddBooks bk = new AddBooks( "Avengers 9", "Gurleen", 145, 16, "Fiction");
        da.addBookOakville(bk);
        da.addBookBrampton(bk);
        da.addBookMississauga(bk);
        
        AddBooks bl = new AddBooks( "Thor the new avenger", "Navjot", 145, 19, "Science and fiction");
        da.addBookOakville(bl);
        da.addBookBrampton(bl);
        da.addBookMississauga(bl);
        
        AddBooks bm = new AddBooks( "Thor", "Navjot", 178, 340, "Science and fiction");
        da.addBookOakville(bm);
        da.addBookBrampton(bm);
        da.addBookMississauga(bm);
        
        AddBooks bn = new AddBooks( "Thor is back", "Navjot", 194, 46, "Science and fiction");
        da.addBookOakville(bn);
        da.addBookBrampton(bn);
        da.addBookMississauga(bn);
        
        AddBooks bo = new AddBooks( "Thor 3", "Navjot", 156, 150, "Science and fiction");
        da.addBookOakville(bo);
        da.addBookBrampton(bo);
        da.addBookMississauga(bo);
        
        AddBooks bp = new AddBooks( "Thor 4", "Navjot", 145, 100, "Science and fiction");
        da.addBookOakville(bp);
        da.addBookBrampton(bp);
        da.addBookMississauga(bp);
        
        AddBooks bq = new AddBooks( "Thor 5", "Navjot", 145, 100, "Science and fiction");
        da.addBookOakville(bq);
        da.addBookBrampton(bq);
        da.addBookMississauga(bq);
        
        AddBooks br = new AddBooks( "Thor 6", "Navjot", 111, 100, "Science and fiction");
        da.addBookOakville(br);
        da.addBookBrampton(br);
        da.addBookMississauga(br);
        
        AddBooks bs = new AddBooks( "Superman", "Jashan", 112, 100, "Science, Science and Fiction");
        da.addBookOakville(bs);
        da.addBookBrampton(bs);
        da.addBookMississauga(bs);
        
        AddBooks bt = new AddBooks( "Superman 2", "Jashan", 185, 100, "Science, Science and Fiction");
        da.addBookOakville(bt);
        da.addBookBrampton(bt);
        da.addBookMississauga(bt);
        
        AddBooks bu = new AddBooks( "Superman vs Batman", "Jashan", 145, 160, "Science, Science and Fiction");
        da.addBookOakville(bu);
        da.addBookBrampton(bu);
        da.addBookMississauga(bu);
        
        AddBooks bv = new AddBooks( "Superman with Justice League", "Jashan", 145, 500, "Science, Science and Fiction");
        da.addBookOakville(bv);
        da.addBookBrampton(bv);
        da.addBookMississauga(bv);
        
        AddBooks bw = new AddBooks( "Superman 3", "Jashan", 465, 50, "Science, Science and Fiction");
        da.addBookOakville(bw);
        da.addBookBrampton(bw);
        da.addBookMississauga(bw);
        
        AddBooks bx = new AddBooks( "Superman 4", "Jashan", 675, 160, "Science, Science and Fiction");
        da.addBookOakville(bx);
        da.addBookBrampton(bx);
        da.addBookMississauga(bx);
        
        AddBooks by = new AddBooks( "Welcome", "Ghungroo", 574, 10, "Laughter");
        da.addBookOakville(by);
        da.addBookBrampton(by);
        da.addBookMississauga(by);
        
        AddBooks bz = new AddBooks( "Welcome back", "Ghungroo", 956, 165, "Laughter");
        da.addBookOakville(bz);
        da.addBookBrampton(bz);
        da.addBookMississauga(bz);
        
        AddBooks ay = new AddBooks( "Welcome back again", "Ghungroo", 999, 140, "Laughter");
        da.addBookOakville(ay);
        da.addBookBrampton(ay);
        da.addBookMississauga(ay);
        
        
        response.sendRedirect("index.html");
        
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
