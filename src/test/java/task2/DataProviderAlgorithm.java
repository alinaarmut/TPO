package task2;


import org.testng.annotations.DataProvider;

import static org.example.task2.Algorithm.getSortedArray;

public class DataProviderAlgorithm {
    @DataProvider(name ="algorithmDataProvider")
    public static Object[][] algorithmDataProvider() {
        return new Object[][] {
                {new int[]{3, 1, 4, 1, 5, 9, 2}, getSortedArray(new int[]{3, 1, 4, 1, 5, 9, 2})},
                {new int[]{10, -1, 2, 5, 0, 6, 4, -5}, getSortedArray(new int[]{10, -1, 2, 5, 0, 6, 4, -5})},
                {new int[]{5, 5, 5}, getSortedArray(new int[]{5, 5, 5})},
                {new int[]{0}, getSortedArray(new int[]{0})},
        };
    }

}
