
<!DOCTYPE html>
<html lang="es">

<head>

  <meta charset="UTF-8">
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
    
    <!-- ICONO -->
    <link rel="icon" type="image/png" href="formulario_correo/images/icons/SIAI.ico"/>

    <title> AGREGAR USUARIO </title>

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
    <!--INICIO - JAVASCRIPT DE VALIDACI�N -->
    <script src="js/validar_us.js" type="text/javascript"></script>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@8"></script>
    <!--FIN - JAVASCRIPT DE VALIDACI�N -->
 
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
                            <a href="usuarios.jsp">
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
                            <a href="gestion.jsp">
                                <i class="fas fa-copy"></i>Gesti�n Acad�mica</a>
                        </li>
                           
                        
                        <li>
                            <a href="documentacion.jsp">
                            <i class="fas fa-folder-open"></i> Documentaci�n </a></center>
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
                                <input class="au-input au-input--xl" type="text" name="search" placeholder="Buscar ..." />
                                <button class="au-btn--submit" type="submit">
                                    <i class="zmdi zmdi-search"></i>
                                </button>
                            </form>
                            
                                <div class="account-wrap">
                                    <div class="account-item clearfix js-item-menu">
                                        <div class="image">
                                            <img src="modulos/images/icon/avatar-01.png" alt="John Doe" />
                                        </div>
                                        <div class="content">
                                            <a class="js-acc-btn" href="#">Esteban G�mez</a>
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
                                                        <a href="#">Esteban G�mez</a>
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
                                                    <i class="zmdi zmdi-power"> Cerrar Sesi�n</i></a>
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
   <center>
       <div class="col-xl-10 col-lg-10" class="tabla_servicio">
           
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                 
                </div>
                <!-- Card Body -->
                <div class="card-body">
                  <div class="chart-area">
                    <center>
                       <h1> AGREGAR A UN NUEVO USUARIO </h1><p><br>
                            
                       <form class="text-center border border-black p-5" action="ControladorUsuario" method="POST" onsubmit="return UserValidation();">
                    
                <div class="form-group">
                    <label for="pillSelect">Tipo de Usuario</label>
                        <select class="form-control input-pill" id="pillSelect" style="width : 400px;" name="txttipousuario">
                            <option >Administrador</option>
                            <option >Supervisor </option>
                            <option >Docente </option>
                            <option >Estudiante</option>
                        </select>
                </div>
                
                <div class="form-group">
                    <input type="text" id="nombre" class="form-control" name="txtnombre"  placeholder="Nombre"><br>
                </div>
                
                <div class="form-group">
                    <input type="text" id="apellido" class="form-control" name="txtapellido"  placeholder="Apellido"><br>
                </div>
                    
                <div class="form-group">
                               <label for="pillSelect">Tipo de Documento</label>
                               <select class="form-control input-pill" id="pillSelect" style="width : 400px;" name="txtiddoc">
                                   <option value="1"> 1 - Cedula de ciudadania</option>
                                   <option value="2"> 2 - Tarjeta de identidad</option>
                                   <option value="3"> 3 - Registro Civil</option>
                               </select>
                </div>
                
                <div class="form-group">
                    <input type="number" id="documento" class="form-control" min="1000000" max="999999999999" name="txtnumerodoc"  placeholder="Numero de documento"><br>
                </div>
                                
                <div class="form-group">
                    <input type="email" id="correo" class="form-control" name="txtcorreo"  placeholder="E-mail"><br>
                </div>
                
                <div class="form-group">
                    <input type="number" id="telefono" class="form-control" name="txttelefono"  placeholder="Telefono "><br>
                </div>
                
                <div class="form-group">
                    <input type="text" id="clave" class="form-control" name="txtclave" placeholder="Clave de Usuario"><br>
                </div>
                
                    
                <center><input class="btn btn-primary" type="submit" name="accion" value="Agregar"></center>
                
            </form>
                       
                </div>
              </div>
            </div>

        

      </div>
      <!-- End of Main Content -->
      
    </div>
    <!-- End of Content Wrapper -->

  </div>

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

</body>

</html>
<!-- end document-->
 

