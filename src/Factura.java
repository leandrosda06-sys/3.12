
public class Factura {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        setCantidad(cantidad);
        setPrecioArticulo(precioArticulo);
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPrecioArticulo(double precioArticulo) {
        if (precioArticulo > 0) {
            this.precioArticulo = precioArticulo;
        } else {
            this.precioArticulo = 0.0;
        }
    }

    public double getPrecioArticulo() {
        return precioArticulo;
    }

    public double obtenerMontoFactura() {
        return cantidad * precioArticulo;
    }
}
