<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<script src="resources/jquery/jquery-1.11.3.min.js"></script>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="resources/bootstrap-3.3.5-dist/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="resources/bootstrap-3.3.5-dist/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="resources/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
</head>
<body>

	<jsp:include page="../commons/headerAdmin.jsp" />
	<c:if test="${not empty exito}">
		<p>Usuario creado con exito</p>
	</c:if>

	<div class="row">
		<div class="col-md-4 col-md-offset-4">

			<form:form method="post" name="farm" id="crearUsuario"
				action="admCrearEmpleado.htm" modelAttribute="usuarioDTO">
				<div class="input-control text full-size">

					<div class="form-group">
						<label for="exampleInputEmail1">Nombre Usuario</label>
						<form:input type="text" path="username" id="username"  class="form-control" placeholder="Usuario" /> 
					</div>
										<div class="form-group">
						<label for="exampleInputEmail1">Password</label>
						<form:input type="password" path="password" id="password"  class="form-control" placeholder="Password" /> 
					</div>
					</div>
										<div class="form-group">
						<label for="exampleInputEmail1">legajo</label>
						<form:input type="text" path="legajo" id="legajo"  class="form-control" placeholder="Legajo" /> 
					</div>					
					
										<div class="form-group">
						<label for="exampleInputEmail1">Cargo</label>
						<form:input type="text" path="cargo" id="cargo"  class="form-control" placeholder="Cargo" /> 
					</div>
								<div class="form-group">
						<label for="exampleInputEmail1">Sub Cargo</label>
						<form:input type="text" path="subCargo" id="subCargo"  class="form-control" placeholder="subCargo" /> 
					</div>
<!-- 						<div class="form-group"> -->
<!-- 						<label for="exampleInputEmail1">Fecha nacimiento</label> -->
<%-- 						<form:input type="text" path="fechaNacimiento" id="fechaNacimiento"  class="form-control" placeholder="fechaNacimiento" />  --%>
<!-- 					</div> -->
						<div class="form-group">
						<label for="exampleInputEmail1">Direccion</label>
						<form:input type="text" path="direccion" id="direccion"  class="form-control" placeholder="direccion" /> 
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">Ttelefono</label>
						<form:input type="text" path="telefono" id="telefono"  class="form-control" placeholder="telefono" /> 
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">Celular</label>
						<form:input type="text" path="celular" id="celular"  class="form-control" placeholder="celular" /> 
					</div>
					<button class="btn btn-default" onclick="$('#crearUsuario').submit();" type="submit">Crear Empleado</button>
				</div>
			</form:form>
</div>

			<%-- 			<form:form method="post" name="farm" id="crearUsuario" --%>
			<%-- 				action="admCrearEmpleado.htm" modelAttribute="usuarioDTO"> --%>



			<%-- 			<form:input type="text" path="username" id="username" /> --%>
			<%-- 			<form:input type="text" path="password" id="password" /> --%>
			<%-- 			<form:input type="text" path="legajo" id="legajo" /> --%>
			<%-- 			<form:input type="text" path="cargo" id="cargo" /> --%>
			<%-- 			<form:input type="text" path="subCargo" id="subCargo" /> --%>
			<%-- 			<form:input type="text" path="fechaNacimiento" id="fechaNacimiento" /> --%>
			<%-- 			<form:input type="text" path="direccion" id="direccion" /> --%>
			<%-- 			<form:input type="text" path="telefono" id="telefono" /> --%>
			<%-- 			<form:input type="text" path="celular" id="celular" /> --%>



			<%-- 			</form:form> --%>
		</div>
	</div>
</body>
</html>



