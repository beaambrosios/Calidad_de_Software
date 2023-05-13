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
                                        <h5>Lista de Productos enviados</h5>
                                    </div>
                                    <div class="col-5">
                                        <input class="form-control" id="myInput" type="text" placeholder="Search..">
                                    </div>
                                </div>
                            </div>
                            <div class="card-body">                
                                <table class="table table-bordered table-hover">
                                    <thead class="table-primary" align="center">
                                        <!--ud.nombreCompleto,v.fecha,dv.totalventa,v.entregado,e.provincia+' '+e.departamento+' '+e.distrito as destino,e.direccion-->
                                        <tr>
                                            <th scope="col">Nombre Completo</th>
                                            <th scope="col">Fecha de Venta</th>
                                            <th scope="col">Total de Venta</th>
                                            <th scope="col">Destino</th>
                                            <th scope="col">Direccion</th>
                                            <th scope="col">Estado</th>
                                            <th scope="col">Opciones</th>
                                        </tr>
                                    </thead>
                                    <tbody id="myTable" >
                                        <c:forEach var="productoEnviado" items="${sessionScope.productoEnviado}">
                                            <tr>
                                                <td>${productoEnviado.nombreCompleto}</td>
                                                <td>${productoEnviado.fechaVenta}</td>
                                                <td>S/.${productoEnviado.totalPagar}</td>
                                                <td>${productoEnviado.destino}</td>
                                                <td>${productoEnviado.direccion}</td>
                                                <td>${productoEnviado.estado}</td>
                                                <td>
                                                    <a class="btn btn-warning btn-sm" href="<%=request.getContextPath()%>/comproducto.do?txtAccion=detalleVentaProducto&txtIdVenta=${productoEnviado.idVenta}"><i class="far fa-edit"></i></a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <%@include file="../../WEB-INF/jspfAdmin/cJavaScrip.jspf"%>
    </body>
</html>