public class Problema_2_MenuEconomico extends Problema_2_Menu{
    public double porcentajeDescuento;

    public Problema_2_MenuEconomico(String nombrePlato, double valorInicial, double porcentajeDescuento) {
        super(nombrePlato, valorInicial);
        this.porcentajeDescuento = porcentajeDescuento;
        calcularValorMenu();
    }

    @Override
    public void calcularValorMenu() {
        this.valorMenu = valorInicial - (porcentajeDescuento * valorInicial);
    }    
}
