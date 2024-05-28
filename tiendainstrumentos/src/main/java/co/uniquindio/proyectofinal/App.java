package co.uniquindio.proyectofinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import co.uniquindio.proyectofinal.Model.*;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("registrarUsuario"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void closeWindow() {
        Stage stage = (Stage) scene.getWindow();
        stage.close();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        //launch();

        Tienda tienda = Tienda.getInstancia();
        Usuario cliente1 = new Cliente("Angie", "1092", "312", "angie@gmail");
        Usuario administrador = new Administrador("eignA", "1102", "313", "eigna@gmail");
        BuilderInstrumentoCuerda builder = new BuilderInstrumentoCuerda();
        FabricaInstrumento fabrica = new FabricaInstrumentoCuerda(builder);
        Instrumento producto = fabrica.fabricar("Guitarra", "123", "Gibson", 1000000, 1, Stock.DISPONIBLE, Gama.ALTA, new CaracteristicasElectrico());
        tienda.registrarProducto(producto);
        administrador.getServicioActualizar().realizarCambio("acustico", "", "123");
    }

}