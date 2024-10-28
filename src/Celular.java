public class Celular extends Producto{
    private String capacidadBateria;
    private String camaraResolucion;

    public String getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(String capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public String getCamaraResolucion() {
        return camaraResolucion;
    }

    public void setCamaraResolucion(String camaraResolucion) {
        this.camaraResolucion = camaraResolucion;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("el producto es: "+getNombre()+"\nLa marca es: "+getMarca()+"\nSu precio es: $"+getPrecio()+"\nLa cantidad que se tiene en stock es: "+getCantidadStock()+"\nLa capacidad de su bateria es: "+getCapacidadBateria()+"\nLa resolucion de la camara es de: "+getCamaraResolucion()+"MEGAPIXELES");
    }
    @Override
    public void calcularPrecioVenta(int cantidad){
        int totalSinDescuento = cantidad*getPrecio();
        if(cantidad>5){
            double descuentoRealizado = totalSinDescuento-(totalSinDescuento*0.1);
            System.out.println("Si se compra, se hara un descuento especial a esta compra del 10% al total de esta compra:\nprecio total original: $"+totalSinDescuento+"\nCon el descuento hecho el precio total es: $"+descuentoRealizado);
        }else{
            System.out.println("El precio por su compra seria de: $"+totalSinDescuento);
        }
    }
}
