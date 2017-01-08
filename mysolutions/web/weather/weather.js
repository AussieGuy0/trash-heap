var baseUrl = "http://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}";
var apiKey = "01d7df07b3e64d8a355eaedec50045ad";
var weatherElement;
var tempValue;

document.addEventListener("DOMContentLoaded", function(event) {
    weatherElement = document.getElementById("weather");
    navigator.geolocation.getCurrentPosition(handlePosition);
    var celciusButton = document.getElementById("celcius");
    celciusButton.addEventListener('click', function(){
       toggleMeasurement('C'); 
    });
    var farenheightButton = document.getElementById("farenheight");
    farenheightButton.addEventListener('click', function(){
       toggleMeasurement('F'); 
    });
});

function handlePosition(pos) {
    let url;
    var lat = pos.coords.latitude;
    var lon = pos.coords.longitude;

    url = baseUrl.replace("{lat}",lat);
    url = url.replace("{lon}",lon);
    url = url + "&APPID=" + apiKey;
    makeApiRequest(url);
}


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
    var json = JSON.parse(responseText);
    var weather = json.weather;
    var main = json.main;
    tempValue = new Temp(main.temp);
    weatherElement.innerHTML = tempValue.celciusTemp;
}

function toggleMeasurement(measurement) {
    if (measurement === "C") {
        weatherElement.innerHTML = tempValue.celciusTemp;
    } else if (measurement === "F") {
        weatherElement.innerHTML = tempValue.farenheightTemp;
    }
}


function Temp(kelvinTemp) {
    this.kelvinTemp = kelvinTemp;
    this.celciusTemp = kelvinToCelcius(kelvinTemp);
    this.farenheightTemp = kelvinToFarenheight(kelvinTemp);
}

function kelvinToCelcius(kelvin) {
    return kelvin - 273.15; 
}

function kelvinToFarenheight(kelvin) {
    return kelvin * (9/5) - 459.67;
}


