
<!-- Angular and bootstartp table -->


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="">
 <head>
      <script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.3.3/angular.min.js"></script>
	<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
  
 
   </head>
   
<body>
<h4>Angular Bootstrap Application</h4><hr>
<div class="col-xs-3" class="table-responsive" ng-init="student1=[{name:'kavitha',marks:200},{name:'mounika',marks:400},{name:'rahul',marks:500}]" >
<h3>Student Information</h3><br>
<table class="table">
<tr class="success">
<td>Student Name</td>
<td>Student Marks</td>
</tr>
<tr class="active" ng-repeat="st in student1">
<td>{{st.name}}</td>
<td>{{st.marks}}</td>
</tr>

</table>

<div class="col-lg-4" class="table-responsive" ng-init="student2=[{firstname:'Ravi',lastname:'kiran',rollno:11,marks:950,quantity:2},{firstname:'geetha',lastname:'vegesna',rollno:15,marks:800,quantity:1},{firstname:'puri',lastname:'manasa',rollno:25,marks:920,quantity:5}];cost=30;">
<h3>Books</h3><br>


<table class="table">
<tr class="info">
<td>Firstname</td>
<td>Lastname</td>
<td>RollNo</td>
<td>Book_Cost</td>
<td>Marks</td>
</tr>
<tr class="active" ng-repeat="st1 in student2">
<td>{{st1.firstname}}</td>
<td>{{st1.lastname}}</td>
<td>{{st1.rollno}}</td>
<td>{{st1.quantity*cost}}</td>
<td>{{st1.marks}}</td>
</tr>

</table>


</div>
<div>
<div>
haiii
</div>
</div>
<br><br>

</div>

</body>
</html>