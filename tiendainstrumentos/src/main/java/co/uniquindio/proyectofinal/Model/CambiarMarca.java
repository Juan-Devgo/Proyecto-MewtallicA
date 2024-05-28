package co.uniquindio.proyectofinal.Model;

public class CambiarMarca implements CommandActualizar{

    private ProductoDAO recibidor;

    //Cosntructor
    public CambiarMarca() {
        this.recibidor = ProductoDAOImplementacion.getInstancia();
    }

    // metodo para actualizar la cantidad de un producto
    @Override
    public void realizarCambio(String cambio, String codigo){
        Producto productoActualizado = recibidor.getProducto(codigo);
        productoActualizado.setMarca(cambio);
        recibidor.actualizarProducto(productoActualizado);
    }
}