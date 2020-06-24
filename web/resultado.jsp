<%--
   Document   : resultado
   Created on : 25/09/2019, 10:57:02 AM
   Author     : Esteban Gòmez
--%>

<%@page import="Modelo.Email"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>RESULTADO CORREO ELECTRONICO</title>
   </head>
   <body>
       
       <%
           
           Email email = new Email();
           String de = request.getParameter("de");
           String clave = request.getParameter("clave");
           String para = request.getParameter("para");
           String mensaje = request.getParameter("mensaje");
           String asunto = request.getParameter("asunto");
           
           /*
               
               String[] direcciones = {"correo numero 1","correo numero 2","correo numero 3","correo ..."}
               boolean resultado = email.enviarCorreo(de, clave, direcciones, mensaje, asunto);
           
           */
           
           boolean resultado = email.enviarCorreo(de, clave, para, mensaje, asunto);
           
           if(resultado){
                out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
                               out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                               out.println("<script>");
                               out.println("$(document).ready(function(){");
                               out.println("swal ('!Correo Enviado Satisfactoriamente! ',' ','success');");
                               out.println("});");
                               out.println("</script>");
                               RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                               rd.include(request, response);
           }
           else{
               out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
                               out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                               out.println("<script>");
                               out.println("$(document).ready(function(){");
                               out.println("swal ('!Correo NO enviado! ',' ','error');");
                               out.println("});");
                               out.println("</script>");
                               RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                               rd.include(request, response);
           }
           
       %>
       
   </body>
</html>