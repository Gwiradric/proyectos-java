
public class FDeudaMayor implements Filtro {
	private double precio;
	
	public FDeudaMayor(double precio) {
		super();
		this.precio = precio;
	}

	@Override
	public boolean cumple(STurismo p) {
		return (p.getPrecio() > precio);
	}

}
