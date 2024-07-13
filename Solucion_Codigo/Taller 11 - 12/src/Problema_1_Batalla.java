public class Problema_1_Batalla {
    
    public Problema_1_Personaje personaje1;
    public Problema_1_Personaje personaje2;

    public Problema_1_Batalla(Problema_1_Personaje personaje1, Problema_1_Personaje personaje2) {
        this.personaje1 = personaje1;
        this.personaje2 = personaje2;
    }
    
    public String generarBatalla(){
        String estadisticaBatalla = "";
        int aux = 1;
        do {      
            if (aux % 2 == 0) {
                this.personaje2.recibirDanioVida(this.personaje1.atacar(), this.personaje2.defenderse());
                estadisticaBatalla += "COMBATE " + aux + "\n";
                estadisticaBatalla += "Ataca:   \t" + this.personaje1.toString();
                estadisticaBatalla += "Se defiende:\t" + this.personaje2.toString();
            } else if (aux % 2 == 1) {
                this.personaje1.recibirDanioVida(this.personaje2.atacar(), this.personaje1.defenderse());
                estadisticaBatalla += "COMBATE " + aux + "\n";
                estadisticaBatalla += "Ataca:   \t" + this.personaje2.toString();
                estadisticaBatalla += "Se defiende:\t" + this.personaje1.toString();
            }
            aux++;
        } while (this.personaje1.getPuntosVida() > 0 && this.personaje2.getPuntosVida() > 0);
        if (this.personaje1.getPuntosVida() > 0) {
            this.personaje1.subirNivelPersonaje();
            estadisticaBatalla += "\n GANADOR --> " + this.personaje1.toString();
        } else if (this.personaje2.getPuntosVida() > 0) {
            this.personaje2.subirNivelPersonaje();
            estadisticaBatalla += "\n GANADOR --> " + this.personaje2.toString();
        }
        return estadisticaBatalla;
    }
}
