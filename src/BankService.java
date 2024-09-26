import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BankService {
    private final Scanner scanner;
    private final List<Account> accounts;

    // Konstruktör för att initiera BankService med en lista av konton och scanner
    public BankService(Scanner scanner, List<Account> accounts) {
        this.scanner = scanner;
        this.accounts = accounts;
    }

    // Metod för att visa menyn och hantera användarens val
    public void showMenu() {
        while (true) {
            System.out.println("1. Deposit \uD83D\uDCB5");
            System.out.println("2. Withdraw \uD83D\uDCB8");
            System.out.println("3. Transfer \uD83D\uDCB8");
            System.out.println("4. Show Balance \uD83C\uDFE6");
            System.out.println("5. Exit ➡\uFE0F \n<<---------->>");
            System.out.print("Choose an option: ");

            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.❌ Please enter a number.");
                scanner.next(); // Rensa ogiltig inmatning
                continue;
            }

            switch (choice) {
                case 1:
                    handleTransaction("deposit");
                    break;
                case 2:
                    handleTransaction("withdraw");
                    break;
                case 3:
                    handleTransfer();
                    break;
                case 4:
                    showBalances();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.❌ Please try again.");
            }
        }
    }

    // Metod för att hantera insättning och uttag
    private void handleTransaction(String action) {
        System.out.print("Enter amount to " + action + ": ");
        try {
            double amount = scanner.nextDouble();
            Account account = chooseAccount();
            if (action.equals("deposit")) {
                account.deposit(amount);
            } else if (action.equals("withdraw")) {
                account.withdraw(amount);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.❌ Please enter a valid amount.");
            scanner.next(); // Rensa ogiltig inmatning
        }
    }

    // Metod för att hantera överföringar mellan konton
    private void handleTransfer() {
        System.out.print("Enter amount to transfer: ");
        try {
            double transferAmount = scanner.nextDouble();
            Account fromAccount = chooseAccount("from");
            Account toAccount = chooseAccount("to");
            fromAccount.transferAmount(toAccount, transferAmount);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.❌ Please enter a valid amount.");
            scanner.next(); // Rensa ogiltig inmatning
        }
    }

    // Metod för att välja konto utan specifik åtgärd
    private Account chooseAccount() {
        return chooseAccount("");
    }

    // Metod för att välja konto med specifik åtgärd (från/till)
    private Account chooseAccount(String action) {
        System.out.println("Choose account " + action + ":");
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println((i + 1) + ". " + accounts.get(i));
        }
        int accountChoice = 0;
        try {
            accountChoice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.❌ Please enter a number.");
            scanner.next(); // Rensa ogiltig inmatning
        }

        if (accountChoice > 0 && accountChoice <= accounts.size()) {
            return accounts.get(accountChoice - 1);
        } else {
            System.out.println("Invalid choice.❌ Defaulting to first account.");
            return accounts.get(0);
        }
    }

    // Metod för att visa saldon för alla konton
    private void showBalances() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
