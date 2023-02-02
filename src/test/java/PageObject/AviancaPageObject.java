package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AviancaPageObject extends AviancaWebBasePage {
    @FindBy(xpath = "(//input[@data-name='pbOrigen'])[2]")
    private WebElement inputCiudadOrigen;
    @FindBy(xpath="(//input[@data-name='pbDestino'])[5]")
    private WebElement inputCiudadDestino;
    @FindBy(xpath="//label[contains(text(),'Ida y vuelta')]")
    private WebElement verificationJoin;
    @FindBy(xpath = "(//input[@id='radioIdayVuelta'])[1]")
    private WebElement clickBottom1;
    @FindBy(xpath = "//label[contains(text(),'Salida')]")
    private WebElement dateOut;
    @FindBy(xpath = "(//div[@data-day='2023.2.10'])[2]")
    private WebElement setDateOut;
    @FindBy(xpath = "(//div[@data-day='2023.3.12'])[2]")
    private WebElement setDateIn;
    @FindBy(xpath = "(//input[@required='required'])[3]")
    private WebElement setPssg;
    @FindBy(xpath = "(//div[@class='plus control'])[4]")
    private WebElement morePssg;
    @FindBy(xpath = "(//button[@type='button'])[34]")
    private WebElement continuePssg;
    @FindBy(xpath = "//button[@class='btn primary btn-codepromo pull-btn rojo']")
    private WebElement continueSearch;
    @FindBy(xpath = "//span[@class='filter-text']")
    private WebElement verificationFly;
    @FindBy(xpath = "//button[@role='main']")
    private WebElement firstFly;
    @FindBy(xpath = "(//div[@class='ff-header-mobile'])[7]")
    private WebElement verificationPackage;
    @FindBy(xpath = "(//button[@class='continue-button'])[7]")
    private WebElement continueButton1;

    public boolean verificationPage1() {
        esperaElemnento(verificationJoin, 10);
        scrollElement(verificationJoin);
        return verificationJoin.isDisplayed();
    }

    public void clickbottom1() {
        esperaElemnento(verificationJoin, 10);
        //verificationJoin.click();
    }
    public void sendKeysCiudad(String ciudad) {
        esperaElemnento(inputCiudadOrigen, 10);
        inputCiudadOrigen.sendKeys(ciudad);
        threadTest(1);
        inputCiudadOrigen.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void sendKeysDestino(String destino) {
        esperaElemnento(inputCiudadDestino, 10);
        inputCiudadDestino.sendKeys(destino);
        threadTest(1);
        inputCiudadDestino.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void sendKeysSalida(String salida) {
        esperaElemnento(dateOut, 10);
        dateOut.click();
        threadTest(2);
        setDateOut.click();
    }

    public void sendKeysVuelta(String vuelta) {
        threadTest(2);
        setDateIn.click();
    }

    public void clickPssg() {
        esperaElemnento(setPssg, 10);
        setPssg.click();
        threadTest(2);
        morePssg.click();
        threadTest(2);
        //continuePssg.click();

    }
    public void clickContinue() {
        esperaElemnento(continueSearch, 10);
        threadTest(3);
        continueSearch.click();
    }

    public boolean clickBottom2() {
        esperaElemnento(verificationFly, 120);
        return verificationFly.isDisplayed();
    }

    public boolean verificationPage2() {
        firstFly.click();
        esperaElemnento(verificationPackage, 10);
        return verificationPackage.isDisplayed();
    }
    public void clickContinueButtom() {
        continueButton1.click();
    }
    public void senKeysNombre1(String nombre1) {
    }

    public void sendKeysApellido1(String apellido1) {
    }

    public void sendKeysNombre2(String nombre2) {
    }

    public void sendKeysApellido2(String apellido2) {
    }

    public void sendKeysEmail(String email) {
    }

    public void sendKeysNumero(String numero) {
    }

    public void clickBottom3() {
    }

    public void verificationPage3() {
    }

    public void sendKeysBanco(String banco) {
    }

    public void sendKeysTipoPersona(String tipoPersona) {
    }

    public void sendKeysTipCc(String tipoCc) {
    }

    public void sendKeysCc(String cc) {
    }

    public boolean verificationPage4() {
        return false;
    }



}
