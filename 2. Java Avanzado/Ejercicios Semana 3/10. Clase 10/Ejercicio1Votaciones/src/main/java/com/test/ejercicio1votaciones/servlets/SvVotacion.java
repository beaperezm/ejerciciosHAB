package com.test.ejercicio1votaciones.servlets;

import com.test.ejercicio1votaciones.logica.Controladora;
import com.test.ejercicio1votaciones.logica.Voto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvVotacion", urlPatterns = {"/SvVotacion"})
public class SvVotacion extends HttpServlet {
    
    Controladora control = new Controladora();
    List<Voto> listadoVotos = new ArrayList<>();
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    
        listadoVotos = control.traerVotos();

        request.setAttribute("listadoVotos", this.listadoVotos);
   
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String partido = request.getParameter("partido");
        
        Voto voto = new Voto();
        voto.setPartido(partido);
        
        control.crearVotos(voto);
  
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
