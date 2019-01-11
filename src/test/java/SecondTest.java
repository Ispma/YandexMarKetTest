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
        search();
        targetSearch();
        clickX("//button[contains(@class, 'button2')]");
        searchSecond();
        equals();
        close();
    }

}
