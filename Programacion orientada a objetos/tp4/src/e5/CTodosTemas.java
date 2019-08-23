package e5;

public class CTodosTemas implements Criterio{

	@Override
	public boolean cumple(Evaluador e, Trabajo t) {
		return (e.getConocimientos().containsAll(t.getTemas()));
	}

}
