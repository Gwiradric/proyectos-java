package ejercicio8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compra c1 = new Compra();
		c1.addProducto(new Producto("Gaseosa", 75));
		c1.addProducto(new Producto("Mesa", 215));
		c1.addProducto(new Producto("Silla", 1555));
		c1.addProducto(new Producto("Gaseosa",75));
		System.out.println(c1);
		
		CompraDescuento c2 = new CompraDescuento(0.5);
		c2.addProducto(new Producto("Gaseosa", 75));
		c2.addProducto(new Producto("Mesa", 215));
		c2.addProducto(new Producto("Silla", 1555));
		c2.addProducto(new Producto("Gaseosa",75));
		System.out.println(c2);
	}

}
