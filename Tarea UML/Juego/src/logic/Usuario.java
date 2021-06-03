package logic;

public class Usuario {

	//Estados
	private String nombre;
	private int cedula;
	
	
	//Constructor completo
	public Usuario(String nombre, int cedula) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
	}

	
	//Comportamiento
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCedula() {
		return cedula;
	}


	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	
	
	
	
}
