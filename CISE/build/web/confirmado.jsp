<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : login
    Created on : 2023
    Author     : GRUPO CALIDAD 4
--%>

<%@page import="soft.cise.modeloDTO.compraDTO"%>
<%@page import="soft.cise.modeloDao.ventaProductosDAO"%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% int idVenta = Integer.parseInt((String) request.getAttribute("idVenta"));%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"  crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css"  crossorigin="anonymous">
        <%@include file="WEB-INF/jspfTienda/cStylos.jspf" %>

        <!--Google fonts-->

        <title>Chinimini</title>
    </head>
    <body>
            <div style="padding-top: 100px; padding-bottom: 100px; ">
                <div class="row justify-content-center">
                    <div class="card mb-3 border-success">
                        <div class="card-header text-white bg-success text-center" >
                            <img src="resource/img/tienda/cheque.png" alt="" width="80px"/>
                            <h1>Su compra se ha realizado correctamente!</h1>
                        </div>
                        <div class="card-body">
                            <%
                                    ventaProductosDAO ventaproductodao = new ventaProductosDAO();
                                    compraDTO compradto = ventaproductodao.sql_detalleVentaProducto1(idVenta);
                                %>
                            
                                <input type="hidden" name="txtIdVenta" value="<%=compradto.getIdVenta()%>">
                            <table class="table table-borderless">
                            <thead>
                              <tr>
                                <th scope="col"><h6 class="card-title">Pedido N°: <span class="text-muted">13479790264-01</span></h6></th>
                                <th scope="col"><h6 class="card-title">Fecha de compra: <span class="text-muted"><%=compradto.getFechaVenta()%></span></h6></th>
                                <th scope="col"><h6 class="card-title">Total: <span class="text-muted">S/ <%=compradto.getTotalPagar()%></span></h6></th>
                              </tr>
                            </thead>
                            </table>
                            
                            <h6><i class="fas fa-store"></i> <span> Metodo de entrega:</span><span class="text-muted">Envio a Domicilio</span> </h6>
                            <h6><i class="fas fa-map-marked-alt"></i> <span> Direccion:</span><span class="text-muted"><%=compradto.getDireccion()%></span></h6>
                            <h6><i class="fas fa-user"></i> <span> ¿Quien recibira el pedido?:</span><span class="text-muted"> <%=compradto.getNombreCompleto()%></span></h6>
                            
                            <span class="font-italic">Vendido y entregado por: </span><span>Chinimini</span>
                            
                            <h5 class="themed-grid-col text-info">Estado del pedido: <span class="badge badge-pill badge-warning"><%=compradto.getEstado()%></span></h5>
                            
                          
                          <p class="card-text">Gracias por comprar en Chinimini! Te estaremos entregando este producto satisfactoriamente en los proximos dias! :)</p>
                          <table class="table table-bordered">
                            <thead>
                              <tr>
                                <th scope="col">Imagen</th>
                                <th scope="col">Producto</th>
                                <th scope="col">Descripcion</th>
                                <th scope="col">Cantidad</th>
                                <th scope="col">IGV Producto</th>
                                <th scope="col">Precio</th>
                              </tr>
                            </thead>
                            <tbody id="myTable">
                              <c:forEach var="listaProductoV" items="${sessionScope.listaProductoV}">
                                <tr>
                                  <td><img class="card-img-top" style="width: 80px;" src="<%=request.getContextPath()%>/comcatalogo.do?txtAccion=imagen&id=${listaProductoV.idProducto}"></td>
                                  <td>${listaProductoV.nombProducto}</td>
                                  <td>${listaProductoV.descripcion}</td>
                                  <td>${listaProductoV.cantidad}</td>
                                  <td>S/.${listaProductoV.IGV}</td>
                                  <td>S/.${listaProductoV.totalProducto}</td>
                                </tr>
                              </c:forEach>
                            </tbody>
                          </table>
                          
                          <h4 class="text-info">Información de compra</h4>
                          
                          <table class="table table-borderless">
                            <thead>
                              <tr>
                                <th scope="col"><h5>Datos personales</h5></th>
                                <th scope="col"><h5>Informacion de Pago</h5></th>
                              </tr>
                            </thead>
                            <tbody>
                              <tr>
                                  <td>
                                        <h6>Nombre y Apellidos: <span class="text-muted"><%=compradto.getNombreCompleto()%></span></h6>
                                        <h6>Documento de Identidad: <span class="text-muted"><%=compradto.getDni()%></span></h6>
                                        <h6>Telefono: <span class="text-muted"><%=compradto.getTelefono1()%></span></h6>
                                  </td>
                                  <td>
                                      <h6>Tipo de comprobante: <span class="text-muted">Boleta</span></h6>
                                      <h6>Metodo de Pago: <span class="text-muted"><%=compradto.getCuenta()%></span></h6>
                                  </td>
                              </tr>
                            </tbody>
                          </table>
                          <h4 class="text-info">Resumen de compra</h4>
                          <table class="table table-bordered">
                            <thead>
                              <tr>
                                <th scope="col"><h6 class="card-title">Total producto: <span class="text-muted">S/ <%=compradto.getTotalProducto()%></span></h6></th>
                                <th scope="col"><h6 class="card-title">Costo Envio: <span class="text-muted">S/ <%=compradto.getCostoEnvio()%></span></h6></th>
                                <th scope="col"><h6 class="card-title">Total a Pagar: <span class="badge-pill badge-warning">S/ <%=compradto.getTotalPagar()%></span></h6></th>
                              </tr>
                            </thead>
                            </table>
                          <a href="index.jsp"><button type="submit" value="Regresar" class="btn btn-outline-secondary btn-lg btn-block">Regresar</button></a> 
                          <script>var pfHeaderImgUrl = 'resource/img/tienda/logo.png';var pfHeaderTagline = '';var pfdisableClickToDel = 1;var pfHideImages = 0;var pfImageDisplayStyle = 'block';var pfDisablePDF = 0;var pfDisableEmail = 0;var pfDisablePrint = 0;var pfCustomCSS = '';var pfEncodeImages = 1;var pfShowHiddenContent = 0;var pfBtVersion='2';(function(){var js,pf;pf=document.createElement('script');pf.type='text/javascript';pf.src='//cdn.printfriendly.com/printfriendly.js';document.getElementsByTagName('head')[0].appendChild(pf)})();</script><a href="https://www.printfriendly.com" style="color:#6D9F00;text-decoration:none;" class="printfriendly" onclick="window.print();return false;" title="Printer Friendly and PDF"><img style="border:none;-webkit-box-shadow:none;box-shadow:none;" src="//cdn.printfriendly.com/buttons/printfriendly-pdf-button-nobg-md.png" alt="Print Friendly and PDF"/></a>  

                          
                        </div>
                        

                    </div>
                    <!-- comment -->
                    
                </div>
            </div>
        <!--Scrip-->
        <%@include file="WEB-INF/jspfAdmin/cJavaScrip.jspf"%>
    </body>
</html>