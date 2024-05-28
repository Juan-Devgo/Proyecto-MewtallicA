package co.uniquindio.proyectofinal.Model;

public class CarritoComprado implements EstadoCarrito {

    private Carrito contexto;

    public CarritoComprado(Carrito contexto) {
        assert contexto != null;
        this.contexto = contexto;
    }

    @Override
    //No se puede realizar porque el carrito ya fue comprado.
    public void realizarCompra(String identificacion) {

    }

    @Override
    public void cambiarEstado (TipoCarrito estado) {
        switch (estado) {
            case EN_COMPRA:
                contexto.cambiarEstado(new EnCompra(contexto));
                break;
        
            default:
                break;
        }
    }
    
}