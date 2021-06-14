package logic;

import java.util.ArrayList;

public class Jugador extends Usuario{
	
	//Estados
	private int puntaje;
	
	private ArrayList<Pregunta> preguntas;
	
	
	//Constructor completo

	public Jugador(String nombre, int cedula, int puntaje, ArrayList<logic.Pregunta> preguntas) {
		super(nombre, cedula);
		this.puntaje = puntaje;
		this.preguntas = preguntas;
	}


	//Comportamiento
	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public ArrayList<Pregunta> getPreguntas() {
		return preguntas;
	}

	public void setPregunta(ArrayList<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}
	
	
	public void addPreguntas(Pregunta)
	
	
	
}
	
	

	