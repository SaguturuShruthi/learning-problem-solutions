// File: SingletonTest.java

public class SingletonTest {

    public static void main(String[] args) {
        System.out.println("--- Starting Singleton Pattern Test ---");

        System.out.println("\nRequesting the first logger instance...");
        Logger logger1 = Logger.getInstance();
        logger1.log("First message from logger1.");

        System.out.println("\nRequesting the second logger instance...");
        Logger logger2 = Logger.getInstance();
        logger2.log("Second message from logger2.");

        // Now, we verify if they are the same object.
        System.out.println("\n--- Verification ---");
        if (logger1 == logger2) {
            System.out.println("SUCCESS: Both logger1 and logger2 refer to the same object.");
            System.out.println("Hashcode of logger1: " + logger1.hashCode());
            System.out.println("Hashcode of logger2: " + logger2.hashCode());
        } else {
            System.out.println("FAILURE: logger1 and logger2 are different objects.");
        }
    }
}