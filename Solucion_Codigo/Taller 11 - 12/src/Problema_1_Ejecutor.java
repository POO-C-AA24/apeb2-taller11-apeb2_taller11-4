public class Problema_1_Ejecutor {
    public static void main(String[] args) {
        int puntosVidaIniciales = 100;
        Problema_1_Personaje guerrero = new Problema_1_Guerrero(3, "Embestir", "Escudo de hierro", puntosVidaIniciales, 1);
        Problema_1_Personaje mago = new Problema_1_Mago(2, "Proyectil magico", "Escudo de fuego", puntosVidaIniciales, 1);
        Problema_1_Personaje arquero = new Problema_1_Arquero(3, "Disparo doble", "Evasor agil", puntosVidaIniciales, 1);
        Problema_1_Personaje guerrero2 = new Problema_1_Guerrero(2, "Apunalar", "Escudo de hierro", puntosVidaIniciales, 1);
        
        System.out.println("====================================================== Batalla 1 ======================================================");
        Problema_1_Batalla batalla1 = new Problema_1_Batalla(guerrero, mago);
        System.out.println(batalla1.generarBatalla());
        System.out.println("====================================================== Batalla 2 ======================================================");
        Problema_1_Batalla batalla2 = new Problema_1_Batalla(arquero, guerrero2);
        System.out.println(batalla2.generarBatalla());
    }
}
