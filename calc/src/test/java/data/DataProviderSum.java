package data;
import org.testng.annotations.DataProvider;

public class DataProviderSum {
    @DataProvider (name = "TestDataSum")
    public Object[][] getData() {
        return new Object[][] {
                {5, 6, 11 },
                {6, 4, 9 },
                {7, 1, 8 },
                {8, 3, 11 },
        };
    }
}
