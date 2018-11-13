public class Transaction {

    private final Calendar calendar;
    private final Amount amount;
    private final Amount balance;

    public Transaction(Calendar calendar, Amount amount, Amount balance) {
        this.calendar = calendar;
        this.amount = amount;
        this.balance = balance;
    }

    public void print(Printer printer) {
        printer.printLine(calendar.dateToString() + " " + this.amount.toString() + " " + this.balance.toString());
    }
}
