package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class TinkoffTest extends TestBase {

    @Tag("tinkoff")
    @Test
    void searchDeposit() {
        open("https://www.tinkoff.ru/");

        $("div[data-tabs-with-droplist-index='2']").click();

        sleep(1000);

    }
}
