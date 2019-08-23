import java.time.LocalDate;
import java.util.Vector;

public class Pasajero extends STurismo{
	private double precio, deuda;
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}
	
	public Pasajero(String nombre, String destino, LocalDate fechaPartida, LocalDate fechaLlegada, double precio,
			double deuda) {
		super(nombre, destino, fechaPartida, fechaLlegada);
		this.precio = precio;
		this.deuda = deuda;
	}

	public Pasajero(Pasajero p) {
		super(p.getNombre(), p.getDestino(), p.getFechaPartida(), p.getFechaLlegada());
	}

	@Override
	public double getPrecio() {
		return precio;
	}

	@Override
	public double getDeuda() {
		return deuda;
	}

	@Override
	public int getCantPasajeros() {
		return 1;
	}

	@Override
	public STurismo getCopia() {
		return (new Pasajero(this));
	}

	@Override
	public Vector<STurismo> buscar(Filtro f) {
		Vector<STurismo> res = new Vector<STurismo>();
		if (f.cumple(this))
			res.add(this);
		return res;
	}

	@Override
	public boolean getContValido(Filtro f) {
		return (!f.cumple(this));
	}

	@Override
	public Pasajero getPasajeroMayorDeuda() {
		return (this);
	}

}
