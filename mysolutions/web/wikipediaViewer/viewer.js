let baseUrl = "https://en.wikipedia.org/w/api.php?action=opensearch&search=";
let searchButton;
let searchBox;

document.addEventListener("DOMContentLoaded", function(event) {
    searchButton = document.getElementById("search-button");
    searchBox = document.getElementById("search-box");
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
    xmlHttp.send(null);
}

function handleApiReturn(responseText) {
}

function handleSearchButtonClicked() {
    window.open(baseUrl + searchBox.value);
}
