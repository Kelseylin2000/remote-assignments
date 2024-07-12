function ajax(src, callback) {
    fetch(src)
        .then(response => response.json())
        .then(data => callback(data))
}
function render(data) {
    let productsDiv = document.createElement("div");
    productsDiv.className = "productsDiv";

    for(const product of data){
        let productDiv = document.createElement("div");

        createAndAppendElement(productDiv, "h3", product.name);
        createAndAppendElement(productDiv, "p", product.price);
        createAndAppendElement(productDiv, "p", product.description);

        productDiv.className = "productDiv";
        productsDiv.appendChild(productDiv);
    }

    document.body.appendChild(productsDiv);
}

function createAndAppendElement(parent, tag, textContent) {
    let element = document.createElement(tag);
    element.textContent = textContent;
    parent.appendChild(element);
}

ajax( 'https://remote-assignment.s3.ap-northeast-1.amazonaws.com/products', function (response) {
render(response); }); // you should get product information in JSON format and render data in the page