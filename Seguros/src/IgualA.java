public class IgualA implements Buscar {
	
	private String clave;
	private String dato;
	
	public IgualA(String clave, String dato) {
		this.clave = clave;
		this.dato = dato;
	}
	
	public boolean comparar(Individual s) {
			String elem = s.getAtributo(clave);
			if (elem != null)
				return (elem == dato);
			else
				return false;
	}

}
