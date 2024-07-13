public class Problema_3_Portero extends Problema_3_Jugador{
    
    public int atajadasRealizadas;

    public Problema_3_Portero(int atajadasRealizadas, String nombre, int numeroDorsal, String rut, int numGoles) {
        super(nombre, numeroDorsal, rut, numGoles);
        this.atajadasRealizadas = atajadasRealizadas;
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
        this.valoracioJugador = calcularValoracionGoles() + this.atajadasRealizadas * 5;
        return this.valoracioJugador;
    }

    @Override
    public String toString() {
        return "Portero{" + super.toString() + "atajadasRealizadas=" + atajadasRealizadas + '}';
    }
    
    
}
