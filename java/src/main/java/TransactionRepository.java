public interface TransactionRepository {

    public void printStatements();

    public void withdraw(Amount amount, Amount balance);

    public void deposit(Amount amount, Amount balance);
}
