public class Problema_1_Mago extends Problema_1_Personaje {
    
    public int poderMagico;
    public String hechizoAtaque;
    public String hechizoDefensa;

    public Problema_1_Mago(int poderMagico, String hechizoAtaque, String hechizoDefensa, int puntosVida, int nivel) {
        super(puntosVida, nivel);
        this.poderMagico = poderMagico;
        this.hechizoAtaque = hechizoAtaque;
        this.hechizoDefensa = hechizoDefensa;
    }
    
    @Override
    public int getPuntosVida() {
        return super.getPuntosVida();
    }
    
    @Override
    public int atacar(){
        int danioAtaque = 0;
        if (this.hechizoAtaque.equals("Proyectil magico")) {
            danioAtaque = poderMagico * 5;
        } else if (this.hechizoAtaque.equals("Rayo abrasador")) {
            danioAtaque = poderMagico * 8;
        }
        return danioAtaque;
    }
    
    @Override
    public int defenderse(){
        return(this.hechizoDefensa.equals("Escudo de fuego"))?(this.poderMagico * 3):(0);
    }
    
    @Override
    public void subirNivelPersonaje(){
        super.subirNivelPersonaje();
    }

    @Override
    public String toString() {
        return "Mago{" + super.toString() + "poderMagico=" + poderMagico + ", hechizoAtaque=" + hechizoAtaque + ", hechizoDefensa=" + hechizoDefensa + "} \n";
    }
}
