<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<script type="text/javascript">

function getSolicitarPermisos(){
	
	$.ajax({
		type : "POST",
		traditional : true,
		url : "empFormSolicitarPermisos.htm",
		datatype : "text/jason",
		success : function(response) {
			
			$('#contenedor').append(response);
						
		},
		error : function(response) {
			console.log(response);
		}

	});
	
	
}

</script>

</head>
<body>

<jsp:include page="../commons/headerEmpleado.jsp" />	
<div class="row">
 <div class="col-md-2">
<ul class="nav nav-pills nav-stacked">
  
  <li role="presentation"><a  onclick="getSolicitarPermisos()" >Soliciar Permiso</a></li>
    <li role="presentation"><a href="#" >Cancelar Permiso</a></li>
    <li role="presentation"><a href="j_spring_security_logout" >Logout</a></li>
</ul>
</div>
<div class="col-md-5" id ="contenedor">

</div>
<div class="col-md-5"></div>
</div>


</body>
</html>