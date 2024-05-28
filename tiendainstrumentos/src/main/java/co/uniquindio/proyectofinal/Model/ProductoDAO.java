package co.uniquindio.proyectofinal.Model;

import java.util.List;

public interface ProductoDAO {
    public Producto getProducto(String codigo);
    public Instrumento getInstrumento(String codigo);
    public List<Producto> listarProductos();
    public void registrarProducto(Producto producto);
    public void eliminarProducto(Producto producto);
    public void actualizarProducto(Producto producto);
    public void actualizarInstrumento(Instrumento instrumento);
}