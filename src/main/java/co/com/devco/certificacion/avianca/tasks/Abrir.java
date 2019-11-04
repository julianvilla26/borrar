package co.com.devco.certificacion.avianca.tasks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import co.com.devco.certificacion.avianca.utils.propertiesmanager.AviancaProperties;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task{

	private static final Logger LOGGER = LogManager.getLogger(Abrir.class.getName());

	public Abrir() {
		super();
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			actor.attemptsTo(Open.url(AviancaProperties.getUrlAvianca()));
		} catch (Exception ex) {
            LOGGER.warn("Failed open the browser", ex);
		}
	}

	public static Abrir elNavegador() {
		return Tasks.instrumented(Abrir.class);
	}
}
