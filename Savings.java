public class Savings extends Account {

    // List the properties specific to a Savings Account
    private int safetyDepositBoxID;
    private int safetyDepositBoxkey;

    // Constructor to initialize settings for the Savings account properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxkey = (int) (Math.random() * Math.pow(10, 4));
    }

    // List any methods specific to the Savings account
    public void showInfo() {
        super.showInfo();
        System.out.println("Your savings account features: " + "\n Safety deposit Box ID: " + safetyDepositBoxID
                + "\n Safety Deposit Box Key: " + safetyDepositBoxkey);
    }
}