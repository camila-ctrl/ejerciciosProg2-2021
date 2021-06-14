package logic;

import java.util.ArrayList;
import java.time.LocalDate;

public class Manejador {
	
	private ArrayList<Usuario> usuarios;
	private ArrayList<Pregunta> preguntas;
	
	//Variables de control
	private Usuario jugadorActual;
	private int indicePreguntaActual;

	//Mantiene el control del jeugo. Guarda todas las instancias del juego, preguntas y respuestas. 
	//Variables de control, jugador actual.
	
	//Crear preguntas
	public void crearPregunta(String enunciado, ArrayList<Respuesta> respuesta) {
		Pregunta preg = new Pregunta(enunciado);
		for(int 1 = 0; i < respuestas.size(); i++) {
			preg.addRespuesta(respuestas.get(i));
		}
		this.preguntas.add(preg);
	}
	
	public Manejador() {
		this.usuarios = new ArrayList<Usuario>();
		this.preguntas = new ArrayList<Pregunta>();
	}
	
	//Crear jugadores
	public void crearJugador(String nombre, int ci, int puntaje) {
		Usuario jugador = new Jugador(nombre, ci, puntaje);
		this.usuarios.add(jugador);
	}
	
	//Crear adm
	public void crearAdm(String nombre, int ci, LocalDate fechaIngreso) {
		Usuario admin = new Administrador(nombre, ci, fechaIngreso);
		this.usuarios.add(admin);
	}
	
	
	public Pregunta comenzarJuego(int ci) {
		//Setear el jugadorActual dada la ci
		for(int i = 0; i<this.usuarios.size(); i++) {
			if (this.usuarios.get(i).(getCi() == ci) {
				this.jugadorActual = this.usuarios.get(i);
			}
		}
		
		//Imprimir pregunta
		this.indicePreguntaActual = 0;
		if(this.preguntas.sice() > this.indicePreguntaActual) {
			imprimirStatusJuego();
		}
		
	}
	
	public void imprimirStatusJuego() {
		System.out.println("Juega "+ this.jugadorActual.getNombre());
		System.out.println("Contesta la pregunta:");
			this.preguntas.get(this.indicePreguntaActual).getEnunciado() +" con" +
			this.preguntas.get(this.indicePreguntaActual)get.respuestas().size() + " respuestas!");
	}
	
	public void contestarPregunta(int indiceRespuesta) {
		ArrayList<Respuesta> tempRespuesta = this.preguntas.get(this.indicePreguntaActual)getRespuestas());
		if(indiceRespuesta <= tempRespuesta.size()) {
			
		}
	}
	
	public Pregunta siguientePregunta() {
		
	}
	
}
