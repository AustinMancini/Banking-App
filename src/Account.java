public abstract class Account implements IBaseRate {
    // ***PARENT Class*** //

    // List common properties for savings and checking accounts
    String name;
    String sSN;
    double balance;
    String accountNumber;
    double rate;


    // Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        System.out.println("NAME: " + name + " SSN: " + sSN + " BALANCE: " + balance);

        // Set account number
        this.accountNumber = setAccountNumber();
        System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
    }

    private String setAccountNumber() {
        return sSN.substring(sSN.length()-2, sSN.length());
    }

    // List of common methods

}
