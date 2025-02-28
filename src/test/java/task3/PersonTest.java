package task3;

import org.example.task3.Person;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    @Test(dataProvider = "personTest", dataProviderClass = DataProviderModel.class)
    public void testPersonAndTableActions(Person person) {
        assertNotNull(person.getTable(), "Столик должен существовать");
        person.getTable().openTable();
        assertTrue(person.getTable().isOpen(), "Столик должен быть открыт");

        assertEquals(person.getTable().getDescription(), "с лиловым зонтом", "Описание стола должно быть правильным");
        assertEquals(person.getBeach().getName(), "Голубая лагуна");
        person.getTable().closeTable();
        assertFalse(person.getTable().isOpen(), "Столик должен быть закрыт");
    }
}
