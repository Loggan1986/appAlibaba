package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.proyecto.modelo.Producto;
import java.util.List;
import com.proyecto.dao.ProductoDaoImpl;

public final class productos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("   \n");
      out.write("\n");
      out.write("    <title>Dashboard - Sistema de Gestión</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("   \n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"css/dashboard.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("   \n");
      out.write("  </head>\n");
      out.write("  ");

      ProductoDaoImpl dao = new ProductoDaoImpl();
      List<Producto> listProducto = new ArrayList();
      
   
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"navbar-brand\" href=\"index.html\">Alibaba</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <li><a href=\"#\">Dashboard</a></li>\n");
      out.write("            <li><a href=\"#\">Configuración</a></li>\n");
      out.write("            <li><a href=\"#\">Usuario</a></li>\n");
      out.write("            <li><a href=\"#\">Ayuda</a></li>\n");
      out.write("          </ul>\n");
      out.write("          <form class=\"navbar-form navbar-right\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Buscar...\">\n");
      out.write("          </form>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-3 col-md-2 sidebar\">\n");
      out.write("          <ul class=\"nav nav-sidebar\">\n");
      out.write("            <li class=\"active\"><a href=\"index.html\">Inicio <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("            <li><a href=\"reportes.jsp\">Reportes</a></li>\n");
      out.write("            <li><a href=\"analisis.jsp\">Analisis</a></li>\n");
      out.write("            <li><a href=\"usuarios.jsp\">Usuarios</a></li>\n");
      out.write("          </ul>\n");
      out.write("          <ul class=\"nav nav-sidebar\">\n");
      out.write("            <li><a href=\"productos.jsp\">Productos</a></li>\n");
      out.write("            <li><a href=\"categorias.jsp\">Categorías</a></li>\n");
      out.write("            <li><a href=\"clientes.jsp\">Clientes</a></li>\n");
      out.write("            <li><a href=\"ventas.html\">Ventas</a></li>\n");
      out.write("            \n");
      out.write("          </ul>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main\">\n");
      out.write("          <h1 class=\"page-header\">Productos</h1>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <h4></h4>\n");
      out.write("          <div class=\"row placeholders\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-6 col-sm-4\"></div>\n");
      out.write("                <div class=\"col-xs-6 col-sm-4\"></div>\n");
      out.write("                <div class=\"clearfix visible-xs-block\"></div>\n");
      out.write("                <div class=\"col-xs-6 col-sm-4\"><button type=\"button\" class=\"btn btn-primary\" onclick=\"window.location.href='registrar_producto.jsp'\">Nuevo Producto</button></div>\n");
      out.write("              </div>\n");
      out.write("          \n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("<!-- Tabla productos -->\n");
      out.write("          <div class=\"panel panel-default\">\n");
      out.write("              <div class=\"panel-heading\">\n");
      out.write("                  <form class=\"form-inline\">\n");
      out.write("                    <label class=\"sr-only\" for=\"inlineFormCustomSelect\">Parametro</label>\n");
      out.write("                    <select class=\"form-control\" id=\"inlineFormCustomSelect\">\n");
      out.write("                      <option selected>- Seleccione -</option>\n");
      out.write("                      <option value=\"1\">Código</option>\n");
      out.write("                      <option value=\"2\">Nombre</option>\n");
      out.write("                      <option value=\"3\">Cantidad</option>\n");
      out.write("                      <option value=\"3\">Categoría</option>\n");
      out.write("                      <option value=\"3\">Estado</option>\n");
      out.write("                    </select>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"inputBuscar\" >\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Buscar</button>\n");
      out.write("                  </form>\n");
      out.write("              </div>\n");
      out.write("            <table class=\"table\">\n");
      out.write("              <thead>\n");
      out.write("                <tr>\n");
      out.write("                  \n");
      out.write("                  <th>Código</th>\n");
      out.write("                  <th>Nombre</th>\n");
      out.write("                  <th>Cantidad</th>\n");
      out.write("                  <th>Categoría</th>\n");
      out.write("                  <th>Estado</th>\n");
      out.write("                  <th>Operaciones</th>\n");
      out.write("                </tr>\n");
      out.write("              </thead>\n");
      out.write("              <tbody>\n");
      out.write("                  <!-- fila inicial -->\n");
      out.write("                  ");

                      listProducto = dao.listar();
                      for(Producto p : listProducto){
                   
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( p.getCodProducto() );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( p.getNombre());
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( p.getCantidad());
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( p.getIdCategoria());
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( p.getEstado());
      out.write("</td>\n");
      out.write("                  <td>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-1 col-md-1\">\n");
      out.write("                            \n");
      out.write("                             <form action=\"pruebasv\" method=\"get\">\n");
      out.write("                                <a href=\"javascript:;\" onclick=\"parentNode.submit();\" name=\"btnModificar\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-file\"></span>\n");
      out.write("                                </a>\n");
      out.write("                             <input type=\"hidden\" name=\"btnModificar\" value=\"modificar\"/>\n");
      out.write("                             <input type=\"hidden\" name=\"codigo\" value='");
      out.print( p.getIdProducto() );
      out.write("'/>\n");
      out.write("                            </form> \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-1 col-md-1\">\n");
      out.write("                            <form action=\"pruebasv\" method=\"get\">\n");
      out.write("                                <a href=\"javascript:;\" onclick=\"parentNode.submit();\" name=\"btnEliminar\">\n");
      out.write("                                    <span class=\"glyphicon glyphicon-trash\" aria-hidden=\"true\"></span>\n");
      out.write("                                </a>\n");
      out.write("                                <input type=\"hidden\" name=\"btnEliminar\" value=\"eliminar\"/>\n");
      out.write("                                <input type=\"hidden\" name=\"cod\" value='");
      out.print( p.getIdProducto() );
      out.write("'/>\n");
      out.write("                            </form>                  \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-1 col-md-1\">\n");
      out.write("                            <a href=\"#\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Modificar\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-check\" aria-hidden=\"true\"></span>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                   </div>\n");
      out.write("                  </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                <!--  termina la fila inicial -->\n");
      out.write("              \n");
      out.write("               \n");
      out.write("                \n");
      out.write("              </tbody>\n");
      out.write("            </table>\n");
      out.write("          </div> <!-- termina la tabla productos -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript -->\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("       ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
