package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.IOException;
import java.sql.Date;
import fecha.JspCalendar;

public final class verZodiaco_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=windows-1252");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Detalles del Zodiaco</h1>\n");
      out.write("\n");
      out.write("        ");

            // Obtén el nombre y la fecha de nacimiento de los parámetros enviados por el formulario
            String nombre = request.getParameter("nombre");
            Date fechaNacimiento = Date.valueOf(request.getParameter("fechaNacimiento"));

            // Calcula la edad y el signo del zodiaco
            int edad = JspCalendar.calcularEdad(fechaNacimiento);
            String signoZodiaco = JspCalendar.obtenerSignoZodiaco(fechaNacimiento);
        
      out.write("\n");
      out.write("\n");
      out.write("        <p>Nombre: ");
      out.print( nombre );
      out.write("</p>\n");
      out.write("        <p>Edad: ");
      out.print( edad );
      out.write("</p>\n");
      out.write("        <p>Signo del Zodiaco: ");
      out.print( signoZodiaco );
      out.write("</p>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            String redirectURL = "otraPagina.jsp"; // Reemplaza con la URL de destino
            response.sendRedirect(redirectURL);
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
