<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE-edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="icon" href="img/logo-p.png">
<title>E-Vacina</title>

<!--CSS PATH INICIO -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="css/login.css" rel="stylesheet">
<!--CSS PATH FIM -->

</head>



<body>
	<!--TOPO INICIO -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">

		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>


		<a class="navbar-brand" href="/"> <img src="img/logo-topo.png"
			alt="">
		</a>




		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ml-auto">
				<a href="index.jsp"><button
						class="btn btn-outline-light my-2 my-sm-0" type="submit">
						<i class="fas fa-undo-alt"></i> Voltar
					</button></a>
			</ul>
		</div>

	</nav>
	<!--TOPO FIM -->



	<div class="container padding-top">

		<s:form cssClass="form-signin" action="validar"	method="post">
			<p align="center">
				<img src="img/logo-100.png">
			<p>

				<s:label  value="Email" />
				<s:textfield type="email" name="user.login" cssClass="form-control" />
				<br>
				<s:label value="Senha" />
				<s:password name="user.senha" cssClass="form-control" />
				<s:submit cssClass="btn btn-lg btn-primary btn-block" value="Login" />
		</s:form>

	</div>

	<!--JAVASCRIPT PATH INICIO -->
	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script defer src="js/fontawesome-all.js"></script>
	<!--JAVASCRIPT PATH FIM -->

</body>
</html>
