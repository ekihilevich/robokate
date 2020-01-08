package data;
import org.testng.annotations.DataProvider;

public class DataProviderDiv {
    @DataProvider (name = "TestDataDiv")
    public Object[][] getData() {
        return new Object[][] {
                {10, 5, 2 },
                {6, 2, 3 },
                {7, 1, 7 },
                {8, 2, 4 },
        };
    }
}
