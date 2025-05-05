// package ChainOfResponsibilityPattern.SupportHandler;

public class LevelTwoSupport extends SupportHandler{
    
    @Override
    public void handleRequest(String issue, int complexity) {
        if(complexity <= 2) {
            System.out.println("Level 2 Support resolved: " + issue);
        } else if(nextHandler != null) {
            System.out.println("Level 2 support escalating: " + issue);
            nextHandler.handleRequest(issue, complexity);
        } else {
            System.out.println("Issue Unresolved: " + issue);
        }
    }
}
