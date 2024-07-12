package dto;

import java.util.List;

import model.Proveedor;

public interface ProveedorDAO {
	
	/*CRUD*/
	
	 void create(Proveedor p); 
	
	 List<Proveedor> read(); 
	
	 Proveedor read(int id);
	
	 void update(Proveedor p);
	
	 void delete(int id);

}
