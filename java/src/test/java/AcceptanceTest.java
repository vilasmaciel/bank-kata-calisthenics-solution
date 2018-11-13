import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AcceptanceTest {

    @Test
    public void shouldPrintThreeLinesWithTheWithdrawsAndDeposits() {

        Printer printer = mock(Printer.class);
        Calendar calendar = mock(Calendar.class);

        when(calendar.dateToString()).thenReturn("24.12.2015").thenReturn("23.8.2016");

        TransactionRepository transactions = new CustomTransactionRepository(printer, calendar);
        Account account = new Account(transactions);
        account.deposit(new Amount(500));
        account.withdraw(new Amount(100));

        account.printStatements();

        verify(printer).printLine("Calendar Amount Balance");
        verify(printer).printLine("24.12.2015 +500 500");
        verify(printer).printLine("23.8.2016 -100 400");
    }

}
