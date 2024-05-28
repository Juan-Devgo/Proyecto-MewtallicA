package co.uniquindio.proyectofinal.Model;

public class Administrador extends Usuario{

    private final boolean acceso;

    //Cosntructor
    public Administrador(String nombre, String identificacion, String contacto, String email){
        super(nombre, identificacion, contacto, email);

        assert nombre != null;
        assert identificacion != null;
        assert contacto != null;
        assert email != null;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.contacto = contacto;
        this.email = email;
        this.acceso = true;
        servicioActualizar = new ProxyActualizar(true);
    }
// metodo get
    public boolean getAcceso() {
        return acceso;
    }
// metodo sobreescrito realizar compra, no se implementa en la clase 
    @Override 
    public void realizarCompra(){
        
    }

}
