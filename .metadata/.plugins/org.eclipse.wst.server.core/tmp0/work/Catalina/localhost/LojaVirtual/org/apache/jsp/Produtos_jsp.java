/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2015-09-10 03:47:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Produtos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Produtos</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write(" <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write(" <title> Produtos</title>\r\n");
      out.write(" \r\n");
      out.write(" <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write(" <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"main\" class=\"container-fluid\"> \r\n");
      out.write("\r\n");
      out.write(" <h3 class=\"page-header\">Escolha seus produtos</h3>\r\n");
      out.write(" \r\n");
      out.write(" <div id=\"top\" class=\"row\">\r\n");
      out.write("    <div class=\"col-md-3\">\r\n");
      out.write("        <h2>Itens</h2>\r\n");
      out.write("    </div>\r\n");
      out.write(" \r\n");
      out.write("    <div class=\"col-md-6\">\r\n");
      out.write("        <div class=\"input-group h2\">\r\n");
      out.write("            <input name=\"data[search]\" class=\"form-control\" id=\"search\" type=\"text\" placeholder=\"Pesquisar Itens\">\r\n");
      out.write("            <span class=\"input-group-btn\">\r\n");
      out.write("                <button class=\"btn btn-primary\" type=\"submit\">\r\n");
      out.write("                    <span class=\"glyphicon glyphicon-search\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("            </span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write(" \r\n");
      out.write("    <div class=\"col-md-3\">\r\n");
      out.write("        <a href=\"add.html\" class=\"btn btn-primary pull-right h2\">Novo Item</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div> <!-- /#top -->               \r\n");
      out.write("\r\n");
      out.write("            <hr/>\r\n");
      out.write("                         <div id=\"list\" class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t <div class=\"table-responsive col-md-12\">\r\n");
      out.write("        <table class=\"table table-striped\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>ID</th>\r\n");
      out.write("                    <th>Descricao</th>\r\n");
      out.write("                    <th>Preco</th>\r\n");
      out.write("                    <th>Quantidade</th>\r\n");
      out.write("                    <th class=\"actions\">Ações</th>\r\n");
      out.write("                 </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write(" \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>1001</td>\r\n");
      out.write("                    <td>Camisa polo</td>\r\n");
      out.write("                    <td>R$50,00</td>\r\n");
      out.write("                    <td>01</td>\r\n");
      out.write("                    <td class=\"actions\">\r\n");
      out.write("                        <a class=\"btn btn-success btn-xs\" href=\"view.html\">Visualizar</a>\r\n");
      out.write("                        <a class=\"btn btn-warning btn-xs\" href=\"edit.html\">Editar</a>\r\n");
      out.write("                        <a class=\"btn btn-danger btn-xs\"  href=\"#\" data-toggle=\"modal\" data-target=\"#delete-modal\">Excluir</a>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write(" \r\n");
      out.write("            </tbody>\r\n");
      out.write("         </table>\r\n");
      out.write(" \r\n");
      out.write("     </div>\r\n");
      out.write("                                </div><!--#list-->\r\n");
      out.write("  \r\n");
      out.write("                         <div id=\"bottom\" class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"col-md-12\">\r\n");
      out.write("         \r\n");
      out.write("        <ul class=\"pagination\">\r\n");
      out.write("            <li class=\"disabled\"><a>&lt; Anterior</a></li>\r\n");
      out.write("            <li class=\"disabled\"><a>1</a></li>\r\n");
      out.write("            <li><a href=\"#\">2</a></li>\r\n");
      out.write("            <li><a href=\"#\">3</a></li>\r\n");
      out.write("            <li class=\"next\"><a href=\"#\" rel=\"next\">Próximo &gt;</a></li>\r\n");
      out.write("        </ul><!-- /.pagination -->\r\n");
      out.write(" \r\n");
      out.write("    </div>\r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("                          </div> <!--/bottom-->\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write(" </div>\r\n");
      out.write(" <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
