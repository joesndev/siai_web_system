
<%-- 
    Document   : login
    Created on : 23-jun-2019, 15:46:32
    Author     : ESTEBAN
--%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es" >

<head>
  <meta charset="UTF-8">
  
   <!-- ICONO -->
    <link rel="icon" type="image/png" href="formulario_correo/images/icons/SIAI.ico"/>
    
    <title> INGRESO </title>
  
    <link rel="stylesheet" href="css/style2.css">
    
       <!-- ESTILO BOTONES -->   
        <link href="css/botones_css.css" rel="stylesheet" media="all">
        <link href="css/botones_servicio.css" rel="stylesheet" media="all">
    
</head>

<body > 
    <STYLE>A {text-decoration: none;} </STYLE>
  <hgroup>
  <h1>INICIO DE SESIÓN</h1>
</hgroup>
<form action="Validar" method="POST">
<img src="img/SIAI.PNG" class="img_form">
<div class="container">
  <div class="profile">
    
    <div class="profile__form">
      <div class="profile__fields">
         
        <div class="group">
            <input type="number" id="fieldUser" class="input" name="txtuser" required pattern=.*\S.* />
                <span class="highlight"></span><span class="bar"></span>
                    <label for="fieldUser" class="label" >Codigo</label>
        </div>

          
        <div class="group">
            <input type="password" id="fieldPassword" class="input" name="txtpass" required pattern=.*\S.* />
                <span class="highlight"></span><span class="bar"></span>
                    <label for="fieldPassword" class="label">Clave</label>
        </div>
        <div class="profile__footer">
            
     <center>       
    <button class="bttn-jelly bttn-md bttn-primary" type="submit" name="accion" value="Ingresar" >
        Acceder 
    </button> <p>
        
    <button class="bttn-jelly bttn-md bttn-primary" onclick="location.href='formulario_correo/formulario_correo.jsp'"  data-toggle="tooltip" title="INGRESAR AL MODULO SERVICIO SOCIAL">
       ¿Olvido su contraseña?
    </button>
        
    </p></center>
            
    <style>
        .bttn-primary{
            width: 35%;
            height: 50px;
            border-radius:25px ;
        }
    </style>
          
          
           <br><br>
        </div>
      </div>
     </div>
  </div>
</div>
    </form>


<!--
<footer>
  <a href="index.html" target="_blank">
    <img class="imagen_footer" src="img/SIAI.PNG"></a>
      <p><b>SIAI WEB</b><a href="" target="_blank"></a></p>
</footer> -->
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

  

    <script  src="js/index.js"></script>

<%
if(request.getParameter("CerrarSesion")!=null){
        session.invalidate();
}
%>


</body>

</html>
