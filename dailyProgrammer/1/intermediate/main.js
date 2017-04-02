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
    dateHeader.addEventListener("click", () => sortTableByDate(eventTable));
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

function sortTableByDate(table) {
    let rows = table.rows;
    let workingRows = [];
    for (let i = 1; i < rows.length; i++) { //push all rows to array
        let row = rows[i];
        workingRows.push(row);
    }

    let rowsLength = table.rows.length;
    for (let i = 1; i < rowsLength; i++) { //delete all rows in table
        table.deleteRow(1);
    }

    while (workingRows.length > 0) { //re-add rows in order of date
        let indexOfMaxRow = 0;
        let maxRow = workingRows[0];
        for (let i = 1; i < workingRows.length; i++) {
            let maxDate = maxRow.cells[1].innerHTML;
            let currRow = workingRows[i];
            let currDate = currRow.cells[1].innerHTML;
            if (compareDates(maxDate, currDate) === -1) {
               maxRow = currRow; 
               indexOfMaxRow = i;
            }
        }
        workingRows.splice(indexOfMaxRow, 1);
        table.appendChild(maxRow);
    }

}

function compareDates(first, second) {
    let datePattern = /[0-9]{4}-[0-9]{2}-[0-9]{2}/;
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
