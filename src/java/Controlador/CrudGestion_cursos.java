

package Controlador;

import Modelo.Gestion_cursos;
import ModeloDAO.Gestion_cursosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CrudGestion_cursos extends HttpServlet {

String listar="gestion_otros_cursos.jsp";
String add="vista/addgest_cursos.jsp";
String edit="vista/editgest_cursos.jsp";
Gestion_cursos g=new Gestion_cursos();
Gestion_cursosDAO dao=new Gestion_cursosDAO(); 
int idGestion;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CrudGestion_cursos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CrudGestion_cursos at " + request.getContextPath() + "</h1>");
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
        String descripcion=request.getParameter("txtdescripcion");
        String materia=request.getParameter("txtmateria");
        String fecha=request.getParameter("txtfecha");
        String periodo=request.getParameter("txtperiodo");
        String recurso=request.getParameter("txtrecurso");
        g.setNombre(nombre);
        g.setDescripcion(descripcion);
        g.setMateria(materia);
        g.setFecha(fecha);
        g.setPeriodo(periodo);
        g.setRecurso(recurso);
        dao.add(g);
        acceso=listar;
        }
        else if(action.equalsIgnoreCase("editar")){
        request.setAttribute("idges", request.getParameter("idGestion"));
        acceso=edit;
        }
        else if(action.equalsIgnoreCase("Actualizar")){
        idGestion= Integer.parseInt(request.getParameter("txtidGestion"));
        String nombre=request.getParameter("txtnombre");
        String descripcion=request.getParameter("txtdescripcion");
        String materia=request.getParameter("txtmateria");
        String fecha=request.getParameter("txtfecha");
        String periodo=request.getParameter("txtperiodo");
        String recurso=request.getParameter("txtrecurso");
        g.setIdGestion(idGestion);
        g.setNombre(nombre);
        g.setDescripcion(descripcion);
        g.setMateria(materia);
        g.setFecha(fecha);
        g.setPeriodo(periodo);
        g.setRecurso(recurso);
        dao.edit(g);
        acceso=listar;
        }
        else if(action.equalsIgnoreCase("eliminar")){
        idGestion=Integer.parseInt(request.getParameter("idGestion"));
        g.setIdGestion(idGestion);
        dao.eliminar(idGestion);
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
