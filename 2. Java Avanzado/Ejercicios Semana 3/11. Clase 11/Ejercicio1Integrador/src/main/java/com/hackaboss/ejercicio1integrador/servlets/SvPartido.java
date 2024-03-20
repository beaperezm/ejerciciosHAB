package com.hackaboss.ejercicio1integrador.servlets;

import com.hackaboss.ejercicio1integrador.logica.Controladora;
import com.hackaboss.ejercicio1integrador.logica.Partido;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvPartido", urlPatterns = {"/SvPartido"})
public class SvPartido extends HttpServlet {
    
    Controladora control = new Controladora();
    List<Partido> listadoPartidos = new ArrayList<>();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        
        
        listadoPartidos = control.traerPartidos();
        request.setAttribute("listaConPartidos", this.listadoPartidos);
        
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        
        String fecha = request.getParameter("fecha");
        String idEquipo1 = request.getParameter("idEquipo1");
        String idEquipo2 = request.getParameter("idEquipo2");
        String resultadoEquipo1 = request.getParameter("resultadoEquipo1");
        String resultadoEquipo2 = request.getParameter("resultadoEquipo2");
 
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
            Date fecha2 = sdf.parse(fecha);
            Partido partido = new Partido();
            partido.setFecha(fecha2);
            partido.setResultadoEquipo1(Integer.parseInt(resultadoEquipo1));
            partido.setResultadoEquipo2(Integer.parseInt(resultadoEquipo2));
            
            control.crearPartido(partido, Integer.parseInt(idEquipo1), Integer.parseInt(idEquipo2));
            
           request.getRequestDispatcher("index.jsp").forward(request, response);
           response.sendRedirect("index.jsp");
        } catch(ParseException e) {
            Logger.getLogger(SvPartido.class.getName()).log(Level.SEVERE, null, e);
        }
       
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
