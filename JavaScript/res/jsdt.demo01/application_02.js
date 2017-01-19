/** application.js */

// module
var app = angular.module('jsdtApp', ['']);

//controllers with injected angular $scope
app.controller('mainController', function ($scope) {
  // create a message to display in our view
  $scope.message = 'Learn more about JSDT at https://wiki.eclipse.org/JSDT';
});