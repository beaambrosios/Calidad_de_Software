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
        <script async>(function(w, d) { var h = d.head || d.getElementsByTagName("head")[0]; var s = d.createElement("script"); s.setAttribute("type", "text/javascript"); s.setAttribute("src", "https://app.bluecaribu.com/conversion/integration/5d1c5f7b36ad92bef25c00e52d6f5a2e"); h.appendChild(s); })(window, document);</script>

    </head>
    <body>
        <%@include file="WEB-INF/jspfTienda/nav.jspf" %>
        <section id="loginSeccion">
            <div class="contenido">
                <div class="fondoSeccion">
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-md-6">
                                <div class="colorLogin">
                                    <div class="contCard">
                                        <div class="card">
                                            <div class="card-header">
                                                <h5 align="center">Inicio Sesión</h5>
                                            </div>
                                            <form class="card-body needs-validation" action="<%=request.getContextPath()%>/conusuario.do" method="post" novalidate>
                                                <div class="col-md-12 mb-3">
                                                    <div class="input-group">
                                                        <div class="input-group-prepend">
                                                            <span class="input-group-text">
                                                                <i class="fas fa-user-alt"></i>
                                                            </span>
                                                        </div>
                                                        <input type="text" class="form-control" name="txtCorreo" placeholder="Username" required>
                                                        <div class="invalid-feedback">
                                                            Por favor, ingrese su usuario.
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-md-12 mb-3">
                                                    <div class="input-group">
                                                        <div class="input-group-prepend">
                                                            <span class="input-group-text">
                                                                <i class="fas fa-unlock-alt"></i>
                                                            </span>
                                                        </div>
                                                        <input type="password" class="form-control" name="txtClave" placeholder="password" required>
                                                        <div class="invalid-feedback">
                                                            Por favor, ingrese su contraseña.
                                                        </div>
                                                    </div>
                                                </div>
                                                <% if (request.getAttribute("error") != null) { %>
                                                    <div class="error-message">
                                                        <%= request.getAttribute("error") %>
                                                    </div>
                                                <% } %>
                                                <div class="col-md-12 mb-3">
                                                    <input type="submit" name="txtAccion" value="Ingresar" class="btn btn-primary btn-block">
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
                                    <div align="center">
                                        <small>Aun no tienes Cuenta?</small><br>
                                        <a href="registrar.jsp" style="color: #000;">Registrate aquí</a>
                                    </div>
                                </div>
                            </div>
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
