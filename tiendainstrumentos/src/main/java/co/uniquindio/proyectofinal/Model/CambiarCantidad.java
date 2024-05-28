package co.uniquindio.proyectofinal.Model;

public class CambiarCantidad implements CommandActualizar{
    
    private ProductoDAO recibidor;

//Constructor
    public CambiarCantidad() {
        this.recibidor = ProductoDAOImplementacion.getInstancia();
    }
    
// metodo para actualizar la cantidad de un producto
    @Override
    public void realizarCambio(String cambio, String codigo) {
        Producto productoActualizado = recibidor.getProducto(codigo);
        productoActualizado.setCantidad(cambio);
        recibidor.actualizarProducto(productoActualizado);
    }
}
