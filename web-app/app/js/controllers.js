'use strict';

/* Controllers */

angular.module('curriculumApp.controllers', []).
  controller('CourseListCtrl', ['$scope', '$http','$rootScope',
	function ($scope, $http,$rootScope){
  		$http.get('http://localhost:8080/courseApp/courses.json?max=6000').success(function (data) {
  			console.log(data.length);
  			for (var j=0;j<data.length;j++){
               data[j].courseCode = data[j].programCode + " "+ data[j].courseNum;
               if(data[j].otm)
                 {
            	   data[j].OTM = true;
            	 }
            	   else{
            		   data[j].OTM =  false;
            	   }
               if(data[j].tag)
               {
          	   data[j].TAG = true;
          	 }
          	   else{
          		   data[j].TAG =  false;
          	   }

  			};
  		$scope.courses = data;
   	    var pagesShown = 1;
   	    var pageSize = 25;
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
    //$scope.orderProp = 'courseCode';
       
  }])
  .controller('CourseCtrl',  ['$scope', '$routeParams', '$http',
     function($scope, $routeParams, $http) {
	    $http.get('http://localhost:8080/courseApp/courses/' + $routeParams.courseId + '.json').success(function(data) {
	      $scope.course = data; 
	    });
}]);
	  