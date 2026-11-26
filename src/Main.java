import java.util.Random;
import java.util.Scanner;

public class Main {
    static int MAX_FIL_YODA = 10;
    static int MAX_COL_YODA = 10;
    static int MAX_FIL_DM = 10;
    static int MAX_COL_DM = 10;
    static int vidasYoda = 10;

    static void imprimirTableroYoda(char[][] tableroYoda) {
        for (int fila = 0; fila < MAX_FIL_YODA; fila++) {
            for (int columna = 0; columna < MAX_COL_YODA; columna++) {
                System.out.print(tableroYoda[fila][columna] + " ");
            }
            System.out.println();
        }
    }

    static void imprimirTableroDM(char[][] tableroDM) {
        for (int fila = 0; fila < MAX_FIL_DM; fila++) {
            for (int columna = 0; columna < MAX_COL_DM; columna++) {
                System.out.print(tableroDM[fila][columna] + " ");
            }
            System.out.println();
        }
    }

    static void imprimirNieblaYoda(char[][] tableroYoda, int filaYoda, int columnaYoda) {
        for (int fila = 0; fila < MAX_FIL_YODA; fila++) {
            for (int columna = 0; columna < MAX_COL_YODA; columna++) {
                if (fila == filaYoda && columna == columnaYoda) {
                    System.out.print('Y' + " ");
                } else {
                    System.out.print('.' + " ");
                }
            }
            System.out.println();
        }
    }

    static void imprimirNieblaDM(char[][] tableroDM, int filaDM, int columnaDM) {
        for (int fila = 0; fila < MAX_FIL_DM; fila++) {
            for (int columna = 0; columna < MAX_COL_DM; columna++) {
                if (fila == filaDM && columna == columnaDM) {
                    System.out.print('D' + " ");
                } else {
                    System.out.print('.' + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        char YODA = 'Y';
        char LIBRE = '*';
        char DM = 'D';
        char MURO = 'M';
        char VADER = 'V';
        char POCIMA = 'P';
        char NUBLAR = 'N';

        boolean yodaActive = true;
        boolean dmActive = false;

        int nieblaYoda = 0;
        int nieblaDM = 0;

        char[][] tableroYoda = new char[MAX_FIL_YODA][MAX_COL_YODA];
        char[][] tableroDM = new char[MAX_FIL_DM][MAX_COL_DM];

        Random aleat = new Random();

        int filaAl = aleat.nextInt(10);
        int colAl = aleat.nextInt(10);

        // ================= TABLERO YODA =================

        for (int i = 0; i < MAX_FIL_YODA; i++) {
            for (int j = 0; j < MAX_COL_YODA; j++) {
                tableroYoda[i][j] = LIBRE;
            }
        }

        do {
            filaAl = aleat.nextInt(MAX_FIL_YODA);
            colAl = aleat.nextInt(MAX_COL_YODA);
        } while (tableroYoda[filaAl][colAl] != LIBRE);

        tableroYoda[filaAl][colAl] = YODA;

        int filaOficialYoda = filaAl;
        int columnaOficialYoda = colAl;

        // COLOCAR MUROS

        for (int i = 0; i < 10; i++) {
            do {
                filaAl = aleat.nextInt(MAX_FIL_YODA);
                colAl = aleat.nextInt(MAX_COL_YODA);
            } while (tableroYoda[filaAl][colAl] != LIBRE);

            tableroYoda[filaAl][colAl] = MURO;
        }

        // COLOCAR VADERS

        for (int i = 0; i < 7; i++) {
            do {
                filaAl = aleat.nextInt(MAX_FIL_YODA);
                colAl = aleat.nextInt(MAX_COL_YODA);
            } while (tableroYoda[filaAl][colAl] != LIBRE);

            tableroYoda[filaAl][colAl] = VADER;
        }

        // COLOCAR POCIMAS

        for (int i = 0; i < 5; i++) {
            do {
                filaAl = aleat.nextInt(MAX_FIL_YODA);
                colAl = aleat.nextInt(MAX_COL_YODA);
            } while (tableroYoda[filaAl][colAl] != LIBRE);

            tableroYoda[filaAl][colAl] = POCIMA;
        }

        // ================= TABLERO DM =================

        for (int i = 0; i < MAX_FIL_DM; i++) {
            for (int j = 0; j < MAX_COL_DM; j++) {
                tableroDM[i][j] = LIBRE;
            }
        }

        do {
            filaAl = aleat.nextInt(MAX_FIL_DM);
            colAl = aleat.nextInt(MAX_COL_DM);
        } while (tableroDM[filaAl][colAl] != LIBRE);

        tableroDM[filaAl][colAl] = DM;

        int filaOficialDM = filaAl;
        int columnaOficialDM = colAl;

        // COLOCAR MUROS

        for (int i = 0; i < 10; i++) {
            do {
                filaAl = aleat.nextInt(MAX_FIL_DM);
                colAl = aleat.nextInt(MAX_COL_DM);
            } while (tableroDM[filaAl][colAl] != LIBRE);

            tableroDM[filaAl][colAl] = MURO;
        }

        // COLOCAR VADERS

        for (int i = 0; i < 7; i++) {
            do {
                filaAl = aleat.nextInt(MAX_FIL_DM);
                colAl = aleat.nextInt(MAX_COL_DM);
            } while (tableroDM[filaAl][colAl] != LIBRE);

            tableroDM[filaAl][colAl] = VADER;
        }

        // COLOCAR POCIMAS

        for (int i = 0; i < 5; i++) {
            do {
                filaAl = aleat.nextInt(MAX_FIL_DM);
                colAl = aleat.nextInt(MAX_COL_DM);
            } while (tableroDM[filaAl][colAl] != LIBRE);

            tableroDM[filaAl][colAl] = POCIMA;
        }

        // COLOCAR NUBLAR EN YODA

        for (int i = 0; i < 2; i++) {
            do {
                filaAl = aleat.nextInt(MAX_FIL_YODA);
                colAl = aleat.nextInt(MAX_COL_YODA);
            } while (tableroYoda[filaAl][colAl] != LIBRE);

            tableroYoda[filaAl][colAl] = NUBLAR;
        }

        // COLOCAR NUBLAR EN DM

        for (int i = 0; i < 2; i++) {
            do {
                filaAl = aleat.nextInt(MAX_FIL_DM);
                colAl = aleat.nextInt(MAX_COL_DM);
            } while (tableroDM[filaAl][colAl] != LIBRE);

            tableroDM[filaAl][colAl] = NUBLAR;
        }

        //DEFINIR VIDAS Y SCANNER
        int vidasYoda = 10;
        int vidasDM = 10;

        Scanner lector = new Scanner(System.in);

        System.out.println("EMPIEZA EL JUEGO!!");

        // ================= JUEGO =================
        //ALTERNAR ENTRE AMBOS TABLEROS

        do {

            if (yodaActive && !dmActive) {

                System.out.println("TABLERO YODA (vidas: " + vidasYoda + ")");

                if (nieblaYoda > 0) {
                    imprimirNieblaYoda(tableroYoda, filaOficialYoda, columnaOficialYoda);
                } else {
                    imprimirTableroYoda(tableroYoda);
                }
                // INSTRUCCIONES Y LECTURA DE MOVIMIENTO
                System.out.println("Tablero Yoda");
                System.out.println("Te mueves en WASD QEZX");
                System.out.println("Dime una letra de movimiento !!");

                char mov = lector.next().charAt(0);

                // FILA DE RESPALDO
                int filaAnteriorYoda = filaOficialYoda;
                int colAnteriorYoda = columnaOficialYoda;

                // MOVIMIENTO
                switch (mov) {
                    case 'W':
                        filaOficialYoda = filaOficialYoda - 1;
                        break;

                    case 'A':
                        columnaOficialYoda = columnaOficialYoda - 1;
                        break;

                    case 'S':
                        filaOficialYoda = filaOficialYoda + 1;
                        break;

                    case 'D':
                        columnaOficialYoda = columnaOficialYoda + 1;
                        break;

                    case 'E':
                        columnaOficialYoda = columnaOficialYoda + 1;
                        filaOficialYoda = filaOficialYoda - 1;
                        break;

                    case 'Q':
                        columnaOficialYoda = columnaOficialYoda - 1;
                        filaOficialYoda = filaOficialYoda - 1;
                        break;

                    case 'Z':
                        columnaOficialYoda = columnaOficialYoda - 1;
                        filaOficialYoda = filaOficialYoda + 1;
                        break;

                    case 'X':
                        columnaOficialYoda = columnaOficialYoda + 1;
                        filaOficialYoda = filaOficialYoda + 1;
                        break;
                }

                // Y SI YODA SE SALE DEL TABLERO ??????????????????
                if (filaOficialYoda < 0 ||
                        filaOficialYoda > 9 ||
                        columnaOficialYoda < 0 ||
                        columnaOficialYoda > 9) {

                    System.out.println("EHHHHHHHH!!!!!!!!!!!!");
                    System.out.println("LÍMITE DE TABLERO!!!!!!");

                    filaOficialYoda = filaAnteriorYoda;
                    columnaOficialYoda = colAnteriorYoda;

                } else {

                    if (tableroYoda[filaOficialYoda][columnaOficialYoda] == MURO) { // Y SI CHOCA CON MURO?????

                        System.out.println("NO PUEDES PASAR!!!!!");

                        filaOficialYoda = filaAnteriorYoda;
                        columnaOficialYoda = colAnteriorYoda;

                    } else if (tableroYoda[filaOficialYoda][columnaOficialYoda] == POCIMA) { // Y SI CHOCA CON POCIMA CON PREGUNTA???

                        tableroYoda[filaOficialYoda][columnaOficialYoda] = YODA;
                        tableroYoda[filaAnteriorYoda][colAnteriorYoda] = LIBRE;

                        System.out.println("¿Cuanto es 1+1?");

                        char pregunta = lector.next().charAt(0);

                        if (pregunta == '2') {
                            vidasYoda = vidasYoda - 1;
                        } else {
                            vidasYoda = vidasYoda + 1;
                        }

                    } else if (tableroYoda[filaOficialYoda][columnaOficialYoda] == VADER) {// Y SI CHOCA CON VADER?????

                        tableroYoda[filaOficialYoda][columnaOficialYoda] = YODA;
                        tableroYoda[filaAnteriorYoda][colAnteriorYoda] = LIBRE;
                        vidasYoda--;

                    } else if (tableroYoda[filaOficialYoda][columnaOficialYoda] == NUBLAR) {// Y SI CHOCA CON NUBLAR?????

                        tableroYoda[filaOficialYoda][columnaOficialYoda] = YODA;
                        tableroYoda[filaAnteriorYoda][colAnteriorYoda] = LIBRE;
                        nieblaYoda = 3;

                        System.out.println("¡¡¡NIEBLA!!!");
                        System.out.println("El tablero estará nublado durante 3 movimientos.");

                    } else if (tableroYoda[filaOficialYoda][columnaOficialYoda] == LIBRE) {

                        tableroYoda[filaOficialYoda][columnaOficialYoda] = YODA;
                        tableroYoda[filaAnteriorYoda][colAnteriorYoda] = LIBRE;
                    }
                }

                if (nieblaYoda > 0) {
                    nieblaYoda--;
                }

                // CAMBIO DE TABLERO
                yodaActive = false;
                dmActive = true;

            } else { // MOSTRAR DM

                System.out.println("TABLERO DM (vidas: " + vidasDM + ")");

                if (nieblaDM > 0) {
                    imprimirNieblaDM(tableroDM, filaOficialDM, columnaOficialDM);
                } else {
                    imprimirTableroDM(tableroDM);
                }

                System.out.println("Tablero DM");
                System.out.println("Te mueves con WASD QEZX");
                System.out.println("Dime una letra de movimiento !!");

                char mov = lector.next().charAt(0);

                int filaAnteriorDM = filaOficialDM;
                int colAnteriorDM = columnaOficialDM;

                switch (mov) { // W, A, S, D, Q, E, Z o X

                    case 'W':
                        filaOficialDM--;
                        break;

                    case 'A':
                        columnaOficialDM--;
                        break;

                    case 'S':
                        filaOficialDM++;
                        break;

                    case 'D':
                        columnaOficialDM++;
                        break;

                    case 'E':
                        columnaOficialDM++;
                        filaOficialDM--;
                        break;

                    case 'Q':
                        columnaOficialDM--;
                        filaOficialDM--;
                        break;

                    case 'Z':
                        columnaOficialDM--;
                        filaOficialDM++;
                        break;

                    case 'X':
                        columnaOficialDM++;
                        filaOficialDM++;
                        break;
                }

                // Y SI DM SE SALE DEL TABLERO ???????????
                if (filaOficialDM < 0 ||
                        filaOficialDM > 9 ||
                        columnaOficialDM < 0 ||
                        columnaOficialDM > 9) {

                    System.out.println("EHHHHHHHH!!!!!!!!!!!!");
                    System.out.println("LÍMITE DE TABLERO!!!!!!");

                    filaOficialDM = filaAnteriorDM;
                    columnaOficialDM = colAnteriorDM;

                } else {

                    if (tableroDM[filaOficialDM][columnaOficialDM] == MURO) { // Y SI CHOCA CON MURO???????

                        System.out.println("NO PUEDES PASAR!!!!!");

                        filaOficialDM = filaAnteriorDM;
                        columnaOficialDM = colAnteriorDM;

                    } else if (tableroDM[filaOficialDM][columnaOficialDM] == POCIMA) { // Y SI CHOCA CON POCIMA CON PREGUNTA????

                        tableroDM[filaOficialDM][columnaOficialDM] = DM;
                        tableroDM[filaAnteriorDM][colAnteriorDM] = LIBRE;

                        System.out.println("¿Cuanto es (9*9)+9?");

                        char pregunta2 = lector.next().charAt(0);

                        if (pregunta2 == '9') {
                            vidasDM = vidasDM - 1;
                        } else {
                            vidasDM = vidasDM + 1;
                        }

                    } else if (tableroDM[filaOficialDM][columnaOficialDM] == VADER) { // Y SI CHOCA CON VADER??????

                        tableroDM[filaOficialDM][columnaOficialDM] = DM;
                        tableroDM[filaAnteriorDM][colAnteriorDM] = LIBRE;

                        vidasDM--;

                    } else if (tableroDM[filaOficialDM][columnaOficialDM] == NUBLAR) { // Y SI CHOCA CON NUBLAR?????

                        tableroDM[filaOficialDM][columnaOficialDM] = DM;
                        tableroDM[filaAnteriorDM][colAnteriorDM] = LIBRE;
                        nieblaDM = 3;

                        System.out.println("¡¡¡NIEBLA!!!");
                        System.out.println("El tablero estará nublado durante 3 movimientos.");

                    } else if (tableroDM[filaOficialDM][columnaOficialDM] == LIBRE) {

                        tableroDM[filaOficialDM][columnaOficialDM] = DM;
                        tableroDM[filaAnteriorDM][colAnteriorDM] = LIBRE;
                    }
                }

                if (nieblaDM > 0) {
                    nieblaDM--;
                }

                // CAMBIO DE TABLERO
                yodaActive = true;
                dmActive = false;
            }

            // HACER HASTA Q O UNO U OTRO TENGA VIDAS = 0
        } while (vidasYoda > 0 && vidasDM > 0);

        // FIN DEL JUEGO: SE MUESTRAN LOS DOS TABLEROS
        System.out.println("FIN DEL JUEGO");

        System.out.println("TABLERO YODA");
        imprimirTableroYoda(tableroYoda);

        System.out.println("TABLERO DM");
        imprimirTableroDM(tableroDM);
    }
}
