let eventTable;
let nameInput;
let dateInput;
let addButton;
let dateHeader;

document.addEventListener("DOMContentLoaded", function (event) {
    eventTable = document.getElementById("event-table");
    nameInput = document.getElementById("name");
    dateInput = document.getElementById("date");
    dateHeader = document.getElementById("date-header");
    dateHeader.addEventListener("click", () => sortTableByDate());
    addButton = document.getElementById("add-button");
    addButton.addEventListener("click", () => {
        addEvent(nameInput.value, dateInput.value, eventTable);
    });
});

function addEvent(name, date, table) {
    let row = table.insertRow(1);

    let nameCell = row.insertCell(0);
    nameCell.innerHTML = name;

    let dateCell = row.insertCell(1);
    dateCell.innerHTML = date;
}

function sortTableByDate() {
}

function compareDates(first, second) {
    let datePattern = /[0-9]{4}-[0-9]{2}-[0-9]{2}/g;
    if (!datePattern.test(first) || !datePattern.test(second)) {
        return;
    }
    firstDate = new Date(first);
    secondDate = new Date(second);

    if (firstDate.getTime() > secondDate.getTime()) {
        return 1;
    } else if (firstDate.getTime() < secondDate.getTime()) {
        return -1;
    } else {
        return 0;
    }
}
