package dto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import connection.Conexion;
import model.Proveedor;

public class ProveedorDAOImpl implements ProveedorDAO {

	// DAO ( Data Access Object)

	Proveedor proveedor = new Proveedor();

	public void create(Proveedor p) {
		
		try {
			// 1.-Create connection and assign it to our Conexion class created earlier
			Connection c = Conexion.getCon();

			// 2.-Create a statement and assign it to our connection
			Statement s = c.createStatement();

			// 3.-Create "hard coding" our query
			String query = "insert into proveedores (nombre,rut,direccion,correo,telefono,contacto,telefono_contacto) values ('"
					+ p.getNombre() + "','" + p.getRut()+ "','" + p.getDireccion() + "','" + p.getCorreo() + "','" + p.getTelefono() + "','"
					+ p.getContacto() + "','" + p.getTelefonoContacto() + "')";
			// 4.-Instantiate ResultSet and assign it our query through out method
			// executeQuery()
			 s.execute(query);

			/*if (resultado == 1) {
				System.out.println("Insercion correcta de proveedor");
			} else {
				System.out.println("Error al insertar el proveedor");
			}*/

		} catch (SQLException e) {
			System.out.println("ERROR en metodo create");
			e.printStackTrace();
		}
	}

	public void update(Proveedor p) {
	
		try {
			// 1.-Create connection and assign it to our Conexion class created earlier
			Connection c = Conexion.getCon();

			// 2.-Create a statement and assign it to our connection
			Statement s = c.createStatement();

			// 3.-Create "hard coding" our query
			String query = "update proveedores set nombre='" + p.getNombre() + "', rut='" + p.getRut()
					+ "', direccion='" + p.getDireccion() + "', correo='" + p.getCorreo() + "', telefono='"
					+ p.getTelefono() + "', contacto='" + p.getContacto() + "', telefono_contacto='" + p.getTelefonoContacto()
					+ "'where id =" + p.getId();
			// 4.-Instantiate ResultSet and assign it our query through out method
			// executeQuery()
			 s.execute(query);


		} catch (SQLException e) {
			System.out.println("ERROR en metodo read");
			e.printStackTrace();
		}
	}

	public List<Proveedor> read() {
		List<Proveedor> proveedores = new ArrayList<>();

		try {
			// 1.-Create connection and assign it to our Conexion class created earlier
			Connection c = Conexion.getCon();

			// 2.-Create a statement and assign it to our connection
			Statement s = c.createStatement();

			// 3.-Create "hard coding" our query
			String query = "select id,nombre,rut,direccion,correo,telefono,contacto,telefono_contacto from proveedores";
			// 4.-Instantiate ResultSet and assign it our query through out method
			// executeQuery()
			ResultSet rs = s.executeQuery(query);
			// 5.-Through a while or other java loop iterate through ResultSet "rs"
			while (rs.next()) {
				// Create a proveedor object
				Proveedor p = new Proveedor();
				// set the proveedor parameters
				p.setId(rs.getInt("id"));
				p.setNombre(rs.getString("nombre"));
				p.setRut(rs.getString("rut"));
				p.setDireccion(rs.getString("direccion"));
				p.setCorreo(rs.getString("correo"));
				p.setTelefono(rs.getString("telefono"));
				p.setContacto(rs.getString("contacto"));
				p.setTelefonoContacto(rs.getString("telefono_contacto"));
				// adding the actor to the list
				proveedores.add(p);
			}
		} catch (SQLException e) {
			System.out.println("ERROR en metodo read");
			e.printStackTrace();
		}
		return proveedores;
	}

	public Proveedor read(int id) {
		// Create a proveedor object
		Proveedor p = new Proveedor();
		try {
			// 1.-Create connection and assign it to our Conexion class created earlier
			Connection c = Conexion.getCon();

			// 2.-Create a statement and assign it to our connection
			Statement s = c.createStatement();

			// 3.-Create "hard coding" our query
			String query = "select id,nombre,rut,direccion,correo,telefono,contacto,telefono_contacto from proveedores where id="
					+ id;
			// 4.-Instantiate ResultSet and assign it our query through out method
			// executeQuery()
			ResultSet rs = s.executeQuery(query);
			// 5.-Through a while or other java loop iterate through ResultSet "rs"
			while (rs.next()) {

				// set the proveedor parameters
				p.setId(rs.getInt("id"));
				p.setNombre(rs.getString("nombre"));
				p.setRut(rs.getString("rut"));
				p.setDireccion(rs.getString("direccion"));
				p.setCorreo(rs.getString("correo"));
				p.setTelefono(rs.getString("telefono"));
				p.setContacto(rs.getString("contacto"));
				p.setTelefonoContacto(rs.getString("telefono_contacto"));

				return p;
			}
		} catch (SQLException e) {
			System.out.println("ERROR en metodo read");
			e.printStackTrace();
		}

		return p;
	}

	public void delete(int id) {
		int resultado = 0;
		String query = "delete from proveedores where  id =" + id;
		try {
			Connection c = Conexion.getCon();
			Statement s = c.createStatement();
			 s.execute(query);
		
			}
		 catch (Exception e) {
			System.out.println("Error al eliminar el proveedor " + e);
		}


	}

}
