<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
<script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.3.3/angular.min.js"></script>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
  <style type="text/css">
  	.generic-container{
  	margin-top: 100px;
  	margin-left:200px;
  
  	}
  	.row1{
  	margin-left: 65px;
  	}
  </style>
</head>
<body ng-app="myapp">
			<div class="generic-container">
				<div class="col-md-5">
				<div class="panel panel-primary">
				<div class="panel-heading">Registration Form</div>
				<div class="panel-body">
				<h5 align="center">Please fill the following to register</h5>
      
				 <form action="" method="" class="register-form"> 
					      <div class="row">      
					           <div class="col-md-7">
					              <label for="fullName">Full Name</label>
					               <input name="fullName" class="form-control" type="text" ng-model="fullName">    
					           </div>            
					      </div>
					      <div class="row">
					           <div class="col-md-7">
					              <label for="email">Email</label>
					               <input name="email" class="form-control" type="email" ng-model="email">             
					           </div>            
					      </div>
					      <div class="row">
					           <div class="col-md-7">
					              <label for="phone">Phone</label>
					               <input name="phone" class="form-control" type="number" ng-model="phone">             
					           </div>            
					      </div>
					      <div class="row">
					           <div class="col-md-7">
					              <label for="address">Address</label>
					               <input name="address" class="form-control" type="text" ng-model="address">             
					           </div>            
					      </div>
					      <div class="row">
					           <div class="col-md-7">
					              <label for="uname">User Name</label>
					               <input name="uname" class="form-control" type="uname" ng-model="uname">             
					           </div>            
					      </div>
					      <div class="row">
					           <div class="col-md-7">
					              <label for="password">Password</label>
					               <input name="password" class="form-control" type="password" ng-model="pwd">             
					           </div>            
					      </div>
					      <hr>
					      <div class="row1" align="center">
					           <div class="col-md-7">
					           <button class="btn btn-primary">Register</button>		          
					           <button class="btn btn-primary">Cancel</button>           
					          </div>          
					      </div>    
			 </form>         
 
      </div>
    </div>
	</div>
</div>
</body>
</html>