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
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!--Bootstrap-->
        <%@include file="../../WEB-INF/jspfAdmin/cStylos.jspf" %>
        <!--CSS-->
        <title>Administrador</title>
    </head>
    <body>
        <%@include file="../../WEB-INF/jspfAdmin/menu-lateral.jspf" %>
        <section id="navcont" class="activa">
            <!--Barra de navegacion-->
            <%@include file="../../WEB-INF/jspfAdmin/nav-admin.jspf" %>
            <!--Contenido-->
            <div class="container-fluid" style="padding: 30px 10px;">
                <div class="sistema">
                    <div class="addProducto">                     
                        <!--Listado de productos guardados-->    
                        <div class="card cardespa">
                            <div class="card-header">
                                <div class="row">
                                    <div class="col-7">
                                        <h5>Reporte de gastos en productos por mes</h5>
                                    </div>
                                    <div class="col-5">
                                        <div class="contenedor-menu">
                                                <ul class="menu">
                                                    <li class=""><a href="#"><i class="icono izquierda fas fa-folder-plus"></i>Seleccionar Mes<i class="icono derecha fa fa-chevron-down"></i></a>
                                                        <ul>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProducto&txtMes=1">Enero</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProducto&txtMes=2">Febrero</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProducto&txtMes=3">Marzo</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProducto&txtMes=4">Abril</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProducto&txtMes=5">Mayo</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProducto&txtMes=6">Junio</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProducto&txtMes=7">Julio</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProducto&txtMes=8">Agosto</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProducto&txtMes=9">Septiembre</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProducto&txtMes=10">Octubre</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProducto&txtMes=11">Nobiembre</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteProducto&txtMes=12">Dicienbre</a></li>
                                                        </ul>
                                                    </li>
                                                </ul>
                                            </div>
                                    </div>
                                </div>
                            </div>
                            <div class="card-body">                
                                <table class="table table-bordered table-hover">
                                    <thead class="table-primary" align="center">
                                        <!--ud.nombreCompleto,v.fecha,dv.totalventa,v.entregado,e.provincia+' '+e.departamento+' '+e.distrito as destino,e.direccion-->
                                        <tr>
                                            <th scope="col">Img</th>
                                            <th scope="col">Nombre Proveedor</th>
                                            <th scope="col">Nombre Producto</th>
                                            <th scope="col">Precio Compra</th>
                                            <th scope="col">Stock</th>
                                            <th scope="col">Total Compra</th>
                                        </tr>
                                    </thead>
                                    <tbody id="myTable" >
                                        <c:forEach var="reporteProducto" items="${sessionScope.reporteProducto}">
                                            <tr>
                                                <td><img class="card-img-top" style="width: 80px;" src="<%=request.getContextPath()%>/comcatalogo.do?txtAccion=imagen&id=${reporteProducto.idProducto}"></td>
                                                <td>${reporteProducto.nombreProveedor}</td>
                                                <td>${reporteProducto.nombreProducto}</td>
                                                <td>S/.${reporteProducto.precioCompra}</td>
                                                <td>${reporteProducto.cantidad}</td>
                                                <td>S/.${reporteProducto.totalCompra}</td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                                <div class="row">
                                    <div class="col-3">
                                        <h5>Total gastado al mes:</h5>
                                    </div>
                                    <div class="col-3">
                                        <input class="form-control" value="S/.<%=request.getAttribute("totalMes") %>" readonly="readonly">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <%@include file="../../WEB-INF/jspfAdmin/cJavaScrip.jspf"%>
    </body>
</html>
