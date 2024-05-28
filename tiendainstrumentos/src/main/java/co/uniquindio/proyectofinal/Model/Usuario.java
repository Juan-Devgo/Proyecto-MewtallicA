package co.uniquindio.proyectofinal.Model;

public abstract class Usuario {
    protected String nombre;
    protected String identificacion;
    protected String contacto;
    protected String email;
    protected Actualizar servicioActualizar;

    public Usuario(String nombre, String identificacion, String contacto, String email){
        assert nombre != null;
        assert identificacion != null;
        assert contacto != null;
        assert email != null;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.contacto = contacto;
        this.email = email;
    }

    public void realizarCompra(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public Actualizar getServicioActualizar() {
        return servicioActualizar;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


