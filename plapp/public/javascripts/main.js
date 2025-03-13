document.getElementById('bsThemeSwitch').onchange = switchBootstrapTheme;

// cf. https://htmx.org/docs/#scripting or https://hypermedia.systems/client-side-scripting/#rsjs for more htmx-idiomatic approaches
function switchBootstrapTheme() {
  const body = document.body;
  const currentTheme = body.getAttribute("data-bs-theme");
  body.setAttribute(
    "data-bs-theme",
    currentTheme === "light" ? "dark" : "light"
  );
}
