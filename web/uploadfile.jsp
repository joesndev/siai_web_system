<%-- 
    Document   : uploadfile
    Created on : 24-02-2015, 06:52:35 PM
    Author     : Seba
--%>

<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SUBIENDO ARCHIVO...</title>
    </head>
    <body>
        <%
        
            String archivourl = "C:\\Users\\APRENDIZ\\Desktop\\siaiweb\\web\\Archivos";
            RequestDispatcher rd=null;
            DiskFileItemFactory factory = new DiskFileItemFactory();
            
            factory.setSizeThreshold(1024);
            
            factory.setRepository(new File(archivourl));
            
            ServletFileUpload upload = new ServletFileUpload(factory);
            
            
            try {
                   List<FileItem> partes = upload.parseRequest(request);
                   
              for(FileItem items: partes){
                  File file = new File(archivourl, items.getName());
                  items.write(file);
              }
              out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
              out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
              out.println("<script>");
              out.println("$(document).ready(function(){");
              out.println("swal ( ' El archivo se subio correctamente' , ' ' ,  'success' );");
             
              out.println("});");
              out.println("</script>");
             
              rd = request.getRequestDispatcher("serviciosocial.jsp");
              rd.include(request, response);
               } catch (Exception e) {
                   out.print("Exception: "+e.getMessage()+"");
               }
            
        %>
    </body>
</html>
