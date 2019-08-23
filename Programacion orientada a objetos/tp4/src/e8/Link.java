package e8;

public class Link extends EF {
	private EF apuntado;
	private static int tam;

	public Link(String nombre) {
		super(nombre);
	}

	@Override
	public double getTam() {
		return tam;
	}

	@Override
	public int getCant() {
		return 1;
	}

	public EF getApuntado() {
		return apuntado;
	}

	public void setApuntado(EF apuntado) {
		this.apuntado = apuntado;
	}

}
