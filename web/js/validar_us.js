function UserValidation() {

    var nombre, apellido, documento, correo, telefono, clave;
    nombre = document.getElementById("nombre").value;
    apellido = document.getElementById("apellido").value;
    documento = document.getElementById("documento").value;
    correo = document.getElementById("correo").value;
    telefono = document.getElementById("telefono").value;
    clave = document.getElementById("clave").value;
    expresion = /\w+@+\gmail+\.+[a-z]/;
    expresionclave = /^(?=\w*\d)(?=\w*[A-Z])(?=\w*[a-z])\S{8,16}$/;
    
    if (nombre === "" || apellido === "" || documento === "" || correo === "" || telefono === ""  || clave === "" ) {

        Swal.fire(
                'Ningún campo puede estar vacío'
                );
        return false;
    } 
    else if (nombre.length > 15) {
        Swal.fire(
                'El nombre de usuario es demasiado largo'
                );
        return false;
    } 
    else if (apellido.length > 15) {
        Swal.fire(
                'El apellido del usuario es demasiado largo.'
                );
        return false;
    }
    else if (documento.length > 14) {
        Swal.fire(
                'El número de documento ingresado no es válido, demasiados números.'
                );
        return false;
    }
    else if (isNaN(documento)) {

        Swal.fire(
                'El documento ingresado no es un número'
                );
        return false;
    }
    
    else if (correo.length > 50) {

        Swal.fire(
                'El correo electrónico ingresado es muy largo'
                );
        return false;
    } else if (!expresion.test(correo)) {

        Swal.fire(
                'El sistema solo admite correos con dominio @Gmail.com'
                );
        return false;
    } else if (telefono.length < 10) {

        Swal.fire(
                'El número teléfonico ingresado no es válido'
                );
        return false;
    } else if (isNaN(telefono)) {

        Swal.fire(
                'El teléfono ingresado no es un número'
                );
        return false;
    }
    else if (clave.length > 17) {

        Swal.fire(
                'la clave ingresada contiene demasiados caracteres, te recomendamos ingresar una mas corta para que la puedas recordar facilmente'
                );
        return false;
    }
    else if (!expresionclave.test(clave)) {

        Swal.fire(
                'La clave de usuario debe contener de 8 a 16 carácteres entre números y letras masyúsculas y minúsculas'
                );
        return false;
    }
}