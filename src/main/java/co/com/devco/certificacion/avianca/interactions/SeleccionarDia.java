package co.com.devco.certificacion.avianca.interactions;

import static co.com.devco.certificacion.avianca.user_interfaces.DetallesReservaVuelo.CALENDARIO_DOS_IDA;
import static co.com.devco.certificacion.avianca.user_interfaces.DetallesReservaVuelo.CALENDARIO_UNO_IDA;
import static co.com.devco.certificacion.avianca.user_interfaces.DetallesReservaVuelo.DIA_CALENDARIO_DOS;
import static co.com.devco.certificacion.avianca.user_interfaces.DetallesReservaVuelo.DIA_CALENDARIO_UNO;
import static co.com.devco.certificacion.avianca.user_interfaces.DetallesReservaVuelo.SIGUIENTE_MES_IDA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SeleccionarDia implements Interaction{

	private String mes;
	private String dia;
	
	public SeleccionarDia(String mes, int dia) {
		this.mes = mes;
		this.dia = Integer.toString(dia);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				WaitUntil.the(CALENDARIO_UNO_IDA, isVisible()));
		do {
			if(mes.equals(CALENDARIO_UNO_IDA.resolveFor(actor).getTextValue())) {
				actor.attemptsTo(Click.on(DIA_CALENDARIO_UNO.of(dia)));
				break;
			}
			else if(mes.equalsIgnoreCase(CALENDARIO_DOS_IDA.resolveFor(actor).getTextValue())) {
				actor.attemptsTo(Click.on(DIA_CALENDARIO_DOS.of(dia)));
				break;
			}
			actor.attemptsTo(Click.on(SIGUIENTE_MES_IDA));
			
		}while(!mes.equals(CALENDARIO_UNO_IDA.resolveFor(actor).getTextValue())||!mes.equalsIgnoreCase(CALENDARIO_DOS_IDA.resolveFor(actor).getTextValue()));
	}

	public static SeleccionarDia ida(String mesIda, int dia) {
		return Tasks.instrumented(SeleccionarDia.class, mesIda, dia);
	}
}
