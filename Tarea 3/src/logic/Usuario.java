package logic;
public class Usuario{

  private String nombre;
  private int cedula;

  //Constructor completo
  		public Usuario(String nombre, int cedula){
  			this.nombre = nombre;
  			this.cedula = cedula;
  		}


  //Setters
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public void setCedula(int cedula) {
			this.cedula = cedula;
		}

		//Getters
    public String getNombre() {
			return this.nombre;
		}
		public int getCedula() {
			return this.cedula;
		}





}
