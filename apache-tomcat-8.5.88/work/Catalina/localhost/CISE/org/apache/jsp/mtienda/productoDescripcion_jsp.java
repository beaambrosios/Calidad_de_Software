/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.88
 * Generated at: 2023-06-29 20:38:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mtienda;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.ArrayList;
import soft.cise.modeloDTO.productoDTO;
import soft.cise.modeloDao.metProduc;

public final class productoDescripcion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/mtienda/../WEB-INF/jspfTienda/cfooter.jspf", Long.valueOf(1687037555659L));
    _jspx_dependants.put("/mtienda/../WEB-INF/jspfTienda/cStylos.jspf", Long.valueOf(1688070073257L));
    _jspx_dependants.put("/mtienda/../WEB-INF/jspfTienda/nav.jspf", Long.valueOf(1683953575182L));
    _jspx_dependants.put("/mtienda/../WEB-INF/jspfTienda/cJavaScrip.jspf", Long.valueOf(1688071020246L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("soft.cise.modeloDao.metProduc");
    _jspx_imports_classes.add("java.util.Iterator");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
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
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/sweetalert2@11.7.12/dist/sweetalert2.min.css\" integrity=\"sha256-7jUS+MWeqkFdmW9ozkZ7mPagz+QmMbsBlt+Q3MsE+FU=\" crossorigin=\"anonymous\">");
      out.write("\n");
      out.write("        <link href=\"resource/css/allproduct.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>ChiniMini Importaciones</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("\n");
      out.write("        ");

            metProduc metp = new metProduc();
            int id = Integer.parseInt((String) request.getAttribute("id"));
            productoDTO produc = metp.sql_selectById(id);

        
      out.write("\n");
      out.write("        <div class=\"espacio\"></div>\n");
      out.write("        <section id=\"barraNavegacion\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"menuopciones\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"index.jsp\">Inicio</a></li>\n");
      out.write("                        <li><a href=\"#\">Mas Productos</a></li>\n");
      out.write("                        <li><a href=\"#\">Carrito</a></li>\n");
      out.write("                        <li style=\"float: right\"><input class=\"form-control\" id=\"myInput\" type=\"text\" placeholder=\"Search..\"></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <section>\n");
      out.write("            <div class=\"contenido\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"seccionIzquierda\">\n");
      out.write("                        <div class=\"\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Todos</a></li>\n");
      out.write("                                <li><a href=\"#\">Niñas</a></li>\n");
      out.write("                                <li><a href=\"#\">Niños</a></li>\n");
      out.write("                                <li><a href=\"#\">Bebes</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"seccionDerecha\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-5\">\n");
      out.write("                                <div class=\"card cardoff\">\n");
      out.write("                                    <img src=\"comcatalogo.do?txtAccion=imagen&id=");
      out.print(id);
      out.write("\" class=\"card-img-top\" alt=\"\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-7\">\n");
      out.write("                                <div class=\"card cardoff\">\n");
      out.write("                                    <form action=\"comcatalogo.do\" method=\"post\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h5>Nombre: ");
      out.print(produc.getNombProducto());
      out.write("</h5>\n");
      out.write("                                        <label>Codigo del Producto: ");
      out.print(id);
      out.write("</label><br>\n");
      out.write("                                        <label>Precio: S/");
      out.print(produc.getPrecioVenta());
      out.write("</label><br>\n");
      out.write("                                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print(id );
      out.write("\">\n");
      out.write("                                        <label>Cantidad: </label><input style=\"height: 30px;width: 50px;\" type=\"text\" id=\"txtCantidad\" name=\"txtCantidad\" value=\"1\" autocomplete=\"off\">\n");
      out.write("                                        <input type=\"submit\" class=\"btn btn-warning\" name=\"txtAccion\" value=\"Agregar CArrito\">\n");
      out.write("                                        <label>Disponibilidad:Stock =");
      out.print(produc.getCantidad());
      out.write("</label><br>\n");
      out.write("                                        <label>Condicion:nuevo</label><br>\n");
      out.write("                                        <label>Marca: ");
      out.print(produc.getMarca());
      out.write("</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--Mas productos-->\n");
      out.write("                        <div class=\"espacio\"></div>\n");
      out.write("                        <div>\n");
      out.write("                            <h3>Mas Productos</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"SearchPrenda\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                ");

                                    soft.cise.modeloDao.metProduc metPr = new soft.cise.modeloDao.metProduc();
                                    ArrayList<productoDTO> lis3 = metPr.listProduc12();
                                    Iterator<productoDTO> iter3 = lis3.iterator();
                                    soft.cise.modeloDTO.productoDTO produc1 = new soft.cise.modeloDTO.productoDTO();
                                    int con3 = 0;
                                    while (iter3.hasNext()) {
                                        produc1 = iter3.next();

                                
      out.write("\n");
      out.write("                                <div class=\"col-md-4\">\n");
      out.write("                                    <div class=\"card\">\n");
      out.write("                                        <div class=\"imgEstilo\">\n");
      out.write("                                            <img class=\"card-img-top\" src=\"");
      out.print(request.getContextPath());
      out.write("/comcatalogo.do?txtAccion=imagen&id=");
      out.print(produc1.getIdProducto());
      out.write("\">\n");
      out.write("                                            <figcaption>\n");
      out.write("                                                <h2>");
      out.print(produc1.getNombProducto());
      out.write("</h2>\n");
      out.write("                                                <p>");
      out.print(produc1.getDescripcion());
      out.write("</p>\n");
      out.write("                                                <h2>Precio: S/");
      out.print(produc1.getPrecioVenta());
      out.write("</h2>\n");
      out.write("                                                <a href=\"#\"></a>\n");
      out.write("                                            </figcaption>			\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card-body\">\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-6\">\n");
      out.write("                                                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/comcatalogo.do?txtAccion=productoDescrip&id=");
      out.print(produc1.getIdProducto());
      out.write("\" class=\"btn btn-warning btn-block\"><i class=\"fas fa-plus-circle\"></i></a>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-6\">\n");
      out.write("                                                    <a class=\"btn btn-primary btn-block\" ><i class=\"fas fa-cart-plus\"></i></a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                ");
 }
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"espacio\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--JavasScrip-Jquery-Bootstrap-->\n");
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
