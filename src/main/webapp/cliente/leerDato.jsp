<%@page import="org.json.JSONArray"%>
<%@page import="java.util.Arrays"%>
<%@page import="util.Dato"%>
<%

    String valor = Dato.getDatoNombre();
   
    String nom = "";
    String com = "";
    //String[] split = valor.split(",");
     String[] separatedStrings = valor.replaceAll("\\[", "")
            .replaceAll("]", "").split(",");
    for (int i = 0; i < separatedStrings.length; i++) {
      nom = separatedStrings[0];
      com = separatedStrings[1];
      
    }
    
    
   out.print("Cliente: " + nom + ", recoja su pedido:  " + com);
   
%>