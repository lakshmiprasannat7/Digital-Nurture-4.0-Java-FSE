import java.util.Arrays;

public class ProductSearch {
    // Linear Search Implementation
    public static Product linearSearch(Product[] products, int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null; // Not found
    }

    // Binary Search Implementation
    public static Product binarySearch(Product[] products, int productId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getProductId() == productId) {
                return products[mid];
            } else if (products[mid].getProductId() < productId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Not found
    }

    // Method to sort products by productId for binary search
    public static void sortProducts(Product[] products) {
        Arrays.sort(products, (a, b) -> Integer.compare(a.getProductId(), b.getProductId()));
    }
}