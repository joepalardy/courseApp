'use strict';

/* Controllers */

angular.module('curriculumApp.controllers', []).
  controller('CourseListCtrl', ['$scope', '$http','$rootScope',
	function ($scope, $http,$rootScope){
  		$http.get('http://localhost:8080/courseApp/courses.json').success(function (data) {
   		 $scope.courses = data;
   	    var pagesShown = 1;
   	    var pageSize = 5;
   	    $scope.itemsLimit = function() {
   	        return pageSize * pagesShown;
   	    };
   	   $scope.hasMoreItemsToShow = function() {
   	        return pagesShown < ($scope.courses.length / pageSize);
   	    };
   	    $scope.showMoreItems = function() {
   	        pagesShown = pagesShown + 1;         
   	    };
 	 });
    $scope.orderProp = 'courseCode';
 
    
  }])
  .controller('CourseCtrl',  ['$scope', '$routeParams', '$http',
     function($scope, $routeParams, $http) {
	    $http.get('http://localhost:8080/courseApp/courses/' + $routeParams.courseId + '.json').success(function(data) {
	      $scope.course = data;
	    });
}]);
	  