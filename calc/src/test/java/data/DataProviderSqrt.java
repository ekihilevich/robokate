package data;
import org.testng.annotations.DataProvider;

public class DataProviderSqrt {
    @DataProvider (name = "TestDataSqrt")
    public Object[][] getData() {
        return new Object[][] {
                {9, 3},
                {16, 4 },
                {25, 5},
                {36, 6 },
        };
    }
}
