package logic;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pasajero {

	//Estados
	private String nombre;
	private int documento;
	
	//Comportamientos
			//Constructor completo
			Pasajero(String nombre, int documento){
				this.nombre = nombre;
				this.documento = documento;
			}

			//Setters
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public void setDocumento(int documento) {
				this.documento = documento;
			}
			
			//Getters
			public String getNombre() {
				return this.nombre;
			}
			public int getDocumento() {
				return this.documento;
			}
}
