// package ChainOfResponsibilityPattern.SupportHandler;

public class ExpertSupport extends SupportHandler {
    
    @Override
    public void handleRequest(String issue, int complexity) {
        if(complexity <= 3) {
            System.out.println("Expert support resolved: " + issue);
        } else {
            System.out.println("Even Expert support cannot resolve: " + issue);
        }
    }
}
