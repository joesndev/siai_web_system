<%-- 
    Document   : Pagina2
    Created on : 19/12/2017, 04:00:50 PM
    Author     : ESTEBAN
--%>

<%@page import="Modelo.Libro"%>
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
         
        <title>AGREGAR LIBRO</title>
        
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
  <link href="css/botones_css.css" rel="stylesheet" media="all">
  <link href="css/botones_servicio.css" rel="stylesheet" media="all">
  <link href="modulos/css/theme.css" rel="stylesheet" media="all">
  
  </head>
    <body id="page-top"><p><br><p><br><br>

        
       
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
                            <a href="biblioteca_admin.jsp">
                                <i class="fas fa-fast-backward"></i>Regresar</a>
                          </li>
                               
                            <hr>
                            <!-- Linea entre texto-->

                            <ul 
                            class="list-unstyled navbar__sub-list js-sub-list">
                            </ul>
                        
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
                                <h1 class="titulo_modulo">LISTA DE LIBROS DISPONIBLES</h1>
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
                <div class="row">
                    <!-- Area Chart -->
                    <div class="col-xl-12 col-lg-12" class="tabla_servicio">
                        <div class="card shadow mb-4">
                            <form action="CargaMasivaServicio" enctype="multipart/form-data" method="post">
                                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">


                                   

                                    <div class="dropdown no-arrow">
                                        <a class="dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            <i class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"></i>
                                        </a>

                                    </div>
                                </div>
                            </form>
         
                    
                <%
                        Integer dato = 0;
                        try {
                            Libro pdf = (Libro) request.getAttribute("row");
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
                    
                    
                <!-- Card Body -->
                <div class="card-body">
                    <form name="formpdf" action="ControllerLibro" method="post" enctype="multipart/form-data">
                  <div class="chart-area">
                       <table id="tblPersonas"  class="table" id="testTable" border="1">
                          <thead class="thead-dark">
                            
                                <tr>
                                            <th>NOMBRE</th>
                                            <th>DESCRIPCION</th>
                                            <th>GENERO</th>
                                            <th>AUTOR</th>
                                            <th>NUMERO DE CAPITULOS</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr> 
                                            <td>
                                                <div class="form-group">
                                                    <input type="text" name="txtname" class="form-control" placeholder="Nombre libro" value="<c:out value="${row.nombrepdf}"/>">
                                                </div>
                                            </td>
                                            <td>
                                                <div class="form-group">
                                                    <input type="text" name="txtdescripcion" class="form-control" placeholder="Descripción libro" value="<c:out value="${row.descripcion}"/>">
                                                </div>
                                            </td>
                                            <td>
                                                <div class="form-group">
                                                    <input type="text" name="txtgenero" class="form-control" placeholder="Género libro" value="<c:out value="${row.genero}"/>">
                                                </div>
                                            </td>
                                            <td>
                                                <div class="form-group">
                                                    <input type="text" name="txtautor" class="form-control" placeholder="Autor libro" value="<c:out value="${row.autor}"/>">
                                                </div>
                                            </td>
                                            <td>
                                                <div class="form-group">
                                                    <input type="text" name="txtnumcap" class="form-control" placeholder="N°Capitulos" value="<c:out value="${row.numCapitulos}"/>">
                                                </div>
                                            </td>
                                        </tr>
                                        <thead class="thead-dark">
                            
                                <tr>
                                            <th>VER ARCHIVO CARGADO </th>
                                            <th>SELECCIONE ARCHIVO PARA EDITAR</th>
                                            <th>CARGAR</th>
                                            <th>ARCHIVO</th>
                                            <th></th>
                                </tr>
                                    </thead>
                                    
                                        <tr>
                                            <td>
                                                <label for="Ident"></label>
                                                <%
                                                    if (icono) {
                                                %>
                                                <a  href="pdflibro?Ident=<%out.print(dato); %>" target="_blank">VIZUALIZAR PDF</a>
                                                <%
                                                    } else {
                                                        out.print("PDF no Seleccionado");
                                                    }
                                                %>
                                            </td>  
                                            <td>
                                                <input class="bttn-unite bttn-sm bttn-primary" type="file" name="fichero" value="" class="btn"/>
                                            </td>
                                        
                                            <td colspan="2" style="text-align: center">
                                                <button type="submit" value="Enviar Archivo" name="submit" id="btn" class="bttn-unite bttn-sm bttn-primary">CARGAR LIBRO</button>
                                                
                                            </td> 
                                            <td> -------- </td>
                                        </tr>
                                    
                                    </tbody>
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
            </div>

            </body>
            </html>
