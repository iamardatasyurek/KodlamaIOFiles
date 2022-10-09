public class Main {
    public static void main(String[] args) {
        BaseLogger[] baseLoggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger(),
                new ConsoleLogger() };
        for (BaseLogger logger : baseLoggers) {
            logger.log("123");
        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
