<%-- 
    Document   : administrador
    Created on : 2023
    Author     : Calidad de Software
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
                    <div class="row">
                        <div class="col-md-12">
                            <div class="card cardespa">     
                                <div class="card-header">
                                    <h5><i class="fab fa-product-hunt"></i>&nbsp;&nbsp;Agregar Usuarios</h5>
                                </div>
                                <form class="card-body bg-white" action="<%=request.getContextPath()%>/conusuario.do" method="post" autocomplete="off">
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <input class="form-control" type="text" name="txtNombre" placeholder="Nombre Usuario">
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <input class="form-control" type="email" name="txtCorreo" placeholder="Correo Usuario">
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <input class="form-control" type="password" name="txtPass" placeholder="Contraseña">
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <select class="form-control" name="txtPerfil">
                                                    <option>Perfil Usuario</option>
                                                    <option value="admin">Administrador</option>
                                                    <option value="trabajador">Trabajador</option>
                                                    <option value="cliente">Cliente</option>
                                                </select>
                                            </div>
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
                                                <input type="submit" name="txtAccion" value="agregar" class="btn btn-info btn-block">
                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <%@include file="../../WEB-INF/jspfAdmin/cJavaScrip.jspf"%>
    </body>
</html>
