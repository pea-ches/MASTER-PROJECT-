const items = document.getElementById("items");
const templateCard = document.getElementById("template-card").content;
const fragment = document.createDocumentFragment();

document.addEventListener("DOMContentLoaded", () => fetchData());

const endPoint = "http://127.0.0.1:8080";

const fetchData = async () => {
  try {
    const resp = await fetch(endPoint + "/tienda");
    const data = await resp.json();
    mostrarCard(data);
  } catch (error) {
    console.error(error);
  }
};

const mostrarCard = (data) => {
  data.forEach((item) => {
    templateCard.querySelector("h2").textContent = item.nombreProducto;
    templateCard.querySelector("h3").textContent = "$" + item.precio;
    templateCard.querySelector("img").textContent = item.img;
    templateCard.querySelector("h4").textContent = item.valoracionProducto;
    const clone = templateCard.cloneNode(true);
    fragment.appendChild(clone);
    console.log(item);
  });
  items.appendChild(fragment);
};
