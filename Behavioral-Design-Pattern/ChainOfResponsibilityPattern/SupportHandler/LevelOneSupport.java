// package ChainOfResponsibilityPattern.SupportHandler;

public class LevelOneSupport extends SupportHandler{
    
    @Override
    public void handleRequest(String issue, int complexity) {
        if(complexity <= 1) {
            System.out.println("Level 1 support resolved: " + issue);
        } else if(nextHandler != null) {
            System.out.println("Level 1 support escalating: " + issue);
            nextHandler.handleRequest(issue, complexity);
        } else {
            System.out.println("Issue Unresolved: " + issue);
        }
    }
}
