package com.automation.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Class for interact with the home page.
 * @author july.rojas
 */
public class HomePage extends BasePage {

    @FindBy(className = "login")
    private WebElement registrase;

    /**
     * Constructor.
     * @param driver WebDriver
     * @param url String
     */
    public HomePage(WebDriver driver, String url) {
        super(driver);
        driver.get(url);
    }

    public RegistrarPage registrar() {
        clickElement(registrase);
        return new RegistrarPage(getDriver());
    }
}
