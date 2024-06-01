public class Main {
    public static void main(String[] args) throws Exception {
/*         EmailLogger emailLogger = new EmailLogger();
        emailLogger.log("Email Log message");
        BaseLogger[] loggers = new BaseLogger[] {new EmailLogger(), new FileLogger(), new DatabaseLogger(), new ConsoleLogger()};
        for (BaseLogger logger : loggers) {
            logger.log("Log message");
        } */

        CustomerManager customerManager = new CustomerManager(new EmailLogger());
        customerManager.Add();
    }
}
