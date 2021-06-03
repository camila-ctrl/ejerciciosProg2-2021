package logic;

import java.util.ArrayList;

public class Jugador extends Usuario{
	
	//Estados
	private int puntaje;
	
	private ArrayList<Pregunta> Pregunta;
	
	
	//Constructor completo

	public Jugador(String nombre, int cedula, int puntaje, ArrayList<logic.Pregunta> pregunta) {
		super(nombre, cedula);
		this.puntaje = puntaje;
		Pregunta = pregunta;
	}


	//Comportamiento
	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public ArrayList<Pregunta> getPregunta() {
		return Pregunta;
	}

	public void setPregunta(ArrayList<Pregunta> pregunta) {
		Pregunta = pregunta;
	}
	
	
	//Relaciones
	
	
	
}
	
	

	