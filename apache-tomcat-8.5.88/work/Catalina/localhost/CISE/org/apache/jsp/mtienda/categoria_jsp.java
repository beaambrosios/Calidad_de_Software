/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.88
 * Generated at: 2023-07-15 12:46:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mtienda;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class categoria_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("jar:file:/D:/Documentos/UCH/IX-CICLO-UCH/TRABAJO%20GRUPAL/CALIDAD%20DE%20SOFTWARE/CISE/build/web/WEB-INF/lib/jstl-impl.jar!/META-INF/c.tld", Long.valueOf(1343837818000L));
    _jspx_dependants.put("/mtienda/../WEB-INF/jspfTienda/cfooter.jspf", Long.valueOf(1689417569598L));
    _jspx_dependants.put("/mtienda/../WEB-INF/jspfTienda/cStylos.jspf", Long.valueOf(1689417569596L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-impl.jar", Long.valueOf(1689417570182L));
    _jspx_dependants.put("/mtienda/../WEB-INF/jspfTienda/nav.jspf", Long.valueOf(1689417569602L));
    _jspx_dependants.put("/mtienda/../WEB-INF/jspfTienda/cJavaScrip.jspf", Long.valueOf(1689417569595L));
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        ");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"  crossorigin=\"anonymous\">\n");
      out.write("<!--fontawesome-->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.2/css/all.css\"  crossorigin=\"anonymous\">\n");
      out.write("<link href=\"resource/css/tienda.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<!--Letras-->\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("<link rel=\"stylesheet\" href=\"//cdn.jsdelivr.net/npm/alertifyjs@1.11.2/build/css/alertify.min.css\"/>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/sweetalert2@11.7.12/dist/sweetalert2.min.css\" integrity=\"sha256-7jUS+MWeqkFdmW9ozkZ7mPagz+QmMbsBlt+Q3MsE+FU=\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"shortcut icon\" href=\"https://d20f60vzbd93dl.cloudfront.net/uploads/tienda_017323/tienda_017323_e734755e26a2ab26164eecc2565839de02d5188a_logo_small_85.png\">");
      out.write("\r\n");
      out.write("        <link href=\"resource/css/allproduct.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"../resource/assets/css/main.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"../resource/assets/css/fontawesome-all.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <title>ChiniMini Importaciones</title>\r\n");
      out.write("        <script async>(function(w, d) { var h = d.head || d.getElementsByTagName(\"head\")[0]; var s = d.createElement(\"script\"); s.setAttribute(\"type\", \"text/javascript\"); s.setAttribute(\"src\", \"https://app.bluecaribu.com/conversion/integration/062e356f5fe6a7ffe90577fcdb6e2319\"); h.appendChild(s); })(window, document);</script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

    HttpSession sessionOk = request.getSession();

      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-white bg-white  fixed-top\" id=\"mainNav\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.jsp\"><img class=\"imagen-logo\" src=\"resource/img/tienda/logo.png\"></a>\n");
      out.write("        <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            Menu\n");
      out.write("            <i class=\"fas fa-bars\"></i>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("            <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(request.getContextPath());
      out.write("/comcatalogo.do?txtAccion=carrito\">Carrito");
//=contador 
      out.write("</a>\n");
      out.write("                </li>\n");
      out.write("                ");
 
                    if (sessionOk.getAttribute("perfil") == null) {
                
      out.write("\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"login.jsp\">Acceder</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"registrar.jsp\">Registrarse</a>\n");
      out.write("                </li>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                ");

                    if (sessionOk.getAttribute("perfil") != null) {
                
      out.write("\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">");
      out.print(sessionOk.getAttribute("nombre") );
      out.write("</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(request.getContextPath());
      out.write("/conusuario.do?txtAccion=cerrarSession\">Cerrar Session</a>\n");
      out.write("                </li>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("        <div class=\"espacio\"></div>\r\n");
      out.write("        <section id=\"barraNavegacion\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"menuopciones\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"index.jsp\">Inicio</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Mas Productos</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Carrito</a></li>\r\n");
      out.write("                        <li style=\"float: right\"><input class=\"form-control\" id=\"myInput\" type=\"text\" placeholder=\"Search..\"></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <section>\r\n");
      out.write("            <div class=\"contenido\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"seccionIzquierda\">\r\n");
      out.write("                        <div class=\"\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/comcatalogo.do?txtAccion=categoria&txtCategoria=0\">Todos</a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/comcatalogo.do?txtAccion=categoria&txtCategoria=2\">Niñas</a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/comcatalogo.do?txtAccion=categoria&txtCategoria=3\">Niños</a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/comcatalogo.do?txtAccion=categoria&txtCategoria=1\">Bebes</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"seccionDerecha\">\r\n");
      out.write("                        <div id=\"SearchPrenda\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                 ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      boolean _jspx_th_c_005fforEach_005f0_reused = false;
      try {
        _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fforEach_005f0.setParent(null);
        // /mtienda/categoria.jsp(51,33) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setVar("categoria");
        // /mtienda/categoria.jsp(51,33) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/mtienda/categoria.jsp(51,33) '${categoria}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${categoria}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
        int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
          if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                                <div class=\"col-md-4\">\r\n");
              out.write("                                    <div class=\"card\">\r\n");
              out.write("                                        <div class=\"imgEstilo\">\r\n");
              out.write("                                            <img class=\"card-img-top\" src=\"");
              out.print(request.getContextPath());
              out.write("/comcatalogo.do?txtAccion=imagen&id=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${categoria.idProducto}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\">\r\n");
              out.write("                                            <figcaption>\r\n");
              out.write("                                                <h2>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${categoria.nombre}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</h2>\r\n");
              out.write("                                                <p>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${categoria.descripcion}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</p>\r\n");
              out.write("                                                <h2>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${categoria.precioVenta}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</h2>\r\n");
              out.write("                                                <a href=\"#\"></a>\r\n");
              out.write("                                            </figcaption>			\r\n");
              out.write("                                        </div>\r\n");
              out.write("                                        <div class=\"card-body\">\r\n");
              out.write("                                            <div class=\"row\">\r\n");
              out.write("                                                <div class=\"col-6\">\r\n");
              out.write("                                                 \r\n");
              out.write("                                                    <a href=\"");
              out.print(request.getContextPath());
              out.write("/comcatalogo.do?txtAccion=productoDescrip&id=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${categoria.idProducto}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\" class=\"btn btn-warning btn-block\"><i class=\"fas fa-plus-circle\"></i></a>\r\n");
              out.write("                                                </div>\r\n");
              out.write("                                                <div class=\"col-6\">\r\n");
              out.write("                                                    <a class=\"btn btn-primary btn-block\" ><i class=\"fas fa-cart-plus\"></i></a>\r\n");
              out.write("                                                </div>\r\n");
              out.write("                                            </div>\r\n");
              out.write("                                        </div>\r\n");
              out.write("                                    </div>\r\n");
              out.write("                                </div>\r\n");
              out.write("                               ");
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
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!--Mas productos-->\r\n");
      out.write("                        <div class=\"espacio\"></div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"espacio\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("<footer>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <span class=\"copyright\">Copyright &copy; ChiniMini-Importaciones 2023</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\" align=\"center\">\n");
      out.write("                <ul class=\"social-buttons\">\n");
      out.write("                    <li class=\"list-inline-item\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <i class=\"fab fa-twitter\"></i>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"list-inline-item\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"list-inline-item\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <i class=\"fab fa-linkedin-in\"></i>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <ul class=\"list-inline quicklinks\">\n");
      out.write("                    <li class=\"list-inline-item\">\n");
      out.write("                        <a href=\"#\">Politicas de Privacidad</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"list-inline-item\">\n");
      out.write("                        <a href=\"#\">Terminos de Uso</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\r\n");
      out.write("        <!--JavasScrip-Jquery-Bootstrap-->\r\n");
      out.write("        ");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"  crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"  crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"  crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"resource/js/tienda.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"resource/js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"resource/js/carrito.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\"></script>\n");
      out.write("<script src=\"//cdn.jsdelivr.net/npm/alertifyjs@1.11.2/build/alertify.min.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11.7.12/dist/sweetalert2.all.min.js\" integrity=\"sha256-2Dbg51yxfa7qZ8CSKqsNxHtph8UHdgbzxXF9ANtyJHo=\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"resource/js/alert.js\" type=\"text/javascript\"></script>");
      out.write("\r\n");
      out.write("        <script src=\"../resource/assets/js/util.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"../resource/assets/js/main.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"../resource/assets/js/jquery.poptrox.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"../resource/assets/js/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"../resource/assets/js/browser.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"../resource/assets/js/breakpoints.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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