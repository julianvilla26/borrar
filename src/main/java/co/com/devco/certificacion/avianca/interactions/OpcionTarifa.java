package co.com.devco.certificacion.avianca.interactions;

import co.com.devco.certificacion.avianca.user_interfaces.DetallesReservaVuelo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class OpcionTarifa implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(DetallesReservaVuelo.TARIFA_VIAJE, WebElementStateMatchers.isVisible()));
	}
	
	public static OpcionTarifa viaje() {
		return Tasks.instrumented(OpcionTarifa.class);
	}

}
