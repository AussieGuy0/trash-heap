const baseUrl = "http://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}";
const apiKey = "01d7df07b3e64d8a355eaedec50045ad";
let weatherElement;
let tempValue;
let celciusButton;
let farenheightButton;

document.addEventListener("DOMContentLoaded", function(event) {
    weatherElement = document.getElementById("weather");
    navigator.geolocation.getCurrentPosition(handlePosition);
    celciusButton = document.getElementById("celcius");
    farenheightButton = document.getElementById("farenheight");
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
    var weather = json.weather[0].main;
    var main = json.main;
    tempValue = new Temp(main.temp);
    weatherElement.innerHTML = tempValue.celciusTemp + " ºC";
    celciusButton.removeAttribute("href");
    getWeatherImage(weather);
}

function toggleMeasurement(measurement) {
    if (measurement === "C") {
        weatherElement.innerHTML = parseInt(tempValue.celciusTemp) + " ºC";
        switchButton(farenheightButton, celciusButton);
    } else if (measurement === "F") {
        weatherElement.innerHTML = parseInt(tempValue.farenheightTemp) + " ºF";
        switchButton(celciusButton, farenheightButton);
    }
}

function switchButton(turnOn, turnOff) {
    turnOn.setAttribute("href", "#");
    turnOff.removeAttribute("href");
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

function getWeatherImage(weather) { 
    let body = document.getElementsByTagName("body")[0];
    let backgroundUrl = "media/";
    switch (weather) {
        case "Clouds":
            backgroundUrl += "cloudy.jpg";
            break;
        case "Thunderstorm":
            backgroundUrl += "thunder.jpg";
            break;
        case "Drizzle":
            backgroundUrl += "drizzle.jpg";
            break;
        case "Rain":
            backgroundUrl += "rain.jpg";
            break;
        case "Snow":
            backgroundUrl += "snow.jpg";
            break;
        case "Atmosphere":
            backgroundUrl += "fog.jpg";
            break;
        case "Clear":
            backgroundUrl += "clear.jpg";
            break;
        case "Extreme":
            backgroundUrl += "extreme.jpg";
            break;
    }
    body.style.backgroundImage = "url(" + backgroundUrl +")";
}

