import java.util.*;

class Transaction {
    String type;        
    String description; 
    double amount;      
    String date;        
    String note;       

    void display() {
        System.out.println("\nTransaction Details:");
        System.out.println("Type        : " + type);
        System.out.println("Description : " + description);
        System.out.println("Amount      : $" + amount);
        System.out.println("Date        : " + date);
        System.out.println("Note        : " + note);
    }
}

public class MyBudgetTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0;

        System.out.println("Welcome to MyBudgetTracker");
        System.out.println("Choose an option:");
        System.out.println("1. Add Income");
        System.out.println("2. Add Expense");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine(); 
    
        if (choice == 1) {
            Transaction t = new Transaction();
            t.type = "Income";

            System.out.print("Enter description: ");
            t.description = sc.nextLine();

            System.out.print("Enter amount: ");
            t.amount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter date (DD-MM-YYYY): ");
            t.date = sc.nextLine();

            System.out.print("Enter note: ");
            t.note = sc.nextLine();

            balance += t.amount;
            t.display();
            System.out.println("Current Balance: $" + balance);
        }

        if (choice == 2) {
            Transaction t = new Transaction();
            t.type = "Expense";

            System.out.print("Enter description: ");
            t.description = sc.nextLine();

            System.out.print("Enter amount: ");
            t.amount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter date (DD-MM-YYYY): ");
            t.date = sc.nextLine();

            System.out.print("Enter note: ");
            t.note = sc.nextLine();

            balance -= t.amount;
            t.display();
            System.out.println("Current Balance: $" + balance);
        }

        if (choice == 3) {
            System.out.println("Current Balance: $" + balance);
        }

        if (choice == 4) {
            System.out.println("Exiting MyBudgetTracker. Goodbye!");
        }

        if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
            System.out.println("Invalid option. Run the program again.");
        }

        sc.close();
    }
}