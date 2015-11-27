<%-- 
    Document   : QR_page
    Created on : 25-11-2015, 13:46:48
    Author     : Roman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="librerias.jsp" %>
    </head>
    <body>
        <%@include file="menu_superior.jsp" %>
        <h1>Hello World!</h1>
        
          <div id="myContent" style="width:50%;">
       <form action="<c:url value="/QR_page.jsp"/>" id="samplecode" name="samplecode" method="post" >
   <fieldset>
    <legend><b>&nbsp;&nbsp;&nbsp;QR Code Generator - Request&nbsp;&nbsp;&nbsp;</b></legend>
 
    <p>
     <label for="qrtext"> Input Text for QR Code </label>
  
     <input id="qrtext" type="text" name="qrtext" size="50" />
    </p>
    <input id="generate" type="submit" value="Generate QR Code" />
   </fieldset>

               <fieldset>
    <legend><b>&nbsp;&nbsp;&nbsp;QR Code Generator - Response&nbsp;&nbsp;&nbsp;</b></legend>
    <img src="<c:url value="/QRServlet?qrtext="/><%=request.getParameter("qrtext")%>">
   </fieldset>
    </form>
</div> 
    </body>
</html>
