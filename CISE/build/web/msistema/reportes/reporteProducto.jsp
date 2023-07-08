<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : administrador
    Created on : 2023
    Author     : GRUPO CALIDAD 4
--%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!--Bootstrap-->
        <%@include file="../../WEB-INF/jspfAdmin/cStylos.jspf" %>
        <!--CSS-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
        <title>Administrador</title>
    </head>
    <body>
        <%@include file="../../WEB-INF/jspfAdmin/menu-lateral.jspf" %>
        <section id="navcont" class="activa">
            <!--Barra de navegacion-->
            <%@include file="../../WEB-INF/jspfAdmin/nav-admin.jspf" %>
            <!--Contenido-->
            <div class="container-fluid" style="padding: 5px 10px;">
                <div class="sistema">
                    <div class="addProducto">                     
                        <!--Listado de productos guardados-->    
                        <div class="card cardespa">
                            <nav class="navbar navbar-expand-lg bg-body-tertiary">
                                <div class="container-fluid">
                                    <a class="navbar-brand" href="#">REPORTE PRODUCTO</a>
                                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
                                        <span class="navbar-toggler-icon"></span>
                                    </button>
                                    <div class="collapse navbar-collapse" id="navbarScroll">
                                        <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll">
                                            <li class="nav-item dropdown">
                                                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                                    Seleccione
                                                </a>
                                                <ul class="dropdown-menu">
                                                    <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProductop&txtMes=0">Todos</a></li>
                                                    <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProductop&txtMes=1">Enero</a></li>
                                                    <li><a class="dropdown-item" href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProductop&txtMes=2">Febrero</a></li>
                                                    <li><a class="dropdown-item" href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProductop&txtMes=3">Marzo</a></li>
                                                    <li><a class="dropdown-item" href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProductop&txtMes=4">Abril</a></li>
                                                    <li><a class="dropdown-item" href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProductop&txtMes=5">Mayo</a></li>
                                                    <li><a class="dropdown-item" href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProductop&txtMes=6">Junio</a></li>
                                                    <li><a class="dropdown-item" href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProductop&txtMes=7">Julio</a></li>
                                                    <li><a class="dropdown-item" href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProductop&txtMes=8">Agosto</a></li>
                                                    <li><a class="dropdown-item" href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProductop&txtMes=9">Septiembre</a></li>
                                                    <li><a class="dropdown-item" href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProductop&txtMes=10">Octubre</a></li>
                                                    <li><a class="dropdown-item" href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProductop&txtMes=11">Nobiembre</a></li>
                                                    <li><a class="dropdown-item" href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProductop&txtMes=12">Dicienbre</a></li> 
                                                </ul>
                                            </li>
                                        </ul>
                                        <form class="d-flex" role="search">
                                            <input id="myInput" class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                                        </form>
                                    </div>
                                </div>
                            </nav>
                            <div class="card-body">                
                                <table class="table table-bordered table-hover">
                                    <thead class="table-primary" align="center">
                                        <!--ud.nombreCompleto,v.fecha,dv.totalventa,v.entregado,e.provincia+' '+e.departamento+' '+e.distrito as destino,e.direccion-->
                                        <tr>
                                            <th scope="col">Img</th>
                                            <th scope="col">Nombre Proveedor</th>
                                            <th scope="col">Nombre Producto</th>
                                            <th scope="col">Precio Compra</th>
                                            <th scope="col">Stock Inicial</th>
                                            <th scope="col">Stock Final</th>
                                            <th scope="col">Total Compra</th>
                                        </tr>
                                    </thead>
                                    <tbody id="myTable" >
                                        <c:forEach var="reporteProductop" items="${sessionScope.reporteProductop}">
                                            <tr>
                                                <td><img class="card-img-top" style="width: 80px;" src="<%=request.getContextPath()%>/comcatalogo.do?txtAccion=imagen&id=${reporteProductop.idProducto}"></td>
                                                <td>${reporteProductop.nombreProveedor}</td>
                                                <td>${reporteProductop.nombreProducto}</td>
                                                <td>S/.${reporteProductop.precioCompra}</td>
                                                <td>${reporteProductop.cantidad}</td>
                                                <td>${reporteProductop.stock}</td>
                                                <td>S/.${reporteProductop.totalCompra}</td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                                <div class="row">
                                    <div class="col-3">
                                        <h5>Total gastado al mes:</h5>
                                    </div>
                                    <div class="col-3">
                                        <input class="form-control" value="S/.<%=request.getAttribute("totalMes")%>" readonly="readonly">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script> 
        <%@include file="../../WEB-INF/jspfAdmin/cJavaScrip.jspf"%>
    </body>
</html>
