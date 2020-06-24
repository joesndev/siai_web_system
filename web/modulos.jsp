<!DOCTYPE html>
<html lang="es">  
    <head>
        <meta charset="utf-8">
        <title>MODULOS</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="" name="keywords">
        <meta content="" name="description">

        <!-- ICONO -->
        <link rel="icon" type="image/png" href="formulario_correo/images/icons/SIAI.ico"/>

        <!-- ESTILO BOTONES -->   
        <link href="css/botones_css.css" rel="stylesheet" media="all">
        <link href="css/botones_servicio.css" rel="stylesheet" media="all">


        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Montserrat:300,400,500,700" rel="stylesheet">

        <!-- Bootstrap CSS File -->
        <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Libraries CSS Files -->
        <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
        <link href="lib/animate/animate.min.css" rel="stylesheet">
        <link href="lib/ionicons/css/ionicons.min.css" rel="stylesheet">
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
        <link href="lib/lightbox/css/lightbox.min.css" rel="stylesheet">

        <!-- Main Stylesheet File -->
        <link href="css/modulos.css" rel="stylesheet">


    </head>

    <body>

        <!--==========================
          Header
        ============================-->
        <header id="header">
            <div class="container-fluid">

                <div id="logo" class="pull-left">
                    <h1><a href="#intro" class="scrollto">SIAI WEB</a></h1>
                </div>

                <nav id="nav-menu-container">
                    <ul class="nav-menu">
                        <li><a href="login.jsp?CerrarSesion=true">CERRAR SESIÓN</a></li>
                    </ul>
                </nav>
            </div>
        </header><!-- #header -->
      
        <!--==========================
          Intro Section
        ============================-->
        <section id="intro">
            <div class="intro-container">
                <div id="introCarousel" class="carousel  slide carousel-fade" data-ride="carousel">


                    <div class="carousel-inner" role="listbox">

                        <div class="carousel-item active">
                            <div class="carousel-background"><img src="img/.png" alt=""></div>
                            <div class="carousel-container">

                            </div>
                        </div>


                        </section>

                        <!--==========================
                          About Us Section
                        ============================-->
                        <section id="about">
                            <div class="container">

                                <header class="section-header">
                                    <h3>MODULOS</h3>
                                    <p> A continuación encontrara los módulos a los cuales puede acceder</p>
                                </header>

                                <div class="row about-cols" >


                                    <!-- inicio -->
                                    <div class="col-md-1 wow fadeInUp" data-wow-delay="0.1s">
                                        <div class="about-col">
                                            <div class="img">

                                            </div>
                                        </div>
                                    </div>
                                    <!-- FIN -->


                                    <!-- inicio -->
                                    <div class="col-md-5 wow fadeInUp" data-wow-delay="0.1s">
                                        <div class="about-col">
                                            <div class="img"> 
                                                <img src="img/2.jpg" alt="" class="img-fluid">
                                                <style>
                                                    .img-fluid{
                                                        width: 100%;
                                                        height: 200px;
                                                    }
                                                </style>
                                                <div class="icon"><i class="ion-ios-person"></i></div>
                                            </div>
                                            <h2 class="title"><a href="#"> Usuarios </a></h2>
                                            <center> 
                                                <p>
                                                    En este espacio podra encontrar y gestionar los diferentes usuarios y sus tipos de roles existentes en el sistema 
                                                </p>

                                                <button class="bttn-jelly bttn-sm bttn-primary" onclick="location.href = 'usuarios.jsp'"  data-toggle="tooltip" title="INGRESAR AL MODULO SERVICIO SOCIAL">
                                                    INGRESAR
                                                </button>

                                            </center></p>
                                        </div>
                                    </div>
                                    <!-- FIN -->

                                    <!-- inicio -->
                                    <div class="col-md-5 wow fadeInUp" data-wow-delay="0.1s">
                                        <div class="about-col">
                                            <div class="img">
                                                <img src="img/SERVICIO.jpg" alt="" class="img-fluid">
                                                <div class="icon"><i class="ion-ios-browsers"></i></div>
                                            </div>
                                            <h2 class="title"><a href="#">Servicio Social </a></h2>
                                            <center> 
                                                <p>
                                                    En este espacio podra encontrar los datos basicos y la documentación de los estudiantes de noveno grado
                                                </p>

                                                <button class="bttn-jelly bttn-sm bttn-primary" onclick="location.href = 'servicio_estudiante.jsp'" data-toggle="tooltip" title="INGRESAR AL MODULO SERVICIO SOCIAL">
                                                    INGRESAR
                                                </button>

                                            </center></p>
                                        </div>
                                    </div>
                                    <!-- FIN -->



                                    <!-- inicio -->
                                    <div class="col-md-4 wow fadeInUp">
                                        <div class="about-col">
                                            <div class="img">
                                                <img src="img/DOCUMENTACION.jpg" alt="" class="img-fluid">
                                                <div class="icon"><i class="ion-ios-paper"></i></div>
                                            </div>
                                            <h2 class="title">Documentación </h2>
                                            <center> 
                                                <p>
                                                    En este espacio podra encontrar todo lo relacionado con la documentación perteneciente a los estudiantes
                                                </p>

                                                <button class="bttn-jelly bttn-sm bttn-primary" onclick="location.href = 'documentacion.jsp'" data-toggle="tooltip" title="INGRESAR AL MODULO DOCUMENTACIÓN">
                                                    INGRESAR
                                                </button>

                                            </center></p>
                                        </div>
                                    </div>
                                    <!-- FIN -->


                                    <!-- inicio -->
                                    <div class="col-md-4 wow fadeInUp" data-wow-delay="0.2s">
                                        <div class="about-col">
                                            <div class="img">
                                                <img src="img/GESTION.jpg" alt="" class="img-fluid">
                                                <div class="icon"><i class="ion-ios-filing"></i></div>
                                            </div>
                                            <h2 class="title"><a href="#"> Gestión Academica </a></h2>
                                            <center> 
                                                <p>
                                                    En este espacio podra encontrar actividades y tareas que deben realizar de los estudiantes para una materia
                                                </p>

                                                <button class="bttn-jelly bttn-sm bttn-primary" onclick="location.href = 'gestion_cursos.jsp'"  data-toggle="tooltip" title="INGRESAR AL MODULO SERVICIO SOCIAL">
                                                    INGRESAR
                                                </button>

                                            </center></p>
                                        </div>
                                    </div>
                                    <!-- FIN --> 


                                    <div class="col-md-4 wow fadeInUp" data-wow-delay="0.1s">
                                        <div class="about-col">
                                            <div class="img"> 
                                                <img src="img/BIBLIOTECA.jpg" alt="" class="img-fluid">
                                                <style>
                                                    .img-fluid{
                                                        height: 200px;
                                                    }
                                                </style>
                                                <div class="icon"><i class="ion-ios-book"></i></div>
                                            </div>
                                            <h2 class="title"><a href="#"> Biblioteca Virtual </a></h2>
                                            <center> 
                                                <p>
                                                    En este espacio podra encontrar contenido de biblioteca como apoyo para el aprendizaje

                                                </p><p>

                                                    <button class="bttn-jelly bttn-sm bttn-primary" onclick="location.href = 'biblioteca_admin.jsp'"  data-toggle="tooltip" title="INGRESAR AL MODULO SERVICIO SOCIAL">
                                                        INGRESAR
                                                    </button>

                                            </center></p>
                                        </div>
                                    </div>



                                </div>
                            </div>
                        </section>


                        <!-- JavaScript Libraries -->
                        <script src="lib/jquery/jquery.min.js"></script>
                        <script src="lib/jquery/jquery-migrate.min.js"></script>
                        <script src="lib/bootstrap/js/bootstrap.bundle.min.js"></script>
                        <script src="lib/easing/easing.min.js"></script>
                        <script src="lib/superfish/hoverIntent.js"></script>
                        <script src="lib/superfish/superfish.min.js"></script>
                        <script src="lib/wow/wow.min.js"></script>
                        <script src="lib/waypoints/waypoints.min.js"></script>
                        <script src="lib/counterup/counterup.min.js"></script>
                        <script src="lib/owlcarousel/owl.carousel.min.js"></script>
                        <script src="lib/isotope/isotope.pkgd.min.js"></script>
                        <script src="lib/lightbox/js/lightbox.min.js"></script>
                        <script src="lib/touchSwipe/jquery.touchSwipe.min.js"></script>
                        <!-- Contact Form JavaScript File -->
                        <script src="contactform/contactform.js"></script>

                        <!-- Template Main Javascript File -->
                        <script src="js/main.js"></script>

                        </body>
                        </html>
