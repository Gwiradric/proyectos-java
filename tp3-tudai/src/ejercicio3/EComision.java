package ejercicio3;

public class EComision extends Empleado{
		private double totalVentas;
		private int cantidadVentas;

		public EComision(double salario, double horasTrabajadas) {
			super(salario, horasTrabajadas);
			this.cantidadVentas = 0;
			this.totalVentas = 0;
		}

		public int getCantidadVentas() {
			return cantidadVentas;
		}
		
		public double getTotalVentas() {
			return (this.totalVentas);
		}
		
		public void addVenta(double venta) {
			totalVentas += venta;
			cantidadVentas++;
		}

		@Override
		public double getPago() {
			// TODO Auto-generated method stub
			return (super.getSalario() + (this.getTotalVentas() / this.getCantidadVentas()));
		}
		
		
}
