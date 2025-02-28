package task2;

import org.example.task2.Algorithm;
import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class AlgorithmTest {
    @Test(dataProvider = "algorithmDataProvider",dataProviderClass = DataProviderAlgorithm.class )
    public void testQuickSort(int[] input, int[] expected) {
        Algorithm.quickSort(input, 0, input.length - 1);
       assertArrayEquals(input, expected);
    }


}
