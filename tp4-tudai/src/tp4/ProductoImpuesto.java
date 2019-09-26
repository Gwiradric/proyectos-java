package tp4;

public class ProductoImpuesto extends Producto {
	private double porcentaje, dineroProvincial, dineroNacional;

	public ProductoImpuesto(String nombre, double precio, double porcentaje, double dineroProvincial,
			double dineroNacional) {
		super(nombre, precio);
		this.porcentaje = porcentaje;
		this.dineroProvincial = dineroProvincial;
		this.dineroNacional = dineroNacional;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public double getDineroProvincial() {
		return dineroProvincial;
	}

	public void setDineroProvincial(double dineroProvincial) {
		this.dineroProvincial = dineroProvincial;
	}

	public double getDineroNacional() {
		return dineroNacional;
	}

	public void setDineroNacional(double dineroNacional) {
		this.dineroNacional = dineroNacional;
	}

	private double getImpProv() {
		return (getPrecio() * getPorcentaje() + getDineroProvincial());
	};
	
	private double getImpNac() {
		return (getPrecio() * getPorcentaje() + getDineroNacional());
	};
	
	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return super.getPrecio() + getImpProv() + getImpNac();
	}
		
}
