/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.servletAula;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author maryna
 */
public class aula2 extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet aula2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<img src='imagens/ifrn.png'> <br>");
            out.println("<p>Aqui é um texto: blá blá blá blá blá<br>");
            out.println("blá blá blá blá blá blá blá blá blá blá<br>");
            out.println("blá blá blá blá blá blá blá blá blá blá<br>");
            out.println("blá blá blá blá blá blá blá blá blá blá</p><br><br>");
            out.println("<form>");
            out.println("<label>Nome: <label>");
            out.println("<input type='text'> <br>");
            out.println("<label>Idade: <label>");
            out.println("<input type='text'> <br>");
            out.println("<label>Escola: <label>");
            out.println("<select>");
            out.println("<option>Pública</option>");
            out.println("<option>Particular</option>");
            out.println("</select>");
            out.println("<br><br>");
            for (int i = 0; i < 1000; i++) {
                out.println("Número: "+i+"<br>");
            }
            out.println("<br><br>");
            out.println("A <br> B <br> C <br> D <br> E <br> F <br> G <br> H <br> I <br> J <br> K <br> L <br> M <br> N <br> O <br> P <br> Q <br> R <br> S <br> T <br> U <br> V <br> W <br> X <br> Y <br> Z");
            
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
