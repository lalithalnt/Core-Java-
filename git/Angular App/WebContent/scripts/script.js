//creating the module
var app=angular.module("myApp",[])
		.controller("myController",function($scope){
			
			var students=[
				{
					name:"ravi",
					id:"st01",
					marks:85
				},
				{
					name:"varun",
					id:"st02",
					marks:70
				},
				{
					name:"manasa",
					id:"st03",
					marks:73
				}
			];
			
			$scope.students=students;
		});