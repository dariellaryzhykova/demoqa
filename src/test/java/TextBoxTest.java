import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {

    @BeforeAll
    static void  beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("Dariella");
        $("#userEmail").setValue("dariella@gmail.com");
        $("#currentAddress").setValue("1130 W Pratt");
        $("#permanentAddress").setValue("1130 W Pratt");
        $("#submit").scrollTo();
        $("#submit").click();
        $("#output").shouldHave(text("Dariella"), text("dariella@gmail.com"),
                text("1130 W Pratt"), text("1130 W Pratt"));
    }
}
