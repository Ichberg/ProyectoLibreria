package proyectoliberia;

public class Revista extends Producto {
    private String nombre;
    private String fechaPublicacion;
    private String editor;
    
    public Revista(String codigo, double precioCompra, double precioVenta, String nombre, String fechaPublicacion, String editor) {
        super(codigo, precioCompra, precioVenta);
        this.nombre = nombre;
        this.fechaPublicacion = fechaPublicacion;
        this.editor = editor;
    }

    public double calcularPrecioVenta() {
        double porcentajeGanancia = 0.2; 
        return getPrecioCompra() * (1 + porcentajeGanancia);
    }
    
       
}

