<%@page import="com.google.gson.Gson"%>
<%@page import="org.json.JSONObject"%>
<%@page import="java.util.Arrays"%>
<%@page contentType="application/json" %>

<%
   
    Object[] days = {"error", "mensaje", "data"};

    Gson gson = new Gson();

    String daysJson = gson.toJson(days);

    out.println(daysJson);

%>