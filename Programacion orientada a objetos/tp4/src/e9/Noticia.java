package e9;

import java.util.Vector;

public class Noticia {
	private Vector<String> titulo;
	private String calificacion;
	private Cuerpo cuerpo;
	
	public Noticia(Vector<String> titulo, String calificacion, Cuerpo cuerpo) {
		super();
		this.titulo = titulo;
		this.calificacion = calificacion;
		this.cuerpo = cuerpo;
	}

	public Vector<String> getTitulo() {
		return titulo;
	}

	public void setTitulo(Vector<String> titulo) {
		this.titulo = titulo;
	}

	public String getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

	public Cuerpo getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(Cuerpo cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	

}
