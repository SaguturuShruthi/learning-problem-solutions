// File: Logger.java

public class Logger {

    // 1. A private static variable to hold the one and only instance of the class.
    private static Logger instance;

    // 2. A private constructor to prevent anyone else from creating an instance.
    private Logger() {
        // This print statement helps us see when the instance is created.
        System.out.println("Logger instance has been created.");
    }

    // 3. A public static method to provide the single point of access.
    public static Logger getInstance() {
        // "Lazy initialization": create the instance only if it doesn't exist yet.
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    /**
     * A sample method for the Logger to perform an action.
     */
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}