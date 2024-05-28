package co.uniquindio.proyectofinal.Model;

public class ProxyActualizar implements Actualizar{
    private boolean acceso;
    private ServicioActualizar servicioReal;

    //Constructor
    public ProxyActualizar(boolean acceso) {
        this.acceso = acceso;
        this.servicioReal = new ServicioActualizar();
    }

    @Override
    public void realizarCambio(String cambio, String tipoCambio, String Codigo){
        if(acceso) {
            servicioReal.realizarCambio(cambio, tipoCambio, Codigo);
        }
    }

    public ServicioActualizar getServicioReal() {
        return servicioReal;
    }
    public boolean getAcceso() {
        return acceso;
    }
}