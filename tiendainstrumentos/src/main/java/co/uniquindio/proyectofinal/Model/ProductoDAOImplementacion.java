package co.uniquindio.proyectofinal.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductoDAOImplementacion implements ProductoDAO {
    private static ProductoDAOImplementacion instancia;
    private HashMap<String, Producto> productos;

    //Constructor
    private ProductoDAOImplementacion(){
        this.productos = new HashMap<>();
    }

    //Singlenton
    public static ProductoDAOImplementacion getInstancia() {
        if(instancia == null){
            ProductoDAOImplementacion instancia = new ProductoDAOImplementacion();
            ProductoDAOImplementacion.instancia = instancia;
        }
            
        return instancia;
    }

    @Override
    public void actualizarProducto(Producto producto) {
        productos.put(producto.getCodigo(), producto);
    }

    @Override
    public void eliminarProducto(Producto producto) {
        productos.remove(producto.getCodigo(), producto); 
    }

    @Override
    public Producto getProducto(String codigo) {
        return productos.get(codigo);
    }

    @Override
    public Instrumento getInstrumento(String codigo) {
        Instrumento instrumento = (Instrumento)productos.get(codigo);
        return instrumento;
    }

    @Override
    public List<Producto> listarProductos(){
        List<Producto> ListaProductos = new ArrayList<>(productos.values());
        return ListaProductos;
    }

    @Override
    public void registrarProducto(Producto producto) {
        productos.put(producto.getCodigo(), producto);
    }

    @Override
    public void actualizarInstrumento(Instrumento instrumento) {
        productos.put(instrumento.getCodigo(), instrumento);
    }
    
}