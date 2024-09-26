// 17 sep 2024 Jonas N Övning-2 Klasser och Objekt. Skapa en Bank Account
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Skapa konton
        Account savingsAccount = new Account("Alice", 1000);
        Account checkingAccount = new Account("Erik", 500);
        SavingsAccount businessAccount = new SavingsAccount("Bob", 1000, 5);
        Account anotherAccount = new Account("Charlie", 2000);

        // Lägg till konton i en lista
        List<Account> accounts = new ArrayList<>();
        accounts.add(savingsAccount);
        accounts.add(checkingAccount);
        accounts.add(businessAccount);
        accounts.add(anotherAccount);

        // Lägg till ränta till businessAccount
        businessAccount.addInterest();
        System.out.println("Lagts till: " + businessAccount + "\n<<---MENU--->>");

        // Skapa en instans av BankService och visa menyn
        BankService bankService = new BankService(scanner, accounts);
        bankService.showMenu();
    }
}
