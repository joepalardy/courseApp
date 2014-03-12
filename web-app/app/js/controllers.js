'use strict';

/* Controllers */

angular.module('curriculumApp.controllers', []).
  controller('CourseListCtrl', ['$scope', '$http','$rootScope',
	function ($scope, $http,$rootScope){
  		$http.get('http://localhost:8080/courseApp/courses.json').success(function (data) {
   		 $scope.courses = data;
 	 });
    $scope.orderProp = 'courseCode';
  }])
  .controller('MyCtrl2', [function() {

  }]);