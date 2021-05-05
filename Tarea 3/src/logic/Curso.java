package logic;
public class Curso{

  private String nombre;

//Relaciones
  Materia [] materias;

  //Constructor completo
      public Curso (String nombre){
        this.nombre = nombre;
      }

  //Setters
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
	//Getters
    public String getNombre() {
			return this.nombre;
		}

}
