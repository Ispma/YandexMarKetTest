import org.junit.Test;


public class FirstTest extends Automatization
{
        @Test
        public void FirstTest ( )
        {
            one();
            click("Маркет");
            click("Компьютерная техника");
            click("Компьютеры");
            click("Ноутбуки");
            send("glpriceto", "30000");
            click("HP");
            click("Lenovo");
           /* click("Показывать по 48");
            click("Показывать по 12"); */
            search();
            targetSearch();
            clickX("//button[contains(@class, 'button2')]");
            searchSecond();
            equals();
            close();
        }


}
