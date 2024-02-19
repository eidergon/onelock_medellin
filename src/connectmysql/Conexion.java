package connectmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Metodo de conexion 
 * @author EiderAndrésGonzálezS
 */
public class Conexion {
    
    /**
     * Especificamos la direción, el usurio y contraseña de la dase de datos
     * para realiazar la conexión.
     */
    String url = "jdbc:mysql://10.206.69.198:12125/Onecontact";
    String user = "mysqldb";
    String password = "Colombia2025=";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;

    public Conexion(){}
    
    /**
     *  Validados que los datos sean correctos para realizar la conexion.
     * @return 
     */
    public Connection conectar(){
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex); // Nos indica la causa de la no conexión.
        }
        return cx;
    }
    
    public static void main(String[] args){
        Conexion conexion = new Conexion();
        conexion.conectar();
    }
}
