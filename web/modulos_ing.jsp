<!DOCTYPE html>
<html lang="es">  
    <head>
        <meta charset="utf-8">
        <title>MODULES</title>
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
          <li><a href="index_ing.jsp">Log out</a></li>
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

          
  </section><!-- #intro -->

    <!--==========================
                          About Us Section
                        ============================-->
                        <section id="about">
                            <div class="container">

                                <header class="section-header">
                                    <h3>MODULES</h3>
                                    <p> Below you will find the modules that you can access</p>
                                </header>

                                <div class="row about-cols" >
                                    
                                    <!-- inicio -->
                                    <div class="col-md-3 wow fadeInUp" data-wow-delay="0.1s">
                                        <div class="about-col">
                                            <div class="img">
                                                <img src="img/SERVICIO.jpg" alt="" class="img-fluid">
                                                <div class="icon"><i class="ion-ios-browsers"></i></div>
                                            </div>
                                            <h2 class="title"><a href="#"> Social Services </a></h2>
                                            <center> 
                                                <p>
                                                   In this space you can find the basic data and documentation of the ninth grade students
                                                </p>

                                                <button class="bttn-jelly bttn-sm bttn-primary" onclick="location.href = 'servicio_estudiante_ing.jsp'" data-toggle="tooltip" title="INGRESAR AL MODULO SERVICIO SOCIAL">
                                                    LOGIN
                                                </button>

                                            </center></p>
                                        </div>
                                    </div>
                                    <!-- FIN -->



                                    <!-- inicio -->
                                    <div class="col-md-3 wow fadeInUp">
                                        <div class="about-col">
                                            <div class="img">
                                                <img src="img/DOCUMENTACION.jpg" alt="" class="img-fluid">
                                                <div class="icon"><i class="ion-ios-paper"></i></div>
                                            </div>
                                            <h2 class="title">Documentation </h2>
                                            <center> 
                                                <p>
                                                    In this space you can find everything related to the documentation pertaining 
                                                </p>

                                                <button class="bttn-jelly bttn-sm bttn-primary" onclick="location.href = 'documentacion_ing.jsp'" data-toggle="tooltip" title="INGRESAR AL MODULO DOCUMENTACIÓN">
                                                    LOGIN
                                                </button>

                                            </center></p>
                                        </div>
                                    </div>
                                    <!-- FIN -->


                                    <!-- inicio -->
                                    <div class="col-md-3 wow fadeInUp" data-wow-delay="0.2s">
                                        <div class="about-col">
                                            <div class="img">
                                                <img src="img/GESTION.jpg" alt="" class="img-fluid">
                                                <div class="icon"><i class="ion-ios-filing"></i></div>
                                            </div>
                                            <h2 class="title"><a href="#"> Academic Management </a></h2>
                                            <center> 
                                                <p>
                                                    In this space you can find activities and tasks that students must do for a subject
                                                </p>

                                                <button class="bttn-jelly bttn-sm bttn-primary" onclick="location.href = 'gestion_cursos_ing.jsp'"  data-toggle="tooltip" title="INGRESAR AL MODULO SERVICIO SOCIAL">
                                                    LOGIN
                                                </button>

                                            </center></p>
                                        </div>
                                    </div>
                                    <!-- FIN --> 


                                    <div class="col-md-3 wow fadeInUp" data-wow-delay="0.1s">
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
                                            <h2 class="title"><a href="#"> Virtual Library </a></h2>
                                            <center> 
                                                <p>
                                                   In this space you can find library content to support learning

                                                </p><p>

                                                    <button class="bttn-jelly bttn-sm bttn-primary" onclick="location.href = 'biblioteca_admin_ing.jsp'"  data-toggle="tooltip" title="INGRESAR AL MODULO SERVICIO SOCIAL">
                                                        LOGIN
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
