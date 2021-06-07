function validarForma(forma){
    // Validar Usuario
    let usuario = forma.usuario;
    if(usuario.values === "" || usuario.value == "Escribir usuario"){
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    // Validar Password
    let password = forma.password;
    if(password.value === "" || password.value.length < 3){
        alert("Debe proporcionar un password de al menos 3 caracteres");
        password.focus();
        password.select();
        return false;
    }
    
    // Validar Tecnologias
    let tecnologias = forma.tecnologia;
    let checkSeleccionado = false;
    
    for(let i=0; i < tecnologias.length; i++){
        if(tecnologias[i].checked){
            checkSeleccionado = true
        }
    }
    
    if(!checkSeleccionado){
        alert("Debe seleccionar una tecnologia");
        return false;
    }
    
    // Validar Generos
    let generos = forma.genero;
    let radioSeleccionado = false;
    
    for(let i=0; i < generos.length; i++){
        if(generos[i].checked){
            radioSeleccionado = true
        }
    }
    
    if(!radioSeleccionado){
        alert("Debe seleccionar un genero");
        return false;
    }
    
    // Validar ocuapcion
    let ocupacion = forma.ocupacion;
    if(ocupacion.value == ""){
        alert("Debe seleccionar una ocupacion");
        return false;
    }
    
    // Formaulario valido
    alert("Enviando datos al servidor");
    return true;
}