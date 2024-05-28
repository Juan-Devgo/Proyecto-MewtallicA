package co.uniquindio.proyectofinal.Model;

public class Cliente extends Usuario{

    private double puntos;

    //Constructor
    public Cliente(String nombre, String identificacion, String contacto, String email){
        super (nombre, identificacion, contacto, email);

        assert nombre != null;
        assert identificacion != null;
        assert contacto != null;
        assert email != null;

        this.nombre = nombre;
        this.identificacion = identificacion;
        this.contacto = contacto;
        this.email = email;
        this.puntos = 0.0;
        servicioActualizar = new ProxyActualizar(false);
    }

    public void acumularPuntos(double puntos) {
        this.puntos += puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }
    public double getPuntos() {
        return puntos;
    }
}
