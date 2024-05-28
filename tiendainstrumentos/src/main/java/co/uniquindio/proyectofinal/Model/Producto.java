package co.uniquindio.proyectofinal.Model;

public abstract class Producto {
    protected String nombre, codigo, marca;
    protected double precio;
    protected int cantidad;
    protected Stock stock;

    public Producto(String nombre, String codigo, String marca, double precio, int cantidad, Stock stock) {
        assert nombre != null && !nombre.isBlank();
        assert codigo != null && !codigo.isBlank();
        assert marca != null && !marca.isBlank();
        assert precio > 0;
        assert cantidad >= 0;
        assert stock != null;

        this.nombre = nombre;
        this.codigo = codigo;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
        this.stock = stock;
    }
    
    public  void setNombre(String nombre){
        assert nombre != null && !nombre.isBlank();
        this.nombre = nombre;
    }
    public void setCodigo(String codigo){
        assert codigo != null && !codigo.isBlank();
        this.codigo = codigo;
    }
    public void setMarca(String marca){
        assert marca != null && !marca.isBlank();
        this.marca = marca;
    }
    public void setPrecio(String precioString){
        assert precioString != null && !precioString.isBlank();
        double precio = Double.parseDouble(precioString);
        assert precio > 0;
        this.precio = precio;
    }
    public void setCantidad(String cantidadString) {
        assert cantidadString != null && !cantidadString.isBlank();
        int cantidad = Integer.parseInt(cantidadString);
        assert cantidad >= 0;
        this.cantidad = cantidad;
    }
    public void setStock(String stockString) {
        switch (stockString.toLowerCase()) {
            case "disponible":
                this.stock = Stock.DISPONIBLE;
                break;
        
            default:
                this.stock = Stock.AGOTADO;
                break;
        }
    }

    public String getNombre() {
        return nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getMarca() {
        return marca;
    }
    public double getPrecio() {
        return precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public Stock getStock() {
        return stock;
    }
    
}