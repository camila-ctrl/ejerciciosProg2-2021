package logic;

import java.time.LocalDate;
import java.time.LocalTime;

public class Vuelo {
	
	//Estados
	private LocalDate fecha;
	private LocalTime hora;
	
	Aeropuerto origen;
	Aeropuerto destino;
	Avion nombreAvion;
	Pasajero[] pasajeros; 
	
	//Comportamientos
		//Constructor completo
		Vuelo(LocalDate fecha, LocalTime hora){
			this.fecha = fecha;
			this.hora = hora;
		}

		//Setters
		public void setFecha(LocalDate fecha) {
			this.fecha = fecha;
		}
		public void setHora(LocalTime hora) {
			this.hora = hora;
		}
		
		//Getters
		public LocalDate getFecha() {
			return this.fecha;
		}
		public LocalTime getHora() {
			return this.hora;
		}
}
