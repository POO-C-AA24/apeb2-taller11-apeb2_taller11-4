public class Problema_1_Guerrero extends Problema_1_Personaje {
    
    public int fuerza;
    public String habilidadAtaque;
    public String habilidadDefensa;

    public Problema_1_Guerrero(int fuerza, String habilidadAtaque, String habilidadDefensa, int puntosVida, int nivel) {
        super(puntosVida, nivel);
        this.fuerza = fuerza;
        this.habilidadAtaque = habilidadAtaque;
        this.habilidadDefensa = habilidadDefensa;
    }
    
    @Override
    public int getPuntosVida() {
        return super.getPuntosVida();
    }
    
    @Override
    public int atacar(){
        int danioAtaque = 0;
        if (this.habilidadAtaque.equals("Apunalar")) {
            danioAtaque = fuerza * 2;
        } else if (this.habilidadAtaque.equals("Embestir")) {
            danioAtaque = fuerza * 5;
        }
        return danioAtaque;
    }
    
    @Override
    public int defenderse(){
        return (this.habilidadDefensa.equals("Escudo de hierro"))?(this.fuerza * 2):(0);
    }
    
    @Override
    public void subirNivelPersonaje(){
        super.subirNivelPersonaje();
    }

    @Override
    public String toString() {
        return "Guerrero{" + super.toString() + "fuerza=" + fuerza + ", habilidadAtaque=" + habilidadAtaque + ", habilidadDefensa=" + habilidadDefensa + "} \n";
    }
}
