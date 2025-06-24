public class EcommerceSearchTest {
    public static void main(String[] args) {
        // Create an array of products
        Product[] products = {
            new Product(3, "Laptop", "Electronics"),
            new Product(1, "Smartphone", "Electronics"),
            new Product(2, "Tablet", "Electronics"),
            new Product(4, "Headphones", "Accessories"),
            new Product(5, "Charger", "Accessories")
        };

        // Test Linear Search
        System.out.println("Linear Search:");
        Product foundProduct = ProductSearch.linearSearch(products, 3);
        if (foundProduct != null) {
            System.out.println("Found: " + foundProduct);
        } else {
            System.out.println("Product not found.");
        }

        // Test Binary Search
        System.out.println("\nBinary Search:");
        ProductSearch.sortProducts(products); // Sort products before binary search
        foundProduct = ProductSearch.binarySearch(products, 3);
        if (foundProduct != null) {
            System.out.println("Found: " + foundProduct);
        } else {
            System.out.println("Product not found.");
        }
    }
}
