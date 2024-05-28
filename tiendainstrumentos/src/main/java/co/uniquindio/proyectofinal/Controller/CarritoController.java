package co.uniquindio.proyectofinal.Controller;

import java.util.Optional;

import co.uniquindio.proyectofinal.Model.CaracteristicasAcustico;
import co.uniquindio.proyectofinal.Model.Carrito;
import co.uniquindio.proyectofinal.Model.Gama;
import co.uniquindio.proyectofinal.Model.Instrumento;
import co.uniquindio.proyectofinal.Model.InstrumentoPercusion;
import co.uniquindio.proyectofinal.Model.Producto;
import co.uniquindio.proyectofinal.Model.ProductoDAO;
import co.uniquindio.proyectofinal.Model.Stock;
import co.uniquindio.proyectofinal.Model.TipoCarrito;
import co.uniquindio.proyectofinal.Model.EstadoCarrito;
import co.uniquindio.proyectofinal.Model.CarritoComprado;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextInputDialog;

public class CarritoController {
    @FXML
    private ListView<Producto> lv_ListaCarrito;

    private Carrito carrito;
    private ProductoDAO productoDAO;
    private ObservableList<Producto> productosObservableList;

    public void initialize() {
        // Inicializar el carrito y la lista observable
        carrito = new Carrito();
        productosObservableList = lv_ListaCarrito.getItems();
    }

    public void setProductoDAO(ProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
    }

    @FXML
    private void agregarProducto() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Agregar Producto");
        dialog.setHeaderText("Ingrese el nombre del producto:");
        dialog.setContentText("Nombre:");

        Optional<String> result = dialog.showAndWait();
        result.ifPresent(nombre -> {
            // Crear una nueva instancia de Instrumento con el nombre proporcionado
            InstrumentoPercusion nuevoInstrumento = new InstrumentoPercusion(nombre, "codigo", "marca", 100.0, 1, Stock.DISPONIBLE, Gama.MEDIA, new CaracteristicasAcustico());

            // Registrar el nuevo producto en el DAO
            productoDAO.registrarProducto(nuevoInstrumento);

            // Agregar el nuevo producto al carrito
            carrito.agregarProducto(nuevoInstrumento);

            // Actualizar la lista observable de productos en el carrito
            productosObservableList.setAll(carrito.getProductos());
        });
    }

    @FXML
    private void eliminarProducto() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Eliminar Producto");
        dialog.setHeaderText("Ingrese el código del producto a eliminar:");
        dialog.setContentText("Código:");

        Optional<String> result = dialog.showAndWait();
        result.ifPresent(codigo -> {
            Producto productoAEliminar = productoDAO.getProducto(codigo);
            if (productoAEliminar != null) {
                carrito.eliminarProducto(productoAEliminar);
                productoDAO.eliminarProducto(productoAEliminar);
                productosObservableList.setAll(carrito.getProductos());
            } else {
                showAlert("Producto no encontrado", "No se encontró ningún producto con el código proporcionado.");
            }
        });
    }

    @FXML
    private void realizarCompra() {
        Alert confirmDialog = new Alert(Alert.AlertType.CONFIRMATION);
        confirmDialog.setTitle("Confirmar Compra");
        confirmDialog.setHeaderText("¿Está seguro de realizar la compra?");

        Optional<ButtonType> result = confirmDialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            // Lógica para realizar la compra
            EstadoCarrito nuevoEstado = new CarritoComprado(carrito);
            productosObservableList.clear();
            showAlert("Compra Realizada", "La compra se ha realizado con éxito.");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}