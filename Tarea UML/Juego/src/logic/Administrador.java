package logic;

import java.time.LocalDate;

public class Administrador extends Usuario{
	
	//Estados
	private LocalDate fechaIngreso;

	
	//Constructor completo
	public Administrador(String nombre, int cedula, LocalDate fechaIngreso) {
		super(nombre, cedula);
		this.fechaIngreso = fechaIngreso;
	}

	
	//Comportamiento
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
}
