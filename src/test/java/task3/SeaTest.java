package task3;

import org.example.task3.Sea;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SeaTest {

    @Test(dataProvider = "positiveSeaCheck", dataProviderClass = DataProviderModel.class)
    public static void seaTest(String color){
    Sea sea = new Sea(color);
       assertEquals(sea.getColor(), color);
    }

}
