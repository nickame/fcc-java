'use strict';

// ************  Home Page  ******************
myApp.controller('homeController', function ($scope, $http) {
});

// ************  Articles Page  ******************
myApp.controller('contactsController', function ($scope, $http) {
});

// ************  Info Page  ******************
myApp.controller('infoController', function ($scope, $http) {
});

// ************  Info Login page  ******************
myApp.controller('loginController', function ($scope, $http) {

    //test JSON as post
    $scope.user = {};
    $scope.user.email = '';
    $scope.user.password = '';
     $scope.submit = function () {
        var post = {
            email: $scope.user.email,
            password: $scope.user.password,
            firstname: $scope.user.firstname
        };

        $http.post('/', post).success(function (data, status, headers, config) {
            alert("good post data");
        }).error(function (data, status, headers, config) {
            alert("error post data");
        });
    };
});



// ************  Info Sing Up page  ******************
myApp.controller('singupController', function ($scope, $http) {

    //test JSON as post
    $scope.user = {};
    $scope.user.login = '';
    $scope.user.email = '';
    $scope.user.password = '';
    $scope.user.firstname = '';
    $scope.user.lastname = '';
    $scope.submit = function () {
        var post = {
            login: $scope.user.login,
            email: $scope.user.email,
            password: $scope.user.password,
            firstname: $scope.user.firstname,
            lastname: $scope.user.lastname
        };

        $http.post('/', post).success(function (data, status, headers, config) {
            alert("good post data");
        }).error(function (data, status, headers, config) {
            alert("error post data");
        });
    };
});


// ************ ADMIN:  Admin Home Page  ******************
myAdmin.controller('adminHomeController', function ($scope, $http) {
});

// ************ ADMIN:  Admin Create Page  ******************
myAdmin.controller('adminCreateController', function ($scope, $http) {
});

// ************ ADMIN:  Admin Update Page  ******************
myAdmin.controller('adminUpdateController', function ($scope, $http) {
});

// ************ ADMIN:  Admin Delete Page  ******************
myAdmin.controller('adminDeleteController', function ($scope, $http) {
});

// ************ ADMIN:  Admin View Page  ******************
myAdmin.controller('adminViewController', function ($scope, $http) {
});

