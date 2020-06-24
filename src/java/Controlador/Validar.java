/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Usuario;
import ModeloDAO.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Validar extends HttpServlet {

    UsuarioDAO usdao = new UsuarioDAO();
    Usuario us = new Usuario();
    RequestDispatcher rd;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Validar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Validar at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        String accion=request.getParameter("accion");
        PrintWriter out = response.getWriter();
        if(accion.equalsIgnoreCase("Ingresar"))
        {
            String user=request.getParameter("txtuser");
            String pass=request.getParameter("txtpass");
            us=usdao.VALIDACION(user, pass);
            if(us.getNumeroDocumento()!=null)
            {
                
                if (us.getEstado().equalsIgnoreCase("Habilitado")) {
                request.getSession().setAttribute("user", user);
                request.getSession().setAttribute("pass", pass);
                
                switch(us.getTipoUsuario())
                {
                   case "Docente" :
                      request.getRequestDispatcher("modulos_docente.jsp").forward(request, response);
                      break; 

                   case "Administrador" :
                      request.getRequestDispatcher("modulos.jsp").forward(request, response);
                      break;
                   
                   case "Estudiante" :
                      request.getRequestDispatcher("modulos_estudiante.jsp").forward(request, response);
                      break;
                      
                   case "Supervisor" :
                      request.getRequestDispatcher("modulos_supervisor.jsp").forward(request, response);
                      break;   
                   
                   default : 
                      request.getRequestDispatcher("login.jsp").forward(request, response);
                }
                
            }
            else
            {
                out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
                out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                out.println("<script>");
                out.println("$(document).ready(function(){");
                out.println("swal ( ' El usuario se encuentra deshabilitado' ,  ' ' ,  'error' );");
                out.println("});");
                out.println("</script>");
                
                rd = request.getRequestDispatcher("login.jsp");
                rd.include(request, response);
            }}
             else
            {   
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
                out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                out.println("<script>");
                out.println("$(document).ready(function(){");
                out.println("swal ( 'Nombre de usuario o clave incorrecta' ,  ' ' ,  'error' );");
                out.println("});");
                out.println("</script>");
                
                rd = request.getRequestDispatcher("login.jsp");
                rd.include(request, response);
            }}
        else
        {
            request.getRequestDispatcher("login.jsp").forward(request, response);
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