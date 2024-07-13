import java.util.Scanner;
public class Problema_2_Ejecutor {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double valorInicialCarta,valorGuarnicion,valorBebidaCarta,porcentajeAdicional,valorInicialDia,valorPostre,valorBebidaDia,valorInicialNino,valorHelado,valorPastel,valorInicialEconomico,porcentajeDescuento;
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = tc.nextLine();

        Problema_2_CuentaPorPagar cuenta = new Problema_2_CuentaPorPagar(nombreCliente);

        while (true) {
            System.out.println("Seleccione el tipo de menu:");
            System.out.println("1. Menu a la Carta");
            System.out.println("2. Menu del Dia");
            System.out.println("3. Menu de Nino");
            System.out.println("4. Menu Economico");
            System.out.println("5. Terminar y mostrar cuenta");
            int opcion = tc.nextInt();
            tc.nextLine(); 

            if (opcion == 5) {
                break;
            }

            System.out.print("Ingrese el nombre del plato: ");
            String nombrePlato = tc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor inicial del menú: ");
                    valorInicialCarta = tc.nextDouble();
                    System.out.print("Ingrese el valor de la guarnición: ");
                    valorGuarnicion = tc.nextDouble();
                    System.out.print("Ingrese el valor de la bebida: ");
                    valorBebidaCarta = tc.nextDouble();
                    System.out.print("Ingrese el porcentaje adicional por servicio: ");
                    porcentajeAdicional = tc.nextDouble();
                    tc.nextLine();
                    Problema_2_Menu menuCarta = new Problema_2_MenuALaCarta(nombrePlato,valorInicialCarta,valorGuarnicion,valorBebidaCarta,porcentajeAdicional);
                    cuenta.agregarMenu(menuCarta);
                    break;
                case 2:
                    System.out.print("Ingrese el valor inicial del menú: ");
                    valorInicialDia = tc.nextDouble();
                    System.out.print("Ingrese el valor del postre: ");
                    valorPostre = tc.nextDouble();
                    System.out.print("Ingrese el valor de la bebida: ");
                    valorBebidaDia = tc.nextDouble();
                    tc.nextLine(); 
                    Problema_2_Menu menuDia = new Problema_2_MenuDelDia(nombrePlato, valorInicialDia, valorPostre, valorBebidaDia);
                    cuenta.agregarMenu(menuDia);
                    break;
                case 3:
                    System.out.print("Ingrese el valor inicial del menú: ");
                    valorInicialNino = tc.nextDouble();
                    System.out.print("Ingrese el valor del helado: ");
                    valorHelado = tc.nextDouble();
                    System.out.print("Ingrese el valor del pastel: ");
                    valorPastel = tc.nextDouble();
                    tc.nextLine(); 
                    Problema_2_Menu menuNino = new Problema_2_MenuNino(nombrePlato, valorInicialNino, valorHelado, valorPastel);
                    cuenta.agregarMenu(menuNino);
                    break;
                case 4:
                    System.out.print("Ingrese el valor inicial del menú: ");
                    valorInicialEconomico = tc.nextDouble();
                    System.out.print("Ingrese el porcentaje de descuento: ");
                    porcentajeDescuento = tc.nextDouble();
                    tc.nextLine();
                    Problema_2_Menu menuEconomico = new Problema_2_MenuEconomico(nombrePlato, valorInicialEconomico, porcentajeDescuento);
                    cuenta.agregarMenu(menuEconomico);
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        cuenta.calcularTotal();
        cuenta.mostrarCuenta();
        tc.close(); 
    }
}