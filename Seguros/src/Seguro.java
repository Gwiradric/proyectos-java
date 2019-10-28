import java.util.List;

public interface Seguro {
public static final double MAX_PORCENTAJE = 100;
	
	public abstract double getCosto();
	public abstract List<Individual> Listar(Buscar B);
}
