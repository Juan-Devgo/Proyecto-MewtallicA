package co.uniquindio.proyectofinal.Model;

public class CambiarGama implements CommandActualizar {
    
    private ProductoDAO recibidor;

    //Constructor
    public CambiarGama() {
        this.recibidor = ProductoDAOImplementacion.getInstancia();
    }

// metodo para actualizar la cantidad de un producto
    @Override
    public void realizarCambio(String cambio, String codigo) {
        Instrumento instrumentoActualizado = recibidor.getInstrumento(codigo);
        instrumentoActualizado.setImplementacion(cambio);
        recibidor.actualizarInstrumento(instrumentoActualizado);
    }
}
