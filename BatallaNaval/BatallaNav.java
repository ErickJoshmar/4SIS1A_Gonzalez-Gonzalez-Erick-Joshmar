import java.util.Scanner;
class BatallaNav {
    public static int[][] playerOne = new int[8][8];
    public static int[][] playerTwo = new int[8][8];

    public static void main(String[] args) {
        int tropa = 0;
        int ladox;
        int ladoy;

        Scanner bn = new Scanner(System.in);

        do {
            System.out.println("Jugador 1 Tropa " + (tropa + 1) + ": Lado x:");
            ladox = bn.nextInt();

            System.out.println("Jugador 1 Tropa " + (tropa + 1) + ": Lado y:");
            ladoy = bn.nextInt();

            tropa = Lugarbar
            (playerOne, ladox, ladoy);

        } while (tropa < 4);

        tropa = 0;

        do {
            System.out.println("Jugador 2 Tropa " + (tropa + 1) + ": Lado x:");
            ladox = bn.nextInt();

            System.out.println("Jugador 2 Tropa " + (tropa + 1) + ": Lado y:");
            ladoy = bn.nextInt();

            tropa = Lugarbar
            (playerTwo, ladox, ladoy);

        } while (tropa < 4);

        int ataque = 0;
        int barcos = 0;
        int player = 0;
        do {
            player = ataque % 2;

            System.out.println("ataque del jugador " + (player + 1));

            System.out.println("Jugador " + (player + 1) + ": Lado x:");
            ladox = bn.nextInt();

            System.out.println("Jugador " + (player + 1) + ": Lado y:");
            ladoy = bn.nextInt();

            int[][] jugadoract;

            if (player == 0)
                jugadoract = playerTwo;
            else
                jugadoract = playerOne;

            barcos = misil(jugadoract, ladox, ladoy, player + 1);

         ataque++;

        } while (barcos > 0);

        System.out.println("Felicidades jugador " + (player + 1) + " has ganado");
    }

    public static int Lugarbar
    (int[][] jugadorbar, int ladox, int ladoy) {
        int barcosc = 0;
        jugadorbar[ladox][ladoy] = 1;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (jugadorbar[i][j] != 0) {
                    barcosc++;
                }
            }
        }
        return barcosc;
    }

    public static int misil(int[][] jugadorbar, int ladox, int ladoy, int playerNumber) {
        int value = jugadorbar[ladox][ladoy];

        if (value != 0) {
            System.out.println(
                    "Tropa destruida en la posicion X:" + ladox + " Y:" + ladoy + " por el jugador " + playerNumber);
            System.out.println("");
        } else {
            System.out.println("Intento Fallido por el jugador " + playerNumber);
            System.out.println("");
        }
        jugadorbar[ladox][ladoy] = 0;

        int barcosrest = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (jugadorbar[i][j] != 0) {
                    barcosrest++;
                }
            }
        }
        return barcosrest;
    }
}
