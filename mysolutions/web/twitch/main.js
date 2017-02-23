let streamerList;
let mockJsonUrl = "https://gist.githubusercontent.com/QuincyLarson/2ff6892f948d0b7118a99264fd9c1ce8/raw/e9e12f154d71cf77fc32e94e990749a7383ca2d6/Twitch%2520sample%2520API%2520responses%2520in%2520array%2520form";

document.addEventListener("DOMContentLoaded", function (event) {
    makeApiRequest(mockJsonUrl);
    streamerList = document.getElementById("list");
});



function makeApiRequest(url) {
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.onreadystatechange = function () {
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
            handleApiReturn(xmlHttp.responseText);
        }
    };
    xmlHttp.open("GET", url, true);
    xmlHttp.send(null);
}

function handleApiReturn(response) {
    let json = JSON.parse(response);
    for (let i = 0; i < json.length; i++) {
        let element = json[i].stream;
        if (element != null) {
            let item = document.createElement('li');
            item.appendChild(document.createTextNode(element.display_name + " ||| " + element.status));
            streamerList.appendChild(item)
        }
    }
}