package tp4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compra c1 = new Compra();
		
		c1.addProducto(new Producto("Detergente", 20));
		c1.addProducto(new Producto("Shampoo", 75.5));
		c1.addProducto(new Producto("Galletitas", 65));
		c1.addProducto(new Producto("Detergente", 20));
		System.out.println(c1);
		
		CompraDescuento c2 = new CompraDescuento(0.10);
		c2.addProducto(new Producto("Detergente", 20));
		c2.addProducto(new Producto("Shampoo", 75.5));
		c2.addProducto(new Producto("Galletitas", 65));
		c2.addProducto(new Producto("Detergente", 20));
		System.out.println(c2);
		
		c1.addProducto(new ProductoImpuesto("Ropa importada", 500, 16, 150, 200));
		System.out.println(c1);
		
		c2.addProducto(new ProductoImpuesto("Ropa importada", 500, 16, 150, 200));
		System.out.println(c2);
	}

}
