package task1;

import org.testng.annotations.DataProvider;

public class DataProviderFunction {
    @DataProvider(name ="functionDataProvider")
    public static Object[][] functionDataProvider(){
        return new Object[][]{
                {0,0},
                {1,(Math.PI)/4},
                {-1,-(Math.PI/4)},
                {0.5,Math.atan(0.5)},
                {-0.5,Math.atan(-0.5)},

        };
    }
}
