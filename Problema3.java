public class Problema3 {
    public static void main(String[] args) {
        // Inicializamos las casillas con los valores actualizados.
        int[] casillas = {8, 6, 5, 7, 3, 2, 2, 11, 10, 2, 4, 1};

        // Instrucción 1: Suma 1 al número en la casilla 11 y almacena el resultado en la casilla 11.
        casillas[10] += 1;

        // Instrucción 2: Copia el número de la casilla 1 a la casilla 10.
        casillas[9] = casillas[0];

        // Instrucción 3: Evalúa si el número en la casilla de la instrucción 2 (casilla 10) es impar.
        if (casillas[9] % 2 != 0) {
            // Instrucción 5: Cambia la instrucción 2 sumando 2 al primer número de casilla que menciona.
            casillas[9] += 2;
        } else {
            // Instrucción 4: Continúa desde la casilla mencionada en la instrucción 2.
            casillas[9] = casillas[0];
        }

        // Instrucción 6: Suma el número en la casilla 5 al número en la casilla 11 y almacénalo en la casilla 11.
        casillas[10] += casillas[4];

        // Instrucción 7: Cambia la instrucción 2 restando el segundo número de casilla al primero.
        casillas[9] -= casillas[11];

        // Instrucción 8: Evalúa si el último número mencionado en la instrucción 2 es menor que el segundo número.
        if (casillas[9] < casillas[11]) {
            // Continúa en la instrucción 3.
            casillas[9] = casillas[0];
        }

        // Resultados
        System.out.println("El número en la casilla 8 es: " + casillas[7]);
        System.out.println("El número en la casilla 9 es: " + casillas[8]);
        
    }
}
