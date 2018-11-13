public class Account {

    public static final int INITIAL_ACCOUNT_BALANCE = 0;

    private Amount balance;
    private TransactionRepository transactions;

    public Account(TransactionRepository transactions) {
        this.balance = new Amount(INITIAL_ACCOUNT_BALANCE);
        this.transactions = transactions;
    }

    void deposit(Amount amount) {
        this.balance = this.balance.plus(amount);
        this.transactions.deposit(amount, this.balance);
    }

    void withdraw(Amount amount) {
        this.balance = this.balance.subtracts(amount);
        this.transactions.withdraw(amount, this.balance);
    }

    void printStatements() {
        this.transactions.printStatements();
    }

}
