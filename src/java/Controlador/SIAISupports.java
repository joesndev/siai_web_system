/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Soporte;
import ModeloDAO.SupportDAO;
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
public class SIAISupports extends HttpServlet {
    public static final String SUPPORT_LIST = "vista/listaPQR.jsp";
    public static final String ADD_SUPPORT_MESSAGE = "index.html";
    public static final String SUPPORT_DELETED = "vista/listaPQR.jsp";
    public static final String ANSWER_SUPPORT = "vista/respuestaPQR.jsp";
    int Id;
    Soporte support = new Soporte();
    SupportDAO dao = new SupportDAO();
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
            out.println("<title>Servlet LsmSupports</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LsmSupports at " + request.getContextPath() + "</h1>");
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
        String RETURN_TO = "";
        String action = request.getParameter("accion");
        if(action.equalsIgnoreCase("ListaSoporte")){
        RETURN_TO = SUPPORT_LIST;  
        }
        else if(action.equalsIgnoreCase("AddSupport")){
        RETURN_TO = ADD_SUPPORT_MESSAGE;
        }
        else if(action.equalsIgnoreCase("Responder")){
        request.setAttribute("ID", request.getParameter("Id"));
        RETURN_TO = ANSWER_SUPPORT;
        }
        else if(action.equalsIgnoreCase("DeleteSupport")){
        Id=Integer.parseInt(request.getParameter("Id"));
        support.setId(Id);
        dao.eliminar(Id);
        RETURN_TO = SUPPORT_DELETED;
        }
        RequestDispatcher  vista = request.getRequestDispatcher(RETURN_TO);
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
         String RETURN_TO = "";
        String action = request.getParameter("accion");
        if (action.equalsIgnoreCase("SendInfoSupport")) {
            String documento = request.getParameter("txtdocumento");
            String tipoSoporte = request.getParameter("txttiposoporte");
            String descripcion = request.getParameter("txtdescripcion");
            support.setDocumento(documento);
            support.setTipoSoporte(tipoSoporte);
            support.setDescripcion(descripcion);
            dao.add(support);
            RETURN_TO = ADD_SUPPORT_MESSAGE;
        }
        else if(action.equalsIgnoreCase("SendAnswer")){
        Id = Integer.parseInt(request.getParameter("txtId"));
        String respuesta = request.getParameter("txtrespuesta");
        support.setId(Id);
        support.setRespuesta(respuesta);
        dao.edit(support);
        RETURN_TO = SUPPORT_LIST;
        }
        RequestDispatcher vista = request.getRequestDispatcher(RETURN_TO);
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
