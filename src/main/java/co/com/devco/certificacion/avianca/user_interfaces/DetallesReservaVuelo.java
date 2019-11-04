package co.com.devco.certificacion.avianca.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DetallesReservaVuelo {
	
	private DetallesReservaVuelo() {
	    throw new IllegalStateException("Clase utilitaria para el mapeo de los detalles de vuelo");
	  }

	public static final Target ORIGEN = Target.the("Ingresar la ciudad de origen del vuelo")
			.locatedBy("//input[@id='dataCountry']/ancestor::div[1]/child::div[2]/child::div[2]/descendant::fieldset[1]/child::div/descendant::label[contains(text(),'Desde')]/descendant::input[1]");
	
	public static final Target LISTA_CIUDADES = Target.the("lista de ciudades de origen")
			.locatedBy("//div[@class='bs-list-countries']/ul/li/div[contains(text(),'{0}')]");
	
	public static final Target DESTINO = Target.the("Ingresar la ciudad de destino del vuelo")
			.locatedBy("//input[@id='dataCountry']/ancestor::div[1]/child::div[2]/child::div[2]/descendant::fieldset[1]/child::div/descendant::label[contains(text(),'Hacia')]/descendant::input[1]");
	
	public static final Target FECHA_DE_IDA = Target.the("Seleccionar el campo de fecha de ida")
			.locatedBy("//input[contains(@id,'pbFechaIda_1')][1]");
	
	public static final Target FECHA_REGRESO = Target.the("Seleccionar el campo de fecha de regreso")
			.locatedBy("//input[contains(@id,'pbFechaRegreso_1')][1]");
	
	public static final Target CALENDARIO_UNO_IDA = Target.the("Seleccionar el calendario uno de ida")
			.locatedBy("//div[contains(@class,'c_pbFechaIda_1')]/parent::div/following-sibling::div/child::div[1]/table/descendant::div[@class='name-month'][1]");
	
	public static final Target SIGUIENTE_MES_IDA = Target.the("Seleccionar el mes de preferencia ida")
			.locatedBy("//div[contains(@class,'c_pbFechaIda_1')]/parent::div/following-sibling::div/child::div[1]/table/descendant::div[@class='name-month'][2]/parent::div//i");
	
	public static final Target CALENDARIO_DOS_IDA = Target.the("Seleccionar el calendario 2 de ida")
			.locatedBy("//div[contains(@class,'c_pbFechaIda_1')]/parent::div/following-sibling::div/child::div[1]/table/descendant::div[@class='name-month'][2]");
	
	public static final Target DIA_CALENDARIO_UNO = Target.the("fecha ida")
			.locatedBy("//div[contains(@class,'c_pbFechaIda_1')]/parent::div/following-sibling::div/child::div[1]/table/descendant::td[@class='cal1']/descendant::tbody[2]/descendant::td[text()='{0}']");
	
	public static final Target DIA_CALENDARIO_DOS = Target.the("fecha ida")
			.locatedBy("//div[contains(@class,'c_pbFechaIda_1')]/parent::div/following-sibling::div/child::div[1]/table/descendant::td[@class='cal2']/descendant::tbody[2]/descendant::td[text()='{0}']");

	public static final Target CALENDARIO_UNO_REGRESO = Target.the("Seleccionar calendario uno regreso")
			.locatedBy("//div[contains(@class,'c_pbFechaRegreso_1')]/child::table/descendant::div[@class='name-month'][1]");
	
	public static final Target CALENDARIO_DOS_REGRESO = Target.the("Seleccionar calendario dos regreso")
			.locatedBy("//div[contains(@class,'c_pbFechaRegreso_1')]/child::table/descendant::div[@class='name-month'][2]");
	
	public static final Target DIA_CALENDARIO_UNO_REGRESO = Target.the("Seleccionar dia de calendario uno regreso")
			.locatedBy("//div[contains(@class,'c_pbFechaRegreso_1')]/table/descendant::td[@class='cal1']/descendant::tbody[2]/descendant::td[text()='{0}']");
	
	public static final Target DIA_CALENDARIO_DOS_REGRESO = Target.the("Seleccionar dia de calendario dos regreso")
			.locatedBy("//div[contains(@class,'c_pbFechaRegreso_1')]/table/descendant::td[@class='cal2']/descendant::tbody[2]/descendant::td[text()='{0}']");

	public static final Target SIGUIENTE_MES_REGRESO = Target.the("Seleccionar el mes de preferencia regreso")
			.locatedBy("//div[contains(@class,'c_pbFechaRegreso_1')]/table/descendant::div[@class='name-month'][2]/parent::div//i");

	public static final Target BUSCAR_VUELO = Target.the("Boton que realiza la busqueda del vuelo")
			.locatedBy("//div[contains(@class,'show_1')]/parent::form/child::div[2]/child::div/descendant::button");
	
	public static final Target TARIFA_VIAJE = Target.the("Opcion de tarifa")
			.locatedBy("//div[contains(@class,'farefamily-header-top row')]/child::ul[2]/child::li[1]/div/div");
}
