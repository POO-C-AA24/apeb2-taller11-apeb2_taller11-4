public abstract class Problema_3_Jugador {
    
    public String nombre;
    public int numeroDorsal;
    public String rut;
    public int numGoles;
    public int valoracionGoles;
    public int valoracioJugador;

    public Problema_3_Jugador(String nombre, int numeroDorsal, String rut, int numGoles) {
        this.nombre = nombre;
        this.numeroDorsal = numeroDorsal;
        this.rut = rut;
        this.numGoles = numGoles;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int calcularValoracionGoles(){
        this.valoracionGoles = this.numGoles * 30;
        return this.valoracionGoles;
    }
    public abstract int calcularValoracionJugador();

    @Override
    public String toString() {
        return "nombre=" + nombre + ", numeroDorsal=" + numeroDorsal + ", rut=" + rut + ", numGoles=" + numGoles + ", valoracionGoles=" + valoracionGoles + ", valoracioJugador=" + valoracioJugador;
    }
}