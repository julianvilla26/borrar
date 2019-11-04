package co.com.devco.certificacion.avianca.models;

import co.com.devco.certificacion.avianca.tasks.ConfirmarDestino;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

public class ReservarElVueloBuilder {
	
	private String ciudadOrigen;
	private String ciudadDestino;
	
	public ReservarElVueloBuilder ciudad(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
		return this;
	}
	
	public ReservarElVueloBuilder aCiudad(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
		return this;
	}
	
	public Performable enLaFechaDeseada() {
		return Tasks.instrumented(ConfirmarDestino.class, ciudadOrigen, ciudadDestino);
		
	}
}
