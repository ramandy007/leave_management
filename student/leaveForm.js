function selectorChange(event) {
  console.log(event.value);

  var OD = document.querySelectorAll(".od");
  var NotOD = document.querySelectorAll(".not-od");

  //   console.log(OD);
  var x;
  if (event.value == "OD") {
    for (x of OD) {
      console.log(x.style.display);
      x.style.display = "block";
    }
    for (x of NotOD) {
      x.style.display = "none";
    }
  } else {
    for (x of OD) {
      x.style.display = "none";
    }
    for (x of NotOD) {
      x.style.display = "block";
    }
  }
}

function validate() {
  typeOfLeave = document.querySelector("#Type_Leave");
  startDate = document.querySelector("#Start_date");
  endDate = document.querySelector("#End_date");
  faculty = document.querySelector("#Faculty");
  eventName = document.querySelector("#EventName");
  reason = document.querySelector("#Reason");
  //   console.log(new Date(startDate).getTime());
  //   console.log(new Date(endDate).getTime());

  flag = false;
  error = "";
  if (typeOfLeave.value == "none") {
    error += "Select Type of Leave\n";
    flag = true;
  }
  if (startDate.value == "" || endDate.value == "") {
    flag = true;
    error = error + "Check the start date or end date. \n";
  } else {
    if (
      new Date(endDate.value).getTime() < new Date(startDate.value).getTime()
    ) {
      flag = true;
      error += "Duration is invalid End date < Start date";
    }
  }
  if (typeOfLeave.value == "OD") {
    if ((faculty.value = "" || eventName.value == "")) {
      flag = true;
      error += "Check the Faculty or Event Name. \n";
    }
  } else {
    if (reason.value == "") {
      error += "Enter Reason of leave\n";
      flag = true;
    }
  }

  if (flag) {
    alert(error);
  } else {
    alert("Success");
  }
}
