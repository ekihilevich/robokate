package data;
import org.testng.annotations.DataProvider;

public class DataProviderPow {
    @DataProvider (name = "TestDataPow")
    public Object[][] getData() {
        return new Object[][] {
                {5, 2},
                {6, 2},
                {7, 1},
                {8, 3},
        };
    }
}
