package Hooks;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setup() {
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
