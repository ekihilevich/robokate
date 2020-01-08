package data;
import org.testng.annotations.DataProvider;

public class DataProviderDiff {
    @DataProvider (name = "TestDataDiff")
    public Object[][] getData() {
        return new Object[][] {
                {6, 6, 10 },
                {6, 4, 2 },
                {7, 1, 6 },
                {8, 3, 5 },
        };
    }
}
