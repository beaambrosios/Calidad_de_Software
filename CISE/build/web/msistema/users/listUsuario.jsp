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

        <title>Administrador</title>
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
                                    <h5>Lista de Usuarios</h5>
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
                                        <th scope="col">Nombre</th>
                                        <th scope="col">Correo</th>
                                        <th scope="col">Perfil</th>
                                        <th scope="col">Estado</th>
                                        <th scope="col">Opciones</th>
                                    </tr>
                                </thead>
                                <tbody id="myTable" >
                                    <%                                        usuarioDAO userDao = new usuarioDAO();
                                        ArrayList<usuarioDTO> lis3 = userDao.listUsers();
                                        Iterator<usuarioDTO> iter3 = lis3.iterator();
                                        usuarioDTO usuariodto = new usuarioDTO();
                                        int con1 = 0;
                                        while (iter3.hasNext()) {
                                            usuariodto = iter3.next();
                                            con1++;
                                    %>
                                    <tr>
                                        <th align="center" scope="row"><%=con1%></th>
                                        <td><%=usuariodto.getNombre()%></td>
                                        <td><%=usuariodto.getCorreo()%></td>
                                        <td><%=usuariodto.getPerfil()%></td>
                                        <td><%=usuariodto.getEstado()%></td>
                                        <td align="center">
                                            <input type="hidden" id="codigo" value="<%=usuariodto.getId()%>">
                                            <a class="btn btn-warning btn-sm" href="<%=request.getContextPath()%>/conusuario.do?txtAccion=updateUsuario&id=<%=usuariodto.getId()%>"><i class="far fa-edit"></i></a> 
                                            <a id="deleteUsuario"  href="<%=request.getContextPath()%>/conusuario.do?txtAccion=delete2&id=<%=usuariodto.getId()%>">
                                                <button type="button" class="btn btn-danger btn-sm" data-toogle="tooltip" title="Eliminar" data-original-title="Eliminar">
                                                <i class="far fa-trash-alt"></i></button>
                                            </a>
                                        </td>
                                    </tr>
                                    <% }%>
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
