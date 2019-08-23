import java.time.LocalDate;
import java.util.Vector;

public abstract class STurismo {
	private String nombre, destino;
	private LocalDate fechaPartida, fechaLlegada;
	
	public STurismo(String nombre, String destino, LocalDate fechaPartida, LocalDate fechaLlegada) {
		super();
		this.nombre = nombre;
		this.destino = destino;
		this.fechaPartida = fechaPartida;
		this.fechaLlegada = fechaLlegada;
	}

	public abstract Pasajero getPasajeroMayorDeuda();
	public abstract double getPrecio();
	public abstract double getDeuda();
	public abstract int getCantPasajeros();
	public abstract STurismo getCopia();
	public abstract Vector<STurismo> buscar(Filtro f);
	public abstract boolean getContValido(Filtro f);

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDate getFechaPartida() {
		return fechaPartida;
	}

	public void setFechaPartida(LocalDate fechaPartida) {
		this.fechaPartida = fechaPartida;
	}

	public LocalDate getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(LocalDate fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
