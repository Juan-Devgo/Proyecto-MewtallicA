package co.uniquindio.proyectofinal.Model;

public class EstrategiaEfectivo implements PagoEstrategia {

    private UsuarioDAO usuarioDAO;

    public EstrategiaEfectivo() {
        this.usuarioDAO = UsuarioDAOImplementacion.getInstancia();
    }

    @Override
    public boolean realizarPago(String identificacion, double precio){
        Cliente clienteActualizado = usuarioDAO.getCliente(identificacion);
        clienteActualizado.acumularPuntos(precio);
        usuarioDAO.actualizarCliente(clienteActualizado);
        return true;
    }
    
}