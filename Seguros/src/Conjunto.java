import java.util.ArrayList;
import java.util.List;

public class Conjunto implements Seguro{
	
	private List<Seguro> seguros = new ArrayList<Seguro>();
	protected static double descuento = 0;
	
	public Conjunto(){
	
	}
	
	public void setDescuento(double porcentaje){
		descuento = porcentaje/MAX_PORCENTAJE;
	}
	
	public void agregarSeguro(Seguro seguro){
		seguros.add(seguro);
	}
	
	public void sacarSeguro(Seguro seguro){
		if (seguros.contains(seguro))
			seguros.remove(seguro);
	}
	
	public double getCosto(){
		double aux = 0;
		for(Seguro it:seguros)
			aux += it.getCosto();
		return aux - (aux * descuento);
	}
	
	public String toString(){
		String aux = "";
		for(Seguro s:seguros){
			aux += s.toString();
		}
		return aux;
	}
	
	public List<Individual> Listar(Buscar B){
		List<Individual> resultado = new ArrayList<Individual>();
		List <Individual> auxiliar;
		for(Seguro it:seguros){
			auxiliar = it.Listar(B);
			if (!auxiliar.isEmpty())
				resultado.addAll(auxiliar);
		}
		return resultado;
	}
}
