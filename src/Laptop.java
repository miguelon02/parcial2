public class Laptop extends Producto{
    private String procesador;
    private String memoriaRam;

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("el producto es: "+getNombre()+"\nLa marca es: "+getMarca()+"\nSu precio es: $"+getPrecio()+"\nLa cantidad que se tiene en stock es: "+getCantidadStock()+"\nEl procesador del equipo es: "+getProcesador()+"\nLa memoria ram del equipo es: "+getMemoriaRam());
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
