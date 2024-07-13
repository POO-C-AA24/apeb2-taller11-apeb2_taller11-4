public abstract class Problema_1_Personaje {
    
    public int puntosVida;
    public int nivel;

    public Problema_1_Personaje(int puntosVida, int nivel) {
        this.puntosVida = puntosVida;
        this.nivel = nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }
    
    public abstract int atacar();
    public abstract int defenderse();
    
    public void recibirDanioVida(int ataque, int resistencia){
        this.puntosVida -= (ataque - resistencia);
    }
    
    public void subirNivelPersonaje(){
        this.nivel++;
    }

    @Override
    public String toString() {
        return "puntosVida=" + puntosVida + ", nivel=" + nivel ;
    }
}
