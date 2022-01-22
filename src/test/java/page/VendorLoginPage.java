package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VendorLoginPage extends PageObject {
    private String nombreDirector;
    public WebDriver driver;
    @FindBy(xpath = "")
    private WebElement txtLogin;

    public void escribircorreoelectronico(String email) {
        WebElement campocorreo = driver.findElement(By.xpath("//label[contains(text(),'Correo electrónico')]/../div/input"));
        //espera EXPLICITA
        waitElementVisible(campocorreo, 5);
        campocorreo.sendKeys(email);
    }
    public void escribircontraseña(String contraseña) {
        WebElement campocontraseña = driver.findElement(By.xpath("//label[contains(text(),'Contraseña')]/../div/input"));
        //espera EXPLICITA
        waitElementVisible(campocontraseña, 5);
        campocontraseña.sendKeys(contraseña);
    }
    public void escribircorreoRecuperacion() {
        WebElement campocontraseña = driver.findElement(By.xpath("//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        WebElement botonContinuar = driver.findElement(By.xpath("//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/form[1]/div[1]/div[1]/div[2]/button[1]/span[1]"));
        //espera EXPLICITA
        waitElementVisible(campocontraseña, 5);
        campocontraseña.sendKeys("ivan@gmail.com");
        botonContinuar.click();
    }
    public void cliquearbotoncont() {
        WebElement botoncont = driver.findElement(By.xpath("//span[contains(text(),'Continuar')]"));
        //espera EXPLICITA
        waitElementVisible(botoncont, 10);
        botoncont.click();
    }
    public void cliquearRegistrar() {
        WebElement botonRegistrar = driver.findElement(By.xpath("//a[contains(text(),'Regístrate aquí')]"));
        //espera EXPLICITA
        waitElementVisible(botonRegistrar, 10);
        botonRegistrar.click();
    }
    public void cliquearOlvideContraseña() throws InterruptedException {
        Thread.sleep(5000);
        WebElement olvideContraseña = driver.findElement(By.xpath("//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/a[1]"));
        //espera EXPLICITA
        waitElementVisible(olvideContraseña, 10);
        olvideContraseña.click();
    }
    public void rellenarDatosUsuario(){
        WebElement nombre = driver.findElement(By.xpath("//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        WebElement correo = driver.findElement(By.xpath("//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
        WebElement contraseña = driver.findElement(By.xpath("//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]"));
        WebElement aceptarTerminos = driver.findElement(By.xpath("//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/span[1]/span[1]/input[1]"));
        //espera EXPLICITA
        waitElementVisible(nombre, 10);

        nombre.sendKeys("Ivan Cantalicio");
        correo.sendKeys("ivani@gmail.com");
        contraseña.sendKeys("12345678nN$");
        aceptarTerminos.click();
    }
    public void ingresarCelular(){
        WebElement celular = driver.findElement(By.xpath("//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));

        waitElementVisible(celular, 10);
        celular.sendKeys("(15) 9489 7895");
    }
    public boolean validarMensajeRecuperacion() throws InterruptedException {
        Thread.sleep(10000);
        WebElement mensajeRecuperacion = driver.findElement(By.xpath("//div[contains(text(),'Revisa tu correo electrónico')]"));
        //espera INPLICITA
        if (waitElementVisible(mensajeRecuperacion, 5)) {
            return true;
        }
        return false;
    }
    public boolean validarHome() throws InterruptedException {
        Thread.sleep(10000);
        WebElement textoHome = driver.findElement(By.xpath("//div[contains(text(),'Tu límite de transacciones')]"));
        //espera INPLICITA
        if (waitElementVisible(textoHome, 5)) {
            return true;
        }
        return false;
    }
    public boolean validarMensajeCreacionUsuario() throws InterruptedException {
        Thread.sleep(20000);
        WebElement mensajeAlertaCrear = driver.findElement(By.xpath("//h5[contains(text(),'Ingresa el código de verificación')]"));
        //espera INPLICITA
        if (waitElementVisible(mensajeAlertaCrear, 5)) {
            return true;
        }
        return false;
    }
    public boolean validarMensajeAlerta() throws InterruptedException {
        WebElement mensajeAlerta = driver.findElement(By.xpath("//p[contains(text(),'Usuario y/o contraseña incorrectos')]"));
        //espera INPLICITA
        if (waitElementVisible(mensajeAlerta, 5)) {
            return true;
        }
        return false;
    }
    public boolean validarMensajeUSuario() throws InterruptedException {
        WebElement alertaUsuario = driver.findElement(By.xpath("//p[contains(text(),'Correo requerido')]"));
        //espera INPLICITA
        if (waitElementVisible(alertaUsuario, 5)) {
            return true;
        }
        return false;
    }
    public boolean validarMensajeContraseña() throws InterruptedException {
        WebElement alertaContraseña = driver.findElement(By.xpath("//p[contains(text(),'Contraseña requerida')]"));
        //espera INPLICITA
        if (waitElementVisible(alertaContraseña, 5)) {
            return true;
        }
        return false;
    }


    public boolean waitElementVisible(WebElement element, int tiempoSegundos) {
        boolean value = false;
        for (int i = 0; i <= tiempoSegundos; i++) {
            try {
                Thread.sleep(1000);
                value = element.isDisplayed();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        return value;
    }
}
