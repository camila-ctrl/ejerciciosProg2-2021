package logic;

public class Respuesta {
	
	//Estados
	private String enunciado;
	private int cantRespuestas;

	
	//Constructor completo
	public Respuesta(String enunciado, int cantRespuestas) {
		super();
		this.enunciado = enunciado;
		this.cantRespuestas = cantRespuestas;
	}

	
	//Comportamiento
	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public int getCantRespuestas() {
		return cantRespuestas;
	}

	public void setCantRespuestas(int cantRespuestas) {
		this.cantRespuestas = cantRespuestas;
	}
	

}
