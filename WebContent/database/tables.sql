


<-------query for  admission form-------->

create table s_admission(
sno varchar(150) not null,
regno varchar(150) not null,
admToCls varchar(150) not null,
dateofAdm varchar(150) not null,
gender varchar(150) not null,
photo varchar(150) not null,
fname varchar(150) not null,
lname varchar(150) not null,
dob varchar(150) not null,
nationality varchar(150) not null,
mothertng varchar(150) not null,
place varchar(150) not null,
state varchar(150) not null,
domicle varchar(150) not null,
relationship varchar(150) not null,
parentFName varchar(150) not null,
parentLName varchar(150) not null,
mobile varchar(150) not null,
email varchar(150) not null,
fatherEduQualification varchar(150) not null,
motherEduQualification varchar(150) not null,
guardian varchar(150) not null,
address varchar(150) not null,
transportRequirement varchar(150) not null,
dayCare varchar(150) not null);


/*permanentAddress varchar(20) not null,
office1 varchar(150) not null,
telephone1 varchar(150) not null,
pin1 varchar(150) not null,
mobile1 varchar(150) not null,
email1 varchar(150) not null,
lastSchool varchar(150) not null,
careOrScholar varchar(150) not null,
pickup varchar(150) not null,
activities varchar(150) not null,
channel varchar(150) not null,
paper varchar(150) not null);*/

/*ParentDeclaration  table*/
create table s_parent_declaration(
parent varchar(150) not null,
student varchar(150) not null,
photos varchar(150) not null,
records varchar(150) not null,
birth varchar(150) not null);


/*principal table*/
create table t_principal_register(
first_name varchar(30),
last_name varchar(30),
email varchar(30),
password varchar(30),
conformpassword VARCHAR(100),
mobileNumber VARCHAR(100),
gender varchar(30),
address VARCHAR(100),
city VARCHAR(100),
state VARCHAR(100));



/*teacher table*/
create table t_teacher_register(
first_name varchar(30),
last_name varchar(30),
email varchar(30),
password varchar(30),
conformpassword VARCHAR(100),
mobileNumber VARCHAR(100),
gender varchar(30),
address VARCHAR(100),
qualification VARCHAR(100),
city VARCHAR(100),
state VARCHAR(100));




<-------query for enquiry form------------>




create table s_enquiry(
id int not null auto_increment,
sno int not null,
date varchar(150) not null,
nameOfChild varchar(150) not null,
dateOfBirth varchar(150) not null,
age varchar(150) not null,
gender varchar(150) not null,
admissionToClass varchar(150) not null,
fatherName varchar(150) not null,
motherName varchar(150) not null,
occupation varchar(150) not null,
fatherResidentialAddress varchar(150) not null,
motherResidentialAddress varchar(150) not null,
residenceTelNo varchar(150) not null,
additionalNo varchar(150) not null,
email varchar(150) not null,
fatherOffNo int not null,
fatherMob int not null,
motherOffNo int not null,
motherMob int not null,
timeSlot varchar(150) not null,
preferred varchar(150) not null,
transportRequirement varchar(150) not null,
previousSchooling varchar(150) not null,
aboutSchool varchar(150) not null,
others varchar(150) not null,
referenceNumber varchar(150),
primary key(id));


<-------query for admin form------------>

 CREATE TABLE s_admin_register(
    admin_id INT NOT NULL AUTO_INCREMENT,
    firstName VARCHAR(100) NOT NULL,
    lastName VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    gender VARCHAR(100) NOT NULL,
    mobileNumber VARCHAR(100) NOT NULL,
    dateofbirth VARCHAR(100) NOT NULL,
    address VARCHAR(100) NOT NULL,
    city VARCHAR(100) NOT NULL,
    state VARCHAR(100) NOT NULL,
    PRIMARY KEY (admin_id)
    );
    
    
    ALTER TABLE s_enquiry DROP COLUMN admissionNumber;
    alter table s_enquiry add column timeSlot varchar(150) after motherMob;
    
    
    