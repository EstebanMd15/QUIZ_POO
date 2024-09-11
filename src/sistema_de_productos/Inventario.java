package sistema_de_productos;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Productos> productos;
    
    public Inventario(){
        productos = new ArrayList<>();
    }
    void agregarProducto(Productos producto){
        productos.add(producto);
    }
    Productos buscarPorCodigo(String codigoProducto){
        for (Productos producto : productos) {
            if(producto.getCodigoProducto().equals(codigoProducto)){
                return producto;
                
            }
        }
        return null;
    }
    double obtenerGanancias(){
        double totalGanancias = 0;
        for (Productos producto : productos) {
            totalGanancias += producto.obtenerGanancias();
        }
        return totalGanancias;
    }
}
