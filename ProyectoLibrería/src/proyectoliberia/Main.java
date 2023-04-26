package proyectoliberia;

public class Main {

public static void main(String[] args) {

	Libro libro1 = new Libro("1234", 1520.0, 0.0, "El gran Gatsby", "F. Scott Fitzgerald", "1925", "Scribner's");
    Libro libro2 = new Libro ("3568", 2654.0, 0.0, "Pensar rápido, pensar despacio", "Daniel Kahneman", "2018", "Debate");
    
    
    Revista revista1 = new Revista("5678", 500.0, 0.0, "National Geographic", "2022", "National Geographic Society");
    
   
    CarritoCompras carrito = new CarritoCompras();
    
    Item i1 = new Item (libro1, 3);
    Item i2 = new Item (libro2, 1);
    Item i3 = new Item (revista1, 2);
    
    
    carrito.agregarItem(i1);
    carrito.agregarItem(i2);
    carrito.agregarItem (i3);
     
      double precioTotal = carrito.getPrecioTotal();
    
    carrito.mostrarItems();
    
    System.out.println("Precio total del carrito: $" + precioTotal);
}
}