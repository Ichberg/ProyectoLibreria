package proyectoliberia;

public abstract class Producto {
    private String codigo;
    private double precioCompra;
    private double precioVenta;
    


    public Producto(String codigo, double precioCompra, double precioVenta) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

     public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }


    public abstract double calcularPrecioVenta();

    public double calcularPrecioVentaFisica() {
        return getPrecioCompra() * 1.18;
    }

    public double calcularPrecioVentaDigital() {
        return getPrecioCompra() * 1.08;
    }


}

