<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Navigation -->
<nav class="navbar navbar-inverse" role="navigation">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>

                <!--<img src="<c:url value="/imagenes/logo.jpg"/>" width="150px" height="50px"/>-->                
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li>
                    <a href="<c:url value="#"/>">Inicio</a>
                </li>
                <li>
                    <a href="<c:url value="#"/>">Ficha Personal</a>
                </li>
                <a href="menu_superior.jsp"></a>
                <li>
                    <a href="<c:url value="/MantenedorServlet"/>">Mantenedor Antecedentes</a>                        
                </li>  
                <li>
                    <a href="<c:url value="/QR_page.jsp"/>">Generador QR</a>                        
                </li>
                <li>
                    <a href="<c:url value="/login.jsp"/>">Login</a>                        
                </li>  
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>

