
import javax.swing.*;
import java.sql.*;
import org.postgresql.Driver;

public class Conexiones {
    static Connection conexion;
static Statement sentencia;
public ResultSet resultado;

public static void conecta() {
try {
Class.forName("org.postgresql.Driver");
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "No se pudo cargar el puente JDBC-ODBC.");
return;
}
try {
conexion = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/prueba", "postgres", "mari");
sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//JOptionPane.showMessageDialog(null, "Conexión establecida");
} catch (Exception er) {
JOptionPane.showMessageDialog(null, "Error de conexion");
}
}

public static void alta(String cadena) {
if (conexion == null) {
conecta();
}
try {
sentencia.execute(cadena);
} catch (Exception er) {
JOptionPane.showMessageDialog(null, "Lo sentimos su operación solicitada no se pudo realizar debido a un error de " + er);
}
}

}





    


