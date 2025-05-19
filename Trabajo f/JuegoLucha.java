public class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;

    public JuegoLucha(Personaje jugador1, Personaje jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void iniciarPelea() {
        System.out.println("¡Comienza la pelea entre " + jugador1.getNombre() + " y " + jugador2.getNombre() + "!\n");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        if (jugador1.estaVivo()) {
            System.out.println(jugador1.getNombre() + " ha ganado la pelea.");
        } else {
            System.out.println(jugador2.getNombre() + " ha ganado la pelea.");
        }
    }

    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println("Turno de " + atacante.getNombre());
        atacante.atacar(defensor);
        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " puntos de vida.\n");
    }

    public static void main(String[] args) {
        Personaje kirby = new LuchadorRosa("Kirby");
        Personaje yoshi = new DinosaurioVerde("Yoshi");

        JuegoLucha juego = new JuegoLucha(kirby, yoshi);
        juego.iniciarPelea();

    
    }
}


