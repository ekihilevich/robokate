package data;
import org.testng.annotations.DataProvider;

public class DataProviderAll {
    @DataProvider (name = "TestDataSum")
    public Object[][] getDataSum() {
        return new Object[][] {
                {5, 6, 11 },
                {6, 4, 9 },
                {7, 1, 8 },
                {8, 3, 11 },
        };
    }

    @DataProvider (name = "TestDataDiff")
    public Object[][] getDataDiff() {
        return new Object[][] {
                {6, 6, 10 },
                {6, 4, 2 },
                {7, 1, 6 },
                {8, 3, 5 },
        };
    }

    @DataProvider (name = "TestDataDiv")
    public Object[][] getDataDiv() {
        return new Object[][] {
                {10, 5, 2 },
                {6, 2, 3 },
                {7, 1, 7 },
                {8, 2, 4 },
        };
    }

    @DataProvider (name = "TestDataMult")
    public Object[][] getDataMult() {
        return new Object[][] {
                {5, 6, 31 },
                {6, 4, 24 },
                {7, 1, 7 },
                {8, 3, 24 },
        };
    }
    @DataProvider (name = "TestDataPow")
    public Object[][] getDataPow() {
        return new Object[][] {
                {5, 2},
                {6, 2},
                {7, 1},
                {8, 3},
        };
    }

    @DataProvider (name = "TestDataSqrt")
    public Object[][] getDataSqrt() {
        return new Object[][] {
                {9, 3},
                {16, 4 },
                {25, 5},
                {36, 6 },
        };
    }
}