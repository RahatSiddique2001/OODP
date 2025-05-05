package Assignment_2;

class Cashier implements AuthorizationHandler {

    private AuthorizationHandler nextHandler;

    @Override
    public void authorize(int amount) {
        if (amount <= 10000) {
            System.out.println("Cashier authorized");
            System.out.println("Money withdraw: " + amount + "\n");
        } else if (nextHandler != null) {

            if(amount >= 1000000) {
                System.out.println("Cashier forwarding to SeniorOfficer ...");
            } else {
                System.out.println("Cashier authorized ...");           
            }
            
            nextHandler.authorize(amount);
        } else {
            System.out.println("Authorization denied.");
        }
    }

    @Override
    public void setNextHandler(AuthorizationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

}
