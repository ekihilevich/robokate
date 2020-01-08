package calculation;
import Calculator.Calculator;
import data.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static java.lang.Math.pow;

public class CalculationTest {

   private SoftAssert softAssert;
   @BeforeMethod
   public void setup() {
       softAssert = new SoftAssert();
   }

   @AfterMethod
   public void clean(){
       softAssert = null;
   }

    @Test(dataProvider = "TestDataSum", dataProviderClass = DataProviderAll.class)
    public void testSum(int int1, int int2, int exp) {
        softAssert.assertEquals(Calculator.getsum(int1, int2), exp);
        softAssert.assertAll();
    }

    @Test(dataProvider = "TestDataDiff", dataProviderClass = DataProviderAll.class)
    public void testDiff(int int1, int int2, int exp) {
        softAssert.assertEquals(Calculator.getdiff(int1, int2), exp);
        softAssert.assertAll();
    }

    @Test(dataProvider = "TestDataMult", dataProviderClass = DataProviderAll.class)
    public void testMult(int int1, int int2, int exp) {
        Assert.assertEquals(Calculator.getmult(int1, int2), exp);
    }

    @Test(dataProvider = "TestDataDiv", dataProviderClass = DataProviderAll.class)
    public void testDiv(int int1, int int2, int exp) {
        Assert.assertEquals(Calculator.getdiv(int1, int2), exp);
    }

    @Test(dataProvider = "TestDataPow", dataProviderClass = DataProviderAll.class)
    public void testPow(int int1, int int2) {
        Assert.assertEquals(Calculator.getpow(int1, int2), pow(int1, int2));
    }

    @Ignore
    @Test(dataProvider = "TestDataSqrt", dataProviderClass = DataProviderAll.class)
    public void testSqrt(int int1, int exp) {
        Assert.assertEquals(Calculator.getsqrt(int1), exp);
    }
}