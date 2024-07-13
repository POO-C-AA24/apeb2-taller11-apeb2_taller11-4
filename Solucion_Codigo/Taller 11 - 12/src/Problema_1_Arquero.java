public class Problema_1_Arquero extends Problema_1_Personaje {
    
    public int presicion;
    public String hablidadDistacia;
    public String defensa;

    public Problema_1_Arquero(int presicion, String hablidadDistacia, String defensa, int puntosVida, int nivel) {
        super(puntosVida, nivel);
        this.presicion = presicion;
        this.hablidadDistacia = hablidadDistacia;
        this.defensa = defensa;
    }
    
    @Override
    public int getPuntosVida() {
        return super.getPuntosVida();
    }
    
    @Override
    public int atacar(){
        int danioAtaque = 0;
        if (this.hablidadDistacia.equals("Disparo de combustion")) {
            danioAtaque = presicion * 4;
        } else if (this.hablidadDistacia.equals("Disparo doble")) {
            danioAtaque = presicion * 7;
        }
        return danioAtaque;
    }
    
    @Override
    public int defenderse(){
        return (this.defensa.equals("Evasor agil"))?(2):(0);
    }
    
    @Override
    public void subirNivelPersonaje(){
        super.subirNivelPersonaje();
    }

    @Override
    public String toString() {
        return "Arquero{" + super.toString() + "presicion=" + presicion + ", hablidadDistacia=" + hablidadDistacia + ", defensa=" + defensa + "} \n";
    }
}
