import java.time.LocalDate;

public class ContingenteEspecial extends Contingente{

	public ContingenteEspecial(Contingente c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public ContingenteEspecial(String nombre, String destino, LocalDate fechaPartida, LocalDate fechaLlegada, Filtro criterio) {
		super(nombre, destino, fechaPartida, fechaLlegada, criterio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrecio() {
		return (this.getPrecio() / this.getCantPasajeros());
	}
	
	
}
