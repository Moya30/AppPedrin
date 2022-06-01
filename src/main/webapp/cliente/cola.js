$(function () {
    const verificarCambio = () => {        
        $.get("leerDato.jsp", function( data ) {
           $("#most").text(data);
        });        
        setTimeout(verificarCambio, 1000);
    };
// Initiate call
    setTimeout(verificarCambio(), 1000);

});