public class Main {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop();
        lap1.setNombre("asus");
        lap1.setProcesador("coreI9");
        lap1.setMemoriaRam("16GB");
        lap1.setMarca("ASUS");
        lap1.setPrecio(3000);
        lap1.setCantidadStock(8);
        Cliente cliente1 = new Cliente();
        cliente1.setCorreo("miguel@a.com");
        cliente1.setNombre("miguel");
        cliente1.comprarProducto(lap1,6);
    }
}