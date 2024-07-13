abstract class Problema_2_Menu {
    public String nombrePlato;
    public double valorInicial;
    public double valorMenu;

    public Problema_2_Menu(String nombrePlato, double valorInicial) {
        this.nombrePlato = nombrePlato;
        this.valorInicial = valorInicial;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public double getValorMenu() {
        return valorMenu;
    }

    public abstract void calcularValorMenu();
}


