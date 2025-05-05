package Assignment_2;

public class CashWithdrawal {
    public static void main(String[] args) {

        AuthorizationHandler cashier = new Cashier();
        AuthorizationHandler seniorOfficer = new SeniorOfficer();
        AuthorizationHandler manager = new Manager();

        cashier.setNextHandler(seniorOfficer);
        seniorOfficer.setNextHandler(manager);

        cashier.authorize(10000);
        cashier.authorize(100000);
        cashier.authorize(1000001);

    }
}