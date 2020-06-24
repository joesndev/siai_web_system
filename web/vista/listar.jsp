


<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Usuario"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <h1>ACA ABAJO LA LISTA </h1>
        
        <div>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>NOMBRE</th>
                <th>APELLIDO</th>
                <th>NUMERO DE DOCUMENTO</th>
                <th>DIRECCION</th>
                <th>CORREO</th>
                <th>TELEFONO</th>
                <th>TIPO DE USUARIO</th>
                <th>CLAVE</th>
                <th>FECHA DE NACIMIENTO</th>
                <th>ACCIONES</th>
            </tr>
        </thead>
        <% 
            UsuarioDAO dao=new UsuarioDAO();
            List<Usuario>list=dao.listar();
            Iterator<Usuario>iter=list.iterator();
            Usuario usu=null;
            while(iter.hasNext()){
            usu=iter.next();
            
        %>
        <tbody>
            <tr>
                <td><%=usu.getIdusuario()%></td>
                <td><%=usu.getNombre()%></td>
                <td><%=usu.getApellido()%></td>
                <td><%=usu.getNumeroDocumento()%></td>
                <td><%=usu.getDireccion()%></td>
                <td><%=usu.getCorreo()%></td>
                <td><%=usu.getTelefono()%></td>
                <td><%=usu.getTipoUsuario()%></td>
                <td><%=usu.getClave()%></td>
                <td><%=usu.getFechaNacimiento()%></td>
                <td>
        <center><a href="Crudusuario?accion=editar&idusuario=<%=usu.getIdusuario()%>" class="btn btn-outline-dark" >Editar</a></center>
        <center><a href="Crudusuario?accion=eliminar&idusuario=<%=usu.getIdusuario()%>" class="btn btn-outline-danger" >Remover</a></center>
                </td>
            </tr>
            <% } %>
        </tbody>
    </table>
</div>
        <a class="btn bvbtn-outline-success btn-lg" href="Crudusuario?accion=add" >Agregar otro</a>
    </body>
</html>
