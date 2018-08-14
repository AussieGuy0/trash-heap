var app = angular.module('matchApp', ['ngRoute']);

const url = "http://localhost:8080/api/v1/";
const basePlayersUrl = url + "players";
const baseSeasonsUrl = url + "seasons";
const baseMatchesUrl = url + "matches";


app.config(['$routeProvider', '$locationProvider', function ($routeProvider, $locationProvider) {
    $locationProvider.html5Mode(true);

    $routeProvider
        .when('/', {
            controller: 'MainController',
            controllerAs: 'mainCtrl',
            templateUrl: 'pages/home.html'
        })
        .when('/seasons', {
            controller: 'SeasonController',
            controllerAs: 'seasonCtrl',
            templateUrl: 'pages/seasons.html'
        })
        .when('/players', {
            controller: 'PlayerController',
            controllerAs: 'playerCtrl',
            templateUrl: 'pages/player.html'
        })

}]);

app.controller('MainController', function () {

});

app.controller('SeasonController', ['$http', function ($http) {
    let self = this;
    self.selectedSeason = 0;
    self.seasonIds = [];
    self.matches = [];

    self.getAllSeasonIds = function () {
        $http.get(baseSeasonsUrl)
            .then((response) => {
                self.seasonIds = [];
                for (let season in response.data) {
                    self.seasonIds.push(season);
                }

            })

    };

    self.getMatchesBySeason = function () {
        $http.get(baseMatchesUrl)
            .then((response) => {
                let data = response.data;
                let matches = [];
                data.forEach((match) => {
                    if (match.seasonId === self.selectedSeason) {
                        matches.push(match);
                    }
                });
                self.matches = matches;
            })
    };
    self.getAllSeasonIds();

}]);

app.controller('PlayerController', ['$http', function ($http) {
    let self = this;
    this.players = [];
    this.newPlayer = {};

    this.getAllPlayers = function () {
        $http.get(basePlayersUrl)
            .then((response) => {
                self.players = response.data
            })
    };

    this.addPlayer = function () {
        $http.post(basePlayersUrl, self.newPlayer)
            .then((response) => {
                this.getAllPlayers();
                self.newPlayer = {};
            });
    };

    this.getAllPlayers();
}]);
