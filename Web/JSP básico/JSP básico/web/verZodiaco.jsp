<%@page import="java.io.IOException"%>
<%@page import="java.sql.Date"%>
<%@page import="Clases.JspCalendar"%>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>TuZodiaco/resultados</title>
        <link rel="stylesheet" type="text/css" href="estilos/estilo.css">
        <link rel="shortcut icon" href="foto/favicon.png">
    </head>
    <body>
        <h1>Detalles del Zodiaco</h1>

        <article>
            <section>
                <%
                    // Obtén el nombre y la fecha de nacimiento de los parámetros enviados por el formulario
                    String fechaNacimientoStr = request.getParameter("fechaNacimiento");

                    // Parsea la fecha en formato "yyyy-MM-dd"
                    Date fechaNacimiento = Date.valueOf(fechaNacimientoStr);

                    JspCalendar Calendar = new JspCalendar(fechaNacimiento);

                    //Calcula la edad y el signo del zodiaco
                    int edad = Calendar.calcularEdad();
                    String signoZodiaco = Calendar.obtenerSignoZodiaco();
                %>

                <p>Edad: <%= edad %></p>
                <p>Signo del Zodiaco: <%= signoZodiaco %></p>
            </section>
        </article>
        <p><a href='index.html'>Volver atrás</a></p>
    </body>
</html>
