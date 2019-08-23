
public class FDeudaIgual implements Filtro{
	private double deuda;

	public FDeudaIgual(double deuda) {
		super();
		this.deuda = deuda;
	}

	@Override
	public boolean cumple(STurismo p) {
		return (p.getDeuda() == deuda);
	}

	
	
}
