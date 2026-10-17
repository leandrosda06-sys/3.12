
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PruebaFactura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero de pieza: ");
        String numero = entrada.nextLine();

        System.out.print("Ingrese la descripcion de la pieza: ");
        String descripcion = entrada.nextLine();

        System.out.print("Ingrese la cantidad de articulos: ");
        int cantidad = Integer.parseInt(entrada.nextLine());

        System.out.print("Ingrese el precio por articulo: ");
        String textoPrecio = entrada.nextLine().replace(",", ".");
        double precio = Double.parseDouble(textoPrecio);

        Factura factura = new Factura(numero, descripcion, cantidad, precio);

        String resultado = "DATOS DE LA FACTURA\n\n"
                + "Numero de pieza: " + factura.getNumeroPieza() + "\n"
                + "Descripcion: " + factura.getDescripcionPieza() + "\n"
                + "Cantidad: " + factura.getCantidad() + "\n"
                + "Precio por articulo: $" + factura.getPrecioArticulo() + "\n"
                + "Monto total: $" + factura.obtenerMontoFactura();

        JOptionPane.showMessageDialog(
                null,
                resultado,
                "Factura",
                JOptionPane.INFORMATION_MESSAGE
        );

        entrada.close();
    }
}
