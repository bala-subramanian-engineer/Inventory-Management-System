// Initialize Dashboard
document.addEventListener('DOMContentLoaded', () => {
    loadProducts();
    checkLowStock();
    
    // Form Submission
    document.getElementById('productForm').addEventListener('submit', (e) => {
        e.preventDefault();
        addProduct({
            name: document.getElementById('productName').value,
            price: parseFloat(document.getElementById('productPrice').value),
            stockQuantity: parseInt(document.getElementById('productStock').value)
        });
    });
});

// API Functions
async function loadProducts() {
    const response = await fetch('/api/products');
    const products = await response.json();
    const tableBody = document.querySelector('#productsTable tbody');
    tableBody.innerHTML = '';
    
    products.forEach(product => {
        const stockClass = product.stockQuantity < 10 ? 'text-danger fw-bold' : '';
        const row = `
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td class="${stockClass}">${product.stockQuantity}</td>
                <td>$${product.price.toFixed(2)}</td>
                <td>
                    <button class="btn btn-sm btn-outline-primary">Edit</button>
                    <button class="btn btn-sm btn-outline-danger">Delete</button>
                </td>
            </tr>
        `;
        tableBody.innerHTML += row;
    });
}

async function checkLowStock() {
    const response = await fetch('/api/products/low-stock?threshold=10');
    const lowStockItems = await response.json();
    
    if (lowStockItems.length > 0) {
        document.getElementById('lowStockAlert').style.display = 'block';
        document.getElementById('lowStockCount').textContent = lowStockItems.length;
    }
}