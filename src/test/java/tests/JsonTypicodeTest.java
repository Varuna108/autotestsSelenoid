package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class JsonTypicodeTest extends TestBase {

    @Tag("typicode")
    @Test
    void searchDeposit() {
        open("https://jsonplaceholder.typicode.com/");

        $("div.container:nth-child(2) div.container table.resources:nth-child(14) tbody:nth-child(1) tr:nth-child(6) td:nth-child(1) > a:nth-child(1)").click();

        sleep(1000);

    }
}
