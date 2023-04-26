package proyectoliberia;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
	
    private List<Item> items;

    public CarritoCompras() {
        this.items = new ArrayList<Item>();
    }

    public void agregarItem(Item item) {
        items.add(item);
    }

    public void quitarItem(Item item) {
        items.remove(item);
    }

    
    public void mostrarItems() {
        if (items.size() == 0) {
            System.out.println("El carrito está vacío");
        } else {
            for (Item item : items) {
                item.mostrarItem();
            }
        }
    }

    public double getPrecioTotal() {
    	double total = 0;
    	if (items.isEmpty())
    		System.out.println ("El carrito está vacío");
    	else {
    		for (Item item : items) {
    	          total = total + item.precioItem();
        }
    	}
        return total;
    }
}
