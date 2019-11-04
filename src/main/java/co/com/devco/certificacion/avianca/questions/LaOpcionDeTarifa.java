package co.com.devco.certificacion.avianca.questions;

import co.com.devco.certificacion.avianca.user_interfaces.DetallesReservaVuelo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaOpcionDeTarifa implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(DetallesReservaVuelo.TARIFA_VIAJE).viewedBy(actor).asString();
	}

	public static LaOpcionDeTarifa es() {
		return new LaOpcionDeTarifa();
	}
}
