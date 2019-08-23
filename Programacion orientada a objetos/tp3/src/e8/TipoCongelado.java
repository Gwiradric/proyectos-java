package e8;

import java.time.LocalDate;
import java.util.Vector;

public class TipoCongelado extends Congelados {
	private Vector<Object> atributos;
	
	public TipoCongelado(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int lote, String granjaOrigen,
			int codigoSupervision, int temperaturaRecomendada) {
		super(fechaVencimiento, fechaEnvasado, lote, granjaOrigen, codigoSupervision, temperaturaRecomendada);
		atributos = new Vector<Object>();
	}

	public void add(Object o) {
		atributos.addElement(o);
	}

	public String getEtiqueta() {
		return (super.getEtiqueta() + ". METODO: " + atributos.toString());
	}
	
	

	
	
	

}
