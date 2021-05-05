package logic;
public class Estudiante extends Usuario{

  private String direccion;

// Relaciones
    Curso nombreCurso;

  //Constructor completo
      public Estudiante(String nombre, int cedula, String direccion){
        super(nombre, cedula);
        this.direccion = direccion;
      }

  //Setters
  public void setDireccion(String direccion) {
      this.direccion = direccion;
    }
  //Getters
    public String getDireccion() {
      return this.direccion;
    }
}
