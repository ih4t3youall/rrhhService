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
</head>
<body>

<header role="banner" id="top" class="navbar navbar-static-top bs-docs-nav">
  <div class="container">
    <div class="navbar-header">
      <a class="navbar-brand" href="../">rrhhService - Admin login</a>
    </div>
  </div>
</header>

	<div class="row ">
		<div class="col-md-4 col-md-offset-4 panel panel-body">
			<form data-example-id="simple-input-groups"
				class="bs-example bs-example-form" name='f' action="<c:url value='j_spring_security_check' />"
				method='POST' id="formularioLogin">
				<div class="input-group">
					<span id="basic-addon1" class="input-group-addon">Usr</span> <input name='j_username'
						type="text" aria-describedby="basic-addon1" placeholder="Usuario"
						class="form-control">
				</div>
				<br>
				<div class="input-group">
					<span id="basic-addon1" class="input-group-addon">Pws</span> <input name='j_password'
						type="password" aria-describedby="basic-addon1"  placeholder="Contrase&ntilde;a"
						class="form-control">
				</div>
				<br>
				<button class="btn btn-primary" type="button" onclick="$('#formularioLogin').submit();">Ingresar</button>
<!-- 				<div class="input-group"> -->
<!-- 					<span class="input-group-addon">$</span> <input type="text" -->
<!-- 						aria-label="Amount (to the nearest dollar)" class="form-control"> -->
<!-- 					<span class="input-group-addon">.00</span> -->
<!-- 				</div> -->
<!-- 				<br> <label for="basic-url">Your vanity URL</label> -->
<!-- 				<div class="input-group"> -->
<!-- 					<span id="basic-addon3" class="input-group-addon">https://example.com/users/</span> -->
<!-- 					<input type="text" aria-describedby="basic-addon3" id="basic-url" -->
<!-- 						class="form-control"> -->
<!-- 				</div> -->
			</form>
		</div>
	</div>
</body>
</html>