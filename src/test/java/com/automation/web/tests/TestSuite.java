package com.automation.web.tests;

import com.automation.web.data.Data;
import com.automation.web.pages.HomePage;
import com.automation.web.pages.RegistrarPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Class for the wikipedia test.
 * @author july.rojas
 */
public class TestSuite extends BaseTest {

    @AfterMethod
    @Parameters({"url"})
    public void launchHomePage(String url) {
        driver.getDriver().get(url);
    } //cargar la pagina despues de cada test

    @Test(description = "Registrar usuario", dataProviderClass = Data.class, dataProvider = "registro")
    public void testCaseRegistrar(String titulo, String nombre, String apellido, String clave, String dia, String mes, String anio) {
        log.info("Click Registrar");
        HomePage homePage = getHomePage();
        RegistrarPage registrarPage = homePage.registrar();
        registrarPage.crearCuenta("felihuarancca@gmail.com");
        registrarPage.completarInformacionPersonal(titulo, nombre, apellido, clave, dia, mes, anio);
    }

}
