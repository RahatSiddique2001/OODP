// package ChainOfResponsibilityPattern.SupportHandler;

public class SupportHandlerDemo {
    
    public static void main(String[] args) {
        SupportHandler level1 = new LevelOneSupport();
        SupportHandler level2 = new LevelTwoSupport();
        SupportHandler expert = new ExpertSupport();

        level1.setNextHandler(level2);
        level2.setNextHandler(expert);

        level1.handleRequest("Forgot Password", 1);
        System.out.println("-----");

        level1.handleRequest("Cannot install Software", 2);
        System.out.println("---------");

        level1.handleRequest("System Crash on Boot", 3);
        System.out.println("----------");

        level1.handleRequest("Hardware incompatibility",4);
    }
}
