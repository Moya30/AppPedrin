$(function () {

    $("button").click(function () {
        let nomb = document.getElementById("nomb").value;
        let comentario = document.getElementById("testId").value;
      alert(nom);
      alert(comentario);
        $.get("cambiarDato.jsp", {comen:comentario}, function (data) {
             //alert( "cambiarDato.jsp");
        });
        
      
    });
});