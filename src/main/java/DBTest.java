import java.sql.Connection;

import connection.Conexion;

public class DBTest {
	public static void main(String[] args) {
        Connection con = Conexion.getCon();
        if (con != null) {
            System.out.println("Conexión exitosa");
        } else {
            System.out.println("Error al establecer la conexión");
        }
    }

}
