<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MemoryCare</title>
        <%@include file="librerias.jsp" %>
    </head>
    <body>
        <form action="LoginServlet.do" method="post" >
            <%@include file="menu_superior.jsp" %>

            <div class="container"> <c:out value="${mapMensajes['idCliente']}"/>
                <div class="row">
                    <div class="col-sm-4 col-sm-offset-4">
                        <div class="input-group">
                            <span class="input-group-addon">Usuario:</span>
                            <input type="text" class="form-control" name="txt_usuario">
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-4 col-sm-offset-4">
                        <div class="input-group">
                            <span class="input-group-addon">Password:</span>
                            <input type="text" class="form-control" name="txt_password">
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-4 col-sm-offset-4">
                        <button type="submit" class="btn btn-primary anchoMaximo">Ingresar</button>
                    </div>
                </div>
            </div>
        </form>
        <script type="text/javascript">
            $(document).ready(function () {
            <c:set var = "txt_usuario" value = "${mapMensajes['txt_usuario']}" />
            <c:if test = "${not empty txt_usuario}" >
                toastr.error("<c:out value="${txt_usuario}" />");
            </c:if>

            <c:set var = "txt_password" value = "${mapMensajes['txt_password']}" />
            <c:if test = "${not empty txt_password}" >
                toastr.error("<c:out value="${txt_password}" />");
            </c:if>
            });
        </script> 
    </body>
</html>
