package e9;

public class FCuerpoPalabra implements Filtro{
	private String palabra;

	public FCuerpoPalabra(String palabra) {
		super();
		this.palabra = palabra;
	}

	@Override
	public boolean cumple(Noticia n) {
		return (n.getCuerpo().tienePalabra(palabra));
	}

}
