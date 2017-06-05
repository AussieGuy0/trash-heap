angular.module("todoList").component("todoList", {
    templateUrl: "js/todo-list/todo-list.template.html",
    controller: ['$http', function TodoController($http) {
        var self = this;
        this.orderProp = "date";
        $http.get('api/todos').then(function (response) {
            self.todos = response.data;
        });
    }
    ]
});

