$(function () {
    const verificarCambio = () => {        
        $.get("leerDato.jsp", function( data ) {
           $("#estado").text(data);
           
        });        
        setTimeout(verificarCambio, 1000);
    };
// Initiate call
    setTimeout(verificarCambio(), 1000);

});