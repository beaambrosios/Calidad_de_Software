<%-- 
    Document   : administrador
    Created on : 09-abr-2019, 14:47:36
    Author     : SISTEMA
--%>

<%@page import="soft.cise.modeloDTO.reporteVentasDTO"%>
<%@page import="soft.cise.modeloDao.reporteVentasDAO"%>
<%@page import="soft.cise.modeloDao.metProduc"%>
<%@page import="soft.cise.modeloDTO.productoDTO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!--Bootstrap-->
        <%@include file="../../WEB-INF/jspfAdmin/cStylos.jspf" %>

        <title>ReporteVentas</title>
    </head>
    <body>
        <%@include file="../../WEB-INF/jspfAdmin/menu-lateral.jspf" %>
        <section id="navcont" class="activa">
            <!--Barra de navegacion-->
            <%@include file="../../WEB-INF/jspfAdmin/nav-admin.jspf" %>
            <!--Contenido-->
            <!--Contenido-->
            <div class="container-fluid" style="padding: 30px 10px;">
                <div class="addProducto">                     
                    <!--Listado de productos guardados-->    
                    <div class="card cardespa">
                        <div class="card-header">
                            <div class="row">
                                <div class="col-7">
                                    <h5>REPORTE GANANCIAS</h5>
                                </div>
                                <div class="col-5">
                                    <input class="form-control" id="myInput" type="text" placeholder="Search..">
                                </div>
                            </div>
                        </div>
                        <div class="card-body">                
                            <table class="table table-bordered table-hover">
                                <thead class="table-primary" align="center">
                                    <tr>
                                        <th scope="col">#</th>
                                        <th scope="col">Proveedor</th>
                                        <th scope="col">Producto</th>
                                        <th scope="col">PrecioCompra</th>
                                        <th scope="col">CantidadCompra</th>
                                        <th scope="col">TotalCompra</th>
                                        <th scope="col">PrecioVenta</th>
                                        <th scope="col">CantidadVenta</th>
                                        <th scope="col">TotalVenta</th>
                                    </tr>
                                </thead>
                                <tbody id="myTable" >
                                    <%                                        reporteVentasDAO metPr = new reporteVentasDAO();
                                        ArrayList<reporteVentasDTO> lis3 = metPr.sql_selectAll();
                                        Iterator<reporteVentasDTO> iter3 = lis3.iterator();
                                        reporteVentasDTO reporteventasdto= new reporteVentasDTO();
                                        int con1 = 0;
                                        while (iter3.hasNext()) {
                                            reporteventasdto = iter3.next();
                                            con1++;
                                    %>
                                    <tr>
                                        <th align="center" scope="row"><%=con1%></th>
                                        <td><%=reporteventasdto.getNombreProveedor()%></td>
                                        <td><%=reporteventasdto.getNombreProducto()%></td>
                                        <td><%=reporteventasdto.getPrecioCompra()%></td>
                                        <td><%=reporteventasdto.getCantidadCompra()%></td>
                                        <td><%=reporteventasdto.getTotalCompra()%></td>
                                        <td><%=reporteventasdto.getPrecioVenta()%></td>
                                        <td><%=reporteventasdto.getCatidadVenta()%></td>
                                        <td><%=reporteventasdto.getTotalVenta()%></td>
                                        
                                    </tr>
                                    <% }%>
                                </tbody>
                            </table>
                              <div class="row">
                                    <div class="col-3">
                                        <h5>Total Ganancia:</h5>
                                    </div>
                                    <div class="col-3">
                                        <input class="form-control" value="S/.<%=request.getAttribute("ganancia") %>" readonly="readonly">
                                    </div>
                            </div>
                                    <br>
                            <div class="row">
                                    <div class="col-3">
                                        <h5>Suma Total Compras:</h5>
                                    </div>
                                    <div class="col-3">
                                        <input class="form-control" value="S/.<%=request.getAttribute("sumacompra")%>" readonly="readonly">
                                    </div>
                            </div>
                                     <br>
                            <div class="row">
                                    <div class="col-3">
                                        <h5>Suma Total Ventas:</h5>
                                    </div>
                                    <div class="col-3">
                                        <input class="form-control" value="S/.<%=request.getAttribute("sumaventa")%>" readonly="readonly">
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
