'use strict';


// Declare app level module which depends on filters, and services
angular.module('curriculumApp', [
  'ngRoute',
  'curriculumApp.filters',
  'curriculumApp.services',
  'curriculumApp.directives',
  'curriculumApp.controllers'
]).
config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/courses', {templateUrl: 'partials/partial1.html', controller: 'CourseListCtrl'});
  $routeProvider.when('/courses/:courseId', {templateUrl: 'partials/partial2.html', controller: 'CourseCtrl'});
  $routeProvider.otherwise({redirectTo: '/courses'});
}]);