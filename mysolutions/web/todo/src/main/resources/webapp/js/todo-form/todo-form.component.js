angular.module("todoForm").component("todoForm", {
    templateUrl: "js/todo-form/todo-form.template.html",
    controller: ['$scope','$http', function TodoController($scope, $http) {
        var self = this;
        $scope.addTodo = function() {
            console.log("lol");
            $http.post('api/todo', $scope.todo).then(function (response) {
                //$location.path('/');
            });
        }
    }
    ]
});

