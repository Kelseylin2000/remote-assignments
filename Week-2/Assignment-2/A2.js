// Complete the function below to calculate the average price of all the products

function avg(data) {
    let totalPrice = data.products.reduce((totalPrice, product) => {
        return totalPrice + product.price;
    }, 0);
    let avgPrice = totalPrice / data.products.length;
    return avgPrice;
}

console.log(
avg({
    size: 3,
    products: [
        {
        name: 'Product 1',
        price: 100,
        },
        {
        name: 'Product 2',
        price: 700,
        },
        {
        name: 'Product 3',
        price: 250,
        },
    ],
})
); // should print the average price of all products