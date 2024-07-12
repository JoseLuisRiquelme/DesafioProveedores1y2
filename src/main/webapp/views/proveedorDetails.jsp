<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ include file="../head.jsp" %>
<body>

<div  class="container">

<h1>Proveedor</h1>
<form class="form" method="post" action="ProveedorDetailsController">
<input type="hidden" id="id" name="id" value="${proveedor.getId()}">
<div class="row">
<div  class="col">
<label  for="name" class="form-label">Nombre:</label>
<input type="text" class="from-control" id="name" name="name"
value="${proveedor.getNombre()}">
</div>
</div>
<div class="row">
<div  class="col">
<label  for="rut" class="form-label">Rut:</label>
<input type="text" class="from-control" id="rut" name="rut"
value="${proveedor.getRut()}">
</div>
</div>
<div class="row">
<div  class="col">
<label  for="address" class="form-label">Direccion:</label>
<input type="text" class="from-control" id="address" name="address"
value="${proveedor.getDireccion()}">
</div>
</div>
<div class="row">
<div  class="col">
<label  for="email" class="form-label">Correo:</label>
<input type="text" class="from-control" id="email" name="email"
value="${proveedor.getCorreo()}">
</div>
</div>
<div class="row">
<div  class="col">
<label  for="phone" class="form-label">Telefono:</label>
<input type="tel" class="from-control" id="phone" name="phone"
value="${proveedor.getTelefono()}">
</div>
</div>
<div class="row">
<div  class="col">
<label  for="contact" class="form-label">Contacto:</label>
<input type="text" class="from-control" id="contact" name="contact"
value="${proveedor.getContacto()}">
</div>
</div>
<div class="row">
<div  class="col">
<label  for="contactphone" class="form-label">Telefono Contacto:</label>
<input type="text" class="from-control" id="contactphone" name="contactphone"
value="${proveedor.getTelefonoContacto()}">
</div>
</div>
<div class="row">
<div class="col pt-4">
<button type="submit" class="btn btn-primary">
<i class="fa-solid fa-floppy-disk">Guarda</i></button>
</div>
</div>
</form>
</div>
<%@ include file="../footer.jsp" %>
</body>
</html>