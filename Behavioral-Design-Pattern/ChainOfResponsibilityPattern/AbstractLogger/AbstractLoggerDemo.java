// package ChainOfResponsibilityPattern.AbstractLogger;


public class AbstractLoggerDemo {

    public static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.nextLogger(fileLogger);
        fileLogger.nextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        
        AbstractLogger logchain = getChainOfLoggers();

        logchain.logMessage(AbstractLogger.INFO, "Information message.");
        logchain.logMessage(AbstractLogger.DEBUG, "Debug message.");
        logchain.logMessage(AbstractLogger.ERROR, "Error message.");
    }
}
