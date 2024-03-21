<%@page import="com.test.ejercicio1votaciones.logica.Voto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Votaciones</title>
       <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
        <div class=" container mt-4">
            <h2>Votación</h2>
            <p>Elija su voto:</p>
            <form action="SvVotacion" method="POST">
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="partido" id="flexRadioDefault1" value="partidoA">
                    <label class="form-check-label" for="flexRadioDefault1">
                        Partido A
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="partido" id="flexRadioDefault2" value="partidoB">
                    <label class="form-check-label" for="flexRadioDefault2">
                        Partido B
                    </label>
                </div>
                 <div class="form-check">
                    <input class="form-check-input" type="radio" name="partido" id="flexRadioDefault3" value="partidoC">
                    <label class="form-check-label" for="flexRadioDefault3">
                        Partido C
                    </label>
                </div>
                <button type="submit" class="btn btn-primary mt-2">Votar</button>
            </form>
        
            <form action="SvVotacion" method="GET">
                <button type="submit" class="btn btn-success mt-4 mr-5">Mostrar Resultados</button>
            </form>
            
            <!-- Mostrar resultados en una tabla -->
            <div class="results-table">
                <% if(request.getAttribute("listadoVotos") != null) { 
                    List<Voto> listadoV = (List) request.getAttribute("listadoVotos"); 
                    int contA = 0;
                    int contB = 0;
                    int contC = 0;
                   for (Voto v : listadoV) {
                        if(v.getPartido().equals("partidoA")) {
                            contA++;
                        } 
                        if (v.getPartido().equals("partidoB")) {
                             contB++;
                        }
                        if(v.getPartido().equals("partidoC")) {
                            contC++;
                        } 
                    } 

                 %>
                
                <h3>Resultados</h3>
                <table class="table">
                    <thread>
                        <tr>
                            <th>Nombre Partido</th>
                            <th>Cantidad Votos</th>
                        </tr>
                    </thread>
                    <tbody>
                        <tr>
                            <th>Partido A</th>
                            <td> <%=contA %></td>
                             
                        </tr>
                        <tr>
                            <th>Partido B</th>
                            <td><%=contB %></td>
                        </tr>
                         <tr>
                            <th>Partido C</th>
                            <td><%=contC %></td>
                        </tr>
                    </tbody>   
                </table>
               <% } %>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
