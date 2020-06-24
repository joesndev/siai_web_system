
<!DOCTYPE html>
<html lang="es" >

<head>
  <meta charset="UTF-8">
  
   <!-- ICONO -->
    <link rel="icon" type="image/png" href="formulario_correo/images/icons/SIAI.ico"/>
    
  <title>Login</title>
  
  
  
      <link rel="stylesheet" href="css/style2.css">

  
</head>

<body > 
  <hgroup>
  <h1>LOGIN</h1>
</hgroup>
<form action="Validate" method="POST">
<img src="img/SIAI.PNG" class="img_form">
<div class="container">
  <div class="profile">
    
    <div class="profile__form">
      <div class="profile__fields">
         
        <div class="group">
            <input type="number" id="fieldUser" class="input" name="txtuser" required pattern=.*\S.* />
                <span class="highlight"></span><span class="bar"></span>
                    <label for="fieldUser" class="label" >Code</label>
        </div>

          
        <div class="group">
            <input type="password" id="fieldPassword" class="input" name="txtpass" required pattern=.*\S.* />
                <span class="highlight"></span><span class="bar"></span>
                    <label for="fieldPassword" class="label">Password</label>
        </div>
        <div class="profile__footer">
            
            
    <button class="button buttonBlue" type="submit" name="accion" value="Ingresar">Sign in&nbsp;</button>
          
  
          
          
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




</body>

</html>
