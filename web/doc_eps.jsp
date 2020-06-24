
<%@page import="ModeloDAO.EpsDAO"%>
<%@page import="Modelo.Eps"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

    <head>

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

        <title> EPS </title>


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
                                        <a href="documentacion_901.jsp">
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
                                        <a href="biblioteca_admin.jsp">
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
                                        <h1 class="titulo_modulo">EPS DEL ESTUDIANTE</h1>
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
                                                    <a href="login.jsp?CerrarSesion=true">
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
                                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">

                                    <form action="CargaMasivaServicio" enctype="multipart/form-data" method="post">
                                        <label class="label_filtrar"> Filtrar registro :</label> &nbsp;  &nbsp; 
                                        <input class="input_filtrar" id="txtBusqueda" type="text" onkeyup="Buscar();" /> &nbsp;
                                        <!--<a class="btn btn-primary " href="ControllerPdf?action=insert&id" >AGREGAR</a> -->
                                    </form>     
                                    <div class="dropdown no-arrow">
                                        <a class="dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            <i class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"></i>
                                        </a>

                                    </div>
                                </div>
                                <!-- Card Body -->
                                <div class="card-body">
                                    <div class="chart-area">
                                        <style>
                                        .label_filtrar{
                                            color: #666666;
                                            font-size: 20px; 
                                            font-family: "arial";
                                        }
                                        
                                        .input_filtrar{
                                            width: 330px;
                                            height: 35px;
                                            border-width: 1px;
                                            border-style: solid;
                                            text-align: center;
                                            
                                        }
                                        
                                        .tabla_pdf{
                                            margin: 10px;
                                        }
                                        
                                        .imagen_pdf{
                                            width: 38px;
                                            height: 38px;
                                        }
                                     
                                        .imagen_elim_pdf{
                                            width: 45px;
                                            height: 40px;
                                        }
                                        .imagen_edit_pdf{
                                        width: 38px;
                                        height: 35px;
                                        }

                                    </style>
                                        <%
                                            EpsDAO emp = new EpsDAO();
                                            Eps epsdto = new Eps();
                                            ArrayList<Eps> listar = emp.Listar_EPS();
                                        %>

                                        <table id="tblPersonas"  class="table" id="testTable" border="1">
                          <thead class="thead-dark">
                                                <tr>
                                                    <th class="campo">Código de EPS</th>
                                                    <th class="campo">Fichero</th>
                                                    <th class="campo">Acciones</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%if (listar.size() > 0) {
                                                        for (Eps listar2 : listar) {
                                                            epsdto = listar2;
                                                %>
                                                <tr>
                                                    <td><%=epsdto.getCodigopdf()%></td>
                                                    <td>
                                                        <%
                                                            if (epsdto.getArchivopdf2() != null) {
                                                        %>
                                                        <a href="pdfeps?IdEps=<%=epsdto.getCodigopdf()%>" target="_blank">PDF</a>
                                                        <%
                                                            } else {
                                                                out.print("Vacío");
                                                            }
                                                        %>
                                                    </td>
                                                    <td>
                                                        <a href="ControladorEps?action=edit&IdEps=<%=epsdto.getCodigopdf()%>"> <img class="imagen_edit_pdf" src="pdf/Imagen/editar.png" title="Modificar"/></a> &nbsp;  
                      
                                                        </td>


                                                    <%}
                        }%>
                                                </tr>
                                            </tbody>
                                        </table>
                                        
                                    </div>
                                </div>
                            </div>  
                        </div>
                    </div>
                </div>
        </div>

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>

        <!-- Script TABLA FILTRO -->
        <script type="text/javascript">// < ![CDATA[
            function Buscar() {
                var tabla = document.getElementById('tblPersonas');
                var busqueda = document.getElementById('txtBusqueda').value.toLowerCase();
                var cellsOfRow = "";
                var found = false;
                var compareWith = "";
                for (var i = 1; i < tabla.rows.length; i++) {
                    cellsOfRow = tabla.rows[i].getElementsByTagName('td');
                    found = false;
                    for (var j = 0; j < cellsOfRow.length && !found; j++) {
                        compareWith = cellsOfRow[j].innerHTML.toLowerCase();
                        if (busqueda.length == 0 || (compareWith.indexOf(busqueda) > -1))
                        {
                            found = true;
                        }
                    }
                    if (found)
                    {
                        tabla.rows[i].style.display = '';
                    } else {
                        tabla.rows[i].style.display = 'none';
                    }
                }
            }
            //s ]]></script>

        <!-- Script ALERTA ELIMINAR -->
        <script>
            function mensaje(idServicioSocial) {
                Swal.fire({
                    title: '¿Estas seguro?',
                    text: "¡No podrás revertir esto!",
                    type: 'advertencia',
                    showCancelButton: true,
                    confirmButtonColor: '#3085d6',
                    cancelButtonColor: '#d33',
                    confirmButtonText: 'Si, borrar registro'
                }).then((result) => {
                    if (result.value) {
                        location.href = "CrudServicio?accion=eliminar&idServicioSocial=" + idServicioSocial;
                    }
                }
                )
            }
        </script>


        <script>
            function mensaje(codigopdf) {
                Swal.fire({
                    title: '¿Estas seguro?',
                    text: "¡No podrás revertir esto!",
                    type: 'advertencia',
                    showCancelButton: true,
                    confirmButtonColor: '#3085d6',
                    cancelButtonColor: '#d33',
                    confirmButtonText: 'Si, borrar registro'
                }).then((result) => {
                    if (result.value) {
                        location.href = "ControladorMatricula?action=delete&IdMatricula=" + codigopdf;
                    }
                }
                )
            }
        </script>




        <!-- Jquery JS-->
        <script src="modulos/vendor/jquery-3.2.1.min.js"></script>
        <!-- Bootstrap JS-->
        <script src="modulos/vendor/bootstrap-4.1/popper.min.js"></script>
        <script src="modulos/vendor/bootstrap-4.1/bootstrap.min.js"></script>
        <!-- Vendor JS       -->
        <script src="modulos/vendor/slick/slick.min.js">
        </script>
        <script src="modulos/vendor/wow/wow.min.js"></script>
        <script src="modulos/vendor/animsition/animsition.min.js"></script>
        <script src="modulos/vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
        </script>
        <script src="modulos/vendor/counter-up/jquery.waypoints.min.js"></script>
        <script src="modulos/vendor/counter-up/jquery.counterup.min.js"></script>
        <script src="modulos/vendor/circle-progress/circle-progress.min.js"></script>
        <script src="modulos/vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
        <script src="modulos/vendor/chartjs/Chart.bundle.min.js"></script>
        <script src="modulos/vendor/select2/select2.min.js">
        </script>

        <!-- Main JS-->
        <script src="modulos/js/main_1.js"></script>
        <script src="modulos/js/main_servicio.js"></script>


        <!-- Bootstrap core JavaScript-->
        <script src="modulos/vendor/jquery/jquery.min.js"></script>
        <script src="modulos/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="modulos/vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="modulos/js/sb-admin-2.min.js"></script>

        <!-- Page level plugins -->
        <script src="modulos/vendor/chart.js/Chart.min.js"></script>

        <!-- Page level custom scripts -->
        <script src="modulos/js/demo/chart-area-demo.js"></script>
        <script src="modulos/js/demo/chart-pie-demo.js"></script>


</html>








