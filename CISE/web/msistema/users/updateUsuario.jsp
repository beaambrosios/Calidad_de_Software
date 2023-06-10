<%-- 
    Document   : administrador
    Created on : 09-abr-2019, 14:47:36
    Author     : SISTEMA
--%>

<%@page import="soft.cise.modeloDTO.usuarioDTO"%>
<%@page import="soft.cise.modeloDao.usuarioDAO"%>
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
        <title>Actualizar Producto</title>
    </head>
    <body>
        <%@include file="../../WEB-INF/jspfAdmin/menu-lateral.jspf" %>
        <section id="navcont" class="activa">
            <!--Barra de navegacion-->
            <%@include file="../../WEB-INF/jspfAdmin/nav-admin.jspf" %>
            <!--Contenido-->
            <%
                usuarioDAO usutp = new usuarioDAO();
                int id = Integer.parseInt((String) request.getAttribute("id"));
                usuarioDTO usuariodto = usutp.sql_selectById(id);

            %>
            <div class="container-fluid" style="padding: 30px 10px;">
                <div class="addProducto">                     
                    <div class="row">
                        <div class="col-md-12">
                            <div class="card cardespa">     
                                <div class="card-header">
                                    <h5><i class="fab fa-product-hunt"></i>&nbsp;&nbsp;Agregar Usuarios</h5>
                                </div>
                                <form class="card-body bg-white" action="<%=request.getContextPath()%>/conusuario.do" method="post" autocomplete="off">
                                    <div class="row">
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <label>Nombre Usuario</label>
                                                <input class="form-control" type="text" name="txtNombre" value="<%=usuariodto.getNombre()%>">
                                            </div>
                                            <div class="form-group">
                                                <label>Correo</label>
                                                <input class="form-control" type="email" name="txtCorreo" value="<%=usuariodto.getCorreo()%>">
                                            </div>
                                            <div class="form-group">
                                                <label>Contraseña</label>
                                                <input class="form-control" type="password" name="txtPass" value="<%=usuariodto.getClave()%>">
                                            </div>
                                            <div class="form-group">
                                                <label>Perfil Usuario</label>
                                                <%
                                                        if (usuariodto.getPerfil().equals("admin")){
                                                        
                                                        
                                                    %>
                                                <select class="form-control" name="txtPerfil">
                                                    <option value="admin">Administrador</option>
                                                    <option value="trabajador">Trabajador</option>  
                                                    <option value="cliente">Cliente</option>
                                                </select>
                                                <% } %>
                                                <%
                                                        if (usuariodto.getPerfil().equals("trabajador")){
                                                        
                                                        
                                                    %>
                                                <select class="form-control" name="txtPerfil">
                                                    <option value="trabajador">Trabajador</option>
                                                    <option value="cliente">Cliente</option>  
                                                    <option value="admin">Administrador</option>
                                                </select>
                                                <% } %>
                                                <%
                                                        if (usuariodto.getPerfil().equals("cliente")){
                                                        
                                                        
                                                    %>
                                                <select class="form-control" name="txtPerfil">
                                                    <option value="cliente">Cliente</option>
                                                    <option value="admin">Administrador</option>  
                                                    <option value="trabajador">Trabajador</option>
                                                </select>
                                                <% } %>
                                                

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
                                                <input type="submit" name="txtAccion" id="chkAceptar" value="actualizar" class="btn btn-info btn-block">
                                            </div>
                                        </div>
                                    </div>
                                </form>
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
                                        <th scope="col">Correo</th>
                                        <th scope="col">Perfil</th>
                                        <th scope="col">Estado</th>
                                        <th scope="col">Opciones</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <th align="center" scope="row">1</th>
                                        <td><%=usuariodto.getNombre()%></td>
                                        <td><%=usuariodto.getCorreo()%></td>
                                        <td><%=usuariodto.getPerfil()%></td>
                                        <td><%=usuariodto.getEstado()%></td>
                                        
                                        <td align="center">
                                            <a class="btn btn-warning btn-sm" href="conusuario.do?txtAccion=updateUsuario&id=<%=id%>"><i class="far fa-edit"></i></a>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <%@include file="../../WEB-INF/jspfAdmin/cJavaScrip.jspf"%>

    </body>
</html>

