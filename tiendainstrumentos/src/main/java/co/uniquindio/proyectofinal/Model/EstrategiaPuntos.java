package co.uniquindio.proyectofinal.Model;

public class EstrategiaPuntos implements PagoEstrategia {
    private UsuarioDAO usuarioDAO;

    public EstrategiaPuntos() {
        this.usuarioDAO = UsuarioDAOImplementacion.getInstancia();
    }

    @Override
    public boolean realizarPago(String identificacion, double precio){
        Cliente cliente = usuarioDAO.getCliente(identificacion); boolean aprobado = false; double puntos = cliente.getPuntos();
        if (puntos > precio) {
            aprobado = true;
            cliente.setPuntos(puntos-precio);
            usuarioDAO.actualizarCliente(cliente);
        }
        return aprobado;
    }
    
}