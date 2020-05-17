
import org.br.zup.test.klyff.MainProductSumPojo;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestProductSumPojo {

    @Test
    public void testProductSumSuccess(){
        int expectedAmmount = 10880;
        int amount = MainProductSumPojo.sumProductValues();
        Assert.assertEquals(expectedAmmount, amount);
    }

    @Test
    public void testInvertIntegerFail(){
        int expectedAmmount = 0;
        int amount = MainProductSumPojo.sumProductValues();
        Assert.assertNotEquals(expectedAmmount, amount);
    }


}
