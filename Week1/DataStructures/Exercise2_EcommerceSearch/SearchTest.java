import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {
    public static void main(String[] args) {

        // Unsorted array - for Linear Search
        Product[] products = {
            new Product(3, "Laptop", "Electronics"),
            new Product(1, "Apple", "Fruits"),
            new Product(5, "Notebook", "Stationery"),
            new Product(2, "Headphones", "Electronics"),
            new Product(4, "Mango", "Fruits")
        };

        // --- LINEAR SEARCH (works on unsorted array) ---
        System.out.println("=== LINEAR SEARCH ===");
        Product result1 = SearchAlgorithms.linearSearch(products, "Headphones");
        System.out.println("Searching for 'Headphones': " + (result1 != null ? result1 : "Not found"));

        Product result2 = SearchAlgorithms.linearSearch(products, "Tablet");
        System.out.println("Searching for 'Tablet': " + (result2 != null ? result2 : "Not found"));

        // --- BINARY SEARCH (needs sorted array first) ---
        System.out.println("\n=== BINARY SEARCH ===");
        // Sort by productName before binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        Product result3 = SearchAlgorithms.binarySearch(products, "Laptop");
        System.out.println("Searching for 'Laptop': " + (result3 != null ? result3 : "Not found"));

        Product result4 = SearchAlgorithms.binarySearch(products, "Tablet");
        System.out.println("Searching for 'Tablet': " + (result4 != null ? result4 : "Not found"));

        // --- COMPARISON ---
        System.out.println("\n=== ANALYSIS ===");
        System.out.println("Linear Search  - Time Complexity: O(n) - checks every element");
        System.out.println("Binary Search  - Time Complexity: O(log n) - halves search space each time");
        System.out.println("Binary search is faster but requires a sorted array.");
    }
}