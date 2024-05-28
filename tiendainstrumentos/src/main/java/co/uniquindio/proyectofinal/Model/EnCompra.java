package co.uniquindio.proyectofinal.Model;

public class EnCompra implements EstadoCarrito{
    private Carrito contexto;

    public EnCompra(Carrito contexto) {
        assert contexto != null;
        this.contexto = contexto;
    }

    //No se puede realizar la compra porque aún no está listo el carrito.
    @Override
    public void realizarCompra(String identificacion) {

    }

    @Override
    public void cambiarEstado(TipoCarrito estado) {
        switch (estado) {
            case CARRITO_LISTO:
                contexto.cambiarEstado(new CarritoListo(contexto));
                break;
        
            default:
                break;
        }
    }

}