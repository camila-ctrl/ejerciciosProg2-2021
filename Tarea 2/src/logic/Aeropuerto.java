package logic;

public class Aeropuerto {

	//Estados
	private int id;
	private String nombre;
	
	//Comportamientos
		//Constructor completo
		Aeropuerto(int id, String nombre){
			this.id = id;
			this.nombre = nombre;
		}

		//Setters
		public void setId(int id) {
			this.id = id;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
	
		//Getters
		public int getId() {
			return this.id;
		}
		public String getNombre() {
			return this.nombre;
		}
		
}
