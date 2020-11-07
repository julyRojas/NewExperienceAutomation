package com.automation.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class RegistrarPage extends BasePage {

    @FindBy(id = "email_create")
    private WebElement correo;

    @FindBy(id = "SubmitCreate")
    private WebElement crearCuenta;

    @FindBy (id= "uniform-id_gender1")
    private WebElement masculino;

    @FindBy (id= "uniform-id_gender2")
    private WebElement femenino;

    @FindBy (id= "customer_firstname")
    private WebElement nombres;

    @FindBy (id= "customer_lastname")
    private WebElement apellidos;

    @FindBy (id= "passwd")
    private WebElement contrasena;

    @FindBy(id= "days")
    private WebElement diaNacimiento;

    @FindBy(id= "months")
    private WebElement mesNacimiento;

    @FindBy(id= "years")
    private WebElement anioNacimiento;

    @FindBy(id= "newsletter")
    private WebElement boletinOfertas;

    @FindBy(id= "optin")
    private WebElement ofertasEspeciales;

    @FindBy(id = "company")
    private WebElement empresa;

    @FindBy(id = "address1")
    private WebElement direccion;

    @FindBy(id = "address2")
    private WebElement direccion2;

    @FindBy(id = "city")
    private WebElement ciudad;

    @FindBy(id = "id_state")
    private WebElement estado;

    @FindBy(id = "postcode")
    private WebElement codPostal;

    @FindBy(id = "id_country")
    private WebElement pais;

    @FindBy(id = "other")
    private WebElement infoAdicional;

    @FindBy(id = "phone")
    private WebElement telefono;

    @FindBy(id = "phone_mobile")
    private WebElement numCelular;

    @FindBy(id = "alias")
    private WebElement alias;

    @FindBy(id = "submitAccount")
    private WebElement terminarRegistro;

    public RegistrarPage(WebDriver driver) {
        super(driver);
    }

    public void crearCuenta(String email) {
        sendElementText(correo,email);
        clickElement(crearCuenta);
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void completarInformacionPersonal(String titulo,String nombre, String apellido, String clave, String dia, String mes, String anio){
        if (titulo.equals("Mr.")) {
            clickElement(masculino);
        } else {
            clickElement(femenino);
        }

        sendElementText(nombres, nombre);
        sendElementText(apellidos, apellido);
        sendElementText(contrasena, clave);
        selectOption(diaNacimiento, dia);
        selectOption(mesNacimiento, mes);
        selectOption(anioNacimiento, anio);

    }

}
