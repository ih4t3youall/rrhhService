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

	<header role="banner" id="top"
		class="navbar navbar-static-top bs-docs-nav">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="../">rrhhService - Panel
					Administrador</a>
			</div>
		</div>
	</header>

	<div class="row">
		<div class="col-md-4 col-md-offset-4">

			<form:form method="post" name="farm" id="crearUsuario"
				action="admCrearEmpleado.htm" modelAttribute="usuarioDTO">
				<div class="input-control text full-size">
					<form:input type="text" path="username" id="username" />
					<form:input type="text" path="password" id="password" />
					<form:input type="text" path="legajo" id="legajo" />
					<form:input type="text" path="cargo" id="cargo" />
					<form:input type="text" path="subCargo" id="subCargo" />
<%-- 					<form:input type="text" path="fechaNacimiento" id="fechaNacimiento" /> --%>
					<form:input type="text" path="direccion" id="direccion" />
					<form:input type="text" path="telefono" id="telefono" />
					<form:input type="text" path="celular" id="celular" />
					<input type="button" onclick="$('#crearUsuario').submit();" value="agregar granja" />
				</div>
			</form:form>


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



