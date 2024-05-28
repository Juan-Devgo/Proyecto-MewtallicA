package co.uniquindio.proyectofinal.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import co.uniquindio.proyectofinal.App;

public class LoginController {

    @FXML
    private Button botonAceptar;

    @FXML
    private Button botonVolver;

    @FXML
    private Label consola;

    @FXML
    private TextField txUsuario;

    @FXML
    private void cambiarRegistro(ActionEvent event) throws IOException {
        if(x.getUsuarios().isEmpty()){
            App.closeWindow();
        }else{
            App.setRoot("registrarUsuario");
        }
    }

    @FXML
    public void loggear(ActionEvent event) throws IOException {
        String nombreUsuario = txUsuario.getText();

        if(buscarUsuario(nombreUsuario)){
            Usuario usuario = x.buscarUsuario(nombreUsuario).get();
            mediator.setUsuarioEnLinea(usuario);
            App.setRoot("paginaPrincipal");
        }else{
            consola.setText("El usuario no se encontró.");
        }
    }

    private boolean buscarUsuario(String nombre) {
        Optional<Usuario> usuarioEncontrado = x.buscarUsuario(nombre);
        return usuarioEncontrado.isPresent();      
    }

}