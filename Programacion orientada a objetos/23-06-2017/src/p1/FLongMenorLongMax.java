package p1;

public class FLongMenorLongMax implements Filtro{

	@Override
	public boolean cumple(CA c) {
		// TODO Auto-generated method stub
		return (c.getLong() < c.getLongmax());
	}
	
}
