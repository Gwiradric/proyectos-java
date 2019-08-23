package p1;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class Noticia extends NAbs{
	private String categoria;
	private String texto;
	private String autor;
	private String titulo;
	private SortedSet<String> palClaves;
	
	
	
	public void addPalabraClave(String p) {
		palClaves.add(p);
	}

	public Noticia(Noticia n) {
		super();
		this.categoria = n.getCategoria();
		this.texto = n.getTexto();
		this.autor = n.getAutor();
		this.titulo = n.getTitulo();
		this.palClaves = n.getPalClave();
	}

	public Noticia(String categoria, String texto, String autor, String titulo, SortedSet<String> palClaves) {
		super();
		this.categoria = categoria;
		this.texto = texto;
		this.autor = autor;
		this.titulo = titulo;
		this.palClaves = palClaves;
	}



	public void setCategoria(String c) {
		categoria = c;
	}
	
	

	public String getTexto() {
		return texto;
	}



	public void setTexto(String texto) {
		this.texto = texto;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public void setPalClaves(SortedSet<String> palClaves) {
		this.palClaves = palClaves;
	}



	@Override
	public String getCategoria() {
		return categoria;
	}

	@Override
	public Vector<NAbs> buscar(Filtro f) {
		Vector<NAbs> res = new Vector<NAbs>();
		if (f.cumple(this))
			res.add(this);
		return res;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	@Override
	public SortedSet<String> getPalClave() {
		SortedSet<String> set = new TreeSet<String>();
		for (String i : palClaves) {
			set.add(i);
		}
		return set;
	}


	@Override
	public void clasificar(Vector<Clasificador> vC) {
		for (int i = 0; i < vC.size(); i++) {
			vC.elementAt(i).clasificar(this);
		}
	}


	@Override
	public NAbs getCopia(Filtro f) {
		if (f.cumple(this))
			return new Noticia(this);
		else
			return null;
	}
	
	@Override
	public String toString() {
		return (this.getTitulo() + ". ");
	}

}
