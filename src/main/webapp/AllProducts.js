/**
 * 
 */
// scripts.js

document.addEventListener('DOMContentLoaded', () => {
    // Assuming 'products' is sent as a JSON string in the JSP page
    const products = JSON.parse('<%= new org.json.JSONArray(request.getAttribute("products")).toString() %>');
    let currentIndex = 0;

    function showProduct(index) {
        if (index < 0 || index >= products.length) return;
        
        const product = products[index];
        const container = document.getElementById('productContainer');
        
        container.innerHTML = `
            <div class="product-detail">
                <h2>${product.productName}</h2>
                <p>Price: $${product.price}</p>
                <p>Description: ${product.description}</p>
                <p>Brand: ${product.brand}</p>
                <p>Rating: ${product.rating}</p>
                <p>Discount: ${product.discount}%</p>
                <button class="add-to-cart" data-product-id="${product.productId}">Add to Cart</button>
            </div>
        `;
    }

    function updateButtons() {
        document.getElementById('prevBtn').disabled = currentIndex === 0;
        document.getElementById('nextBtn').disabled = currentIndex === products.length - 1;
    }

    document.getElementById('prevBtn').addEventListener('click', () => {
        if (currentIndex > 0) {
            currentIndex--;
            showProduct(currentIndex);
            updateButtons();
        }
    });

    document.getElementById('nextBtn').addEventListener('click', () => {
        if (currentIndex < products.length - 1) {
            currentIndex++;
            showProduct(currentIndex);
            updateButtons();
        }
    });

    // Initialize
    showProduct(currentIndex);
    updateButtons();
});
