public class Problema_3_Defensor extends Problema_3_JugadorCampo {

    public Problema_3_Defensor(int pasesRealizadosExito, int balonesRecuperados, String nombre, int numeroDorsal, String rut, int numGoles) {
        super(pasesRealizadosExito, balonesRecuperados, nombre, numeroDorsal, rut, numGoles);
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
    public int calcularValoracionJugador(){
        this.valoracioJugador = calcularValoracionGoles() + this.pasesRealizadosExito + this.balonesRecuperados * 4;
        return valoracioJugador;
    }
    @Override
    public String toString() {
        return "Defensor{" + super.toString() +'}';
    }
}
