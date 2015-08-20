import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by John on 20.08.2015.
 */
public class Test1 extends TestBase{

    @Test
    public void testForJKNS (){
        open("/");
        $(By.linkText("Финансы")).click();
        $(By.linkText("Курсы валют")).click();
        $$(By.linkText("Доллар США")).get(1).click();
        $("h2").shouldHave(text("Доллар США"));
    }
}
