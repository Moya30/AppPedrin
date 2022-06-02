<%@page import="java.util.Arrays"%>
<%@page import="util.Dato"%>
<%@page import="org.json.JSONObject"%>
<%@page contentType="application/json"%>
<%
    JSONObject myObject = new JSONObject();
    String dato = request.getParameter("nombre");
    String dato2 = request.getParameter("coment");
    myObject.put("mensaje", "ok,guardado correctamente");
    myObject.put("error", new Boolean(true));

    String[] datos = {dato, dato2};

    Dato.updateData(Arrays.toString(datos));

    out.print(myObject);

%>