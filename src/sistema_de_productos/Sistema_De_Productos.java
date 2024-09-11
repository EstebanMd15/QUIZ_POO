
package sistema_de_productos;

import java.util.Scanner;


public class Sistema_De_Productos {


    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        Inventario inventario = new Inventario();
        boolean siguiente = true;
        
           
           
            while (siguiente){
            System.out.println("---*MENU DE OPCIONES---\n");
            System.out.println("1. Agregar Producto.");
            System.out.println("2. Agregar Stock a un Producto Buscado Por El Codigo.");
            System.out.println("3. Vender un producto.");
            System.out.println("4. Ganancias de Ventas del Producto Buscado.");
            System.out.println("5. Total de Ganancias de Ventas de los Peoductos.");
            System.out.println("6. Salir.\n");
                System.out.println("--DIGITE UNA OPCION--");
            
           int opcion = scanner.nextInt(); 
           scanner.nextLine();
            switch(opcion){
                case 1: 
                    System.out.println("Ingrese el codigo del producto: ");
                    String codigoProucto = scanner.next();
                    System.out.println("Ingrese el nombre del producto: ");
                    String nombreProducto = scanner.next();
                    System.out.println("Precio de Venta: ");
                    double precioVenta = scanner.nextDouble();
                    System.out.println("Precio compra: ");
                    double precioCompra = scanner.nextDouble();
                    System.out.println("El Stock es: ");
                    int stock = scanner.nextInt();
                    
        Productos producto = new Productos(codigoProucto, nombreProducto, precioVenta, precioCompra,
                stock, precioCompra);
        inventario.agregarProducto(producto);
        break;
        
                case 2:
                     System.out.print("Código del producto: ");
                    String codigoStock = scanner.nextLine();
                    Productos productoStock = inventario.buscarPorCodigo(codigoStock);
                    if (productoStock != null) {
                        System.out.print("Cantidad a agregar: ");
                        int cantidad = scanner.nextInt();
                        productoStock.agregarStock(cantidad);
                        System.out.println("Stock al dia.");
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 3: 
                    System.out.println("Codigo del producto: ");
                    String codigoVenta = scanner.nextLine();
                    Productos productoVenta = inventario.buscarPorCodigo( codigoVenta);
                    if(productoVenta != null){
                        System.out.println("Cantidad a vender: ");
                        int cantidadVenta = scanner.nextInt();
                        if(productoVenta.venta(cantidadVenta));{
                        System.out.println("Venta realizada con exito.");
                    }
                    } else {
                        System.out.println("Producto insuficiente");
                    }
                    break;
                    
                case 4:
                    System.out.println("Nombre del producto: ");
                    String nombreGanancias = scanner.nextLine();
                       Productos productoGanancias = inventario.buscarPorCodigo(nombreGanancias);
                        if (productoGanancias != null) {
                        System.out.println("Ganancias de " + nombreGanancias + ": " + productoGanancias.obtenerGanancias());
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                
                case 5:
                        System.out.println("Ganancias Totales: " + inventario.obtenerGanancias());
                        break;
                        
                case 6:
                    siguiente = false;
                    break;
                default:
                    System.out.println("NO VALIDO");
      
         }           
      } 
            scanner.close();
     }
 }
