import org.br.zup.test.klyff.MainInvertInteger;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestInvertInteger {

    @Test
    public void testInvertIntegerSuccess(){
        int expectedInverted = -55;
        int inverted = MainInvertInteger.reverseInteger(-550);
        Assert.assertEquals(expectedInverted, inverted);
    }

    @Test
    public void testInvertIntegerFail(){
        int expectedInverted = 4200;
        int inverted = MainInvertInteger.reverseInteger(1024);
        Assert.assertNotEquals(expectedInverted, inverted);
    }


}
