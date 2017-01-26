let baseUrl = "https://en.wikipedia.org/w/api.php?action=opensearch&format=json&origin=*&search=";
let searchButton;
let searchBox;
let resultsDiv;
let fadeInInterval;
let spinInterval;
let spinner;
let spinnerDiv;

document.addEventListener("DOMContentLoaded", function(event) {
    searchButton = document.getElementById("search-button");
    searchBox = document.getElementById("search-box");
    resultsDiv = document.getElementById("results");
    spinner = document.getElementById("spinner");
    spinnerDiv = document.getElementById("spinner-div");
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
    spinInterval = window.setInterval(spinAnimation, 10, spinner);
    spinnerDiv.style.display = "block";
    xmlHttp.send(null);
}

function handleApiReturn(responseText) {
    spinnerDiv.style.display = "none";
    window.clearInterval(spinInterval);
    let json = JSON.parse(responseText);
    let titleArr = json[1];
    let summaryArr = json[2];
    let urlArr = json[3];

    for (let i = 0; i < titleArr.length; i++) {
        let title = titleArr[i];
        let summary = summaryArr[i];
        let url = urlArr[i];
        resultsDiv.innerHTML += "<div> <div style=\"border-bottom: solid; border-color: #44B3C2\"> <a href=\""+ url+ "\"><h2>"+ title + "</h2> </a></div>" + summary +  "</div>";
    }
    
    fadeInInterval  = window.setInterval(fadeIn, 10, resultsDiv);
    
}

var opacity = 0.0;

var fadeIn = (function(element) {
    opacity += 0.08;
    if (opacity >= 1) {
        opacity = 0;
        element.style.opacity = "1.0";
        window.clearInterval(fadeInInterval);
    } else {
        element.style.opacity = opacity;
    }
});

var rotation = 0;

let spinAnimation = (function(element) {
    rotation += 2;
    let style =  "rotate(" + rotation + "deg)";
    element.style.transform = style;
    element.style.webkitTransform = style;
    if (rotation >= 360) {
        rotation = 0;
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
