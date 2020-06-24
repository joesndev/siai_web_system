package Controlador;
import Config.sql;
import ModeloDAO.BoletinDAO;
import Modelo.Boletin;
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

@WebServlet(name = "ControladorBoletin", urlPatterns = {"/ControladorBoletin"})
@MultipartConfig(maxFileSize = 1073741824)    // upload file's size up to 16MB

public class ControladorBoletin extends HttpServlet {

    public static final String INSERT_OR_EDIT = "/vista/addboletin.jsp";
    public static final String LISTAR = "doc_boletin.jsp";
    String estado = null;
    BoletinDAO pdfdao;
    int id_pdf = -1;

    public ControladorBoletin() {
        pdfdao = new BoletinDAO();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String forward = "";
        String action = request.getParameter("action");
        
        if (action.equalsIgnoreCase("delete")) {
            forward = LISTAR;
            int studentId = Integer.parseInt(request.getParameter("IdBoletin"));
            pdfdao.Eliminar_BOLETIN(studentId);
        }
        if(action.equalsIgnoreCase("listar")){
            forward = LISTAR;
        }
        if (action.equalsIgnoreCase("edit")) {
            forward = INSERT_OR_EDIT;
            int studentIdM = Integer.parseInt(request.getParameter("IdBoletin"));
            id_pdf = studentIdM;
            Boletin pdfvo = pdfdao.getBoletinById(studentIdM);
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

        Boletin pdfvo = new Boletin();
        sql auto = new sql();
        int nuevoid = auto.auto_increm("SELECT MAX(codigopdf) FROM Boletin;");
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
                pdfdao.Agregar_BOLETIN(pdfvo);
            } else {
                pdfvo.setCodigopdf(id_pdf);
                if (inputStream != null) {
                    pdfvo.setArchivopdf(inputStream);
                    pdfdao.Modificar_BOLETIN(pdfvo);
                }
            }
        } catch (Exception ex) {
            System.out.println("textos: "+ex.getMessage());
        }

        RequestDispatcher view = request.getRequestDispatcher("/doc_boletin.jsp");
        view.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
