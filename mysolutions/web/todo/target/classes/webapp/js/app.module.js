var app = angular.module('todoApp', []);
app.controller('TodoController', ['$http', function ($http) {
    this.orderProp = "text";
    let self = this;

    this.loadData = function() {
        $http.get('/api/todos').then(function (todos) {
            self.todos = todos.data;
        });
    };
    this.loadData();

    self.workingTodo = {};
    this.submitTodo = () => {
        $http.post('/api/todo', self.workingTodo);
        self.workingTodo = {};
    };
}]);

