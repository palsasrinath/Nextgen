<!doctype html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="Generator" content="EditPlus®">
<meta name="Author" content="">
<meta name="Keywords" content="">
<meta name="Description" content="">
<title>ADMISSION-FORM</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>




<link rel="stylesheet" href="css/admission-form.css" />
</head>
<body>
	<!--container start-->

	<div class="container border">
	
		<form:form    id="admissionForm" action="admissionFormSubmit.htm"  method="post" role="form" >
			<div class="row">
				<div class="col-md-12">
					<div>
						<h3 class="title">
							<b>APPLICATION FORM FOR ADMISSION</b>
						</h3>
					</div>
				</div>
			</div>
			<div class="row top">
				<div class="col-md-12">
					<div class="col-md-8">
						<div class="row">
							<div class="col-md-12">
								<div class="form-inline">
									<div class="col-md-4">
										<label class="word">SL. NO</label>
									</div>
									<div class="col-md-4">
										:
										<form:input type="text" class="form-control" name="sno"
											id="sno" path="sno" required="autofocus" />
										<span id="errSNo" style="color: red"></span>
									</div>
								</div>
							</div>
						</div>
						<div class="row top">
							<div class="col-md-12">
								<div class="form-inline">
									<div class="col-md-4">
										<label class="word">Registration No.</label>
									</div>
									<div class="col-md-4">
										: <form:input type="text" class="form-control" name="regNo"
											id="regNo" path="regNo" required="autofocus" /> <span
											id="errRegNo" style="color: red"></span>
									</div>
								</div>
							</div>
						</div>
						<div class="row top">
							<div class="col-md-12">
								<div class="form-inline">
									<div class="col-md-4">
										<label class="word">Admission to Class</label>
									</div>
									<div class="col-md-4">
										:
										<form:input type="text" class="form-control" name="admToCls"
											id="admToCls" path="admToCls" required="autofocus" />
										<span id="errAdmToCls" style="color: red"></span>
									</div>
								</div>
							</div>
						</div>
						<div class="row top">
							<div class="col-md-12">
								<div class="form-inline">
									<div class="col-md-4">
										<label class="word">Date of Admission</label>
									</div>
									<div class="col-md-4">
										:
										<form:input type="text" class="form-control" name="dateOfAdm"
											id="dateOfAdm" path="dateOfAdm" required="autofocus" />
										<span id="errDateOfAdm" style="color: red"></span>
									</div>
								</div>
							</div>
						</div>
						<div class="row top">
							<div class="col-md-12">
								<div class="form-inline">
									<div class="col-md-4">
										<label class="word">Gender</label>
									</div>
									<div class="col-md-2">
										:
										<form:radiobutton class="form-control" name="gender"
											id="gender" path="gender" required="autofocus" />
										<b>Male</b><span id="errGender" style="color: red"></span>
									</div>
									<div class="col-md-2">
										<form:radiobutton class="form-control" name="gender"
											 id="gender" path="gender" required="autofocus" />
										<b>Female</b><span id="errGender" style="color: red"></span>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-4">
						<form:input type="file" name="photo" id="photo" path="photo"
							required="autofocus" />
						<span id="errPhoto" style="color: red"></span>
					</div>
				</div>
			</div>
			<div class="line"></div>
			<div class="row top">
				<div class="col-md-12">
					<div class="form-inline">
						<div class="col-md-4">
							<label class="word">1. Name of the Student :</label>
						</div>
						<div class="col-md-8">
							<div class="form-group">
								<form:input type="text" class="form-control"
									placeholder="FIRST-NAME" name="fname" id="fname" path="fname"
									required="autofocus" />
								 <span id="errFName" style="color: red"></span>
							</div>
							<div class="form-group">
								<form:input type="text" class="form-control" id="lname"
									placeholder="LAST-NAME" name="lname" path="lname"
									required="autofocus" />
								 <span id="errLName" style="color: red"></span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row top">
				<div class="col-md-12">
					<div class="form-inline">
						<div class="col-md-4">
							<label class="word">2. Date of Birth :</label>
						</div>
						<div class="col-md-3">
							<form:input type="date" placeholder="dd-mm-yyyy" name="dob"
								id="myBirthday" path="dob" required="autofocus" />
							<span id="errDate" style="color: red"></span>
						</div>
					</div>
				</div>
			</div>
			<div class="row top">
				<div class="col-md-12">
					<div class="form-inline">
						<div class="col-md-4">
							<label class="word">3. Nationality :</label>
						</div>
						<div class="col-md-3">
							<form:select name="nationality" id="nationality"
								path="nationality" required="autofocus" >
							<option>INDIAN</option>
							<option>JAPAN</option>
							<option>CHINA</option>
							<option>U.S.A</option>
							</form:select>
							<span id="errNationality" style="color: red"></span> 
						</div>
					</div>
				</div>
			</div>
			<div class="row top">
				<div class="col-md-12">
					<div class="form-inline">
						<div class="col-md-4">
							<label class="word">4. Mother Tounge :</label>
						</div>
						<div class="col-md-3">
							<form:select name="mothertng" id="mothertng" path="mothertng"
								required="autofocus" >
							<option>TELUGU</option>
							<option>HINDI</option>
							<option>ENGLISH</option>
							<option>TAMIL</option>
							<option>KANNADA</option>
							<option>MALAYALEM</option>
							<option>URDU</option>
							</form:select>
							<span id="errMotherTng" style="color: red"></span>
						</div>
					</div>
				</div>
			</div>
			<div class="row top">
				<div class="col-md-12">
					<div class="form-inline">
						<div class="col-md-4">
							<label class="word">5. Native Place & State :</label>
						</div>
						<div class="col-md-2">
							<form:input type="text" class="form-control"
								placeholder="NATIVE-PLACE" name="place" id="place" path="place"
								required="autofocus" />
							<span id="errNative" style="color: red"></span>
						</div>
						<div class="col-md-2">
							<form:input type="text" class="form-control" placeholder="STATE"
								name="state" id="state" path="state" required="autofocus" />
							<span id="errState" style="color: red"></span>
						</div>
					</div>
				</div>
			</div>
			<div class="row top">
				<div class="col-md-12">
					<div class="form-inline">
						<div class="col-md-4">
							<label class="word">6. Domicle :</label>
						</div>
						<div class="col-md-4">
							<form:input type="text" class="form-control" name="domicle"
								id="domicle" path="domicle" required="autofocus" />
							<span id="errDomicle" style="color: red"></span>
						</div>
					</div>
				</div>
			</div>
			<div class="row top">
				<div class="col-md-12">
					<div class="form-inline">
						<div class="col-md-4">
							<label class="word">7. Relation Ship With Child :</label>
						</div>
						<div class="col-md-2">
							<form:select name="relationship" id="relationship"
								path="relationship" required="autofocus">
							<option value="father">FATHER</option>
							<option value="mother">MOTHER</option>
							<option value="guardian">GUARDIAN</option>
							</form:select>
							<span id="errRelationship" style="color: red"></span>
						</div>
					</div>
				</div>
			</div>
			<div class="row top">
				<div class="col-md-12">
					<div class="form-inline">
						<div class="col-md-4">
							<label class="word">8. PARENT (or) GUARDIAN :</label>
						</div>
						<div class="col-md-2">
							<form:input type="text" class="form-control"
								placeholder="FIRST-NAME" name="parentFName" id="parentFName"
								path="relationship" required="autofocus" />
							<span id="errParentFName" style="color: red"></span>
						</div>
						<div class="col-md-2">
							<form:input type="text" class="form-control"
								placeholder="LAST-NAME" name="parentLName" id="parentLName"
								path="parentLName" required="autofocus" />
							<span id="errParentLName" style="color: red"></span>
						</div>
						<div class="col-md-2">
							<form:input type="text" class="form-control"
								placeholder="MOBILE-NO." name="mobile" id="mobile" path="mobile"
								required="autofocus" />
							<span id="errMobile" style="color: red"></span>
						</div>
						<div class="col-md-2">
							<form:input type="text" class="form-control" placeholder="E-MAIL"
								name="email" id="email" path="email" required="autofocus" />
							<span id="errEmail" style="color: red"></span>
						</div>
					</div>
				</div>
			</div>
			<div class="row top">
				<div class="col-md-12">
					<div class="form-inline">
						<div class="col-md-4">
							<label class="word">9. Educational Qualification :</label>
						</div>
						<div class="col-md-2">
							<form:input type="text" class="form-control" placeholder="FATHER"
								name="fatherEduQualification" id="fatherEduQualification"
								path="fatherEduQualification" required="autofocus" />
							<span id="errFather" style="color: red"></span>
						</div>
						<div class="col-md-2">
							<form:input type="text" class="form-control" placeholder="MOTHER"
								name="motherEduQualification" id="motherEduQualification"
								path="motherEduQualification" required="autofocus" />
							<span id="errMother" style="color: red"></span>
						</div>
						<div class="col-md-2">
							<form:input type="text" class="form-control"
								placeholder="GUARDIAN" name="guardian" id="guardian"
								path="guardian" required="autofocus" />
							<span id="errGuardian" style="color: red"></span>
						</div>
					</div>
				</div>
			</div>
			<div class="row top">
				<div class="col-md-12">
					<div class="form-inline">
						<div class="col-md-4">
							<label class="word">10. Address :</label>
						</div>
						<div class="col-md-4">
							<form:textarea class="form-control" rows="5" cols="50" name="address" id="address" path="address"
								required="autofocus" />
							<span id="errAddress" style="color: red"></span>
						</div>
					</div>
				</div>
			</div>
			<div class="row top">
				<div class="col-md-12">
					<div class="form-inline">
						<div class="col-md-4">
							<label class="word">11. Transport Requirent :</label>
						</div>
						<div class="col-md-2">
							<label><form:checkbox
									name="transportRequirement" id="transportRequirement"
									path="transportRequirement" value="yes"/> <b>YES</b></label><span id="errTrans"
								style="color: red"></span>
						</div>
						<div class="col-md-2">
							<label><form:checkbox
									name="transportRequirement" id="transportRequirement"
									path="transportRequirement" value="no"/> <b>NO</b></label><span id="errTrans"
								style="color: red"></span>
						</div>
					</div>
				</div>
			</div>
			<div class="row top">
				<div class="col-md-12">
					<div class="form-inline">
						<div class="col-md-4">
							<label class="word">12. Day Care Requirement :</label>
						</div>
						<div class="col-md-2">
							<label><form:checkbox name="dayCare" id="dayCare"
									path="dayCare" value="yes"/> <b>YES</b></label><span id="errDay"
								style="color: red"></span>
						</div>
						<div class="col-md-2">
							<label><form:checkbox name="dayCare" id="dayCare"
									path="dayCare"  value="no"/> <b>NO</b></label><span id="errDay"
								style="color: red"></span>
						</div><br><br>
						<center><button type="submit" class="button-cls" style="color: black">Register
					Now</button></center>
					</div>
				</div>
			</div>
			</form:form>
	</div>



	<!--container end-->

</body>
</html>
