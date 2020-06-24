<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Curso"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.CursoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <title>LS&M-Panel De Control</title>
        <meta content="width=device-width, initial-scale=1.0, shrink-to-fit=no" name="viewport" />
        <link rel="icon" href="../assets/img/Logotipo_LS&M.png" type="image/x-icon" />

        <!-- Fonts and icons -->
        <script src="assets/js/plugin/webfont/webfont.min.js"></script>
        <script>
            WebFont.load({
                google: {
                    "families": ["Lato:300,400,700,900"]
                },
                custom: {
                    "families": ["Flaticon", "Font Awesome 5 Solid", "Font Awesome 5 Regular", "Font Awesome 5 Brands", "simple-line-icons"],
                    urls: ['assets/css/fonts.min.css']
                },
                active: function () {
                    sessionStorage.fonts = true;
                }
            });
        </script>
        <script type="text/javascript">             var tableToExcel = (function() {
                    var uri = 'data:application/vnd.ms-excel;base64,'
                    , template = '<html xmlns:o="urn:schemas-microsoft-com:office:office" xmlns:x="urn:schemas-microsoft-com:office:excel" xmlns="http://www.w3.org/TR/REC-html40"><head><!--[if gte mso 9]><xml><x:ExcelWorkbook><x:ExcelWorksheets><x:ExcelWorksheet><x:Name>{worksheet}</x:Name><x:WorksheetOptions><x:DisplayGridlines/></x:WorksheetOptions></x:ExcelWorksheet></x:ExcelWorksheets></x:ExcelWorkbook></xml><![endif]--></head><body><table>{table}</table></body></html>'
                    , base64 = function(s) { return window.btoa(unescape(encodeURIComponent(s))) }
, format = function(s, c) { return s.replace(/{(\w+)}/g, function(m, p) { return c[p]; }) }
return function(table, name) {
if (!table.nodeType) table = document.getElementById(table)
var ctx = {worksheet: name || 'Worksheet', table: table.innerHTML}
//window.location.href = uri + base64(format(template, ctx))
var link = document.createElement("a");
link.download = "Reporte.xls";
link.href = uri + base64(format(template, ctx));
link.click();
}
})()
        </script>
        <link href="assets/styles.css" rel="stylesheet" />
        <link href="assets/prism.css" rel="stylesheet" />
        <!-- CSS Files -->
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/atlantis.min.css">

        <!-- CSS Just for demo purpose, don't include it in your project -->
        <link rel="stylesheet" href="assets/css/demo.css">
    </head>

    <body>
        <div class="wrapper">
            <div class="main-header">
                <!-- Logo Header -->
                <div class="logo-header" data-background-color="blue">

                    <a href="index.html" class="logo">
                        <img  class="logo_mio" src="images/IMLS.jpg"  widht="60px" height="40px" alt="navbar brand" class="navbar-brand">
                    </a>
                    <button class="navbar-toggler sidenav-toggler ml-auto" type="button" data-toggle="collapse" data-target="collapse" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon">
                            <i class="icon-menu"></i>
                        </span>
                    </button>
                    <button class="topbar-toggler more"><i class="icon-options-vertical"></i></button>
                    <div class="nav-toggle">
                        <button class="btn btn-toggle toggle-sidebar">
                            <i class="icon-menu"></i>
                        </button>
                    </div>
                </div>
                <!-- End Logo Header -->

                <!-- Navbar Header -->
                <nav class="navbar navbar-header navbar-expand-lg" data-background-color="blue2">

                    <div class="container-fluid">
                        <div class="collapse" id="search-nav">
                            <form class="navbar-left navbar-form nav-search mr-md-3">
                                <div class="input-group">
                                    <div class="input-group-prepend">
                                        <button type="submit" class="btn btn-search pr-1">
                                            <i class="fa fa-search search-icon"></i>
                                        </button>
                                    </div>
                                    <input type="text" placeholder="Buscar ..." class="form-control">
                                </div>
                            </form>
                        </div>
                        <ul class="navbar-nav topbar-nav ml-md-auto align-items-center">
                            <li class="nav-item toggle-nav-search hidden-caret">
                                <a class="nav-link" data-toggle="collapse" href="#search-nav" role="button" aria-expanded="false" aria-controls="search-nav">
                                    <i class="fa fa-search"></i>
                                </a>
                            </li>
                            <li class="nav-item dropdown hidden-caret">
                                <a class="nav-link dropdown-toggle" href="#" id="messageDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i class="fa fa-envelope"></i>
                                </a>
                                <ul class="dropdown-menu messages-notif-box animated fadeIn" aria-labelledby="messageDropdown">
                                    <li>
                                        <div class="dropdown-title d-flex justify-content-between align-items-center">
                                            Messages
                                            <a href="#" class="small">Mark all as read</a>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="message-notif-scroll scrollbar-outer">
                                            <div class="notif-center">
                                                <a href="#">
                                                    <div class="notif-img">
                                                        <img src="assets/img/jm_denis.jpg" alt="Img Profile">
                                                    </div>
                                                    <div class="notif-content">
                                                        <span class="subject">Jimmy Denis</span>
                                                        <span class="block">
                                                            How are you ?
                                                        </span>
                                                        <span class="time">5 minutes ago</span>
                                                    </div>
                                                </a>
                                                <a href="#">
                                                    <div class="notif-img">
                                                        <img src="assets/img/chadengle.jpg" alt="Img Profile">
                                                    </div>
                                                    <div class="notif-content">
                                                        <span class="subject">Chad</span>
                                                        <span class="block">
                                                            Ok, Thanks !
                                                        </span>
                                                        <span class="time">12 minutes ago</span>
                                                    </div>
                                                </a>
                                                <a href="#">
                                                    <div class="notif-img">
                                                        <img src="assets/img/mlane.jpg" alt="Img Profile">
                                                    </div>
                                                    <div class="notif-content">
                                                        <span class="subject">Jhon Doe</span>
                                                        <span class="block">
                                                            Ready for the meeting today...
                                                        </span>
                                                        <span class="time">12 minutes ago</span>
                                                    </div>
                                                </a>
                                                <a href="#">
                                                    <div class="notif-img">
                                                        <img src="assets/img/talha.jpg" alt="Img Profile">
                                                    </div>
                                                    <div class="notif-content">
                                                        <span class="subject">Talha</span>
                                                        <span class="block">
                                                            Hi, Apa Kabar ?
                                                        </span>
                                                        <span class="time">17 minutes ago</span>
                                                    </div>
                                                </a>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <a class="see-all" href="javascript:void(0);">See all messages<i class="fa fa-angle-right"></i> </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="nav-item dropdown hidden-caret">
                                <a class="nav-link dropdown-toggle" href="#" id="notifDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i class="fa fa-bell"></i>
                                    <span class="notification">4</span>
                                </a>
                                <ul class="dropdown-menu notif-box animated fadeIn" aria-labelledby="notifDropdown">
                                    <li>
                                        <div class="dropdown-title">Tienes 4 notificaciones</div>
                                    </li>
                                    <li>
                                        <div class="notif-scroll scrollbar-outer">
                                            <div class="notif-center">
                                                <a href="#">
                                                    <div class="notif-icon notif-primary"> <i class="fa fa-user-plus"></i> </div>
                                                    <div class="notif-content">
                                                        <span class="block">
                                                            Nuevo usuario registrado
                                                        </span>
                                                        <span class="time">5 minutes ago</span>
                                                    </div>
                                                </a>
                                                <a href="#">
                                                    <div class="notif-icon notif-success"> <i class="fa fa-comment"></i> </div>
                                                    <div class="notif-content">
                                                        <span class="block">
                                                            Petición usuario
                                                        </span>
                                                        <span class="time">12 minutes ago</span>
                                                    </div>
                                                </a>
                                                <a href="#">
                                                    <div class="notif-img">
                                                        <img src="assets/img/profile2.jpg" alt="Img Profile">
                                                    </div>
                                                    <div class="notif-content">
                                                        <span class="block">
                                                            Mensaje
                                                        </span>
                                                        <span class="time">12 minutes ago</span>
                                                    </div>
                                                </a>
                                                <a href="#">
                                                    <div class="notif-icon notif-danger"> <i class="fas fa-user-alt-slash"></i> </div>
                                                    <div class="notif-content">
                                                        <span class="block">
                                                            Elimino usuario
                                                        </span>
                                                        <span class="time">17 minutes ago</span>
                                                    </div>
                                                </a>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <a class="see-all" href="javascript:void(0);">Ver más notificaciones<i class="fa fa-angle-right"></i> </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="nav-item dropdown hidden-caret">
                                <a class="nav-link" data-toggle="dropdown" href="#" aria-expanded="false">
                                    <i class="fas fa-layer-group"></i>
                                </a>
                                <div class="dropdown-menu quick-actions quick-actions-info animated fadeIn">
                                    <div class="quick-actions-header">
                                        <span class="title mb-1">Panel dinamico</span>
                                        <span class="subtitle op-8">Opciones</span>
                                    </div>
                                    <div class="quick-actions-scroll scrollbar-outer">
                                        <div class="quick-actions-items">
                                            <div class="row m-0">
                                                <a class="col-6 col-md-4 p-0" href="#">
                                                    <div class="quick-actions-item">
                                                        <i class="flaticon-file-1"></i>
                                                        <span class="text">Generar nota</span>
                                                    </div>
                                                </a>
                                                <a class="col-6 col-md-4 p-0" href="#">
                                                    <div class="quick-actions-item">
                                                        <i class="flaticon-database"></i>
                                                        <span class="text">Base de datos</span>
                                                    </div>
                                                </a>
                                                <a class="col-6 col-md-4 p-0" href="#">
                                                    <div class="quick-actions-item">
                                                        <i class="flaticon-pen"></i>
                                                        <span class="text">Responder PQRS</span>
                                                    </div>
                                                </a>
                                                <a class="col-6 col-md-4 p-0" href="#">
                                                    <div class="quick-actions-item">
                                                        <i class="flaticon-interface-1"></i>
                                                        <span class="text">Validar Usuario</span>
                                                    </div>
                                                </a>
                                                <a class="col-6 col-md-4 p-0" href="#">
                                                    <div class="quick-actions-item">
                                                        <i class="flaticon-list"></i>
                                                        <span class="text">Lista usuarios</span>
                                                    </div>
                                                </a>
                                                <a class="col-6 col-md-4 p-0" href="#">
                                                    <div class="quick-actions-item">
                                                        <i class="flaticon-file"></i>
                                                        <span class="text">Validar datos</span>
                                                    </div>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="nav-item dropdown hidden-caret">
                                <a class="dropdown-toggle profile-pic" data-toggle="dropdown" href="#" aria-expanded="false">
                                    <div class="avatar-sm">
                                        <img src="assets/img/profile.jpg" alt="..." class="avatar-img rounded-circle">
                                    </div>
                                </a>
                                <ul class="dropdown-menu dropdown-user animated fadeIn">
                                    <div class="dropdown-user-scroll scrollbar-outer">
                                        <li>
                                            <div class="user-box">
                                                <div class="avatar-lg"><img src="assets/img/profile.jpg" alt="image profile" class="avatar-img rounded"></div>
                                                <div class="u-text">
                                                    <h4>Hizrian</h4>
                                                    <p class="text-muted">hello@example.com</p><a href="profile.html" class="btn btn-xs btn-secondary btn-sm">View Profile</a>
                                                </div>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="dropdown-divider"></div>
                                            <a class="dropdown-item" href="#">MI perfil</a>
                                            <a class="dropdown-item" href="#">Configuración de la cuenta</a>
                                            <a class="dropdown-item" href="login.jsp">Cerrar sesion</a>
                                        </li>
                                    </div>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </nav>
                <!-- End Navbar -->
            </div>

            <!-- Sidebar -->
            <div class="sidebar sidebar-style-2">
                <div class="sidebar-wrapper scrollbar scrollbar-inner">
                    <div class="sidebar-content">
                        <ul class="nav nav-primary">
                            <li class="nav-item active">
                                <a href="index_admin.jsp" aria-expanded="false">
                                    <i class="fas fa-home"></i>
                                    <p>Dashboard</p>

                                </a>
                            </li>
                            <li class="nav-section">
                                <span class="sidebar-mini-icon">
                                    <i class="fa fa-ellipsis-h"></i>
                                </span>
                                <h3 class="text-section">Menu</h3>
                            </li>
                            <li class="nav-item">
                                <a data-toggle="collapse" href="#charts">
                                    <i class="fas fa-user-plus"></i>
                                    <p>Gestionar Usuarios</p>
                                    <span class="caret"></span>
                                </a>
                                <div class="collapse" id="charts">
                                    <ul class="nav nav-collapse">
                                        <li>
                                            <a href="Crud?accion=listar">
                                                <span class="sub-item">Lista de Usuarios IMLS</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="Contact?accion=listar">
                                                <span class="sub-item">Solicitudes IMLS</span>
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <li class="nav-item">
                                <a class="" href="Crudcur?accion=listar">
                                    <i class="fas fa-user-plus"></i>
                                    <p>Cursos</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="admin_soporte.jsp">
                                    <i class="fas fa-user-cog"></i>
                                    <p>Soporte</p>
                                    <span class="badge badge-success">4</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- End Sidebar -->

            <div class="main-panel">
                <div class="content">
                    <div class="panel-header bg-primary-gradient">
                        <div class="page-inner py-5">
                            <div class="d-flex align-items-left align-items-md-center flex-column flex-md-row">
                                <div>
                                    <h1 class="text-white pb-2 fw-bold">Lista de Cursos</h1>
                                    <h5 class="text-white op-7 mb-2"> </h5>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--Acá podran añadir el contenido de sus modulos-->
                    <div class="bd-example">
                        <div class="table-responsive">
                            <table id="testTable" class="display table table-striped table-hover" cellspacing="0" width="100%">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Horario</th>
                                        <th>Nivel</th>
                                        <th>Clase</th>
                                        <th>ACCIONES</th>
                                    </tr>
                                </thead>
                                <%
                                    CursoDAO dao = new CursoDAO();
                                    List<Curso> list = dao.listar();
                                    Iterator<Curso> iter = list.iterator();
                                    Curso cur = null;
                                    while (iter.hasNext()) {
                                        cur = iter.next();

                                %>
                                <tbody>
                                    <tr>
                                        <td><%=cur.getIdCurso()%></td>
                                        <td><%=cur.getHorario()%></td>
                                        <td><%=cur.getNivel_idNiveles()%></td>
                                        <td><%=cur.getTipoClase_idTipoClase()%></td>

                                        <td>
                                <center><a href="Crudcur?accion=editar&idCurso=<%=cur.getIdCurso()%>" class="btn btn-secondary btn-md" >Editar</a></center>
                                <center><a href="Crudcur?accion=eliminar&idCurso=<%=cur.getIdCurso()%>" class="btn btn-info btn-md" >Remover</a></center>
                                </td>
                                </tr>
                                <% }%>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <center><a class="btn btn-outline-success btn-lg" href="Crudcur?accion=add" >Agregar Curso</a></center>
                    <center><input type=image src="Excel.gif" width="180" height="48" onclick="tableToExcel('testTable', 'Empleados')" class="btn btn-success btn-md" data-toggle="tooltip" title="Exportar a Excel"></center>
                    <!--termina el contenido de sus modulos-->
                    <footer class="footer">
                        <div class="container-fluid">
                            <nav class="pull-left">
                                <ul class="nav">
                                    <li class="nav-item">
                                        <a class="nav-link" href="#">
                                            Gmail
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="#">
                                            Help
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="#">
                                            Licenses
                                        </a>
                                    </li>
                                </ul>
                            </nav>
                            <div class="copyright ml-auto">&copy; Copyright <i class="fas fa-skull"></i> 2019 <a href="index.jsp">LS&M</a>
                            </div>
                        </div>
                    </footer>
                </div>



                <!-- End Custom template -->
            </div>
        </div>
        <script src="assets/js/core/jquery.3.2.1.min.js"></script>
        <script src="assets/js/plugin/bootstrap-toggle/bootstrap-toggle.min.js"></script>
        <script src="assets/prism.js"></script>
        <script src="assets/prism-normalize-whitespace.min.js"></script>
        <script type="text/javascript">


        // Optional
        Prism.plugins.NormalizeWhitespace.setDefaults({
            'remove-trailing': true,
            'remove-indent': true,
            'left-trim': true,
            'right-trim': true,
        });

        // handle links with @href started with '#' only
        $(document).on('click', 'a[href^="#"]', function (e) {
            // target element id
            var id = $(this).attr('href');

            // target element
            var $id = $(id);
            if ($id.length === 0) {
                return;
            }

            // prevent standard hash navigation (avoid blinking in IE)
            e.preventDefault();

            // top position relative to the document
            var pos = $id.offset().top - 80;

            // animated top scrolling
            $('body, html').animate({
                scrollTop: pos
            });
        });
        </script>


        <!--   Core JS Files   -->
        <script src="assets/js/core/jquery.3.2.1.min.js"></script>
        <script src="assets/js/core/popper.min.js"></script>
        <script src="assets/js/core/bootstrap.min.js"></script>

        <!-- jQuery UI -->
        <script src="assets/js/plugin/jquery-ui-1.12.1.custom/jquery-ui.min.js"></script>
        <script src="assets/js/plugin/jquery-ui-touch-punch/jquery.ui.touch-punch.min.js"></script>

        <!-- jQuery Scrollbar -->
        <script src="assets/js/plugin/jquery-scrollbar/jquery.scrollbar.min.js"></script>

        <!-- jQuery Sparkline -->
        <script src="assets/js/plugin/jquery.sparkline/jquery.sparkline.min.js"></script>

        <!-- Bootstrap Notify -->
        <script src="assets/js/plugin/bootstrap-notify/bootstrap-notify.min.js"></script>

        <!-- Sweet Alert -->
        <script src="assets/js/plugin/sweetalert/sweetalert.min.js"></script>

        <!-- Atlantis JS -->
        <script src="assets/js/atlantis.min.js"></script>

        <!-- Atlantis DEMO methods, don't include it in your project! -->
        <script src="assets/js/setting-demo.js"></script>
        <script src="assets/js/demo.js"></script>

    </body>

</html>
