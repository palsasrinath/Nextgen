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
  <title>ENQUIRY-FORM</title>
   <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
  <link rel="stylesheet" href="css/enquiry-form.css"/>
 </head>
 <body>
		<div class="container main">
			<div class="row">
				<div class="col-md-12">
					<h1 class="title"><b>Nextgen Kids Enquiry Form</b></h1>
				</div>
			</div>
			<form:form class="form-inline" id="enquiryForm" name="enquiryForm"
			action="enquiryFormSubmit.htm" method="post" role="form">
			<div class="row gap">
				<div class="col-md-12">
						<div class="col-md-3">
							<label class="title1">Sl. NO :</label>
						</div>
						<div class="col-md-3">
							<form:input type="text" class="form-control" name= "sno"  id="sno" path="sno" required="autofocus" placeholder="SL-NO" />
						</div>
					  <div class="col-md-1">
							<label class="title1">Date :</label>
							</div>
						<div class="col-md-3">
							<form:input type="text" class="form-control" name="date"  id="date" path="date" required="autofocus" placeholder="DATE" />
					  </div>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3">
						<label class="title1">Name Of the Child :</label>
					</div>
					<div class="col-md-9">
						<form:input type="text" class="form-control" id="nameOfChild" path="nameOfChild" required="autofocus" name=" nameOfChild" placeholder="CHILD-NAME" />
					</div>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3">
						<label class="title1">Date Of Birth :</label>
					</div>
					<div class="col-md-3">
						<form:input type="text" class="form-control"  name="dateOfBirth"
				id="datepicker" path="dateOfBirth" required="autofocus" placeholder="DD/MM/YYYY" />
					</div>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3">
						<label class="title1">Age :</label>
					</div>
					<div class="col-md-9">
						<form:input type="text" class="form-control"  name="age" id="age" path="age"
				required="autofocus" placeholder="AGE" />
					</div>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3">
						<label class="title1">Gender :</label>
					</div>
					<div class="col-md-1">
						<form:radiobutton path="gender" name="gender"
				id="gender" /> <label class="title1">Male</label>
					</div>
					<div class="col-md-2">
						<form:radiobutton path="gender" name="gender"
				id="gender"/> <label class="title1">Female</label>
					</div>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3">
						<label class="title1">Admission to Class :</label>
					</div>
					<div class="col-md-4">
						<form:input type="text" class="form-control" name="admissionToClass"
				id="admissionToClass" path="admissionToClass" required="autofocus" placeholder="Admission to Class" />
					</div>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3">
						<label class="title1">Father's Name :</label>
					</div>
					
					<div class="col-md-1">
						<form:input type="text" class="form-control"  name="fatherName"
				id="fatherName" path="fatherName" required="autofocus"  placeholder="DETAILS"  />
					</div>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3">
						<label class="title1">Mother's Name :</label>
					</div>
					<div class="col-md-4">
						<form:input type="text" class="form-control"   name="motherName"
				id="motherName" path="motherName" required="autofocus" placeholder="MOTHER-NAME" />
					</div>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3">
						<label class="title1">Occupation :</label>
					</div>
					<div class="col-md-4">
						<form:input type="text" class="form-control" name="occupation"
				id="occupation" path="occupation" required="autofocus" placeholder="OCCUPATION" />
					</div>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3">
						<label class="title1">Residential Address :</label>
					</div>
					<div class="col-md-1">
						<label class="title1">Father-</label>
					</div>
					<div class="col-md-3">
						<form:input type="text" class="form-control" name="fatherResidentialAddress" id="fatherResidentialAddress"
				path="fatherResidentialAddress" required="autofocus" placeholder="" />
					</div>
					<div class="col-md-1">
						<label class="title1">Mother-</label>
					</div>
					<div class="col-md-3">
						<form:input type="text" class="form-control" name="motherResidentialAddress" id="motherResidentialAddress"
				path="motherResidentialAddress" required="autofocus" placeholder="" />
					</div>
				</div>
			</div>
			
			<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3">
						<label class="title1">Residence Tel No :</label>
					</div>
					<div class="col-md-4">
						<form:input type="text" class="form-control" name="residenceTelNo"
				id="residenceTelNo" path="residenceTelNo" required="autofocus" placeholder="Residence Tel No" />
					</div>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3">
						<label class="title1">Additional No.s :</label>
					</div>
					<div class="col-md-2">
						<form:input type="text" class="form-control" name="additionalNo"
				id="additionalNo" path="additionalNo" required="autofocus"  placeholder="" />
					</div>
					<div class="col-md-1">
					</div>
					<div class="col-md-1">
						<label class="title1">E-mail-</label>
					</div>
					<div class="col-md-2">
						<form:input type="text" class="form-control" name="email" id="email"
				path="email" required="autofocus"  placeholder="EMAIL"/>
					</div>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3"></div>
					<div class="col-md-1">
						<label class="title1">Father(O)</label>
					</div>
					<div class="col-md-2">
						<form:input type="text" class="form-control" name="fatherOffNo" id="fatherOffNo"
				path="fatherOffNo" required="autofocus"  placeholder="" />
					</div>
					<div class="col-md-1">
					</div>
					<div class="col-md-3">
					<label class="title1">Mob.</label>
						<form:input type="text" class="form-control" name="fatherMob" id="fatherMob"
				path="fatherMob" required="autofocus" placeholder="MOBILE" />
					</div>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3"></div>
						<div class="col-md-4">
						<label class="title1">Mother (O).</label>
										<form:input type="text" class="form-control" name="motherOffNo" id="motherOffNo"
				path="motherOffNo" required="autofocus" placeholder="OFFICE NO." />
					</div>
					
					<div class="col-md-3">
						<label class="title1">Mob.</label>
				
						<form:input type="text" class="form-control" name="motherMob" id="motherMob"
				path="motherMob" required="autofocus" placeholder="MOBILE" />
					</div>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3">
						<label class="title1">Time Slot (Batch) :</label>
					</div>
					<div class="col-md-2">
			        <form:input type="text" name="timeSlot"
				id="timeSlot" path="timeSlot" class="form-control" required="autofocus" />
				</div>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3">
						<label class="title1">preferred :</label>
					</div>
					<div class="col-md-2">
						<form:input type="text" class="form-control" name="preferred" id="preferred"
				path="preferred" required="autofocus" placeholder="" />
					</div>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3">
						<label class="title1">Transport Requirement :</label>
					</div>
					<div class="col-md-1">
						<label class="title1">Yes </label> <form:checkbox class="form-control" name= "transportRequirement"
				id= "transportRequirement" path= "transportRequirement"
				  value="yes" />
					</div>
					<div class="col-md-1">
						<label class="title1">No </label> <form:checkbox class="form-control" name= "transportRequirement"
				id= "transportRequirement" path= "transportRequirement"
				  value="no" />
					</div>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3">
						<label class="title1">previous Schooling :</label>
					</div>
					<div class="col-md-1">
						<label class="title1">Yes </label> <form:checkbox name= "previousSchooling"
				id= "previousSchooling" path= "previousSchooling"  value="yes" />
					</div>
					<div class="col-md-1">
						<label class="title1">No </label> <form:checkbox name= "previousSchooling"
				id= "previousSchooling" path= "previousSchooling"  value="no" />
					</div>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<h1 class="title2"><b>How did you come to know about Nextgen Kids ?</b></h1>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3">
						 <form:checkbox name="aboutSchool" id="aboutSchool"
				path="aboutSchool"  value="newsAdvertisement"/> <label class="title1">Newspaper Advertisement </label>
					</div>
					<div class="col-md-3">
						<form:checkbox
				name="aboutSchool" id="aboutSchool" path="aboutSchool"
				 value="newsArticle" /> <label class="title1">Newspaper Article </label>
					</div>
					<div class="col-md-3">
						<form:checkbox
				name="aboutSchool" id="aboutSchool" path="aboutSchool"
				 value="tvCommercial" /> <label class="title1">TV Commercial </label>
					</div>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3">
						 <form:checkbox name="aboutSchool" id="aboutSchool" path="aboutSchool"
				 value="magazines" /><label class="title1">Magazines </label>
					</div>
					<div class="col-md-3">
						<form:checkbox
				name="aboutSchool" id="aboutSchool" path="aboutSchool"
				 value="cableTv" /> <label class="title1">Cable TV </label>
					</div>
					<div class="col-md-3">
						<form:checkbox
				name="aboutSchool" id="aboutSchool" path="aboutSchool"
				 value="friend" /> <label class="title1">Friend/Acquaintance</label>
					</div>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3">
						<label class="title1">Other (Pls. Specify) : </label>
					</div>
					<div class="col-md-3">
						<form:input type="text" name="others"
				id="others" path="others" required="autofocus"  placeholder="" />
					</div>
					<div class="row gap">
				<div class="col-md-12">
					<div class="col-md-3">
						<label class="title1">Reference Number : </label>
					</div>
					<div class="col-md-3">
						<form:input type="text" name="referenceNumber"
				id="referenceNumber" path="referenceNumber" required="autofocus"  placeholder="" />
					</div>
					<div class="button-click">
				<button type="submit" class="btn btn-primary button-cls" style="color: white">Register
					Now</button>
			</div>
				</div>
			</div>
			<div class="row gap">
				<div class="col-md-12">
					<h3 class="title3"><b>Thank you for visiting NextgenKids</b></h3>
				</div>
			</div>
			</form:form>
		</div>
 </body>
</html>
