package e4;

public class CSuperficie implements Criterio {
	private float superficie;

	public CSuperficie(float superficie) {
		this.superficie = superficie;
	}

	@Override
	public boolean cumple(Lote l) {
		return (l.getSuperficie() <= superficie);
	}
	
	
}
