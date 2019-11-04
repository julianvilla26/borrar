package co.com.devco.certificacion.avianca.exceptions;

@SuppressWarnings("serial")
public class ElMensajeEs extends AssertionError{
	
	public static final String MENSAJE_DE_ERROR = "El mensaje no es la opción de tarifa que se espera";
	
	public ElMensajeEs(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}
}
