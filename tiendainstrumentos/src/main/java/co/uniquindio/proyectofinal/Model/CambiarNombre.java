package co.uniquindio.proyectofinal.Model;

public class CambiarNombre implements CommandActualizar{

    private ProductoDAO recibidor;

//Cosntructor
    public CambiarNombre() {
        this.recibidor = ProductoDAOImplementacion.getInstancia();
    }

// metodo para actualizar la cantidad de un producto
    @Override
    public void realizarCambio(String cambio, String codigo){
        Producto productoActualizado = recibidor.getProducto(codigo);
        productoActualizado.setNombre(cambio);
        recibidor.actualizarProducto(productoActualizado);
    }
}
