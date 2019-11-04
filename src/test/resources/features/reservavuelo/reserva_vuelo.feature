#language: es
#Autor: julianvilla30@gmail.com

Característica: Reservar vuelo de ida y regreso por la pagina web Avianca
	Yo como usuario necesito realizar una reserva de vuelo a cualquier destino a traves de la pagina web de Avianca

Antecedentes:
	Dado que me encuentre en la pagina web de Avianca
	
Esquema del escenario: Reserva vuelo ida y regreso
	Cuando realice la reserva de un vuelo de ida "<ciudadOrigen>" y regreso "<ciudadDestino>"
	Entonces validare la reserva de vuelo generada "<opcionTarifa>"
	Ejemplos:
	|ciudadOrigen|ciudadDestino|opcionTarifa|
	|Medellín|Munich|Súper Promo|
	
Escenario: Consultar ofertas de vuelo
	Cuando consulto las ofertas de vuelo
	Entonces validare la tarifa mas economica
	
Escenario: Cambio reserva de vuelo
	Cuando realice un cambio en la ruta del vuelo
	Entonces validare el el detalle de la reserva
	
Escenario: Consulta estado de vuelo
	Cuando conulto el estado de un vuelo
	Entonces validare el estado y trayecto del vuelo
	
Escenario: Consultar el itinerario de un vuelo de ida y regreso
	Cuando realizo la consulta de itinerario
	Entonces validare el numero de vuelo
	
Escenario: Realizar chequeo en linea
 Cuando consulto la reserva de vuelo
 Entonces validare la confirmacion de vuelo
 
Escenario: Consultar itinerario de un vuelo de ida
	Cuando realizo la consulta de itinerario de un viaje de ida
	Entonces validare las opciones de trifas
	
Escenario: Reserva vuelo solo ida
	Cuando realice la reserva de un vuelo solo de ida
	Entonces Validare la reserva realizada en clase Ejecutiva
	
Escenario: Reserva vuelo multidestino
	Cuando realizo la reserva de vuelo con multiples destinos
	Entonces Validare el detalle de la reserva
	
Escenario: Reserva vuelo con acompañantes
	Cuando realizo la reserva de un vuelo para varios acompañantes
	Entonces validare el detalle y valor de la reserva 
	