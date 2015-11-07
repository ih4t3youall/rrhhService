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
	
	<jsp:include page="../commons/headerEmpleado.jsp" />	
	<div class="row ">
		<div class="col-md-4 col-md-offset-4 panel panel-body">
		
		<div data-example-id="simple-button-group" class="bs-example">
  
  
  
	<c:if test="${not empty exito}">
		<h3>El permiso se creo con exito!</h3>
	</c:if>
		<c:if test="${empty exito}">
		<h3>Surgio un problema durante la creacion del permiso, intente nuevamente.</h3>
	</c:if>
  		
  
  </div>
		
		</div>
	</div>
	


</body>
</html>