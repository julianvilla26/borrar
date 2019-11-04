package co.com.devco.certificacion.avianca.runners.reservavuelo;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/reservavuelo/reserva_vuelo.feature",
		glue = {"co.com.devco.certificacion.avianca.stepdefinitions"},
		snippets = SnippetType.CAMELCASE)
public class ReservaVuelo {

}
