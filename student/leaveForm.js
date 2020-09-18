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
