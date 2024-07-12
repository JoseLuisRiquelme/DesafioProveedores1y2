<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="../head.jsp" %>

<div class="container">
<%@ include file="../nav.jsp" %>
<main>
<div class="container">
<h1>Listado de proveedores disponibles:</h1>
<a href="${pageContext.request.contextPath }/ProveedorDetailsController" class="btn btn-primary">Agregar nuevo Proveedor</a></div>
	<table class="table table-bordered border-primary" id="tblActor">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nombre</th>
				<th>Rut</th>
				<th>Direccion</th>
				<th>Correo</th>
				<th>Telefono</th>
				<th>Contacto</th>
				<th>Telefono Contacto</th>
				<th>Accion</th>
			</tr>
		</thead>
		<tbody>
		<!-- use forEach from taglib to iterate through out the proveedores list -->
			<c:forEach var="p" items="${proveedores}">
			<!-- forEach needs 2 parameters: var and items -->
				<tr>
					<th><c:out value="${p.getId()}"></c:out></th>
					<td><c:out value="${p.getNombre()}"></c:out></td>
					<td><c:out value="${p.getRut()}"></c:out></td>
					<td><c:out value="${p.getDireccion()}"></c:out></td>
					<td><c:out value="${p.getCorreo()}"></c:out></td>
					<td><c:out value="${p.getTelefono()}"></c:out></td>
					<td><c:out value="${p.getContacto()}"></c:out></td>
					<td><c:out value="${p.getTelefonoContacto()}"></c:out></td>
					<td>
					<a href="${pageContext.request.contextPath }/ProveedorDetailsController?id=${p.getId()}" class =  "btn btn-secondary">
					<i class="fa-regular fa-pen-to-square"></i>
					</a>
					<a href="${pageContext.request.contextPath }/ProveedorDetailsController?id=${p.getId()}&op=del" class =  "btn btn-danger">
					<i class="fa-solid fa-trash-can"></i>
					</a>
					</td>
					
				</tr>

			</c:forEach>


		</tbody>
	</table>
</main>
<%@ include file="../footer.jsp" %>
</div>