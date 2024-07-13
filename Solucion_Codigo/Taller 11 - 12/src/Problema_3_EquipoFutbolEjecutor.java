public class Problema_3_EquipoFutbolEjecutor {
    public static void main(String[] args) {
        
        Problema_3_Jugador atacante = new Problema_3_Atacante(10, 5, "Messi", 10, "001", 10);
        Problema_3_Jugador defensor = new Problema_3_Defensor(30, 15, "Puyol", 7, "002", 5);
        Problema_3_Jugador portero = new Problema_3_Portero(15, "Casillas", 1, "003", 2);
        
        System.out.println("Valoracion Jugador " + atacante.getNombre() + " es :" + atacante.calcularValoracionJugador());
        System.out.println("Valoracion Jugador " + defensor.getNombre() + " es :" + defensor.calcularValoracionJugador());
        System.out.println("Valoracion Jugador " + portero.getNombre() + " es :" + portero.calcularValoracionJugador());
    }
}
