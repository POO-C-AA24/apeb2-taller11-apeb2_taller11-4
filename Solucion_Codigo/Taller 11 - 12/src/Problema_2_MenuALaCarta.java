public class Problema_2_MenuALaCarta extends Problema_2_Menu{
    public double valorGuarnicion;
    public double valorBebida;
    public double porcentajeAdicional;

    public Problema_2_MenuALaCarta(String nombrePlato, double valorInicial, double valorGuarnicion, double valorBebida, double porcentajeAdicional){
        super(nombrePlato, valorInicial);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeAdicional = porcentajeAdicional;
        calcularValorMenu();
    }

    @Override
    public void calcularValorMenu() {
        this.valorMenu = valorInicial + valorGuarnicion + valorBebida + (porcentajeAdicional * valorInicial);
    }
}
