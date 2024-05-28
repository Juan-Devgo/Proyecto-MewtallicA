package co.uniquindio.proyectofinal.Model;

public class CambiarCodigo implements CommandActualizar{

    private ProductoDAO recibidor;

//Constructor
    public CambiarCodigo() {
        this.recibidor = ProductoDAOImplementacion.getInstancia();
    }
    
// metodo para actualizar la cantidad de un producto
    @Override
    public void realizarCambio(String cambio, String codigo){
        Producto productoActualizado = recibidor.getProducto(codigo);
        productoActualizado.setCodigo(cambio);
        recibidor.actualizarProducto(productoActualizado);
    }
}