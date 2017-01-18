let baseUrl = "https://en.wikipedia.org/w/api.php?action=opensearch&format=json&origin=*&search=";
let searchButton;
let searchBox;
let resultsDiv;
let interval;

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
    resultsDiv.style.opacity = "0";
    resultsDiv.innerHTML = "";
    xmlHttp.send(null);
}

function handleApiReturn(responseText) {

    let json = JSON.parse(responseText);
    let titleArr = json[1];
    let summaryArr = json[2];
    let urlArr = json[3];

    for (let i = 0; i < titleArr.length; i++) {
        let title = titleArr[i];
        let summary = summaryArr[i];
        let url = urlArr[i];
        resultsDiv.innerHTML += "<div> <a href=\""+ url+ "\"><h2>"+ title + "</h2> </a>" + summary +  "</div>";
    }
    
     interval = window.setInterval(fadeIn, 10, resultsDiv);
}

var opacity = 0.0;


var fadeIn = (function(element) {
    opacity += 0.08;
    if (opacity >= 1) {
        opacity = 0;
        element.style.opacity = "1.0";
        window.clearInterval(interval);
    } else {
        element.style.opacity = opacity;
    }
});

function handleSearchButtonClicked() {
    makeApiRequest(baseUrl + searchBox.value);
}

function search(event) {
    if (event.keyCode == 13) {
        handleSearchButtonClicked();
        return false;
    }
}
