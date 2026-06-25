import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    // Create logger for this class
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        // ERROR - something went seriously wrong
        logger.error("This is an error message");

        // WARN - something unexpected but not fatal
        logger.warn("This is a warning message");

        // INFO - general app info (default visible level)
        logger.info("This is an info message");

        // DEBUG - detailed info for debugging
        logger.debug("This is a debug message");

        // TRACE - very fine-grained info
        logger.trace("This is a trace message");

        System.out.println("Check console above for log output.");
    }
}