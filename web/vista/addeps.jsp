<%-- 
    Document   : addmatricula
    Created on : Nov 19, 2019, 8:23:41 PM
    Author     : Johann Esneider
--%>

<%@page import="Modelo.Eps"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="modulos/vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet" media="all">
    </head>
    <body>
        <%
                        Integer dato = 0;
                        try {
                            Eps pdf = (Eps) request.getAttribute("row");
                            dato = pdf.getCodigopdf();
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                        boolean icono = false;
                        try {
                            icono = (Boolean) request.getAttribute("row2");
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    %>
                    
                    
                    
                    <form name="formpdf" action="ControladorEps" method="post" enctype="multipart/form-data">
                            <div class="datagrid">
                                <table style="width: 100%; height: 100px;">
                                    <thead>
                                    </thead>
                                    <tbody>
                                        <tr class="alt">
                                            <td></td>
                                            <td>
                                                <label for="IdEps"></label>
                                                <%
                                                    if (icono) {
                                                %>
                                                <a href="pdfeps?IdEps=<%out.print(dato); %>" target="_blank">Visualizar PDF</a>
                                                <%
                                                    } else {
                                                        out.print("No hay ningún PDF seleccionado");
                                                    }
                                                %>
                                            </td>  
                                            <td>
                                                <input type="file" name="fichero" value="" class="btn"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td colspan="2" style="text-align: center">
                                            <input type="submit" value="Enviar Archivo" name="submit" id="btn" class="btn btn-info"/></td>                
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </form>
    </body>
</html>
