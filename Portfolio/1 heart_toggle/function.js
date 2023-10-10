const srce = document.querySelector(".srce5");
srce.addEventListener("click", () => {
  if (!srce.classList.contains("forward")) {
    srce.classList.add("forward");
    srce.classList.remove("reverse");
  } else {
    srce.classList.add("reverse");
    srce.classList.remove("forward");
  }
});
