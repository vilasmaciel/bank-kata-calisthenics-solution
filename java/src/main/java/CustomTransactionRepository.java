import java.util.ArrayList;

public class CustomTransactionRepository implements TransactionRepository {
    public static final String STATEMENTS_HEADER = "Calendar Amount Balance";

    private final Printer printer;
    private final Calendar calendar;
    private ArrayList<Transaction> transactions;

    public CustomTransactionRepository(Printer printer, Calendar calendar) {
        this.printer = printer;
        this.calendar = calendar;
        this.transactions = new ArrayList<>();
    }

    public void printStatements() {
        this.printer.printLine(STATEMENTS_HEADER);
        for (Transaction transaction : this.transactions) {
            transaction.print(this.printer);
        }
    }

    public void withdraw(Amount amount, Amount balance) {
        this.transactions.add(new Transaction(calendar, amount.negative(), balance));
    }

    public void deposit(Amount amount, Amount balance) {
        this.transactions.add(new Transaction(calendar, amount, balance));
    }
}
