public class CostoMayorA implements Buscar{
	private Double dato;
	
	public CostoMayorA(Double dato) {
		this.dato = dato;
	}
	
	public boolean comparar(Individual s) {
		return s.getCosto() > dato;
	}
}
