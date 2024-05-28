package co.uniquindio.proyectofinal.Controller;

import java.io.IOException;

import co.uniquindio.proyectofinal.App;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
