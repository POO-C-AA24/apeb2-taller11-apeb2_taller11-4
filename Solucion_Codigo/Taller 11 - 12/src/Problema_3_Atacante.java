public class Problema_3_Atacante extends Problema_3_JugadorCampo {

    public Problema_3_Atacante(int pasesRealizadosExito, int balonesRecuperados, String nombre, int numeroDorsal, String rut, int numGoles) {
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
        this.valoracioJugador = calcularValoracionGoles() + this.pasesRealizadosExito * 2 + this.balonesRecuperados * 3;
        return valoracioJugador;
    }

    @Override
    public String toString() {
        return "Atacante{" + super.toString() +'}';
    }
}
