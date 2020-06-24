<%-- 
    Document   : Pagina2
    Created on : 19/12/2017, 04:00:50 PM
    Author     : ESTEBAN
--%>

<%@page import="Modelo.PdfVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="pdf/css/.css" type="text/css" media="screen"/>
        
        <!-- ICONO -->
        <link rel="icon" type="image/png" href="formulario_correo/images/icons/SIAI.ico"/>
         
        <title>AGREGAR BOLETA</title>
        
        <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="au theme template">
  <meta name="author" content="Hau Nguyen">
  <meta name="keywords" content="au theme template">
  
  <!-- Bootstrap CSS-->
    <link href="modulos/vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet" media="all">

    <!-- Vendor CSS-->
    <link href="modulos/vendor/animsition/animsition.min.css" rel="stylesheet" media="all">
    <link href="modulos/vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet" media="all">
    <link href="modulos/vendor/wow/animate.css" rel="stylesheet" media="all">
    <link href="modulos/vendor/css-hamburgers/hamburgers.min.css" rel="stylesheet" media="all">
    <link href="modulos/vendor/slick/slick.css" rel="stylesheet" media="all">
    <link href="modulos/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="modulos/vendor/perfect-scrollbar/perfect-scrollbar.css" rel="stylesheet" media="all">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    
    <!-- ICONO -->
    <link rel="icon" type="image/png" href="formulario_correo/images/icons/SIAI.ico"/>
 
  <!-- Custom fonts for this template-->
  <link href="modulos/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
  <link href="modulos/css/font-face.css" rel="stylesheet" media="all">
  <link href="modulos/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
  <link href="modulos/vendor/font-awesome-5/css/fontawesome-all.min.css" rel="stylesheet" media="all">
  <link href="modulos/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">

  <!-- Main CSS-->
  <link href="modulos/css/theme.css" rel="stylesheet" media="all">
  <link href="modulos/css/estilo_tabla.css" rel="stylesheet" media="all">
  <link href="modulos/css/sb-admin-2.min.css" rel="stylesheet">
  
  <link href="modulos/css/theme.css" rel="stylesheet" media="all">
  
  </head>
    <body id="page-top"><p><br><p><br><br>

        <%
            Integer dato = 0;
            try {
                PdfVO pdf = (PdfVO) request.getAttribute("row");
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
        
       
  <!-- Page Wrapper -->
  <div id="wrapper">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
        
        <aside class="menu-sidebar d-none d-lg-block">
            <div class="logo">
                <a href="#">
                    <img class="logo_siai" src="modulos/images/icon/usuario.png" />
                </a>
            </div>
            <div class="menu-sidebar__content js-scrollbar1">
                <nav class="navbar-sidebar">
                    <ul class="list-unstyled navbar__list">
                        <center>
                            <li class="C has-sub">

                            <!-- Linea entre texto-->
                            <hr>
                          <li>
                            <a href="Pagina1.jsp">
                                <i class="fas fa-fast-backward"></i>Regresar</a>
                          </li>
                               
                            <hr>
                            <!-- Linea entre texto-->

                            <ul 
                            class="list-unstyled navbar__sub-list js-sub-list">
                            </ul>
                        
                          <li>
                            <a href="usuarios.jsp">
                                <i class="fas fa-user"></i> Usuarios </a>
                           </li>
                           
                           <li>
                            <a href="servicio_estudiante.jsp">
                                <i class="fa fa-book-reader"></i>Biblioteca Virtual</a>
                        </li>
                       
                           
                        <li>
                            <a href="gestion.jsp">
                                <i class="fas fa-copy"></i>Gestión Académica</a>
                        </li>
                           
                        
                        <li>
                            <a href="documentacion.jsp">
                            <i class="fas fa-folder-open"></i> Documentación </a></center>
                        </li>    
                        
                                                        
                            <ul class="list-unstyled navbar__sub-list js-sub-list">

                    </ul>
                </nav>
            </div>
        </aside>
        <!-- END MENU SIDEBAR-->
    </ul>
    <!-- End of Sidebar -->

    <!-- PAGE CONTAINER-->
        <div class="page-container">
            <!-- HEADER DESKTOP-->
            <header class="header-desktop">
                <div class="section__content section__content--p30">
                    <div class="container-fluid">
                        <div class="header-wrap">
                            <form class="form-header" action="" method="POST">
                                <h1 class="titulo_modulo">BOLETAS DE CONSTANCIA DE ACTIVIDAD</h1>
                                    <style>
                                        .titulo_modulo{
                                            color: #FFFFFF;
                                            font-size: 25px;
                                        }
                                    </style>
                            </form>
                                <div class="account-wrap">
                                    <div class="account-item clearfix js-item-menu">
                                        <div class="image">
                                            <img src="modulos/images/icon/avatar-01.png" alt="John Doe" />
                                        </div>
                                        <div class="content">
                                            <a class="js-acc-btn" href="#">Esteban Gómez &nbsp; </a>
                                        </div>
                                        <div class="account-dropdown js-dropdown">
                                            <div class="info clearfix">
                                                <div class="image">
                                                    <a href="#">
                                                        <img src="modulos/images/icon/avatar-01.png" alt="John Doe" />
                                                    </a>
                                                </div>
                                                <div class="content">
                                                    <h5 class="name">
                                                        <a href="#">Esteban Gómez</a>
                                                    </h5>
                                                    <span class="email">esteban@prueba1.com</span>
                                                </div>
                                            </div>
                                            <div class="account-dropdown__body">
                                                
                                                <div class="account-dropdown__item">
                                                    <a href="#">
                                                        <i class="zmdi zmdi-settings"></i>Setting</a>
                                                </div>
                                            </div>
                                            <div class="account-dropdown__footer">
                                                <a href="index.html">
                                                    <i class="zmdi zmdi-power"></i>Cerrar Sesión</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
            <!-- HEADER DESKTOP-->

        <!-- Begin Page Content -->
        <div class="container-fluid">


          <!-- Content Row -->
         
          <div class="row">

            <!-- Area Chart -->
            <div class="col-xl-12 col-lg-12" class="tabla_servicio">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                
              <!-- Card Body -->
                <div class="card-body">
                  <div class="chart-area">
                      
        <form name="formpdf" action="ControllerPdf" method="post" enctype="multipart/form-data">
            <div class="datagrid">
                <table id="tblPersonas"  class="table" id="testTable" border="1">
                    <thead class="thead-dark">
                        <tr>
                            <th>NOMBRE</th>
                            <th>ARCHIVO</th>
                        </tr>
                    </thead>
                    
                    <tbody>
                        <tr>
                            <td>
                                <label for="id">Nombre del archivo : </label>
                            </td>  
                            <td>
                            <center>
                                <input  class="form-control" type="text" name="txtname"  value="<c:out value="${row.nombrepdf}" />" />
                            </center>
                                <style>
                                        .form-control{
                                            width: 330px;
                                            text-align: center;
                                        } 
                                    </style>
                            </td>
                        </tr>
                        <tr class="alt">
                            <td>
                                <label for="id">Seleccionar archivo PDF : </label>
                                <%
                                    if (icono) {
                                %>
                                <a href="pdf?id=<%out.print(dato); %>" target="_blank"> Click AQUI para vizualizar archivo seleccionado </a>
                                <%
                                    } else {
                                        out.print("");
                                    }
                                %>
                            </td>  
                            <td>
                                <input type="file" name="fichero" value="" class="btn btn-primary" />
                            </td>
                        </tr>
                    </tbody>
                    <td colspan="2" style="text-align: center"><input type="submit" value="AGREGAR BOLETA" name="submit" class="btn btn-primary"/></td>
                </table>
            </div>
        </form>
      </div>
    </div>
   </div>  
  </div>
 </div>
        </div>
              </div>
 
    </body>
</html>
