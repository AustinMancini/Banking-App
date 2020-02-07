import org.jetbrains.annotations.NotNull;

public abstract class Account implements IBaseRate {
    // ***PARENT Class*** //

    // List common properties for savings and checking accounts
    String name;
    String sSN;
    double balance;

    static int index = 10000;
    String accountNumber;
    double rate;

    // Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        // Set account number
        index++;
        this.accountNumber = setAccountNumber();

        // Call in ACCOUNT super class since method is in both Checking and Savings class
        setRate();
    }

    // Checking and Savings HAVE to implement this method
    public abstract void setRate();

    @NotNull
    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length()-2);
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    // List of common methods
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }

    public void withDraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing $ " + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transfering $" + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is now: $" + balance);
    }

    public void showInfo() {
        System.out.println(
                "NAME: " + name +
                 "\nACCOUNT NUMBER: " + accountNumber +
                 "\nBALANCE: " + balance +
                 "\nRATE: " + rate + "%"
        );
    }
}
