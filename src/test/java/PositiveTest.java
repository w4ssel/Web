import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PositiveTest {
    @Test
    void test() {
        open("http://localhost:9999/");
        $("span[data-test-id=name] input").setValue("Иван");
        $("span[data-test-id=phone] input").setValue("+79306666666");
        $(".checkbox__box").click();
        $(".button__text").click();
        $(".Success_successBlock__2L3Cw").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}
