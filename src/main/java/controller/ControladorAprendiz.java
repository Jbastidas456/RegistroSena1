/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Aprendiz;
import modeldao.AprendizDao;


@WebServlet(name = "ControladorAprendiz", urlPatterns = {"/ControladorAprendiz"})
public class ControladorAprendiz extends HttpServlet {

    String agregar="index.html";
    Aprendiz ape = new Aprendiz();
    AprendizDao adao= new AprendizDao();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorAprendiz</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorAprendiz at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String acceso="";
       String action=request.getParameter("accion");
       if(action.equalsIgnoreCase("Agregar")){
           
           int documento=Integer.parseInt(request.getParameter("txtdoc"));
           String nombrea = request.getParameter("txtnom");
           String apellidoa=request.getParameter("txtape");
           String emaila=request.getParameter("txtemail");
           int telefonoa=Integer.parseInt(request.getParameter("txttel"));
           ape.setDocuapre(documento);
           ape.setNombre(nombrea);
           ape.setNombre(apellidoa);
           ape.setCorreoA(emaila);
           ape.setTeleapre(telefonoa);
           adao.registraap(ape);
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
