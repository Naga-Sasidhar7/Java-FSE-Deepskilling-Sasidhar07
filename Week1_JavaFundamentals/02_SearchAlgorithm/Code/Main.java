package Week1_Exercises.Data_Structures_And_Algorithms.Serach_Algorithm;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(201, "Wireless Earbuds", "Electronics"),
                new Product(202, "Yoga Mat", "Fitness"),
                new Product(203, "Coffee Maker", "Home Appliances"),
                new Product(204, "Backpack", "Accessories")
        };

        System.out.println("🔍 Linear Search:");
        Product found1 = SearchEngine.linearSearch(products, "Yoga Mat");
        System.out.println(found1 != null ? "Found: " + found1 : "Product not found");

        System.out.println("\n🔍 Binary Search:");
        SearchEngine.sortByProductName(products); // sort first
        Product found2 = SearchEngine.binarySearch(products, "Yoga Mat");
        System.out.println(found2 != null ? "Found: " + found2 : "Product not found");
    }
}
