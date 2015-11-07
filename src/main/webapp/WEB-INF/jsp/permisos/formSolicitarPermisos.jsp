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
<script
	src="resources/bootstrap-3.3.5-dist/plugins/datepicker/bootstrap-datepicker.js"></script>
<!-- fin datepicker -->


<script type="text/javascript">
	$(document).ready(function() {

		$('.fecha').datepicker();
	});
	
	
	
	
	function ocultarHasta(){
		
		if($("#checkBox").is(':checked')){
			$('#fechaHasta').val("");
			$( "#divFechaHasta" ).animate({
			    opacity: 1.00,
			    left: "+=50",
			    height: "toggle"
			  }, 1000, function() {
			    // Animation complete.
			  });
			
			
		}else{
			$( "#divFechaHasta" ).animate({
			    opacity: 1.00,
			    left: "+=50",
			    height: "toggle"
			  }, 1000, function() {
			    // Animation complete.
			  });
		}
		
		
		
		
	}

	function validar() {

		
		if ($('#combo').val() != "Seleccione...") {
			
			if ($('#fechaDesde').val() != "") {

				if($("#checkBox").is(':checked')){
				
// 					console.log("un solo dia");
					$("#crearUsuario").submit();
				
				
				}else{
					
					if($('#fechaHasta').val() != "") {
						
						if ((Date.parse($('#fechaDesde').val())) > (Date.parse($('#fechaHasta')
								.val()))) {
							alert("La fecha inicial no puede ser mayor que la fecha final");
						}else{
							
// 							console.log("dos dias");
							$("#crearUsuario").submit();
							
						}
						
					}else{
					alert("debe completar fecha hasta");	
					}
					
					
				}
			}else{
				
				alert('debe seleccionar una fecha inicial.');	
				
			}

		}else{
			
			
			alert('debe seleccionar un motivo.');
			
			}


	}
</script>

</head>
<body>
	<form:form method="post" name="farm" id="crearUsuario"
		action="empSolicitarPermisos.htm" modelAttribute="solicitarPermisoDTO">
		<div class="input-control text full-size">


			<select class="form-control" id="combo">
				<option>Seleccione...</option>
				<c:forEach items="${motivos}" var="motivo">
					<option>${motivo.motivo}</option>
				</c:forEach>
			</select>

			<div class="form-group">
				<label for="exampleInputEmail1">Fecha Desde</label>
				<form:input type="date" path="fechaDesde" id="fechaDesde"
					class="form-control fecha" placeholder="Fecha desde" />
			</div>

			<form>
				<label class="checkbox-inline"> <input type="checkbox"
					value="true" id="checkBox" onclick="ocultarHasta()"> Solo 1 dia
				</label>
			</form>

			<div class="form-group" id="divFechaHasta">
				<label for="exampleInputEmail1">Fecha Hasta</label>
				<form:input type="date" path="fechaHasta" id="fechaHasta"
					class="form-control fecha" placeholder="Fecha hasta" />
			</div>

			<div class="form-group">
				<label for="exampleInputEmail1">Comentarios</label>
				<form:textarea class="form-control" rows="3" type="text"
					path="motivo" id="motivo" placeholder="comentarios" />
			</div>

			<input type="button" value="boton" onclick="validar()" />

			<!-- 			<button class="btn btn-default" -->
			<!-- 				onclick="" >Crear -->
			<!-- 				Empleado</button> -->
		</div>
	</form:form>


</body>
</html>