public class SingletonTest {
    public static void main(String[] args) {

        // Get two "instances"
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Use them
        logger1.log("Application started.");
        logger2.log("User logged in.");

        // Prove they are the SAME object
        if (logger1 == logger2) {
            System.out.println("SUCCESS: Both variables point to the same Logger instance!");
        } else {
            System.out.println("FAIL: Different instances created.");
        }
    }
}