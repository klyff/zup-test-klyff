
import org.br.zup.test.klyff.MainProductSumFuncionalInterface;
import org.br.zup.test.klyff.MainProductSumPojo;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestProductFuncionalInterface {

    @Test
    public void testProductSumSuccess(){
        int expectedAmmount = 1115;
        int amount = MainProductSumFuncionalInterface.sumProductValues();
        Assert.assertEquals(expectedAmmount, amount);
    }

    @Test
    public void testInvertIntegerFail(){
        int expectedAmmount = Integer.MAX_VALUE;
        int amount = MainProductSumFuncionalInterface.sumProductValues();
        Assert.assertNotEquals(expectedAmmount, amount);
    }


}
