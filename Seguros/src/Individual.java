import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class Individual implements Seguro{
	private Hashtable<String,String> datos = new Hashtable<String, String>();
	private double costo;
	
	public Individual(double costo){
		this.costo = costo;
	}
	
	public double getCosto(){
		return costo;
	}
	
	public String getAtributo(String clave){
		return (datos.get(clave));
	}
	
	public void setAtributo(String clave, String dato){
		datos.put(clave,dato);
	}
	
	public List<Individual> Listar(Buscar B){
		List<Individual> aux = new ArrayList<Individual>();
		if (B.comparar(this)){
			aux.add(this);
		}
		return aux;
	}
	
	public String toString(){
		Set<String> keys = datos.keySet();
		String aux = "";
		for(String key: keys){
			aux += key + ": " + datos.get(key) + "; ";
		}
		aux += "";
		return aux;
	}
}
