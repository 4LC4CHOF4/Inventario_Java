public class inventario {
    public static int calcularSubtotal(int precio, int cantidad) {
        return precio - cantidad;
    }
    public static void main(String[] args) {
        int precio = 64;
        int cantidad = 18;
        int valorTotal = calcularSubtotal(precio, cantidad);
        System.out.println("Subtotal: " + valorTotal);
    }
}