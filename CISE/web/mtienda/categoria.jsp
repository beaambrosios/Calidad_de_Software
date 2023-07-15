<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : administrador
    Created on : 09-abr-2019, 14:47:36
    Author     : SISTEMA
--%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../WEB-INF/jspfTienda/cStylos.jspf" %>
        <link href="resource/css/allproduct.css" rel="stylesheet" type="text/css"/>
        <link href="../resource/assets/css/main.css" rel="stylesheet" type="text/css"/>
        <link href="../resource/assets/css/fontawesome-all.min.css" rel="stylesheet" type="text/css"/>
        <title>ChiniMini Importaciones</title>
        <script async>(function(w, d) { var h = d.head || d.getElementsByTagName("head")[0]; var s = d.createElement("script"); s.setAttribute("type", "text/javascript"); s.setAttribute("src", "https://app.bluecaribu.com/conversion/integration/062e356f5fe6a7ffe90577fcdb6e2319"); h.appendChild(s); })(window, document);</script>
    </head>
    <body>
        <%@include file="../WEB-INF/jspfTienda/nav.jspf" %>
        <div class="espacio"></div>
        <section id="barraNavegacion">
            <div class="container">
                <div class="menuopciones">
                    <ul>
                        <li><a href="index.jsp">Inicio</a></li>
                        <li><a href="#">Mas Productos</a></li>
                        <li><a href="#">Carrito</a></li>
                        <li style="float: right"><input class="form-control" id="myInput" type="text" placeholder="Search.."></li>
                    </ul>
                </div>
            </div>
        </section>
        <section>
            <div class="contenido">
                <div class="container">
                    <div class="seccionIzquierda">
                        <div class="">
                            <ul>
                                <li><a href="<%=request.getContextPath()%>/comcatalogo.do?txtAccion=categoria&txtCategoria=0">Todos</a></li>
                                <li><a href="<%=request.getContextPath()%>/comcatalogo.do?txtAccion=categoria&txtCategoria=2">Niñas</a></li>
                                <li><a href="<%=request.getContextPath()%>/comcatalogo.do?txtAccion=categoria&txtCategoria=3">Niños</a></li>
                                <li><a href="<%=request.getContextPath()%>/comcatalogo.do?txtAccion=categoria&txtCategoria=1">Bebes</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="seccionDerecha">
                        <div id="SearchPrenda">
                            <div class="row">
                                 <c:forEach var="categoria" items="${categoria}">
                                <div class="col-md-4">
                                    <div class="card">
                                        <div class="imgEstilo">
                                            <img class="card-img-top" src="<%=request.getContextPath()%>/comcatalogo.do?txtAccion=imagen&id=${categoria.idProducto}">
                                            <figcaption>
                                                <h2>${categoria.nombre}</h2>
                                                <p>${categoria.descripcion}</p>
                                                <h2>${categoria.precioVenta}</h2>
                                                <a href="#"></a>
                                            </figcaption>			
                                        </div>
                                        <div class="card-body">
                                            <div class="row">
                                                <div class="col-6">
                                                 
                                                    <a href="<%=request.getContextPath()%>/comcatalogo.do?txtAccion=productoDescrip&id=${categoria.idProducto}" class="btn btn-warning btn-block"><i class="fas fa-plus-circle"></i></a>
                                                </div>
                                                <div class="col-6">
                                                    <a class="btn btn-primary btn-block" ><i class="fas fa-cart-plus"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                               </c:forEach>
                            </div>
                        </div>
                        <!--Mas productos-->
                        <div class="espacio"></div>

                        <div class="espacio"></div>
                    </div>
                </div>
            </div>
        </section>

        <%@include file="../WEB-INF/jspfTienda/cfooter.jspf" %>
        <!--JavasScrip-Jquery-Bootstrap-->
        <%@include file="../WEB-INF/jspfTienda/cJavaScrip.jspf" %>
        <script src="../resource/assets/js/util.js" type="text/javascript"></script>
        <script src="../resource/assets/js/main.js" type="text/javascript"></script>
        <script src="../resource/assets/js/jquery.poptrox.min.js" type="text/javascript"></script>
        <script src="../resource/assets/js/jquery.min.js" type="text/javascript"></script>
        <script src="../resource/assets/js/browser.min.js" type="text/javascript"></script>
        <script src="../resource/assets/js/breakpoints.min.js" type="text/javascript"></script>
    </body>
</html>
