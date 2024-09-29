package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.IOException;
import java.sql.Date;
import java.util.List;
import java.util.ArrayList;
import fecha.Book;

public final class tabla_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Tabla de Libros</title>\n");
      out.write("    <style>\n");
      out.write("        table {\n");
      out.write("          width: 100%;\n");
      out.write("          border-collapse: collapse;\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("          padding: 8px;\n");
      out.write("          text-align: left;\n");
      out.write("          border-bottom: 1px solid #ddd;\n");
      out.write("        }\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("          background-color: #f2f2f2;\n");
      out.write("        }\n");
      out.write("        tr:hover {\n");
      out.write("          background-color: #ddd;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <h2>Tabla de Libros</h2>\n");
      out.write("\n");
      out.write("    <table>\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("              <th>Número</th>\n");
      out.write("              <th>Título del Libro</th>\n");
      out.write("              <th>Género</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            ");

                // Definir una lista de libros
                List<Book> books = new ArrayList<>();
                books.add(new Book("El Señor de los Anillos", "Fantasía"));
                books.add(new Book("El Hobbit", "Fantasía"));
                books.add(new Book("El Camino de los Reyes", "Fantasía"));
                books.add(new Book("El Visitante", "Misterio"));
                books.add(new Book("La Paciente Silenciosa", "Misterio"));

                // Mostrar cada libro en una fila de la tabla
                int rowNum = 1;
                for (Book book : books) {
            
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( rowNum++ );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( book.getTitle() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( book.getGenre() );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
