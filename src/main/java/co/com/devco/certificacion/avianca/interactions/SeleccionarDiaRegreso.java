package co.com.devco.certificacion.avianca.interactions;

import static co.com.devco.certificacion.avianca.user_interfaces.DetallesReservaVuelo.CALENDARIO_DOS_REGRESO;
import static co.com.devco.certificacion.avianca.user_interfaces.DetallesReservaVuelo.CALENDARIO_UNO_REGRESO;
import static co.com.devco.certificacion.avianca.user_interfaces.DetallesReservaVuelo.DIA_CALENDARIO_DOS_REGRESO;
import static co.com.devco.certificacion.avianca.user_interfaces.DetallesReservaVuelo.DIA_CALENDARIO_UNO_REGRESO;
import static co.com.devco.certificacion.avianca.user_interfaces.DetallesReservaVuelo.SIGUIENTE_MES_REGRESO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SeleccionarDiaRegreso implements Interaction{

	private String mes;
	private String dia;
	
	public SeleccionarDiaRegreso(String mes, int dia) {
		this.mes = mes;
		this.dia = Integer.toString(dia);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(WaitUntil.the(CALENDARIO_UNO_REGRESO, isVisible()));
		
		do {
			if(mes.equals(CALENDARIO_UNO_REGRESO.resolveFor(actor).getTextValue())) {
				actor.attemptsTo(Click.on(DIA_CALENDARIO_UNO_REGRESO.of(dia)));
				break;
			}
			else if(mes.equalsIgnoreCase(CALENDARIO_DOS_REGRESO.resolveFor(actor).getTextValue())) {
				actor.attemptsTo(Click.on(DIA_CALENDARIO_DOS_REGRESO.of(dia)));
				break;
			}
			
			actor.attemptsTo(Click.on(SIGUIENTE_MES_REGRESO));
		}while(!mes.equals(CALENDARIO_UNO_REGRESO.resolveFor(actor).getTextValue())||!mes.equalsIgnoreCase(CALENDARIO_DOS_REGRESO.resolveFor(actor).getTextValue()));
	}

	public static SeleccionarDiaRegreso viaje(String mesIda, int dia) {
		return Tasks.instrumented(SeleccionarDiaRegreso.class, mesIda, dia);
	}
}
