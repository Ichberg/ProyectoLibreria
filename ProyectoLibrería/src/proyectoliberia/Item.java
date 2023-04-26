package proyectoliberia;

public class Item {
	Producto producto;
	int cantidad;
	boolean esFisico;

	public double precioItem() {
		if (producto instanceof Libro) {
			
		
			if (esFisico) {
				return producto.getPrecioCompra() * 1.18 * cantidad;
			} else {
				return producto.getPrecioCompra() * 1.08 * cantidad;
			}
			} else {
				if (esFisico) { 
					return producto.getPrecioCompra() * 1.22 * cantidad;
				} else {
					return producto.getPrecioCompra() * 1.12 * cantidad;
				}
			}
	}
	
	public Item (Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	public void mostrarItem() {
		System.out.println("Producto: " + producto.getCodigo() + "- cantidad: " + cantidad);
		
}
}

