package Controlador;
import Config.sql;
import ModeloDAO.LibroDAO;
import Modelo.Libro;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(name = "ControllerLibro", urlPatterns = {"/ControllerLibro"})
@MultipartConfig(maxFileSize = 1073741824)    // upload file's size up to 16MB

public class ControllerLibro extends HttpServlet {

    public static final String INSERT_OR_EDIT = "/vista/addlib.jsp";
    public static final String LISTAR = "biblioteca_docente.jsp";
    public static final String LISTAR_ADMIN = "biblioteca_admin.jsp";
    int numCapitulos;
    String estado = null;
    LibroDAO pdfdao;
    int id_pdf = -1;
    
    public ControllerLibro() {
        pdfdao = new LibroDAO();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String forward = "";
        String action = request.getParameter("action");
        
        if (action.equalsIgnoreCase("delete")) {
            forward = LISTAR;
            int studentId = Integer.parseInt(request.getParameter("Ident"));
            pdfdao.Eliminar_libro(studentId);
        }
        if (action.equalsIgnoreCase("deleteasadmin")) {
            forward = LISTAR_ADMIN;
            int studentId = Integer.parseInt(request.getParameter("Ident"));
            pdfdao.Eliminar_libro(studentId);
        }
        if(action.equalsIgnoreCase("listar")){
            forward = LISTAR;
        }
        if (action.equalsIgnoreCase("edit")) {
            forward = INSERT_OR_EDIT;
            int studentIdM = Integer.parseInt(request.getParameter("Ident"));
            id_pdf = studentIdM;
            Libro pdfvo = pdfdao.getLibroById(studentIdM);
            request.setAttribute("row", pdfvo);
            boolean boo = false;
            if (pdfvo.getArchivopdf2() != null) {
                boo = true;
            }
            request.setAttribute("row2", boo);
            estado = "edit";
        } else if (action.equalsIgnoreCase("insert")) {
            forward = INSERT_OR_EDIT;
            estado = "insert";
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        Libro pdfvo = new Libro();
        sql auto = new sql();
        int nuevoid = auto.auto_increm("SELECT MAX(codigopdf) FROM pdfLibro;");
        
        try{
            String name = request.getParameter("txtname");
            String descripcion = request.getParameter("txtdescripcion");
            String genero = request.getParameter("txtgenero");
            String autor = request.getParameter("txtautor");
            numCapitulos = Integer.parseInt(request.getParameter("txtnumcap"));
            pdfvo.setNombrepdf(name);
            pdfvo.setDescripcion(descripcion);
            pdfvo.setGenero(genero);
            pdfvo.setAutor(autor);
            pdfvo.setNumCapitulos(numCapitulos);
        }catch(Exception ex){
            System.out.println("nombre: "+ex.getMessage());
        }

        InputStream inputStream = null;
        try {
            Part filePart = request.getPart("fichero");
            if (filePart.getSize() > 0) {
                System.out.println(filePart.getName());
                System.out.println(filePart.getSize());
                System.out.println(filePart.getContentType());
                inputStream = filePart.getInputStream();
            }
        } catch (Exception ex) {
            System.out.println("fichero: "+ex.getMessage());
        }

        try {
            
            if (estado.equalsIgnoreCase("insert")) {
                pdfvo.setCodigopdf(nuevoid);
                if (inputStream != null) {
                    pdfvo.setArchivopdf(inputStream);
                }
                pdfdao.Agregar_libro(pdfvo);
            } else {
                pdfvo.setCodigopdf(id_pdf);
                if (inputStream != null) {
                    pdfvo.setArchivopdf(inputStream);
                    pdfdao.Modificar_libro(pdfvo);
                } else {
                    pdfdao.Modificar_libro2(pdfvo);
                }
            }
        } catch (Exception ex) {
            System.out.println("textos: "+ex.getMessage());
        }
 
        RequestDispatcher view = request.getRequestDispatcher("/biblioteca_docente.jsp");
        view.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
