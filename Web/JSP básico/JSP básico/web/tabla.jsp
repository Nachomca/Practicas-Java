<%@page import="java.io.IOException"%>
<%@page import="java.sql.Date"%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@page import="Clases.Libro"%>
<%@page contentType="text/html" pageEncoding="windows-1252"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TuZodiaco/Tabla de Libros</title>
    <link rel="stylesheet" type="text/css" href="estilos/estilo.css">
    <link rel="shortcut icon" href="foto/favicon.png">
</head>
<body>

    <h2>Una tabla de Libros que te pueden interesar</h2>

    <table>
        <thead>
            <tr>
                <th>Nombre</th>
                <th>Género</th>
                <th>Número de Páginas</th>
                <th>Portada</th>
                <th>Fecha de Publicación</th>
            </tr>
        </thead>
        <tbody>
            <%
                Map<Integer, Libro> libros = Libro.obtenerLibros();
                request.setAttribute("libros", libros);
            %>
            <% for (Map.Entry<Integer, Libro> entry : libros.entrySet()) {%>
                <tr>
                    <td><%= entry.getValue().getNombre()%></td>
                    <td><%= entry.getValue().getGrupo()%></td>
                    <td><%= entry.getValue().getNumeroPaginas()%></td>
                    <td><img src="<%= entry.getValue().getImagen()%>" alt="Portada"></td>
                    <td><%= entry.getValue().getFechaPublicacion()%></td>
                </tr>
            <% }%>
        </tbody>
    </table>
    <p><a href='index.html'>Volver atrás</a></p>
</body>
</html>