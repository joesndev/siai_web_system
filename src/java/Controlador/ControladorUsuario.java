/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.UsuarioDAO;
import Modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Johann Esneider
 */
public class ControladorUsuario extends HttpServlet {
public static final String USER_LIST = "usuarios.jsp";
    public static final String ADD_USER = "vista/add.jsp"; 
    public static final String MODIFY_USER = "vista/edit.jsp";
    public static final String USER_ON = "usuarios.jsp"; 
    public static final String USER_OFF = "usuarios.jsp";
    public static final String ADD_ING = "vista/add_ing.jsp";
    Usuario dto=new Usuario();
    UsuarioDAO dao=new UsuarioDAO();
    int idUsuario;
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
        request.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorUsuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorUsuario at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String RETURN_TO="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listar")){
        RETURN_TO = USER_LIST;
        }
        else if(action.equalsIgnoreCase("add")){
            RETURN_TO = ADD_USER;
        }
        else if(action.equalsIgnoreCase("adding")){
            RETURN_TO = ADD_ING;
        }
        else if(action.equalsIgnoreCase("editar")){
        request.setAttribute("ID", request.getParameter("idUsuario"));
        RETURN_TO = MODIFY_USER;
        }
        
        else if(action.equalsIgnoreCase("eliminar")){
        idUsuario=Integer.parseInt(request.getParameter("idUsuario"));
        dto.setIdUsuario(idUsuario);
        dao.eliminar(idUsuario);
        RETURN_TO = USER_LIST;
        }
  else if(action.equalsIgnoreCase("Habilitar")){
            idUsuario=Integer.parseInt(request.getParameter("idUsuario"));
            dto.setIdUsuario(idUsuario);
            dao.Habilitar(dto);
            RETURN_TO = USER_OFF;
        }
         else if(action.equalsIgnoreCase("Deshabilitar")){
            idUsuario=Integer.parseInt(request.getParameter("idUsuario"));
            dto.setIdUsuario(idUsuario);
            dao.Deshabilitar(dto);
            RETURN_TO = USER_ON;
        }
        RequestDispatcher vista=request.getRequestDispatcher(RETURN_TO);
        vista.forward(request, response);
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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String RETURN_TO="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("Agregar")){
        String nombre = request.getParameter("txtnombre");
        String apellido = request.getParameter("txtapellido");
        String telefono = request.getParameter("txttelefono");
        String correo = request.getParameter("txtcorreo");
        String tipo_doc_Id = request.getParameter("txtiddoc");
        String tipoUsuario = request.getParameter("txttipousuario");
        String numeroDocumento = request.getParameter("txtnumerodoc");
        String clave = request.getParameter("txtclave");
        dto.setNombre(nombre);
        dto.setApellido(apellido);
        dto.setTelefono(telefono);
        dto.setCorreo(correo);
        dto.setTipo_doc_Id(tipo_doc_Id);
        dto.setTipoUsuario(tipoUsuario);
        dto.setNumeroDocumento(numeroDocumento);
        dto.setClave(clave);
        dao.add(dto);
        RETURN_TO = USER_LIST;
        }
        else if(action.equalsIgnoreCase("Actualizar")){
        idUsuario = Integer.parseInt(request.getParameter("txtId"));
        String nombre = request.getParameter("txtnombre");
        String apellido = request.getParameter("txtapellido");
        String telefono = request.getParameter("txttelefono");
        String correo = request.getParameter("txtcorreo");
        String tipoUsuario = request.getParameter("txttipousuario");
        String numeroDocumento = request.getParameter("txtnumerodoc");
        String clave = request.getParameter("txtclave");
        dto.setIdUsuario(idUsuario);
        dto.setNombre(nombre);
        dto.setApellido(apellido);
        dto.setTelefono(telefono);
        dto.setCorreo(correo);
        dto.setTipoUsuario(tipoUsuario);
        dto.setNumeroDocumento(numeroDocumento);
        dto.setClave(clave);
        dao.edit(dto);
        RETURN_TO = USER_LIST;
        }
        RequestDispatcher vista=request.getRequestDispatcher(RETURN_TO);
        vista.forward(request, response);
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
