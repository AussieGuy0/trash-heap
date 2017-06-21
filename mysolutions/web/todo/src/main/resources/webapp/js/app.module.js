var app = angular.module('todoApp', []);
app.controller('TodoController', ['$http', '$window', function ($http, $window) {
    let self = this;

    $http.get('/api/todos').then(function (todos) {
        self.todos = todos.data;
    });

    self.workingTodo = {};
    this.submitTodo = () => {
        $http.post('/api/todo', self.workingTodo);
        self.workingTodo = {};
        $window.location.reload();
    };
}]);

