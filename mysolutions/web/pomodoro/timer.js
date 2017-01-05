$(document).ready(function() {
    var minutesClass = $(".minutes");
    var secondsClass = $(".seconds");
    var sessionLength = $("#sessionLength");
    var breakLength = $("#breakLength");
    var progressBar = $("#progressBar");
    var type = $("#type");
    var started = false;
    var breakTime = false;

    var minutes = 25;
    var seconds = 0;

    var minutesSession = 25;
    var minutesBreak = 5;

    $("#startBtn").on("click", startClock);
    $("#addMinuteButton").on("click", addMinuteClock);
    $("#minusMinuteButton").on("click", minusMinuteClock);
    $("#minusBreakMinuteButton").on("click", minusBreakMinute);
    $("#addBreakMinuteButton").on("click", addBreakMinute);
    buildClock();

    var timeInterval;

    function buildClock() {
        minutesClass.html(minutes);
        secondsClass.html("0" + seconds);
        sessionLength.html(minutesSession);
        breakLength.html(minutesBreak);
    }

    function updateClock() {
        if ((seconds === 0 && minutes === 0) && breakTime === false) {
            beep();
            minutes = minutesBreak;
            breakTime = true;
            type.html("BREAK");
        } else if ((seconds === 0 && minutes === 0) && breakTime === true) {
            beep();
            minutes = minutesSession;
            breakTime = false;
            type.html("WORK");
        }

        if (seconds === -1) {
            minutes = minutes - 1;
            seconds = 59;
        }
        if (seconds <= 9) {
            secondsClass.html("0" + seconds);
        } else {
            secondsClass.html(seconds);
        }
        minutesClass.html(minutes);
        seconds = seconds - 1;
    }

    function startClock() {
        if (started === true) {
            $("#startBtn").html("Start");
            clearInterval(timeInterval);
            started = false;
        } else {
            $("#startBtn").html("Stop");
            updateClock();
            timeInterval = setInterval(updateClock, 1000);
            started = true;
        }
    }

    function addMinuteClock() {
        if (started === false) {
            if (breakTime === false) {
                minutes++;
                minutesClass.html(minutes);
            }
            minutesSession++;
            sessionLength.html(minutesSession);

        } else if (breakTime === true) {
            minutesSession++;
            sessionLength.html(minutesSession);
        }
    }

    function minusMinuteClock() {
        if (minutes > 1 && started === false) {
            if (breakTime === false) {
                minutes--;
                minutesClass.html(minutes);
            }
            if (minutesSession > 1) {
                minutesSession--;
                sessionLength.html(minutesSession);
            }

        } else if (minutesSession > 1 && breakTime === true) {
            minutesSession--;
            sessionLength.html(minutesSession);
        }
    }

    function addBreakMinute() {
        if (started === false) {
            if (breakTime === true) {
                minutes++;
                minutesClass.html(minutes);
            }
            minutesBreak++;
            breakLength.html(minutesBreak);

        } else if (breakTime === false) {
            minutesBreak++;
            breakLength.html(minutesBreak);
        }
    }

    function minusBreakMinute() {
        if (minutes > 1 && started === false) {
            if (breakTime === true) {
                minutes--;
                minutesClass.html(minutes);
            }
            if (minutesBreak > 1) {
                minutesBreak--;
                breakLength.html(minutesBreak);
            }
        } else if (minutesBreak > 1 && breakTime === false) {
            minutesBreak--;
            breakLength.html(minutesBreak);
        }
    }

});
