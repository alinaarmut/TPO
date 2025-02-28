package task3;


import org.example.task3.Table;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static org.testng.Assert.*;
import static org.testng.AssertJUnit.assertEquals;


public class TableTest {
    @BeforeMethod
    public void namedTest(Method m) {
        Test test = (Test) m.getAnnotation(Test.class);
        System.out.println("Название теста: " + test.testName());
    }

    @Test(dataProvider = "negativeCheckTable",dataProviderClass = DataProviderModel.class, testName = "Проверка пустых значений")
    public void testTable(String material, String description) {
        assertThrows(IllegalArgumentException.class, () -> new Table(material, description));

    }
    @Test(dataProvider = "positiveCheckTable", dataProviderClass = DataProviderModel.class, testName = "Провверка, что стол открыт")
    public void positiveTestTableOpen(String material, String description) {
        Table table = new Table(material, description);
        table.openTable();
        assertEquals(material, table.getMaterial());
        assertEquals(description, table.getDescription());
        assertTrue(table.isOpen(), "Столик должен быть открыт");
    }
    @Test(dataProvider = "positiveCheckTable", dataProviderClass = DataProviderModel.class, testName = "Проверка, что стол закрыт")
    public void positiveTestTableClose(String material, String description) {
        Table table = new Table(material, description);
        table.closeTable();
        assertEquals(material, table.getMaterial());
        assertEquals(description, table.getDescription());
        assertFalse(table.isOpen(), "Столик должен быть закрыт");
    }
    @Test(dataProvider = "positiveCheckTable", dataProviderClass = DataProviderModel.class, testName = "Проверка, что стол открыли")
    public void negativeTestTableClose(String material, String description) {
        Table table = new Table(material, description);
        table.closeTable();
        table.openTable();
        assertEquals(material, table.getMaterial());
        assertEquals(description, table.getDescription());
        assertTrue(table.isOpen(), "Столик должен быть открыт");
    }

    @Test(dataProvider = "positiveCheckTable", dataProviderClass = DataProviderModel.class, testName = "Проверка, что стол закрыт")
    public void testTableClose(String material, String description) {
        Table table = new Table(material, description);
        assertEquals(material, table.getMaterial());
        assertEquals(description, table.getDescription());
        assertFalse(table.isOpen(), "Столик должен быть изначально открыт");
    }
    @Test(dataProvider = "positiveCheckTable", dataProviderClass = DataProviderModel.class, testName = "Проверка, что стол открыт")
    public void testTableOpenDouble(String material, String description) {
        Table table = new Table(material, description);
        table.openTable();
        table.openTable();
        assertEquals(material, table.getMaterial());
        assertEquals(description, table.getDescription());
        assertTrue(table.isOpen(), "Столик должден остаться открытым");
    }

}
