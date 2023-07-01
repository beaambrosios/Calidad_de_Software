<%-- 
    Document   : administrador
    Created on : 2023
    Author     : GRUPO CALIDAD 4
--%>
<%@page import="soft.cise.modeloDTO.reporteVentaDTO"%>
<%@page import="soft.cise.modeloDao.reporteVentaDAO"%>
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

        <title>Reporte Ventas</title>
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
                                    <h5>Reporte venta por mes</h5>
                               </div>
                                    <div class="col-5">
                                        <div class="contenedor-menu">
                                                <ul class="menu">
                                                    <li class=""><a href="#"><i class="icono izquierda fas fa-folder-plus"></i>Seleccionar Mes<i class="icono derecha fa fa-chevron-down"></i></a>
                                                        <ul>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteVenta&txtMes=1">Enero</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteVenta&txtMes=2">Febrero</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteVenta&txtMes=3">Marzo</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteVenta&txtMes=4">Abril</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteVenta&txtMes=5">Mayo</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteVenta&txtMes=6">Junio</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteVenta&txtMes=7">Julio</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteVenta&txtMes=8">Agosto</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteVenta&txtMes=9">Septiembre</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteVenta&txtMes=10">Octubre</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteVenta&txtMes=11">Nobiembre</a></li>
                                                            <li><a href="<%=request.getContextPath()%>/conreportes.do?txtAccion=reporteVenta&txtMes=12">Dicienbre</a></li>
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
                                    <tr>
                                        <th scope="col">#</th>
                                        <th scope="col">Producto</th>
                                        <th scope="col">Precio Compra</th>
                                        <th scope="col">Total Compra</th>
                                        <th scope="col">Precio Venta</th>
                                        <th scope="col">Cantidad Venta</th>
                                        <th scope="col">Total Venta</th>
                                    </tr>
                                </thead>
                                <tbody id="myTable" >
                                    <%  reporteVentaDAO metPr = new reporteVentaDAO();
                                        ArrayList<reporteVentaDTO> lis4 = metPr.sql_selectAll();
                                        Iterator<reporteVentaDTO> iter4 = lis4.iterator();
                                        reporteVentaDTO reporteventadto= new reporteVentaDTO();
                                        int con1 = 0;
                                        while (iter4.hasNext()) {
                                            reporteventadto = iter4.next();
                                            con1++;
                                    %>
                                    <tr>
                                        <th align="center" scope="row"><%=con1%></th>
                                        <td><%=reporteventadto.getNombreProducto()%></td>
                                        <td><%=reporteventadto.getPrecioCompra()%></td>
                                        <td><%=reporteventadto.getTotalCompra()%></td>
                                        <td><%=reporteventadto.getPrecioVenta()%></td>
                                        <td><%=reporteventadto.getCatidadVenta()%></td>
                                        <td><%=reporteventadto.getTotalVenta()%></td>                                      
                                    </tr>
                                    <% }%>     
                                      </tbody>
                            </table>
                              <div class="row">
                                    <div class="col-3">
                                        <h5>Total Ventas:</h5>
                                    </div>
                                    <div class="col-3">
                                        <input class="form-control" value="S/.<%=request.getAttribute("venta") %>" readonly="readonly">
                                    </div>
                            </div>
                                    <br>
                           
                            <div class="row">
                                    <div class="col-3">
                                        <h5>Suma Total Ventas:</h5>
                                    </div>
                                    <div class="col-3">
                                        <input class="form-control" value="S/.<%=request.getAttribute("compraS")%>" readonly="readonly">
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