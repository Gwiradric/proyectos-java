package tp4;

public class CompraDescuento extends Compra{
	private static final int PORCENTAJE_MAXIMO = 100;
	private double descuento;
	
	public CompraDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	public double getDescuento() {
		return descuento;
	}
	
	@Override
	public double getMontoTotal() {
		// TODO Auto-generated method stub
		return (super.getMontoTotal() - (super.getMontoTotal() * descuento));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString() + "Descuento del " + (getDescuento() * PORCENTAJE_MAXIMO) + "%\n--------------------------------\n");
	}



	
	
	
}
