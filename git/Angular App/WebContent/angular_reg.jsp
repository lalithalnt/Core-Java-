<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>  
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
<body ng-app="">

<div>
	
  <div class="col-md-5">
	<div class="panel panel-primary">
		<div class="panel-heading">Input Field Example</div>
		<div class="panel-body">
			<form name="myForm">
				<div class="col-md-6">
					<label>Name</label>
					<input type="text" name="name" ng-model="myInputName" class="form-control" required>
					<span class="help-block" ng-show="myForm.name.$invalid && myForm.name.$touched">Name is required</span>
					<span><button type="submit" class="btn btn-primary" ng-disabled="myForm.$invalid">Submit</button></span>
				</div>
			
			</form>
				
		</div>
		</div>
	</div>
   </div>

</body>
</html>
