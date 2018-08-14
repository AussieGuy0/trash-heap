const url = "http://localhost:8080/api/v1/";
const getPlayersUrl = url + "players";
const getSeasonUrl = url + "seasons";
const getMatchesUrl = url + "matches";

let playerTable;
let matchTable;

let addPlayerForm;
let addMatchForm;

let seasonSelects;
let seasonViewSelect;
let playerNameSelects;

document.addEventListener("DOMContentLoaded", function (event) {
    playerTable = document.getElementById("player-table");
    matchTable = document.getElementById("match-table");

    addPlayerForm = document.getElementById("add-player-form");
    addMatchForm = document.getElementById("add-match-form");

    seasonSelects = document.getElementsByClassName("season-select");
    seasonViewSelect = document.getElementById("season-view-select");
    playerNameSelects = document.getElementsByClassName("player-select");

    makeApiRequest(getPlayersUrl, playerTablePopulate);
    makeApiRequest(getMatchesUrl, matchTablePopulate);

    makeApiRequest(getSeasonUrl, seasonSelectMenuPopulate);
    setFormToSubmitJson(addPlayerForm);
    setFormToSubmitJson(addMatchForm);

});

function populateTable(json, table, callback) {
    for (let i = 0; i < json.length; i++) {
        let element = json[i];

        let row = table.insertRow(1);
        callback(row, element);
    }
}

let matchTablePopulate = (json) => {
    populateTable(json, matchTable, (row, element) => {
        row.insertCell(0).innerHTML = element.homePlayerId;
        row.insertCell(1).innerHTML = element.homeTeam;
        row.insertCell(2).innerHTML = element.homeScore;

        row.insertCell(3).innerHTML = element.awayPlayerId;
        row.insertCell(4).innerHTML = element.awayTeam;
        row.insertCell(5).innerHTML = element.awayScore;
    });
};

let playerTablePopulate = function populatePlayerTable(json) {
    populateTable(json, playerTable, (row, element) => {
        row.insertCell(0).innerHTML = element.id;
        row.insertCell(1).innerHTML = element.name;

        for (let i = 0; i < playerNameSelects.length; i++) {
            let option = document.createElement("option");
            option.text = element.name;
            option.setAttribute("value", element.id);
            playerNameSelects.item(i).add(option)

        }
    });
};

let seasonSelectMenuPopulate = function populateSelectMenu(json) {
    for (let i = 0; i < json.length; i++) {
        let element = json[i];

        for (let j = 0; j < seasonSelects.length; j++) {
            let option = document.createElement("option");
            option.text = element.id;
            option.setAttribute("value", element.id);
            seasonSelects.item(j).add(option);
        }
    }
};

function setFormToSubmitJson(form) {
    form.onsubmit = function (e) {
        // stop the regular form submission
        e.preventDefault();

        // collect the form data while iterating over the inputs
        var data = {};
        for (var i = 0, ii = form.length; i < ii; ++i) {
            var input = form[i];
            if (input.name) {
                data[input.name] = input.value;
            }
        }

        // construct an HTTP request
        var xhr = new XMLHttpRequest();
        xhr.open(form.method, form.action, true);
        xhr.setRequestHeader('Content-Type', 'application/json; charset=UTF-8');

        // send the collected data as JSON
        xhr.send(JSON.stringify(data));

        xhr.onloadend = function () {
            // done
        };
    }
}

function makeApiRequest(url, callback) {
    let xmlHttp = new XMLHttpRequest();
    xmlHttp.onreadystatechange = function () {
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
            callback(JSON.parse(xmlHttp.responseText));
        }
    };
    xmlHttp.open("GET", url, true);
    xmlHttp.send(null);
}

function updateMatchTable() {
    makeApiRequest(getMatchesUrl, getMatchesWithSeason);
}

let getMatchesWithSeason = function(matchesJson) {
    let selectedSeason = seasonViewSelect.options[seasonViewSelect.selectedIndex].value;
    selectedSeason = parseInt(selectedSeason);
    for (let i = 0; i < matchesJson.length; i++) {
        let match = matchesJson[i];
        if (match.seasonId !== selectedSeason) {
            matchesJson.splice(i, 1);
        }
    }
    clearTable(matchTable);
    matchTablePopulate(matchesJson);
};

function clearTable(table) {
    var tableHeaderRowCount = 1;
    var rowCount = table.rows.length;
    for (var i = tableHeaderRowCount; i < rowCount; i++) {
        table.deleteRow(tableHeaderRowCount);
    }
}