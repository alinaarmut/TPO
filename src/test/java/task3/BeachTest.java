package task3;

import org.example.task3.Beach;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class BeachTest {
    @BeforeMethod
    public void namedTest(Method m) {
        Test test = (Test) m.getAnnotation(Test.class);
        System.out.println("Название теста: " + test.testName());
    }


    @Test(testName = "Проверка, что на пляже есть шторм", dataProvider = "nameSeaTest", dataProviderClass = DataProviderModel.class)
    public void changeWeatherTest(String name) {
        Beach beach = new Beach(name);
        beach.changeWeather(true);
        assertEquals(beach.getName(), name);
        assertTrue(beach.isStormy(), "На пляже шторм!!");

    }
    @Test(testName = "Проверка, что на пляже спокойно", dataProvider = "nameSeaTest", dataProviderClass = DataProviderModel.class)
    public void goodWeatherTest(String name) {
        Beach beach = new Beach(name);
        assertEquals(beach.getName(), name);
        assertFalse(beach.isStormy(), "На пляже спокойно!!");

    }
    @Test(testName = "Проверка, что на пляже есть драгоценные камни", dataProvider = "nameSeaTest", dataProviderClass = DataProviderModel.class)
    public void haveStoneTest(String name) {
        Beach beach = new Beach(name);
        assertEquals(beach.getName(), name);
        beach.showStones(true);
        assertTrue(beach.isHasGoldStones(), "На пляже есть камни!!!");

    }
    @Test(testName = "Проверка, что на пляже есть драгоценные камни", dataProvider = "nameSeaTest", dataProviderClass = DataProviderModel.class)
    public void FalseStoneTest(String name) {
        Beach beach = new Beach(name);
        assertEquals(beach.getName(), name);
        assertFalse(beach.isHasGoldStones(), "На пляже уже нет драгоценных камней((");

    }
}
