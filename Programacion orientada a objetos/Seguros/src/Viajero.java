import java.time.LocalDate;
import java.util.List;

public class Viajero implements Seguro{
	private Seguro seguro;
	private LocalDate inicio;
	private LocalDate fin;
	private static final int costoCaduco = 0;
	protected static double porcentaje = 1.0;
	
	public Viajero(LocalDate inicio, LocalDate fin, Seguro seguro){
		this.inicio = inicio;
		this.fin = fin;
		this.seguro = seguro;
	}
	
	public static void setPorcentaje(double porcentajeAPagar){
		porcentaje = porcentajeAPagar/MAX_PORCENTAJE;
	}
	
	private boolean comprobarFecha(){
		boolean aux = fin.isAfter(LocalDate.now());
		boolean aux2 = inicio.isBefore(LocalDate.now());
		return ((aux) && (aux2));
	}
	
	public double getCosto(){
		if (comprobarFecha())
			return (seguro.getCosto())*porcentaje;
		else
			return costoCaduco;
	}
	
	public List<Individual> Listar(Buscar B){
		if (comprobarFecha())
			return seguro.Listar(B);
		else
			return null;
	}
	
	public String toString(){
		if (comprobarFecha())
			return seguro.toString();
		return "";
	}
}
