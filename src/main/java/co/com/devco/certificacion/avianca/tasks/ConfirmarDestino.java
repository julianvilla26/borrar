package co.com.devco.certificacion.avianca.tasks;

import static co.com.devco.certificacion.avianca.user_interfaces.DetallesReservaVuelo.BUSCAR_VUELO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.devco.certificacion.avianca.interactions.OpcionTarifa;
import co.com.devco.certificacion.avianca.interactions.SeleccionarDia;
import co.com.devco.certificacion.avianca.interactions.SeleccionarDiaRegreso;
import co.com.devco.certificacion.avianca.user_interfaces.DetallesReservaVuelo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ConfirmarDestino implements Task{

	private String ciudadOrigen;
	private String ciudadDestino;
	
	public ConfirmarDestino(String ciudadOrigen, String ciudadDestino) {
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(ciudadOrigen).into(DetallesReservaVuelo.ORIGEN),
				WaitUntil.the(DetallesReservaVuelo.LISTA_CIUDADES.of(ciudadOrigen), isVisible()),
				Click.on(DetallesReservaVuelo.LISTA_CIUDADES.of(ciudadOrigen)),
				Enter.theValue(ciudadDestino).into(DetallesReservaVuelo.DESTINO),
				WaitUntil.the(DetallesReservaVuelo.LISTA_CIUDADES.of(ciudadDestino), isVisible()),
				Click.on(DetallesReservaVuelo.LISTA_CIUDADES.of(ciudadDestino)),
				Click.on(DetallesReservaVuelo.FECHA_DE_IDA),
				SeleccionarDia.ida("Septiembre 2019",10),
				Click.on(DetallesReservaVuelo.FECHA_REGRESO),
				SeleccionarDiaRegreso.viaje("Agosto 2020",11),
				Click.on(BUSCAR_VUELO),
				OpcionTarifa.viaje());
	}

}
