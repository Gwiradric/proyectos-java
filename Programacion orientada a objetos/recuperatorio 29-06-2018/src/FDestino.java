
public class FDestino implements Filtro{
	private String destino;

	public FDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public boolean cumple(STurismo p) {
		return (p.getDestino().equals(destino));
	}

}
