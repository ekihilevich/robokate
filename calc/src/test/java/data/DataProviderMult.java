package data;
import org.testng.annotations.DataProvider;

public class DataProviderMult {
    @DataProvider (name = "TestDataMult")
    public Object[][] getData() {
        return new Object[][] {
                {5, 6, 31 },
                {6, 4, 24 },
                {7, 1, 7 },
                {8, 3, 24 },
        };
    }
}
