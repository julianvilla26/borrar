package co.com.devco.certificacion.avianca.stepdefinitions.reservavuelo;

import static co.com.devco.certificacion.avianca.exceptions.ElMensajeEs.MENSAJE_DE_ERROR;
import static net.serenitybdd.core.Serenity.takeScreenshot;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

import co.com.devco.certificacion.avianca.exceptions.ElMensajeEs;
import co.com.devco.certificacion.avianca.models.ReservarElVuelo;
import co.com.devco.certificacion.avianca.questions.LaOpcionDeTarifa;
import co.com.devco.certificacion.avianca.tasks.Abrir;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ReservaVueloStepDefinition {

	@Before
	public void before() {
		setTheStage(new OnlineCast());
		theActorCalled("Julian");
	}
	
	@Dado("^que me encuentre en la pagina web de Avianca$")
	public void queMeEncuentreEnLaPaginaWebDeAvianca() {
	    theActorInTheSpotlight().wasAbleTo(Abrir.elNavegador());  
	}
	
	@Cuando("^realice la reserva de un vuelo de ida \"([^\"]*)\" y regreso \"([^\"]*)\"$")
	public void realiceLaReservaDeUnVueloDeIdaYRegreso(String origen, String destino) {
		theActorInTheSpotlight().attemptsTo(
				ReservarElVuelo
				.desde()
				.ciudad(origen)
				.aCiudad(destino)
				.enLaFechaDeseada());
	}

	@Entonces("^validare la reserva de vuelo generada \"([^\"]*)\"$")
	public void validareLaReservaDeVueloGenerada(String yLaEsperada) {
		theActorInTheSpotlight().should(
				seeThat(LaOpcionDeTarifa.es(), is(yLaEsperada))
				.orComplainWith(ElMensajeEs.class, MENSAJE_DE_ERROR));
		takeScreenshot();
	}
}
