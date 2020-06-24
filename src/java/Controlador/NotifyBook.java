/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Config.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Johann Esneider
 */
public class NotifyBook extends HttpServlet {

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
            out.println("<title>Servlet Masivo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Masivo at " + request.getContextPath() + "</h1>");
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
       response.setContentType("text/html;charset=UTF-8");
       request.setCharacterEncoding("UTF-8");
       RequestDispatcher red;
       String action = request.getParameter("accion");
       if(action.equalsIgnoreCase("SendNotification")){
       try {

            PreparedStatement ps;
            ResultSet rs;
            Conexion conn = new Conexion();
            Connection con = conn.getConnection();
            String sql = "SELECT correo FROM Usuario WHERE tipoUsuario='Estudiante'";
            String[] correos_destinos = null;

            try {
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                ResultSetMetaData rd = rs.getMetaData(); // Obtenemos el metadata desde el resulset
                int filas = rd.getColumnCount();
                correos_destinos = new String[filas + 1];
                int indice = 0;

                while (rs.next()) {
                    correos_destinos[indice] = rs.getString("correo");
                    indice++;
                }

            } catch (SQLException ex) {
                Logger.getLogger(NotifyBook.class.getName()).log(Level.SEVERE, null, ex);
            }


            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");


            Session session = Session.getDefaultInstance(props);


            String correoRemitente = "sistemasiaiweb3r@gmail.com";
            String passRemitente = "GAESSIETE";
            String asunto = "SIAI WEB NOTIFICACIÓN LIBROS";
            String mensaje = "<h1>Hola querido estudiante, nuestro <strong>Sistema de notificaciones SIAI WEB</strong> te informa que ya hay nuevos libros disponibles en el sistema, ¡es hora de aprender!</h1>"
                    +"<br>"
                    +"<h1>Ingresa ahora mismo</h1><a href='twitter.com' class='btn btn-outline-success btn-md'>SIAI WEB LOGIN</a>";
            

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoRemitente));

            Address[] receptores = new Address[correos_destinos.length];
            int j = 0;
            while (j < correos_destinos.length) {
                receptores[j] = new InternetAddress(correos_destinos[j]);
                j++;
            }


            message.addRecipients(Message.RecipientType.TO, receptores);
            message.setSubject(asunto);
            message.setText(mensaje, "ISO-8859-1", "html");

            Transport t = session.getTransport("smtp");
            t.connect(correoRemitente, passRemitente);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();    
            
            red = request.getRequestDispatcher("biblioteca_docente.jsp");
            red.include(request, response);
            
        } catch (AddressException ex) {
            Logger.getLogger(NotifyBook.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(NotifyBook.class.getName()).log(Level.SEVERE, null, ex);
        }
       
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
