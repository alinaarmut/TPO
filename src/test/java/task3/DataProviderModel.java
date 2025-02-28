package task3;

import org.example.task3.Beach;
import org.example.task3.Person;
import org.example.task3.Sea;
import org.example.task3.Table;
import org.testng.annotations.DataProvider;

public class DataProviderModel {

    @DataProvider(name = "negativeCheckTable")
    public static Object[][] checkTable() {
        return new Object[][]{
                {"", ""},
                {null, null},
                {"чистое серебро",""},
                {"","пляжный столик"},

        };
    }

    @DataProvider(name ="positiveCheckTable")
    public static Object[][] positiveCheckTable(){
        return new Object[][]{
                {"чистое серебро", "пляжный столик"}

        };
    }

    @DataProvider(name="positiveSeaCheck")
    public static Object[][] positiveSeaTable(){
        return new Object[][]{
                {"пурпурное"}
        };
    }
    @DataProvider(name="nameSeaTest")
    public static Object[][]  nameSeaTest(){
        return new Object[][]{
                {"Грейс-Бэй"}
        };
    }
    @DataProvider(name="personTest")
    public static Object[][]  personTest(){
        Person person1 = new Person("Человек1", new Sea("пурпурное"), new Beach("Голубая лагуна"), new Table("серебро", "с лиловым зонтом"));
        return new Object[][]{
                {person1},

        };
    }

}

