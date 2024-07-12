package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dto.ProveedorDAOImpl;
import model.Proveedor;
import dto.ProveedorDAO;


@WebServlet("/ProveedorDetailsController")
public class ProveedorDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ProveedorDetailsController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("op");
		String strID= request.getParameter("id");
		int id =0;
		ProveedorDAO pDAO = new ProveedorDAOImpl();
		
		if(strID!=null) {
			id = Integer.parseInt(strID);
		}
		
		if (id>0 && op==null) {
			
			
			Proveedor p = pDAO.read(id);
			request.setAttribute("proveedor", p);
			
			getServletContext().getRequestDispatcher("/views/proveedorDetails.jsp").forward(request,response);
		}else if(id==0 && op==null) {
			getServletContext().getRequestDispatcher("/views/proveedorDetails.jsp").forward(request,response);
		}else if(op.equalsIgnoreCase("del") && id>0) {
	
			pDAO.delete(id);
			response.sendRedirect(request.getContextPath()+"/");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strId = request.getParameter("id");
		String name = request.getParameter("name");
		String rut = request.getParameter("rut");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String contact = request.getParameter("contact");
		String contactphone = request.getParameter("contactphone");
		
		Proveedor p= null;
		
		ProveedorDAO pDAO = new ProveedorDAOImpl();
		
		if(!strId.isEmpty()) {
			int id = Integer.parseInt(strId);
			
			p= new Proveedor(id,name,rut,address,email,phone,contact,contactphone);
			
			System.out.print(p.toString());
			
			pDAO.update(p);
		}else if(strId.isEmpty()) {
			
			p= new Proveedor(name,rut,address,email,phone,contact,contactphone);
			pDAO.create(p);
		}
		
		response.sendRedirect(request.getContextPath()+"/");
	}

}
