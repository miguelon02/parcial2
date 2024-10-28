import java.util.List;
import java.util.Objects;

public class Cliente {
    private String nombre;
    private String correo;
    private List<Producto> productosComprados;
    public Cliente() {
    }

    public Cliente(String nombre, String correo, List<Producto> productosComprados) {
        this.nombre = nombre;
        this.correo = correo;
        this.productosComprados = productosComprados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Producto> getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(List<Producto> productosComprados) {
        this.productosComprados = productosComprados;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", productosComprados=" + productosComprados +
                '}';
    }

    public void comprarProducto(Producto producto, int cantidad){
        if(producto.getCantidadStock()!=0) {
            producto.calcularPrecioVenta(cantidad);
            this.productosComprados.add(producto);
            for (int i = 0; i < productosComprados.size(); i++) {
                productosComprados.get(i).mostrarDetalles();
            }
        }else{
            System.out.println("No hay stock disponible.");
        }
    }
    public void mostrarCompra(){
        for (int i =0;i<productosComprados.size();i++){
            productosComprados.get(i).calcularPrecioVenta(5);
        }
    }
}
