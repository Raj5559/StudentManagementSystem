<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>

<head>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
</head>
<body class="container">

	<form action=""  method="post">

		<div class="form-group">
			<label>Student ID</label>
			<input name="sid" class="form-control" />
			<b class="text-danger"><c:out value="${msg}"/></b>
		</div>
		<button class="btn btn-primary mt-2">Submit</button>

		<b><c:out value="${error}"/></b>
		<c:if test="${savedStudent!=null }">
			<h4>Student ID : ${savedStudent.sid }</h4>
			<h4>Student ID : ${savedStudent.sname }</h4>
			<h4>Student ID : ${savedStudent.scity }</h4>
			<h4>Student ID : ${savedStudent.semail }</h4>
			<h4>Student ID : ${savedStudent.gender }</h4>
		</c:if>
	</form>
</body>
</html>