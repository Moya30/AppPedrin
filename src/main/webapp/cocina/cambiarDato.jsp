<%@page import="util.Dato"%>
<%
    String valor= request.getParameter("nom");
    Dato.updateData( valor);
    String valor2= request.getParameter("comen");
    Dato.updateData( valor2);
    out.print(valor);
%>
