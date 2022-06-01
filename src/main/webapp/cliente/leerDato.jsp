<%@page import="util.Dato"%>
<%  
    String valor=Dato.getData();
    out.print("dat: "+valor);
    //if(valor.equals("1"))
        //out.print("LIBRE");
  //  else
    //    out.print("OCUPADO");
%>