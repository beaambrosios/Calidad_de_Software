/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.88
 * Generated at: 2023-06-17 15:47:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.msistema.venta;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productosEnviados_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/msistema/venta/../../WEB-INF/jspfAdmin/cJavaScrip.jspf", Long.valueOf(1631582830000L));
    _jspx_dependants.put("jar:file:/D:/Documentos/UCH/IX-CICLO-UCH/TRABAJO%20GRUPAL/CALIDAD%20DE%20SOFTWARE/CISE/build/web/WEB-INF/lib/jstl-impl.jar!/META-INF/c.tld", Long.valueOf(1343837818000L));
    _jspx_dependants.put("/msistema/venta/../../WEB-INF/jspfAdmin/nav-admin.jspf", Long.valueOf(1631582830000L));
    _jspx_dependants.put("/msistema/venta/../../WEB-INF/jspfAdmin/cStylos.jspf", Long.valueOf(1631582830000L));
    _jspx_dependants.put("/msistema/venta/../../WEB-INF/jspfAdmin/menu-lateral.jspf", Long.valueOf(1686117350258L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-impl.jar", Long.valueOf(1683571754865L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write('\n');
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
      out.write("        <!--CSS-->\n");
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
      out.write("            <div class=\"container-fluid\" style=\"padding: 30px 10px;\">\n");
      out.write("                <div class=\"sistema\">\n");
      out.write("                    <div class=\"addProducto\">                     \n");
      out.write("                        <!--Listado de productos guardados-->    \n");
      out.write("                        <div class=\"card cardespa\">\n");
      out.write("                            <div class=\"card-header\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-7\">\n");
      out.write("                                        <h5>Lista de Productos enviados</h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-5\">\n");
      out.write("                                        <input class=\"form-control\" id=\"myInput\" type=\"text\" placeholder=\"Search..\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body\">                \n");
      out.write("                                <table class=\"table table-bordered table-hover\">\n");
      out.write("                                    <thead class=\"table-primary\" align=\"center\">\n");
      out.write("                                        <!--ud.nombreCompleto,v.fecha,dv.totalventa,v.entregado,e.provincia+' '+e.departamento+' '+e.distrito as destino,e.direccion-->\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"col\">Nombre Completo</th>\n");
      out.write("                                            <th scope=\"col\">Fecha de Venta</th>\n");
      out.write("                                            <th scope=\"col\">Total de Venta</th>\n");
      out.write("                                            <th scope=\"col\">Destino</th>\n");
      out.write("                                            <th scope=\"col\">Direccion</th>\n");
      out.write("                                            <th scope=\"col\">Estado</th>\n");
      out.write("                                            <th scope=\"col\">Opciones</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody id=\"myTable\" >\n");
      out.write("                                        ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      boolean _jspx_th_c_005fforEach_005f0_reused = false;
      try {
        _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fforEach_005f0.setParent(null);
        // /msistema/venta/productosEnviados.jsp(55,40) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setVar("productoEnviado");
        // /msistema/venta/productosEnviados.jsp(55,40) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/msistema/venta/productosEnviados.jsp(55,40) '${sessionScope.productoEnviado}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${sessionScope.productoEnviado}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
        int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
          if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                            <tr>\n");
              out.write("                                                <td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productoEnviado.nombreCompleto}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\n");
              out.write("                                                <td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productoEnviado.fechaVenta}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\n");
              out.write("                                                <td>S/.");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productoEnviado.totalPagar}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\n");
              out.write("                                                <td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productoEnviado.destino}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\n");
              out.write("                                                <td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productoEnviado.direccion}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\n");
              out.write("                                                <td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productoEnviado.estado}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\n");
              out.write("                                                <td>\n");
              out.write("                                                    <a class=\"btn btn-warning btn-sm\" href=\"");
              out.print(request.getContextPath());
              out.write("/comproducto.do?txtAccion=detalleVentaProducto&txtIdVenta=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productoEnviado.idVenta}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\"><i class=\"far fa-edit\"></i></a>\n");
              out.write("                                                </td>\n");
              out.write("                                            </tr>\n");
              out.write("                                        ");
              int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_c_005fforEach_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
        _jspx_th_c_005fforEach_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
      }
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
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
      out.write("</html>");
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
