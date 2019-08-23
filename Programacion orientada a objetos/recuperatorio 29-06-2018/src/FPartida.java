import java.time.LocalDate;

public class FPartida implements Filtro{
	private LocalDate fechaPartida;
	
	

	public FPartida(LocalDate fechaPartida) {
		super();
		this.fechaPartida = fechaPartida;
	}

	@Override
	public boolean cumple(STurismo p) {
		// TODO Auto-generated method stub
		return (p.getFechaPartida().equals(fechaPartida));
	}
	

}
