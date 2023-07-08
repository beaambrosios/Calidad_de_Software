<%-- 
    Document   : login
   Created on : 2023
    Author     : GRUPO CALIDAD 4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/jspfTienda/cStylos.jspf" %>

        <link href="resource/css/login.css" rel="stylesheet" type="text/css"/>
        <!--Google fonts-->

        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspfTienda/nav.jspf" %>
        <section>
            <div style="padding-top: 150px; padding-bottom: 150px;">
                <div class="row justify-content-center">
                    <div class="col-md-5">
                        <div class="card">
                            <div class="card-header">
                                <h5 align="center">Registrar Usuarios</h5>
                            </div>
                            <form class="card-body needs-validation" action="<%=request.getContextPath()%>/conusuario.do" method="post" novalidate>
                                <div class="form-group">
                                    <input class="form-control" type="text" name="txtNombre" placeholder="nombre completo" required>
                                    <div class="invalid-feedback">
                                        Por favor, ingrese su nombre completo.
                                    </div>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="email" name="txtCorreo" placeholder="correo" required>
                                    <div class="invalid-feedback">
                                        Por favor, ingrese su correo.
                                    </div>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="password" name="txtPass" placeholder="Contraseña" required>
                                    <div class="invalid-feedback">
                                        Por favor, ingrese la contraseña.
                                    </div>
                                </div>
                                <input type="hidden" name="txtPerfil" value="cliente">
                                <input type="submit" class="btn btn-primary btn-block" name="txtAccion" value="Registrar">
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
            </div>
        </section>
        <%@include file="WEB-INF/jspfTienda/cfooter.jspf" %>
        <!--Scrip-->
        <%@include file="WEB-INF/jspfTienda/cJavaScrip.jspf" %>
    </body>
</html>

