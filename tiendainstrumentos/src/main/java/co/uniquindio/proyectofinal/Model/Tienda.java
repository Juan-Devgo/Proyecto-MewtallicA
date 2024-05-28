package co.uniquindio.proyectofinal.Model;

public class Tienda {
    private String nombre;
    private static Tienda instancia;
    private ProductoDAO productoDAO;
    private UsuarioDAO usuarioDAO;

    private Tienda(){
        this.productoDAO = ProductoDAOImplementacion.getInstancia();
        this.usuarioDAO = UsuarioDAOImplementacion.getInstancia();
    }

    public static Tienda getInstancia() {
        if (instancia == null){
            Tienda instancia = new Tienda();
            Tienda.instancia = instancia;
        }
        return instancia;
    }

    public Producto buscarProducto(String codigo){
        return productoDAO.getProducto(codigo);
    }

    public Instrumento buscaInstrumento(String codigo){
        return productoDAO.getInstrumento(codigo);
    }

    public Usuario buscarUsuario(String identificacion){
        return usuarioDAO.getUsuario(identificacion); 
    }

    public Cliente buscarCliente(String identificacion){
        return usuarioDAO.getCliente(identificacion);
    }

    public void registrarProducto(Producto producto){
        productoDAO.registrarProducto(producto);
    }

    public void registrarUsuario(Usuario usuario){
        usuarioDAO.registrarUsuario(usuario);
    }

    public String getNombre() {
        return nombre;
    }
}
