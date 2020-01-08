package calculation;
import Calculator.Calculator;
import data.*;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static java.lang.Math.pow;

public class CalculationTest {

    @Test(dataProvider = "TestDataSum", dataProviderClass = DataProviderSum.class)
    public void testSum(int int1, int int2, int exp) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Calculator.getsum(int1, int2), exp);
    }

    @Test(dataProvider = "TestDataDiff", dataProviderClass = DataProviderDiff.class)
    public void testDiff(int int1, int int2, int exp) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Calculator.getdiff(int1, int2), exp);
    }

    @Test(dataProvider = "TestDataMult", dataProviderClass = DataProviderMult.class)
    public void testMult(int int1, int int2, int exp) {
        SoftAssert softAssert = new SoftAssert();
        Assert.assertEquals(Calculator.getmult(int1, int2), exp);
    }

    @Test(dataProvider = "TestDataDiv", dataProviderClass = DataProviderDiv.class)
    public void testDiv(int int1, int int2, int exp) {
        SoftAssert softAssert = new SoftAssert();
        Assert.assertEquals(Calculator.getdiv(int1, int2), exp);
    }

    @Test(dataProvider = "TestDataPow", dataProviderClass = DataProviderPow.class)
    public void testPow(int int1, int int2) {
        SoftAssert softAssert = new SoftAssert();
        Assert.assertEquals(Calculator.getpow(int1, int2), pow(int1, int2));
    }
    @Ignore
    @Test(dataProvider = "TestDataSqrt", dataProviderClass = DataProviderSqrt.class)
    public void testSqrt(int int1, int exp) {
        SoftAssert softAssert = new SoftAssert();
        Assert.assertEquals(Calculator.getsqrt(int1), exp);

    }
}