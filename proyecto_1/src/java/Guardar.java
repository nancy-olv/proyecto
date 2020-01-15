/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaquee
 */
 import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*;

public class Guardar {
    



/** 
* Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods. 
* @param request servlet request 
* @param response servlet response
*/ 
protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException { 
response.setContentType("text/html;charset=UTF-8"); 
PrintWriter out = response.getWriter(); 
try { 
String nombre = request.getParameter("nombre"); 
String edad = request.getParameter("edad"); 
String direccion = request.getParameter("direccion"); 
String correo = request.getParameter("correo");

String consulta = "INSERT INTO usuarios (nombre, edad, direccion, correo) VALUES (‘" + nombre + "’,’" + edad + "’,’" + direccion + "’,’" + correo + "’)"; 
Conexiones.alta(consulta); 
out.println("<h2><center><br>Alta Registrada"); 
out.println("<br><br><a href=Listar>Ver Usuarios</a><br><br>"); 
out.println("<a href=Nuevo.jsp>Nuevo Usuario</a><br><br>"); 
} finally { 
out.close(); 
} 
}

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code."> 
/** 
* Handles the HTTP <code>GET</code> method. 
* @param request servlet request 
* @param response servlet response
*/ 
protected void doGet(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException { 
processRequest(request, response); 
}

/** 
* Handles the HTTP <code>POST</code> method. 
* @param request servlet request 
* @param response servlet response
*/ 
protected void doPost(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException { 
processRequest(request, response); 
}

/** 
* Returns a short description of the servlet. 
*/ 
public String getServletInfo() { 
return "Short description"; 
}// </editor-fold>

}



