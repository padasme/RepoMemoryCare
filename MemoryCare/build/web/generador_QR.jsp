<%-- 
    Document   : generador_QR
    Created on : 25-11-2015, 18:52:13
    Author     : Roman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table>
            <tr>
                <td>Mis Grupos</td>
                <td>
                    <select name="tipo_antecedente_id" onchange="this.form.submit()">
                        <option value="0"> -- Seleccione -- </option>                        
                      <!--  <c:forEach var="r" items="${lstTipoAntecente}">
                        <option value="${r.id}" ${r.id == antecedente.tipo_antecedente_id ? 'Selected' : ''}>
                            <c:out value="${r.descripcion}"/>
                        </option>
                        </c:forEach>                       -->
                    </select>  
                </td>
            </tr>
            <tr>
                <td colspan="2"></td>
            </tr>
            <tr>
                <td colspan="2">
                    <table>
                        <tr>
                            
                        </tr>
                    </table>                    
                </td>
            </tr>
        </table>
    </body>
</html>
