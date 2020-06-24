

package Controlador;

import Modelo.Servicio_cursos;
import ModeloDAO.Servicio_cursosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ESTEBAN
 */

public class CrudServicio_cursos extends HttpServlet {

String listar="servicio_cursos.jsp";
String add="vista/addserv_cursos.jsp";
String edit="vista/editserv_cursos.jsp";
Servicio_cursos s=new Servicio_cursos();
Servicio_cursosDAO dao=new Servicio_cursosDAO(); 
int idServicioSocial;
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CrudServicio_cursos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CrudServicio_cursos at " + request.getContextPath() + "</h1>");
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
        String firma=request.getParameter("txtfirma");
        String NombreEntidad=request.getParameter("txtNombreEntidad");
        s.setNombre(nombre);
        s.setApellido(apellido);
        s.setNumHoras(numHoras);
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
        String numHoras=request.getParameter("txtnumHoras");
        String firma=request.getParameter("txtfirma");
        String NombraEntidad=request.getParameter("txtNombreEntidad");
        s.setIdServicioSocial(idServicioSocial);
        s.setNombre(nombre);
        s.setApellido(apellido);
        s.setNumHoras(numHoras);
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

    
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
