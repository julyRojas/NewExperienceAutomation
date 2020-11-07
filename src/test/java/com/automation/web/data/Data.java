package com.automation.web.data;

import org.testng.annotations.DataProvider;

/**
 * Data provider class.
 * @author july.rojas
 */
public class Data {

    @DataProvider(name = "registro")
    public Object[][] inputData() {
        return new Object[][] {{"Mrs.", "July", "Rojas", "julyRojas22", "3", "March", "1991"}};
    }
}
