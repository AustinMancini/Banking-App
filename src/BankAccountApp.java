public class BankAccountApp {
    public static void main(String[] args) {

        Checking chkacc1 = new Checking("John Smith", "123456789", 1500);

        Savings savacc1 = new Savings("Tom White", "098765432", 2500);

        savacc1.showInfo();

        System.out.println("***************");

        chkacc1.showInfo();

        // Read a CSV File and create new accounts based on the data
    }
}
