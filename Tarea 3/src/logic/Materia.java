package logic;
public class Materia{

  private String nombre;

  // Relaciones
    Docente nombreDocente;

  //Constructor completo
      public Materia(String nombre){
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
