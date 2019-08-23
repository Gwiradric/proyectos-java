package e5;

public class CAlgunTema implements Criterio{

	@Override
	public boolean cumple(Evaluador e, Trabajo t) {
		boolean res = false;
		int i = 0;
		while (i < t.getTemas().size() && !res) {
			if (e.getConocimientos().contains(t.getTemas().elementAt(i))) {
				res = true;
			}	
			else
				i++;
		}
		return res;
	}
}