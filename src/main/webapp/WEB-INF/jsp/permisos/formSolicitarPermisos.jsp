<html>
<head>	
<!-- 	datepicker -->
<link rel="stylesheet"
	href="resources/bootstrap-3.3.5-dist/plugins/datepicker/datepicker.css">
	<script src="resources/bootstrap-3.3.5-dist/plugins/datepicker/bootstrap-datepicker.js"></script>
<!-- fin datepicker -->

<script type="text/javascript">

</script>

</head>
<body>
<form:form method="post" name="farm" id="crearUsuario"
				action="solicitarPermisos.htm" modelAttribute="solicitarPermisoDTO">
				<div class="input-control text full-size">

<!-- 					<div class="form-group"> -->
<!-- 						<label for="exampleInputEmail1">Nombre Usuario</label> -->
<%-- 						<form:input type="text" path="username" id="username"  class="form-control" placeholder="Usuario" />  --%>
<!-- 					</div> -->
	<input type="text"  value ="" id="valor"/>
										
					<button class="btn btn-default" onclick="$('#crearUsuario').submit();" type="submit">Crear Empleado</button>
				</div>
			</form:form>


</body>
</html>