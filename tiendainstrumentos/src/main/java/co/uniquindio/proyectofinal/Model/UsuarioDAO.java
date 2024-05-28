package co.uniquindio.proyectofinal.Model;

import java.util.List;

public interface UsuarioDAO{
    public Usuario getUsuario(String identificacion);
    public Cliente getCliente(String identificacion);
    public List<Usuario> listarUsuarios();
    public void registrarUsuario(Usuario usuario);
    public void eliminarUsuario(Usuario usuario);
    public void actualizarUsuario(Usuario usuario);
    public void actualizarCliente(Cliente cliente);
}