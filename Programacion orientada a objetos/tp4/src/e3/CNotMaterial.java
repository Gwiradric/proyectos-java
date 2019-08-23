package e3;

public class CNotMaterial implements Criterio{
	private String material;
	
	public CNotMaterial(String material) {
		this.material = material;
	}

	@Override
	public boolean cumple(Pedido p) {
		return !(p.getMaterial().equals(material));
	}
	
}
