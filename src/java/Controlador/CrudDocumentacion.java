package Controlador;

import Modelo.Documentacion;
import ModeloDAO.DocumentacionDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CrudDocumentacion extends HttpServlet {

String listar="documentacion_901.jsp";
String add="vista/adddoc.jsp";
String edit="vista/editdoc.jsp";
Documentacion d=new Documentacion();
DocumentacionDAO dao=new DocumentacionDAO(); 
int idDocumentacion; 
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CrudDocumentacion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CrudDocumentacion at " + request.getContextPath() + "</h1>");
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
        String idDocumentacion=request.getParameter("idDocumentacion");
        String nombre=request.getParameter("txtnombre");
        String apellido=request.getParameter("txtapellido");
        String acudiente=request.getParameter("txtacudiente");
        String matricula=request.getParameter("txtmatricula");
        String salud=request.getParameter("txtsalud");
        String boletin=request.getParameter("txtboletin");
        
        d.setNombre(nombre);
        d.setApellido(apellido);
        d.setAcudiente(acudiente);
        d.setMatricula(matricula);
        d.setSalud(salud);
        d.setBoletin(boletin);
        
        dao.add(d);
        acceso=listar;
        }
        else if(action.equalsIgnoreCase("editar")){
        request.setAttribute("iddoc", request.getParameter("idDocumentacion"));
        acceso=edit;
        }
    
        else if(action.equalsIgnoreCase("Actualizar")){
        idDocumentacion= Integer.parseInt(request.getParameter("txtidDocumentacion"));
        String nombre=request.getParameter("txtnombre");
        String apellido=request.getParameter("txtapellido");
        String acudiente=request.getParameter("txtacudiente");
        String matricula=request.getParameter("txtmatricula");
        String salud=request.getParameter("txtsalud");
        String boletin=request.getParameter("txtboletin");
        d.setIdDocumentacion(idDocumentacion);
        d.setNombre(nombre);
        d.setApellido(apellido);
        d.setAcudiente(acudiente);
        d.setMatricula(matricula);
        d.setSalud(salud);
        d.setBoletin(boletin);
        
        dao.edit(d);
        acceso=listar;
        }
        
        else if(action.equalsIgnoreCase("eliminar")){
        idDocumentacion=Integer.parseInt(request.getParameter("idDocumentacion"));
        d.setIdDocumentacion(idDocumentacion);
        dao.eliminar(idDocumentacion);
        acceso=listar;
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
        }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    
 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
