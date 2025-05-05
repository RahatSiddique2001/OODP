package Assignment_2;

public interface AuthorizationHandler {

    void authorize(int amount);
    void setNextHandler(AuthorizationHandler nextHandler);
    
}
