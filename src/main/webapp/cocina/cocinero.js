$(function () {

    $("#enviar").on( "click",function () {
        let nomb = document.getElementById("nomb").value;
        let comentario = document.getElementById("testId").value;
        let form = {
            nombre: nomb,
            coment: comentario
        }
       
        $.get("cambiarDato.jsp", form, function (data) {
             //alert( "cambiarDato.jsp");
          
        });
        
      
    });
});