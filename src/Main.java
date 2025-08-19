public class Main {
    public static void main(String[] args) {
        BankAccount johnDoeAccount = new BankAccount("John Doe", 1000.0);
        BankAccount janeSmithAccount = new BankAccount("Jane Smith", 2500.0);
        BankAccount bobJohnsonAccount = new BankAccount("Bob Johnson", 500.0);

        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.println("Interest Rate: " + (BankAccount.interestRate * 100) + "%\n");

        johnDoeAccount.displayAccountInfo();
        janeSmithAccount.displayAccountInfo();
        bobJohnsonAccount.displayAccountInfo();

        System.out.println("\n╔═══════════════════ Account Operations ═══════════════════╗");
        johnDoeAccount.deposit(500.0);
        janeSmithAccount.withdraw(300.0);

        System.out.println("\n╔═══════════════════ Interest Calculation ═══════════════════╗");
        double johnDoeInterest = johnDoeAccount.calculateInterest();
        double janeSmithInterest = janeSmithAccount.calculateInterest();
        double bobJohnsonInterest = bobJohnsonAccount.calculateInterest();

        System.out.println("John Doe's interest: $" + johnDoeInterest);
        System.out.println("Jane Smith's interest: $" + janeSmithInterest);
        System.out.println("Bob Johnson's interest: $" + bobJohnsonInterest);

        System.out.println("\nTotal Accounts Created: " + BankAccount.totalAccounts);
    }
}
