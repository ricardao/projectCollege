/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2015-09-10 03:47:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cadastro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Cadastro de Clientes</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" <div id=\"main\" class=\"container-fluid\">\r\n");
      out.write("  \r\n");
      out.write("  <h3 class=\"page-header\">Cadastre-se</h3>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("<form method=\"post\" action=\"controllerDao\">\r\n");
      out.write("  \t<div class=\"row\">\r\n");
      out.write("  \t  <div class=\"form-group col-md-4\">\r\n");
      out.write("  \t  \t<label for=\"exampleInputEmail1\">Email</label>\r\n");
      out.write("  \t  \t<input type=\"email\"  name=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Qual seu email?\">\r\n");
      out.write("  \t  </div>\r\n");
      out.write("\t  <div class=\"form-group col-md-4\">\r\n");
      out.write("  \t  \t<label for=\"exampleInputEmail1\">Nome</label>\r\n");
      out.write("  \t  \t<input type=\"text\"  name=\"nome\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Qual seu nome?\">\r\n");
      out.write("  \t  </div>\r\n");
      out.write("\t \r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("  \t  <div class=\"form-group col-md-3\">\r\n");
      out.write("  \t  \t<label for=\"exampleInputEmail1\">Rua</label>\r\n");
      out.write("  \t  \t<input type=\"text\" name=\"rua\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Onde voce mora?\">\r\n");
      out.write("  \t  </div>\r\n");
      out.write("\t  <div class=\"form-group col-md-3\">\r\n");
      out.write("  \t  \t<label for=\"exampleInputEmail1\">Bairro</label>\r\n");
      out.write("  \t  \t<input type=\"text\"  name=\"bairro\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Qual o seu bairro?\">\r\n");
      out.write("  \t  </div>\r\n");
      out.write("\t  <div class=\"form-group col-md-3\">\r\n");
      out.write("  \t  \t<label for=\"exampleInputEmail1\">Complemento</label>\r\n");
      out.write("  \t  \t<input type=\"text\"  name=\"complemento\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Seu endereco possui complemento?\">\r\n");
      out.write("  \t  </div>\r\n");
      out.write("\t  <div class=\"form-group col-md-3\">\r\n");
      out.write("  \t  \t<label for=\"exampleInputEmail1\">Numero</label>\r\n");
      out.write("  \t  \t<input type=\"text\"  name=\"numero\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Numero de sua residencia\">\r\n");
      out.write("  \t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("  \t  <div class=\"form-group col-md-2\">\r\n");
      out.write("  \t  \t<label for=\"exampleInputEmail1\">Cep</label>\r\n");
      out.write("  \t  \t<input type=\"text\" name=\"cep\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Qual seu cep?\">\r\n");
      out.write("  \t  </div>\r\n");
      out.write("\t  <div class=\"form-group col-md-2\">\r\n");
      out.write("  \t  \t<label for=\"exampleInputEmail1\">Telefone</label>\r\n");
      out.write("  \t  \t<input type=\"text\" name=\"telefone\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Qual seu telefone?\">\r\n");
      out.write("  \t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("  \t  <div class=\"form-group col-md-3\">\r\n");
      out.write("  \t  \t<label for=\"exampleInputEmail1\">Crie sua senha</label>\r\n");
      out.write("  \t  \t<input type=\"password\" name=\"senha\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Digite sua senha\">\r\n");
      out.write("  \t  </div>\r\n");
      out.write("\t  <div class=\"form-group col-md-3\">\r\n");
      out.write("  \t  \t<label for=\"exampleInputEmail1\">Confirme sua senha</label>\r\n");
      out.write("  \t  \t<input type=\"password\" name=\"ConfSenha\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Confirme senha criada\">\r\n");
      out.write("  \t  </div>\r\n");
      out.write("\t \r\n");
      out.write("\t  \r\n");
      out.write("</div>\r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t  \r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<hr />\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t  <div class=\"col-md-12\">\r\n");
      out.write("\t  \t<button type=\"submit\"  name=\"Gravar\" class=\"btn btn-primary\">Salvar</button>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<button  type=\"reset\"value=\"Reset\" class=\"btn\">Limpar</button>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write(" </form>\r\n");
      out.write("\r\n");
      out.write(" <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write(" <script src=\"js/bootstrap.min.js\"></script>\r\n");
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
