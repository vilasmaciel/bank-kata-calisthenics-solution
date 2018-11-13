import org.junit.Assert;
import org.junit.Test;

public class AmountTest {

    @Test
    public void shouldReturnANewAmountAsResultOfTheSumOfTwoAmounts() {

        Amount amount1 = new Amount(10);
        Amount amount2 = new Amount(10);

        Amount sum = amount1.plus(amount2);

        Amount total = new Amount(20);

        Assert.assertTrue(sum.equals(total));
    }

    @Test
    public void shouldReturnANewAmountAsResultOfSubstractOneAmountToAnother() {

        Amount amount1 = new Amount(20);
        Amount amount2 = new Amount(5);

        Amount sum = amount1.subtracts(amount2);

        Amount total = new Amount(15);

        Assert.assertTrue(sum.equals(total));
    }

    @Test
    public void shouldReturnNegativeValueIfTheFirstElementItsBiggerThanTheSecond() {

        Amount amount1 = new Amount(20);
        Amount amount2 = new Amount(5);

        Amount sum = amount2.subtracts(amount1);

        Amount total = new Amount(-15);

        Assert.assertTrue(sum.equals(total));
    }

    @Test
    public void shouldReturnAnStringRepresentingTheAmount() {

        Amount amount = new Amount(20);
        Assert.assertEquals(amount.toString(), "20");
    }

    @Test
    public void shouldReturnANewAmountWithNegativeValue() {

        Amount amount = new Amount(20);
        Assert.assertTrue(amount.negative().equals(new Amount(-20)));
    }
}
