<%@page import="com.hackaboss.ejercicio1integrador.logica.Partido"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.hackaboss.ejercicio1integrador.logica.Equipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio Integrador JSP + JPA</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
        <div class="container mt-4">
            <h2>Formulario Equipo</h2>
            <form action="SvEquipo" method="POST">
                <div class="mb-3">
                    <label for="nombre" class="form-label">Nombre</label>
                    <input type="text" class="form-control" id="nombre" name="nombre">
                </div>
                <div class="mb-3">
                    <label for="ciudad" class="form-label">Ciudad</label>
                    <input type="text" class="form-control" id="ciudad" name="ciudad">
                </div>
                <button type="submit" class="btn btn-primary">Guardar</button>
                </form>
            
            <form action="SvEquipo" method="GET">
                <button type="submit" class="btn btn-success mt-4">Ver equipos</button>
            </form>
            
            <br>
            <br>
            
            <div class="results-table">
                <% if (request.getAttribute("listaConEquipos") != null) { %>
                <h3>Listado de Equipos</h3>
                <table class="table table-bordered">
                     <thead>
                        <tr>
                            <th scope="col">Nombre</th>
                            <th scope="col">Ciudad</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%for (Equipo equipo : (List<Equipo>) request.getAttribute("listaConEquipos")) { %>
                          <tr>
                              <td><%=equipo.getId() %></td>
                            <td><%=equipo.getNombre() %></td>
                            <td><%=equipo.getCiudad() %></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
                <% } %>
            </div>
       
            
            
            <!<!-- PARTIDO -->
            
          <h2>Formulario Partido</h2>
                 <form action="SvPartido" method="POST">
                <div class="mb-3">
                    <label for="fecha" class="form-label">Fecha</label>
                    <input type="date" class="form-control" id="fecha" name="fecha">
                </div>
                <div class="mb-3">
                    <label for="idEquipo1" class="form-label">Id Equipo 1</label>
                    <input type="text" class="form-control" id="idEquipo1" name="idEquipo1">
                </div>
                <div class="mb-3">
                    <label for="idEquipo2" class="form-label">Id Equipo 2</label>
                    <input type="text" class="form-control" id="idEquipo2" name="idEquipo2">
                </div>
                <div class="mb-3">
                    <label for="resultadoEquipo1" class="form-label">Resultado Equipo 1</label>
                    <input type="text" class="form-control" id="resultadoEquipo1" name="resultadoEquipo1">
                </div>
                  <div class="mb-3">
                    <label for="resultadoEquipo2" class="form-label">Resultado Equipo 2</label>
                    <input type="text" class="form-control" id="resultadoEquipo2" name="resultadoEquipo2">
                </div>
                <button type="submit" class="btn btn-primary">Guardar</button>
                </form>
            
            <form action="SvPartido" method="GET">
                <button type="submit" class="btn btn-success mt-4">Ver partidos</button>
            </form>
            
            <br>
            <br>
            
                  <div class="results-table">
                <% if (request.getAttribute("listaConPartidos") != null) { %>  
                <h3>Listado de Partidos</h3>
                <table class="table table-bordered">
                     <thead>
                        <tr>
                            <th scope="col">Fecha</th>
                            <th scope="col">Id Equipo 1</th>
                            <th scope="col">Id Equipo 2</th>
                            <th scope="col">Resultado Equipo 1</th>
                            <th scope="col">Resultado Equipo 2</th>
                        </tr>
                    </thead>
                    <tbody> 
                 <%for (Partido partido : (List<Partido>) request.getAttribute("listaConPartidos")) { %>  
                             <tr>
                            <td><%=partido.fechaFormateada2() %></td>
                            <td><%=partido.getEquipo1().getNombre() %></td>
                            <td><%=partido.getEquipo2().getNombre() %></td>
                            <td><%=partido.getResultadoEquipo1() %></td>
                            <td><%=partido.getResultadoEquipo2() %></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
                <% } %>
            </div> 
        </div> 
               
            
            </div>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
