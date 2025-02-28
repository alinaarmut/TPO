package task1;

import org.example.task1.Function;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class FunctionTest {
    @Test(dataProvider = "functionDataProvider",dataProviderClass = DataProviderFunction.class )
    public void testQuickSort(double input, double expected) {
        double result = Function.atan(input);
        assertEquals(result, expected, 0.01);
    }
}
