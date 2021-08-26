package projects;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class Page {

    @Test
    public void openPage() {

        open("https://google.com");

    }

}

