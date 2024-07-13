public class Problema_2_MenuNino extends Problema_2_Menu{
    public double valorHelado;
    public double valorPastel;

    public Problema_2_MenuNino(String nombrePlato, double valorInicial, double valorHelado, double valorPastel) {
        super(nombrePlato,valorInicial);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
        calcularValorMenu();
    }

    @Override
    public void calcularValorMenu() {
        this.valorMenu = valorInicial + valorHelado + valorPastel;
    }
}
