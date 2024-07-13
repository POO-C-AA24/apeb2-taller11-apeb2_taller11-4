public abstract class Problema_3_JugadorCampo extends Problema_3_Jugador {
    
    public int pasesRealizadosExito;
    public int balonesRecuperados;

    public Problema_3_JugadorCampo(int pasesRealizadosExito, int balonesRecuperados, String nombre, int numeroDorsal, String rut, int numGoles) {
        super(nombre, numeroDorsal, rut, numGoles);
        this.pasesRealizadosExito = pasesRealizadosExito;
        this.balonesRecuperados = balonesRecuperados;
    }
    
    @Override
    public String getNombre() {
        return super.getNombre();
    }
    
    @Override
    public int calcularValoracionGoles(){
        return super.calcularValoracionGoles();
    }
    
    @Override
    public abstract int calcularValoracionJugador();

    @Override
    public String toString() {
        return super.toString() + "pasesRealizadosExito=" + pasesRealizadosExito + ", balonesRecuperados=" + balonesRecuperados;
    }
}