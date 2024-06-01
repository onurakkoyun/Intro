public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void Add() {
        System.out.println("Customer added");
        // BaseLogger logger = new BaseLogger();
        // logger.log("Log message");
        // EmailLogger logger = new EmailLogger();
        // logger.log("Log message");
        // FileLogger logger = new FileLogger();
        // logger.log("Log message");
        // DatabaseLogger logger = new DatabaseLogger();
        // logger.log("Log message");
        // Polymorphism
        BaseLogger logger = new DatabaseLogger();
        logger.log("Log message");
    }
}
