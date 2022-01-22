package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import page.VendorLoginPage;

import static parameters.parameters.filePath;

public class LoginVendorPlace extends ScenarioSteps {
    VendorLoginPage VendorLoginPage= new VendorLoginPage();
    @Given("^que ingresa a la pagina VendorPlace$")
    public void queIngresaALaPaginaVendorPlace() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver",filePath);
    VendorLoginPage.driver= new ChromeDriver();
    VendorLoginPage.driver.manage().window().maximize();
    VendorLoginPage.driver.get("https://stg.vendorplace.yay.do/es/login");
    Thread.sleep(5000);
    }

    @When("^escribe sus credenciales$")
    public void escribeSusCredenciales() {
        VendorLoginPage.escribircorreoelectronico("automation@test.com");
        VendorLoginPage.escribircontraseña("Abc12345.");
    }

    @And("^hace click en continuar$")
    public void haceClickEnContinuar() throws InterruptedException {
        Thread.sleep(5000);
        VendorLoginPage.cliquearbotoncont();
    }

    @Then("^la pagina VendorPlace muesta el Home$")
    public void laPaginaVendorPlaceMuestaElHome() throws InterruptedException {
        Assert.assertTrue("No ingreso al login",VendorLoginPage.validarHome() );
    }

    @When("^ingresa su correo electronico \"([^\"]*)\"$")
    public void ingresaSuCorreoElectronico(String arg0) throws Throwable {
        VendorLoginPage.escribircorreoelectronico(arg0);
    }

    @And("^ingresa su contraseña \"([^\"]*)\"$")
    public void ingresaSuContraseña(String arg0) throws Throwable {
        VendorLoginPage.escribircontraseña(arg0);
    }

    @Then("^el usuario captura el mensaje de alerta \"([^\"]*)\"$")
    public void elUsuarioCapturaElMensajeDeAlerta(String arg0) throws Throwable {
        Thread.sleep(5000);
        Assert.assertTrue("No encuentra mensaje alerta",VendorLoginPage.validarMensajeAlerta() );
    }

    @Then("^el usuario captura el mensaje de alerta \"([^\"]*)\" en el campo correo electronico$")
    public void elUsuarioCapturaElMensajeDeAlertaEnElCampoCorreoElectronico(String arg0) throws Throwable {
        Assert.assertTrue("No encuentra mensaje alerta",VendorLoginPage.validarMensajeUSuario() );


    }

    @And("^el usuario captura el mensaje de alerta \"([^\"]*)\" en el campo contraseña$")
    public void elUsuarioCapturaElMensajeDeAlertaEnElCampoContraseña(String arg0) throws Throwable {
        Assert.assertTrue("No encuentra mensaje alerta",VendorLoginPage.validarMensajeContraseña() );

    }


    @And("^pulsa crear cuenta$")
    public void pulsaCrearCuenta() {
        VendorLoginPage.cliquearRegistrar();
    }

    @When("^ingrese sus datos en los campos determinados$")
    public void ingreseSusDatosEnLosCamposDeterminados() throws InterruptedException {
        Thread.sleep(5000);
        VendorLoginPage.rellenarDatosUsuario();
    }


    @And("^ingreso su nuemero de celular$")
    public void ingresoSuNuemeroDeCelular() throws InterruptedException {
        Thread.sleep(5000);
        VendorLoginPage.ingresarCelular();
    }


    @And("^entonces la aplicacion completa el proceso y te muesta el home de la pagina$")
    public void entoncesLaAplicacionCompletaElProcesoYTeMuestaElHomeDeLaPagina() throws InterruptedException {
        Assert.assertTrue("No encuentra mensaje alerta",VendorLoginPage.validarMensajeCreacionUsuario() );
    }

    @And("^pulsa olvide mi contraseña$")
    public void pulsaOlvideMiContraseña() throws InterruptedException {
        VendorLoginPage.cliquearOlvideContraseña();
    }

    @When("^ingresa el correo de recuperacion$")
    public void ingresaElCorreoDeRecuperacion() throws InterruptedException {
        Thread.sleep(5000);
        VendorLoginPage.escribircorreoRecuperacion();
    }

    @Then("^entonces valida el mensaje \"([^\"]*)\"$")
    public void entoncesValidaElMensaje(String arg0) throws Throwable {
        Thread.sleep(5000);
        Assert.assertTrue("No hay mensaje", VendorLoginPage.validarMensajeRecuperacion());
    }
}
