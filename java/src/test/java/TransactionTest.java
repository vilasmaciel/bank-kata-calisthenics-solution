import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class TransactionTest {

    @Test
    public void shouldPrintOneLineWithTheInformationAboutTheDepositTransaction() {

        String date = "2018.11.12";
        Calendar calendar = mock(Calendar.class);
        Printer printer = mock(Printer.class);
        when(calendar.dateToString()).thenReturn(date);

        Transaction transaction = new Transaction(calendar, new Amount(100), new Amount(200));
        transaction.print(printer);
        verify(printer).printLine("2018.11.12 +100 200");
    }

    @Test
    public void shouldPrintOneLineWithTheInformationAboutTheWithdrawTransaction() {

        String date = "2018.11.12";
        Calendar calendar = mock(Calendar.class);
        Printer printer = mock(Printer.class);
        when(calendar.dateToString()).thenReturn(date);

        Transaction transaction = new Transaction(calendar, new Amount(100), new Amount(200));
        transaction.print(printer);
        verify(printer).printLine("2018.11.12 -100 200");
    }

}
