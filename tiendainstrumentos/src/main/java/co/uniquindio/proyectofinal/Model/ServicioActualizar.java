package co.uniquindio.proyectofinal.Model;

public class ServicioActualizar implements Actualizar{
    
    private CommandActualizar commandActualizar;

    @Override
    public void realizarCambio(String cambio, String tipoCambio, String codigo){
        setCommandActualizar(tipoCambio);
        commandActualizar.realizarCambio(cambio, codigo);
    }

    public void setCommandActualizar(String tipoCambio){
        switch (tipoCambio.toLowerCase()) {
            case "nombre":
                this.commandActualizar = new CambiarNombre();
                break;

            case "codigo":
                this.commandActualizar = new CambiarCodigo();
                break;

            case "marca":
                this.commandActualizar = new CambiarMarca();
                break;

            case "precio":
                this.commandActualizar = new CambiarPrecio();
                break;

            case "cantidad":
                this.commandActualizar = new CambiarCantidad();
                break;

            case "gama":
                this.commandActualizar = new CambiarGama();

            default:
                this.commandActualizar = new CambiarImplementacion();
                break;
        }
    }
}