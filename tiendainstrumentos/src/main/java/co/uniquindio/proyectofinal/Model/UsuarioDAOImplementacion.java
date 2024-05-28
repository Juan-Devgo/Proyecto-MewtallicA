package co.uniquindio.proyectofinal.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UsuarioDAOImplementacion implements UsuarioDAO{
    private static UsuarioDAOImplementacion instancia;
    private HashMap<String, Usuario> usuarios;

    //Constructor
    private UsuarioDAOImplementacion(){
        this.usuarios = new HashMap<>();
    }

    //Singlenton
    public static UsuarioDAOImplementacion getInstancia() {
        if(instancia == null){
            UsuarioDAOImplementacion instancia = new UsuarioDAOImplementacion();
            UsuarioDAOImplementacion.instancia = instancia;
        }
        return instancia;
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        usuarios.put(usuario.getIdentificacion(), usuario);
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        usuarios.put(cliente.getIdentificacion(), cliente);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario.getIdentificacion(), usuario); 
    }

    @Override
    public Usuario getUsuario(String identificacion) {
        return usuarios.get(identificacion);
    }

    @Override
    public Cliente getCliente(String identificacion) {
        return (Cliente)usuarios.get(identificacion);
    }

    @Override
    public List<Usuario> listarUsuarios(){
        List<Usuario> ListaUsuarios = new ArrayList<>(usuarios.values());
        return ListaUsuarios;
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        usuarios.put(usuario.getIdentificacion(), usuario);
    }

}