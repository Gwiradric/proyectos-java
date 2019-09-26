package tp4;

public class CompraDescuento extends Compra{
	private double descuento;
	
	public CompraDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public double getMontoTotal() {
		// TODO Auto-generated method stub
		return (super.getMontoTotal() - (super.getMontoTotal() * descuento));
	}
	
	
}
