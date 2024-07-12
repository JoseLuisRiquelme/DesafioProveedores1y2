<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<div class="container">    
<form action="DAO1Controller" method="post">
<div class="mb-3">
  <label for="name" class="form-label">Ingrese Nombre</label>
  <input type="text" class="form-control" id="name" name="name" >
  
   <label for="rut" class="form-label">Ingrese Rut</label>
  <input type="text" class="form-control" id="rut" name="rut" >
  
   <label for="address" class="form-label">Ingrese Direccion</label>
  <input type="text" class="form-control" id="address" name="address" >
  
   <label for="email" class="form-label">Ingrese correo</label>
  <input type="email" class="form-control" id="email" name="email" >
  
   <label for="phone" class="form-label">Ingrese Telefono</label>
  <input type="number" class="form-control" id="phone" name="phone" >
  
   <label for="contactName" class="form-label">Ingrese Contacto</label>
  <input type="text" class="form-control" id="contactName" name="contactName" >
  
   <label for="contactPhone" class="form-label">Ingrese Telefono Contacto</label>
  <input type="number" class="form-control" id="contactPhone" name="contactPhone" >
  
</div>
<div class="col-auto">
    <button type="submit" class="btn btn-primary mb-3">Agregar proveedor</button>
  </div>
</form>
</div>