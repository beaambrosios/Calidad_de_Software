/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.88
 * Generated at: 2023-06-27 16:34:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.msistema.users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import soft.cise.modeloDTO.usuarioDTO;
import soft.cise.modeloDao.usuarioDAO;
import soft.cise.modeloDao.metProduc;
import soft.cise.modeloDTO.productoDTO;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public final class listUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/msistema/users/../../WEB-INF/jspfAdmin/menu-lateral.jspf", Long.valueOf(1686117350258L));
    _jspx_dependants.put("/msistema/users/../../WEB-INF/jspfAdmin/nav-admin.jspf", Long.valueOf(1631582830000L));
    _jspx_dependants.put("/msistema/users/../../WEB-INF/jspfAdmin/cStylos.jspf", Long.valueOf(1631582830000L));
    _jspx_dependants.put("/msistema/users/../../WEB-INF/jspfAdmin/cJavaScrip.jspf", Long.valueOf(1631582830000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("soft.cise.modeloDao.usuarioDAO");
    _jspx_imports_classes.add("soft.cise.modeloDao.metProduc");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("soft.cise.modeloDTO.usuarioDTO");
    _jspx_imports_classes.add("soft.cise.modeloDTO.productoDTO");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <!--Bootstrap-->\n");
      out.write("        ");
      out.write("<!--Bootstrap v->4.3.1 -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\n");
      out.write("               crossorigin=\"anonymous\">\n");
      out.write("<!--Estilos-->\n");
      out.write("<link href=\"resource/css/estiloSistema.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"resource/css/addProduc.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!--fontawesome-->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.2/css/all.css\"\n");
      out.write("               crossorigin=\"anonymous\">\n");
      out.write("<!--Google fonts-->\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Roboto+Condensed\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Oswald\" rel=\"stylesheet\">\n");
      out.write("<!--ajax-->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"//cdn.jsdelivr.net/npm/alertifyjs@1.11.2/build/alertify.min.js\"></script>");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Administrador</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

    HttpSession sessionOK = request.getSession();

      out.write("\n");
      out.write("<section>\n");
      out.write("    <div id=\"sideBar\" class=\"active\">\n");
      out.write("        <div class=\"contenedor-menu\">\n");
      out.write("            <ul class=\"menuCabecera\">\n");
      out.write("                <li><a href=\"#\">Administrador</a></li>\n");
      out.write("                <li><img src=\"resource/img/admin/perfil2.jpg\" class=\"imgPerfil\"></li>\n");
      out.write("                <li style=\"font-size: 12px;\"><a>");
      out.print(sessionOK.getAttribute("nombre") );
      out.write("</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"menu\">\n");
      out.write("                <li><a href=\"sistema.jsp\"><i class=\"icono izquierda fa fa-home\"></i> Sistema</a></li>\n");
      out.write("                <li><a href=\"index.jsp\"><i class=\"icono izquierda fas fa-store\"></i>Catalogo</a></li>\n");
      out.write("                \n");
      out.write("                <li class=\"\"><a href=\"#\"><i class=\"icono izquierda fas fa-user-cog\"></i>Usuarios<i class=\"icono derecha fa fa-chevron-down\"></i></a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/conusuario.do?txtAccion=addUsers\">Registrar Usuario</a></li>\n");
      out.write("                        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/conusuario.do?txtAccion=listUsuario\">Lista Usuarios</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                <li class=\"\"><a href=\"#\"><i class=\"icono izquierda fas fa-folder-plus\"></i>Productos<i class=\"icono derecha fa fa-chevron-down\"></i></a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/comproducto.do?txtAccion=addProducto\">Registrar Producto</a></li>\n");
      out.write("                        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/comproducto.do?txtAccion=listProducto\">Lista Productos</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"\"><a href=\"#\"><i class=\"icono izquierda fas fa-file-export\"></i>Ventas<i class=\"icono derecha fa fa-chevron-down\"></i></a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/comproducto.do?txtAccion=venta\">Modulo Ventas</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/conreportes.do?txtAccion=reportes\"><i class=\"icono izquierda far fa-file-alt\"></i>Reportes</a></li>\n");
      out.write("                <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/conusuario.do?txtAccion=cerrarSession\"><i class=\"icono izquierda fas fa-sign-out-alt\"></i>Cerrar Sesion</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("        <section id=\"navcont\" class=\"activa\">\n");
      out.write("            <!--Barra de navegacion-->\n");
      out.write("            ");
      out.write("<!--Barra de navegacion-->\n");
      out.write("<nav class=\"navbar\">\n");
      out.write("    <div class=\"toggle-btn\">\n");
      out.write("        <i class=\"fas fa-ellipsis-v\"></i>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"\">\n");
      out.write("        <li class=\"acti\"><a href=\"index.html\"><i class=\"far fa-envelope\"></i></a></li>\n");
      out.write("        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/conusuario.do?txtAccion=cerrarSession\"><i class=\"fas fa-sign-out-alt\"></i></a></li>\n");
      out.write("        \n");
      out.write("    </ul>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("            <!--Contenido-->\n");
      out.write("            <!--Contenido-->\n");
      out.write("            <div class=\"container-fluid\" style=\"padding: 30px 10px;\">\n");
      out.write("                <div class=\"addProducto\">                     \n");
      out.write("                    <!--Listado de productos guardados-->    \n");
      out.write("                    <div class=\"card cardespa\">\n");
      out.write("                        <div class=\"card-header\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-7\">\n");
      out.write("                                    <h5>Lista de Usuarios</h5>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-5\">\n");
      out.write("                                    <input class=\"form-control\" id=\"myInput\" type=\"text\" placeholder=\"Search..\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">                \n");
      out.write("                            <table class=\"table table-bordered table-hover\">\n");
      out.write("                                <thead class=\"table-primary\" align=\"center\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th scope=\"col\">#</th>\n");
      out.write("                                        <th scope=\"col\">Nombre</th>\n");
      out.write("                                        <th scope=\"col\">Correo</th>\n");
      out.write("                                        <th scope=\"col\">Perfil</th>\n");
      out.write("                                        <th scope=\"col\">Estado</th>\n");
      out.write("                                        <th scope=\"col\">Opciones</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody id=\"myTable\" >\n");
      out.write("                                    ");
                                        usuarioDAO userDao = new usuarioDAO();
                                        ArrayList<usuarioDTO> lis3 = userDao.listUsers();
                                        Iterator<usuarioDTO> iter3 = lis3.iterator();
                                        usuarioDTO usuariodto = new usuarioDTO();
                                        int con1 = 0;
                                        while (iter3.hasNext()) {
                                            usuariodto = iter3.next();
                                            con1++;
                                    
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th align=\"center\" scope=\"row\">");
      out.print(con1);
      out.write("</th>\n");
      out.write("                                        <td>");
      out.print(usuariodto.getNombre());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(usuariodto.getCorreo());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(usuariodto.getPerfil());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(usuariodto.getEstado());
      out.write("</td>\n");
      out.write("                                        <td align=\"center\">\n");
      out.write("                                            <a class=\"btn btn-warning btn-sm\" href=\"");
      out.print(request.getContextPath());
      out.write("/conusuario.do?txtAccion=updateUsuario&id=");
      out.print(usuariodto.getId());
      out.write("\"><i class=\"far fa-edit\"></i></a>\n");
      out.write("                                            <a class=\"btn btn-danger btn-sm\" href=\"");
      out.print(request.getContextPath());
      out.write("/conusuario.do?txtAccion=delete2&id=");
      out.print(usuariodto.getId());
      out.write("\"><i class=\"far fa-trash-alt\"></i></a>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");
 }
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("<!-- Optional JavaScript -->\n");
      out.write("<!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\n");
      out.write("crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"\n");
      out.write("crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" \n");
      out.write("crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("<!--Jquery and js-->\n");
      out.write("<script src=\"resource/js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"resource/js/mainSistema.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
