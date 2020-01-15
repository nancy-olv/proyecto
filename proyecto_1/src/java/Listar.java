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
import java.sql.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
import javax.swing.*;
public class Listar {
    static Connection conexion=null; 
static Statement sentencia=null; 
static ResultSet rs=null; 

protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException { 
response.setContentType("text/html;charset=UTF-8"); 
PrintWriter out = response.getWriter(); 
try { 
Class.forName( " org.postgresql.Driver ").newInstance(); 
JOptionPane.showMessageDialog(null,"No se pudo cargar el puente JDBC-ODBC." ); 
//return; 
conexion = Conexiones.conexion; 
sentencia = Conexiones.conexion.createStatement(); 
JOptionPane.showMessageDialog(null,"Conexion establecida"); 
} catch(Exception er){ 
//JOptionPane.showMessageDialog(null,"Error de conexion" ); 
} try 
{ 
String consulta="select * from usuarios"; 
rs = Conexiones.sentencia.executeQuery(consulta); 
while(rs.next()){ 
out.println(rs.getString("nombre")); 
out.println(rs.getString("edad")); 
out.println(rs.getString("direccion")); 
out.println(rs.getString("correo")); 
out.println("<br><hr>"); 
} 
out.println("<a href=Nuevo.jsp>Agregar Nuevo</a>"); 
} catch(Exception er){ 
//JOptionPane.showMessageDialog(null,"Error de conexion" ); 
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
    
    
    
   

    


    
    
