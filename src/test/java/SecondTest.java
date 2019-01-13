import org.junit.Test;

public class SecondTest extends Automatization
{

    @Test
    public void FirstTest ()
    {
        one();
        click("Маркет");
        click("Компьютерная техника");
        click("Компьютеры");
        click("Планшеты");
        send("glpricefrom", "20000");
        send("glpriceto", "25000");
        click("HP");
        click("Lenovo");
        /*
        click("Показать всё");
        click("Acer");
        click("DELL");
        Ничего не находит в нужной ценовой категории, поэтому решил оставить производителей из прошлого теста
        */
        search();
        targetSearch();
        clickX("//button[contains(@class, 'button2')]");
        searchSecond();
        equals();
        close();
    }

}
