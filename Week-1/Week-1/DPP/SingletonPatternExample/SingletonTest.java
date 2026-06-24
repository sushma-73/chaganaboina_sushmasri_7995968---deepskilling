public class SingletonTest {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started");
        logger2.log("Processing request");

        if (logger1 == logger2) {
            System.out.println("Both references point to the same Logger instance");
        } else {
            System.out.println("Different Logger instances created");
        }
    }
}