<%-- 
    Document   : administrador
    Created on : 2023
    Author     : GRUPO CALIDAD 4
--%>

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
        <%@include file="../WEB-INF/jspfAdmin/cStylos.jspf" %>
        <title>Actualizar Producto</title>
    </head>
    <body>
        <%@include file="../WEB-INF/jspfAdmin/menu-lateral.jspf" %>
        <section id="navcont" class="activa">
            <!--Barra de navegacion-->
            <%@include file="../WEB-INF/jspfAdmin/nav-admin.jspf" %>
            <!--Contenido-->
            <%
                metProduc metp = new metProduc();
                int id = Integer.parseInt((String) request.getAttribute("id"));
                productoDTO productodto = metp.sql_selectById(id);

            %>
            <div class="container-fluid" style="padding: 30px 10px;">
                <div class="addProducto">                     
                    <div class="row">
                        <div class="col-md-12">
                            <div class="card cardespa">     
                                <div class="card-header">
                                    <h5><i class="fab fa-product-hunt"></i>&nbsp;&nbsp;Actualizar Producto</h5>
                                </div>
                                <form class="card-body bg-white needs-validation" action="<%=request.getContextPath()%>/comproducto.do" method="post" enctype="multipart/form-data" autocomplete="off" novalidate>
                                    <div class="row">
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <label>Nombre Producto</label>
                                                <input class="form-control" type="text" name="txtProducto" value="<%=productodto.getNombProducto() %>" pattern="^[a-zA-Z0-9\s]+$" required>
                                                <div class="invalid-feedback">
                                                    Por favor, ingrese su nombre de producto.
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label>Cantidad</label>
                                                <input class="form-control" type="text" name="txtCantidad" value="<%=productodto.getCantidad() %>" pattern="^\d+$" required>
                                                <div class="invalid-feedback">
                                                    Por favor, ingresela cantidad de prodducto.
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label>Moneda</label>
                                                <select class="form-control" name="txtMoneda" required>
                                                    <%  String moneda = productodto.getMoneda();
                                                        String moneda2 = "";
                                                        int idMoneda = 0;
                                                        if (moneda.equalsIgnoreCase("1")) {
                                                            moneda = "dolares";
                                                            moneda2 = "Soles";
                                                            idMoneda = 2;

                                                        } else if (moneda.equalsIgnoreCase("2")) {
                                                            moneda = "soles";
                                                            moneda2 = "dolares";
                                                            idMoneda = 1;
                                                        }
                                                    %>
                                                    <option value="<%=productodto.getMoneda()%>"><%=moneda%></option>
                                                    <option value="<%=idMoneda%>"><%=moneda2%></option>   
                                                </select>
                                                <div class="invalid-feedback">
                                                    Por favor, seleccione la moneda de compra.
                                                </div>

                                            </div>
                                            <div class="form-group">
                                                <label>Precio Compra</label>
                                                <input class="form-control" type="text" name="txtPrecioCompra" value="<%=productodto.getPrecioCompra() %>" required>
                                                <div class="invalid-feedback">
                                                    Por favor, ingrese el precio de compra.
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label>Tipo de Cambio</label>
                                                <input class="form-control" type="text" name="txtTipoCambio" value="<%=productodto.getTipoCambio() %>" required>
                                                <div class="invalid-feedback">
                                                    Por favor, ingrese el tipo de cambio.
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label>Precio Venta del Prroducto</label>
                                                <input class="form-control" type="text" name="txtPrecioVenta" value="<%=productodto.getPrecioVenta() %>" required>
                                                <div class="invalid-feedback">
                                                    Por favor, ingrese el precio de venta del producto.
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <input class="form-control" type="hidden" name="txtIGV" value="<%=productodto.getIGV() %>" readonly="readonly" required>                                         
                                            </div>
                                            <div class="form-group">
                                                <label>Nombre Proveedor</label>
                                                <input class="form-control" type="text" name="txtProveedor" value="<%=productodto.getProveedor() %>" required>    
                                                <div class="invalid-feedback">
                                                    Por favor, ingrese el nombre del proveedor.
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label>Talla 1</label>
                                                <input class="form-control" type="text" name="txtTalla1" value="<%=productodto.getTalla1() %>" pattern="^[0-9]$" required>
                                                <div class="invalid-feedback">
                                                    Por favor, ingrese la talla 1.
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label>Talla 2</label>
                                                <input class="form-control" type="text" name="txtTalla2" value="<%=productodto.getTalla2() %>" pattern="^[0-9]$" required>
                                                <div class="invalid-feedback">
                                                    Por favor, ingrese la talla 2.
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label>Talla 3</label>
                                                <input class="form-control" type="text" name="txtTalla3" value="<%=productodto.getTalla3() %>" pattern="^[0-9]$" required>
                                                <div class="invalid-feedback">
                                                    Por favor, ingrese la talla 3.
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label>Talla 4</label>
                                                <input class="form-control" type="text" name="txtTalla4" value="<%=productodto.getTalla4() %>" pattern="^[0-9]$" required>
                                                <div class="invalid-feedback">
                                                    Por favor, ingrese la talla 4.
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <label>Categoria :<%=productodto.getCategoria() %></label>
                                                <select class="form-control" name="txtCategoria" required>
                                                    <%
                                                        metProduc metPro = new soft.cise.modeloDao.metProduc();
                                                        List<productoDTO> lis2 = metPro.listarCateg();
                                                        Iterator<productoDTO> iter2 = lis2.iterator();
                                                        productoDTO productoCategoria = new productoDTO();
                                                        int con2 = 0;
                                                        while (iter2.hasNext()) {
                                                            productoCategoria = iter2.next();
                                                            con2++;

                                                    %>
                                                    <option value="<%=con2%>"><%=productoCategoria.getCategoria()%></option>
                                                    <% }%>
                                                </select>
                                                <div class="invalid-feedback">
                                                    Por favor, seleccione la categoria del producto.
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label>Modelo</label>
                                                <input class="form-control" type="text" name="txtModelo" value="<%=productodto.getMarca() %>" required>
                                                <div class="invalid-feedback">
                                                    Por favor, ingrese el modelo del produto.
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label for="exampleFormControlTextarea1" >Descripcion</label>
                                                <textarea class="form-control" name="txtDescripcion"  required><%=productodto.getDescripcion() %></textarea>
                                                <div class="invalid-feedback">
                                                    Por favor, ingrese la descripcion del producto.
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label>Imagen de la bd</label><br>
                                                <img src="comcatalogo.do?txtAccion=imagen&id=<%=id%>" style="height: 80px; width: 80px;"><br>
                                                <label>Actualizar Imagen</label>
                                                <input type="file" class="form-control-file" name="txtImgProducto" value="<%=productodto.getImg() %>" required>
                                                <div class="invalid-feedback">
                                                    Por favor, seleccione una imagen.
                                                </div>
                                            </div>
                                            <input type="hidden" name="id" value="<%=id%>">
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <a class="btn btn-success btn-block" href="sistema.jsp"><i class="fas fa-arrow-left"></i> Cancelar</a>
                                            </div>
                                        </div>
                                        <div class="col-md-8">
                                            <div class="form-group">
                                                <input type="submit" name="txtAccion" value="actualizar" class="btn btn-info btn-block">
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                    <script>
                                    // Example starter JavaScript for disabling form submissions if there are invalid fields
                                    (function() {
                                      'use strict';
                                      window.addEventListener('load', function() {
                                        // Fetch all the forms we want to apply custom Bootstrap validation styles to
                                        var forms = document.getElementsByClassName('needs-validation');
                                        // Loop over them and prevent submission
                                        var validation = Array.prototype.filter.call(forms, function(form) {
                                          form.addEventListener('submit', function(event) {
                                            if (form.checkValidity() === false) {
                                              event.preventDefault();
                                              event.stopPropagation();
                                            }
                                            form.classList.add('was-validated');
                                          }, false);
                                        });
                                      }, false);
                                    })();
                                    </script>
                                        
                            </div>
                        </div>
                    </div>
                    <!--Listado de productos guardados-->  
                    <div class="card cardespa">
                        <div class="card-header">
                            <h5>Producto Actualizado</h5>
                        </div>
                        <div class="card-body">
                            <table class="table table-bordered table-hover">
                                <thead class="table-primary">
                                    <tr align="center">
                                        <th scope="col">#</th>
                                        <th scope="col">Nombre</th>
                                        <th scope="col">Cantidad</th>
                                        <th scope="col">moneda</th>
                                        <th scope="col">Precio Compra</th>
                                        <th scope="col">Precio Venta</th>
                                        <th scope="col">Proveedor</th>
                                        <th scope="col">Categoria</th>
                                        <th scope="col">Marca</th>
                                        <th scope="col">Talla</th>
                                        <th scope="col">Descripcion</th>
                                        <th scope="col">Opciones</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <th align="center" scope="row">1</th>
                                        <td><%=productodto.getNombProducto()%></td>
                                        <td><%=productodto.getCantidad()%></td>
                                        <td><%=moneda%></td>
                                        <td><%=productodto.getPrecioCompra()%></td>
                                        <td><%=productodto.getPrecioVenta()%></td>
                                        <td><%=productodto.getProveedor()%></td>
                                        <td><%=productodto.getCategoria()%></td>
                                        <td><%=productodto.getMarca()%></td>
                                        <td><%=productodto.getTalla1()%></td>
                                        <td><%=productodto.getDescripcion()%></td>
                                        <td align="center">
                                            <a class="btn btn-warning btn-sm" href="comproducto.do?txtAccion=updateProducto&id=<%=id%>"><i class="far fa-edit"></i></a>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <%@include file="../WEB-INF/jspfAdmin/cJavaScrip.jspf"%>

    </body>
</html>

