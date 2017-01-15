let baseUrl = "https://en.wikipedia.org/w/api.php?action=opensearch&format=json&origin=*&search=";
let searchButton;
let searchBox;
let resultsDiv;

document.addEventListener("DOMContentLoaded", function(event) {
    searchButton = document.getElementById("search-button");
    searchBox = document.getElementById("search-box");
    resultsDiv = document.getElementById("results");
    searchButton.addEventListener("click", handleSearchButtonClicked(), false);
});



function makeApiRequest(url) {
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.onreadystatechange = function() { 
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
            handleApiReturn(xmlHttp.responseText);
        } 
    };
    xmlHttp.open("GET", url, true); 
    xmlHttp.setRequestHeader("Api-User-Agent", "Personal/1.0 (anthonybruno.me)");
    xmlHttp.send(null);
}

function handleApiReturn(responseText) {
    resultsDiv.innerHTML = "";

    let json = JSON.parse(responseText);
    let titleArr = json[1];
    let summaryArr = json[2];
    let urlArr = json[3];

    for (let i = 0; i < titleArr.length; i++) {
        let title = titleArr[i];
        let summary = summaryArr[i];
        let url = urlArr[i];
        resultsDiv.innerHTML += "<p> <a href=\""+ url+ "\"><h2>"+ title + "</h2> </a>" + summary +  "</p>";
    }
}

function handleSearchButtonClicked() {
    makeApiRequest(baseUrl + searchBox.value);
}

function search(event) {
    if (event.keyCode == 13) {
        handleSearchButtonClicked();
        return false;
    }
}
