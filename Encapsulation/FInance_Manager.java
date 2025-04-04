import java.util.ArrayList;
import java.util.Scanner;

class FinanceManager {
    private double income;
    private double expenses;
    private ArrayList<String> expenseDetails;

    public FinanceManager(double income) {
        this.income = income;
        this.expenses = 0;
        this.expenseDetails = new ArrayList<>();
    }

    public void addExpense(String detail, double amount) {
        if (amount > 0 && amount <= income - expenses) {
            expenses += amount;
            expenseDetails.add(detail + ": $" + amount);
            System.out.println("✅ Expense added: " + detail + " - $" + amount);
        } else {
            System.out.println("❌ Insufficient budget!");
        }
    }

    public double getSavings() {
        return income - expenses;
    }

    public String getBudgetAdvice() {
        double savings = getSavings();
        if (savings > income * 0.5) {
            return "You're saving well! Consider investing.";
        } else if (savings > income * 0.2) {
            return "You're doing fine, but optimize unnecessary spending.";
        } else {
            return "Warning: High spending! Reduce unnecessary expenses.";
        }
    }

    public void displaySummary() {
        System.out.println("\n Financial Summary:");
        System.out.println("Income: $" + income);
        System.out.println("Expenses: $" + expenses);
        System.out.println("Savings: $" + getSavings());
        System.out.println("\nExpense Breakdown:");
        for (String e : expenseDetails) {
            System.out.println("  - " + e);
        }
        System.out.println("\nAI Advice: " + getBudgetAdvice());
    }
}

public class PersonalFinanceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FinanceManager userFinance = new FinanceManager(5000);

        userFinance.addExpense("Rent", 1200);
        userFinance.addExpense("Groceries", 400);
        userFinance.addExpense("Entertainment", 300);

        userFinance.displaySummary();

        scanner.close();
    }
}
