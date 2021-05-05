package logic;

import java.time.LocalDate;

public class Docente extends Usuario{

  LocalDate fechaIngreso;

// Relaciones
  Materia nombreMateria;

  //Constructor completo
      public Docente(String nombre, int cedula, LocalDate fechaIngreso){
  			super(nombre, cedula);
        this.fechaIngreso = fechaIngreso;
      }

  //Setters
    public void setFechaIngreso(LocalDate fechaIngreso) {
      this.fechaIngreso = fechaIngreso;
    }
  //Getters
    public LocalDate getFechaIngreso() {
      return this.fechaIngreso;
    }



}
