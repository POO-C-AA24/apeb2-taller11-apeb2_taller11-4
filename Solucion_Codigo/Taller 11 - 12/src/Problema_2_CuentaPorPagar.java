import java.util.ArrayList;
import java.util.List;
public class Problema_2_CuentaPorPagar {
    public String nombreCliente;
    public List<Problema_2_Menu> menus;
    public double subtotal;
    public double iva;
    public double total;

    public Problema_2_CuentaPorPagar(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.menus = new ArrayList<>();
    }

    public void agregarMenu(Problema_2_Menu menu) {
        menus.add(menu);
        subtotal += menu.getValorMenu();
    }

    public void calcularTotal() {
        iva = subtotal * 0.12; // Suponiendo un IVA del 12%
        total = subtotal + iva;
    }

    public void mostrarCuenta() {
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Menus solicitados:");
        for (Problema_2_Menu menu : menus) {
            System.out.println(" - " + menu.getNombrePlato() + ": $" + menu.getValorMenu());
        }
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA: $" + iva);
        System.out.println("Total: $" + total);
    }
}
