/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ServicioIng;
import ModeloDAO.ServicioingDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author APRENDIZ
 */
public class CrudServicioing extends HttpServlet {
String listar="serviciosocialing.jsp";
String add="vista/addserv_ing.jsp";
String edit="vista/editserv_ing.jsp";
ServicioIng s=new ServicioIng();
ServicioingDAO dao=new ServicioingDAO(); 
int idServicioSocial;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CrudServicioing</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CrudServicioing at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listar")){
        acceso=listar;
        }
        else if(action.equalsIgnoreCase("add")){
        acceso=add;
        }
        else if(action.equalsIgnoreCase("Agregar")){
        String nombre=request.getParameter("txtnombre");
        String apellido=request.getParameter("txtapellido");
        String numHoras=request.getParameter("txtnumHoras");
        String drive=request.getParameter("txtdrive");
        String firma=request.getParameter("txtfirma");
        String NombreEntidad=request.getParameter("txtNombreEntidad");
        s.setNombre(nombre);
        s.setApellido(apellido);
        s.setNumHoras(numHoras);
        s.setDrive(drive);
        s.setFirma(firma);
        s.setNombreEntidad(NombreEntidad);
        dao.add(s);
        acceso=listar;
        }
        else if(action.equalsIgnoreCase("editar")){
        request.setAttribute("idser", request.getParameter("idServicioSocial"));
        acceso=edit;
        }
        else if(action.equalsIgnoreCase("Actualizar")){
        idServicioSocial= Integer.parseInt(request.getParameter("txtidServicioSocial"));
        String nombre=request.getParameter("txtnombre");
        String apellido=request.getParameter("txtapellido");
        String numHoras=request.getParameter("txtnumHoras");;
        String drive=request.getParameter("txtdrive");
        String firma=request.getParameter("txtfirma");
        String NombraEntidad=request.getParameter("txtNombreEntidad");
        s.setIdServicioSocial(idServicioSocial);
        s.setNombre(nombre);
        s.setApellido(apellido);
        s.setNumHoras(numHoras);
        s.setDrive(drive);
        s.setFirma(firma);
        s.setNombreEntidad(NombraEntidad);
        dao.edit(s);
        acceso=listar;
        }
        else if(action.equalsIgnoreCase("eliminar")){
        idServicioSocial=Integer.parseInt(request.getParameter("idServicioSocial"));
        s.setIdServicioSocial(idServicioSocial);
        dao.eliminar(idServicioSocial);
        acceso=listar;
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
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
