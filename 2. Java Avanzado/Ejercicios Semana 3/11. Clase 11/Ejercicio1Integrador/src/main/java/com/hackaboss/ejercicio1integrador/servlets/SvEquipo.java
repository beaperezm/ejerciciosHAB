package com.hackaboss.ejercicio1integrador.servlets;

import com.hackaboss.ejercicio1integrador.logica.Controladora;
import com.hackaboss.ejercicio1integrador.logica.Equipo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvEquipo", urlPatterns = {"/SvEquipo"})
public class SvEquipo extends HttpServlet {
    
    Controladora control = new Controladora();
    List<Equipo> listadoEquipos = new ArrayList<>();
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
        listadoEquipos = control.traerEquipos();
        request.setAttribute("listaConEquipos", this.listadoEquipos);
        
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        processRequest(request, response);
        
        String id = request.getParameter("id");
        String nombre = request.getParameter("nombre");
        String ciudad = request.getParameter("ciudad");
        
        Equipo equipo = new Equipo();
        equipo.setId(Integer.parseInt(id));
        equipo.setNombre(nombre);
        equipo.setCiudad(ciudad);
        
        control.crearEquipo(equipo);
        
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
