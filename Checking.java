public class Checking extends Account {

    // List the properties specific to a Checking Account
    private int debitCardNumber;
    private int debitCardPin;

    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    // List any methods specific to the Checkings account
    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));

    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your checking account features " + "\n Debit Card Number: " + debitCardNumber
                + "\n Debit Card PIN: " + debitCardPin);
    }
}