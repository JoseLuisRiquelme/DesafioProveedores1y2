package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dto.ProveedorDAO;
import dto.ProveedorDAOImpl;
import model.Proveedor;


@WebServlet("/")
public class DAO1Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DAO1Controller() {
        super();
        
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	ProveedorDAOImpl pDAO = new ProveedorDAOImpl();
    	List<Proveedor> proveedores = pDAO.read();
    	request.setAttribute("proveedores",proveedores);
    	
    	
    	getServletContext().getRequestDispatcher("/views/proveedores.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	
	
	

}
