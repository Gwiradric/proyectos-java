package ejercicio8;

public class impuestoCriterio extends Impuesto{
	private Criterio c;

	public impuestoCriterio(double suma, double multiplicacion, Criterio c) {
		super(suma, multiplicacion);
		this.c = c;
	}

	@Override
	public double getCalculo(double precio) {
		// TODO Auto-generated method stub
		if (c.cumple())
			return (super.getCalculo(precio));
		else
			return (precio * this.getMultiplicacion());
	}
	
	
}
