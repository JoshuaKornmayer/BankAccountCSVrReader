import java.util.LinkedList;
import java.util.List;

public class BankAccountMain {

    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();
        // Checking chkacc1 = new Checking("Tom Wilson", "321456879", 1500);

        // Savings saveacc1 = new Savings("Rich Lowe", "456657897", 2500);

        // saveacc1.compound();

        // saveacc1.showInfo();
        // System.out.println("********");
        // chkacc1.showInfo();

        // read a csv file then create new accounts based on that data
        String file = "C:\\SDETuniversity\\Files\\NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);

            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, sSN, initDeposit));
            } else {
                System.out.println("Error reading account type");
            }
        }

        // accounts.get(5).showInfo();

        for (Account acc : accounts) {
            System.out.println("\n**********");
            acc.showInfo();
        }

    }
}