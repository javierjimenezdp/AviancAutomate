package StepDefinitions;

import Steps.AviancaSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AviancaStepDefinition {
    AviancaSteps aviancaSteps;

    public AviancaStepDefinition() {
        this.aviancaSteps = new AviancaSteps();
    }

    @Given("^Como usuario pasajero deseo hacer la búsquedad de un tiquete aereo$")
    public void search_ticket() {
        aviancaSteps.ticket_Search(); //verificación de la página de avianca
    }
    @And("^debo verificar que sea un vuelo de ida y vuelta$")
    public void check_fly(){
        aviancaSteps.type_fly(); //verificar y/o dar clic sobre tipo de vuelo ida-vuelta
    }
    @And("^debo ingresar la (.*) de origen, el (.*) de la ciudad, la fecha de (.*), la fecha de (.*) y el número de pasajeros$")
    public void information_fly(String ciudad, String destino, String salida, String vuelta){
        aviancaSteps.fly_city(ciudad, destino, salida, vuelta); //xpath variable | ingresar data de origen, destino, fechas y # de pssg's
    }
    @And("^debo seleccionar un vuelo con el tipo de equipaje de ida y seleccionar un vuelo con el tipo de equipaje de vuelta para continuar con la personalización del vuelo$")
    public void package_type(){
        aviancaSteps.fly_package(); //Seleccionar el equipaje para cada vuelo (ida y vuelta)
    }
    @And("^debo ingresar (.*), (.*) del 1er pasajero, (.*), (.*) del 2do pasajero y también (.*), (.*) de contacto de emergencia$")
    public void pssg_emergency(String nombre1, String apellido1, String nombre2, String apellido2, String email, String numero){
        aviancaSteps.pssg_sos(nombre1, apellido1, nombre2, apellido2, email, numero); //Outline | ingresar los datos de cada pssg y el contacto de emergencia
    }
    @And("^sin seleccionar ningún servicio especial, continuar al proceso de pago de los tiquetes, eligiendo PSE como metodo de pago$")
    public void pay_method(){
        aviancaSteps.pay_pse(); //no selecciono ningún servicio especial, sólo continuar
    }
    @When("^cargue la informacion PSE, debo ingresar (.*), (.*), (.*), (.*) y marcar la casilla de acuerdos para continuar el proceso de pago seguro$")
    public void pay_information(String banco, String tipo_persona, String tipo_CC, String CC){
        aviancaSteps.pse_data(banco, tipo_persona, tipo_CC, CC); //Xpath Variable y Outline | seleccionar el método de pago y luego continuar para ser redireccionado a PSE
    }
    @Then("^debo comprobar que me redirija a el portal de pago de Nequi$")
    public void pay_portal(){
        aviancaSteps.verification_portal();
    }

}
