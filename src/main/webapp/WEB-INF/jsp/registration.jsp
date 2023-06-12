<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<html>

<head>

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">

</head>

<body class="container">
<h3>Registration Form</h3>

	<form:form method="post" action="register" modelAttribute="student">

		<div class="form-group">
			<label>Student Name</label>
			<form:input path="sname" class="form-control" />
			<b class="text-danger"><form:errors path="sname"/></b>
		</div>


		<div class="form-group">
			<label>Student Mobile</label>
			<form:input path="smobile" class="form-control" />
			<b class="text-danger"><form:errors path="smobile"/></b>
		</div>

		<div class="form-group">
			<label>Student Email</label>
			<form:input path="semail" class="form-control" />
			<b class="text-danger"><form:errors path="semail"/></b>
		</div>

		<div class="form-group">
			<label>Student Gender</label>
			<form:radiobutton path="gender" value="MALE" />
			Male
			<form:radiobutton path="gender" value="FEMALE" />Female
			<b class="text-danger"><form:errors path="gender"/></b>
		</div>

		<div>
			<label>Student City</label>
			<form:select class="form-control" path="scity">
				<form:option value="">--Select Your City--</form:option>
				<form:options items="${cities}"/>
			</form:select>
			<b class="text-danger"><form:errors path="scity"/></b>
		</div>
		<br/>
		<button class="btn btn-primary">Register</button>

	</form:form>
	
	<hr/>
	<c:if test="${savedStudent!=null}">
		<h4>Student with ID :<c:out value="${savedStudent.sid}"/>, Saved Successfully</h4>
	</c:if>
	
</body>

</html>