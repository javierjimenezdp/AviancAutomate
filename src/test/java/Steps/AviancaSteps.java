package Steps;

import PageObject.AviancaPageObject;
import StepDefinitions.Hooks;

public class AviancaSteps {
    AviancaPageObject aviancaPageObject;
    public AviancaSteps(){
        this.aviancaPageObject = new AviancaPageObject();
        aviancaPageObject.setDriver(Hooks.getDriver());
    }

    public void ticket_Search() {
        aviancaPageObject.verificationPage1();
    }

    public void type_fly() {
        aviancaPageObject.clickbottom1();
    }

    public void fly_city(String ciudad, String destino, String salida, String vuelta) {
        aviancaPageObject.sendKeysCiudad("M");
        aviancaPageObject.sendKeysDestino("B");
        aviancaPageObject.clickPssg();
        aviancaPageObject.sendKeysSalida(salida);
        aviancaPageObject.sendKeysVuelta(vuelta);
        aviancaPageObject.clickContinue();

    }

    public void fly_package() {
        aviancaPageObject.clickBottom2();
        aviancaPageObject.verificationPage2();
        aviancaPageObject.clickContinueButtom();
    }

    public void pssg_sos(String nombre1, String apellido1, String nombre2, String apellido2, String email, String numero) {
        aviancaPageObject.senKeysNombre1(nombre1);
        aviancaPageObject.sendKeysApellido1(apellido1);
        aviancaPageObject.sendKeysNombre2(nombre2);
        aviancaPageObject.sendKeysApellido2(apellido2);
        aviancaPageObject.sendKeysEmail(email);
        aviancaPageObject.sendKeysNumero(numero);
    }

    public void pay_pse() {
        aviancaPageObject.clickBottom3();
        aviancaPageObject.verificationPage3();
    }

    public void pse_data(String banco, String tipoPersona, String tipoCc, String cc) {
        aviancaPageObject.sendKeysBanco(banco);
        aviancaPageObject.sendKeysTipoPersona(tipoPersona);
        aviancaPageObject.sendKeysTipCc(tipoCc);
        aviancaPageObject.sendKeysCc(cc);
    }

    public void verification_portal() {
        //Assert.assertEquals("No se hizo compra exitosa del vuelo",aviancaPageObject.verificationPage4(),true);
    }
}
