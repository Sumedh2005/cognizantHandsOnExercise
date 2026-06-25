public class SingletonTest {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started.");
        logger2.log("User logged in.");

        // Verify both variables point to the same instance
        if (logger1 == logger2) {
            System.out.println("SUCCESS: Both variables point to the same Logger instance!");
        } else {
            System.out.println("FAIL: Different instances created.");
        }
    }
}