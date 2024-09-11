
package sistema_de_productos;


public class Productos {
    private String codigoProducto;
    private String nombreProducto;
    private double precioVenta;
    private double precioCompra;
    private int stock;
    private double ganancias;
    
public Productos(String codigoProducto, String nombreProducto, double precioVenta, double precioCompra,
        int stock, double ganancias){
    this.codigoProducto = codigoProducto;
    this.nombreProducto = nombreProducto;
    this.precioVenta = precioVenta;
    this.precioCompra = precioCompra;
    this.stock = stock;
    this.ganancias = 0;
    
}    

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public int getStock() {
        return stock;
    }

    public double getGanancias() {
        return ganancias;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setGanancias(double ganancias) {
        this.ganancias = 0;
    }
  
void agregarStock(int cantidad){
    this.stock += cantidad;  
    }
    
boolean venta(int cantidad){
    if(cantidad <= stock){
        stock -= cantidad;
        ganancias += cantidad * precioVenta;
        return true;
    }
    return false;
}
double obtenerGanancias(){
    return ganancias;
}

}
