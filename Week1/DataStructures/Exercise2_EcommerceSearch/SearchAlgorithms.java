public class SearchAlgorithms {

    // LINEAR SEARCH - O(n) - checks each element one by one
    public static Product linearSearch(Product[] products, String targetName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(targetName)) {
                return products[i];  // Found it
            }
        }
        return null;  // Not found
    }

    // BINARY SEARCH - O(log n) - array MUST be sorted by productName first
    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int comparison = products[mid].productName.compareToIgnoreCase(targetName);

            if (comparison == 0) {
                return products[mid];  // Found it
            } else if (comparison < 0) {
                left = mid + 1;        // Target is in right half
            } else {
                right = mid - 1;       // Target is in left half
            }
        }
        return null;  // Not found
    }
}