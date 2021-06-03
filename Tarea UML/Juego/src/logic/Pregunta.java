package logic;

import java.util.ArrayList;

public class Pregunta {

	//Estados
	private String enunciado;
	
	private ArrayList<Respuesta> Respuesta;
	
	
	//Constructor completo
	public Pregunta(String enunciado, ArrayList<logic.Respuesta> respuesta) {
		super();
		this.enunciado = enunciado;
		Respuesta = respuesta;
	}
	
	
	//Comportamiento

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public ArrayList<Respuesta> getRespuesta() {
		return Respuesta;
	}

	public void setRespuesta(ArrayList<Respuesta> respuesta) {
		Respuesta = respuesta;
	}


	
	
	
}
