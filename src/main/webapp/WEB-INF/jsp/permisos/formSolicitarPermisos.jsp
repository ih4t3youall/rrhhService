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

<!-- 	datepicker -->
<link rel="stylesheet"
	href="resources/bootstrap-3.3.5-dist/plugins/datepicker/datepicker.css">
	<script src="resources/bootstrap-3.3.5-dist/plugins/datepicker/bootstrap-datepicker.js"></script>
<!-- fin datepicker -->


<script type="text/javascript">
	$(document).ready(function() {

		$('.fecha').datepicker();
	});
</script>

</head>
<body>
	<form:form method="post" name="farm" id="crearUsuario"
		action="empSolicitarPermisos.htm" modelAttribute="solicitarPermisoDTO">
		<div class="input-control text full-size">

			<div class="form-group">
				<label for="exampleInputEmail1">Fecha Desde</label>
				<form:input type="date" path="fechaDesde" id="fechaDesde"
					class="form-control fecha" placeholder="Fecha desde" />
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Fecha Hasta</label>
				<form:input type="date" path="fechaHasta" id="fechaHasta"
					class="form-control fecha" placeholder="Fecha hasta" />
			</div>
			
			<div class="form-group">
				<label for="exampleInputEmail1">Motivo</label>
				<form:textarea class="form-control" rows="3" type="text" path="motivo" id="motivo"
					 placeholder="motivo" />
			</div>
			
				

			<button class="btn btn-default"
				onclick="$('#crearUsuario').submit();" type="submit">Crear
				Empleado</button>
		</div>
	</form:form>


</body>
</html>