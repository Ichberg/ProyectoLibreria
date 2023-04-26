package proyectoliberia;

public class Libro extends Producto {
    private String titulo;
    private String autorPrincipal;
    private String fechaPublicacion;
    private String editorial;

     public Libro(String codigo, double precioCompra, double precioVenta, String titulo, String autorPrincipal, String fechaPublicacion, String editorial) {
        super(codigo, precioCompra, precioVenta);
        this.titulo = titulo;
        this.autorPrincipal = autorPrincipal;
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
    }

   public double calcularPrecioVenta() {
        double porcentajeGanancia = 0.3;
        return getPrecioCompra() * (1 + porcentajeGanancia);
    }
    
  

}
