import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class SelenideTest {

    @Test
    public void openPage() throws Exception{
        Selenide.open("https://stackoverflow.com/questions/36125122/selenide-different-between-open-navigate-get");

        $(By.xpath("(//a[@href='/questions/ask'])[1]")).click();

        Thread.sleep(5000);
    }
}
