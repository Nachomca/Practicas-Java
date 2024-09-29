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
    <title>TuZodiaco/Lista de Libros</title>
    <link rel="stylesheet" type="text/css" href="estilos/estilo.css">
    <link rel="shortcut icon" href="foto/favicon.png">
</head>
<body>

    <h2>Lista de Libros</h2>

    <%
    Map<Integer, Libro> libros = Libro.obtenerLibros();
    request.setAttribute("libros", libros);
%>
        <div class="lista-libros">
            <% for (Map.Entry<Integer, Libro> entry : libros.entrySet()) {%>
                <article>
                    <section class="listado">
                        <h3>Nombre: <%= entry.getValue().getNombre()%></h3>
                        <p><strong>Grupo:</strong> <%= entry.getValue().getGrupo()%></p>
                        <p><strong>Número de Páginas:</strong> <%= entry.getValue().getNumeroPaginas()%></p>
                        <img src="<%= entry.getValue().getImagen()%>" alt="Portada">
                        <p><strong>Fecha de Publicación:</strong> <%= entry.getValue().getFechaPublicacion()%></p>
                    </section>
                </article>
            <% }%>
        </div>
        <p><a href='index.html'>Volver atrás</a></p>
</body>
</html>
