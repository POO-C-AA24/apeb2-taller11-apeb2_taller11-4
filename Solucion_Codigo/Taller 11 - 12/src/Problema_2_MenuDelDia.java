public class Problema_2_MenuDelDia extends Problema_2_Menu{
    public double valorPostre;
    public double valorBebida;

    public Problema_2_MenuDelDia(String nombrePlato, double valorInicial, double valorPostre, double valorBebida) {
        super(nombrePlato,valorInicial);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
        calcularValorMenu();
    }

    @Override
    public void calcularValorMenu() {
        this.valorMenu = valorInicial + valorPostre + valorBebida;
    }
}
