public class AnalisisAcademico {

    // Cuenta cuántos estudiantes tienen una nota mayor o igual a 60
    public static int contarEstudiantesAprobados(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int nota : fila) {
                if (nota >= 60 && nota <= 100) {
                    contador++;
                }
            }
        }
        return contador;
    }

    // Calcula el promedio de las notas mayores o iguales a 80
    public static double promedioNotasAltas(int[][] matriz) {
        int suma = 0;
        int cantidad = 0;
        for (int[] fila : matriz) {
            for (int nota : fila) {
                if (nota >= 80 && nota <= 100) {
                    suma += nota;
                    cantidad++;
                }
            }
        }
        return (cantidad > 0) ? (double) suma / cantidad : 0.0;
    }

    // Imprime las posiciones de notas menores a 50
    public static void imprimirNotasBajas(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 50 && matriz[i][j] >= 0) {
                    System.out.println("Nota baja en [" + i + "][" + j + "]: " + matriz[i][j] + " puntos");
                }
            }
        }
    }

    // Devuelve la posición [fila, columna] de la nota más alta
    public static int[] posicionNotaMaxima(int[][] matriz) {
        int maxNota = Integer.MIN_VALUE;
        int filaMax = 0;
        int colMax = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maxNota) {
                    maxNota = matriz[i][j];
                    filaMax = i;
                    colMax = j;
                }
            }
        }
        return new int[]{filaMax, colMax};
    }

    // para el BONUS: cuenta cuántas notas están fuera del rango [0, 100]
    public static int contarNotasFueraDeRango(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int nota : fila) {
                if (nota < 0 || nota > 100) {
                    contador++;
                }
            }
        }
        return contador;
    }

    // Método principal para probar
    public static void main(String[] args) {
        int[][] notas = {
            {85, 78, 92, 48},
            {55, 60, 101, -5},
            {70, 82, 90, 47}
        };

        System.out.println("Estudiantes aprobados: " + contarEstudiantesAprobados(notas));
        System.out.println("Promedio de notas altas: " + promedioNotasAltas(notas));
        imprimirNotasBajas(notas);

        int[] posicionMax = posicionNotaMaxima(notas);
        System.out.println("Nota máxima en: [" + posicionMax[0] + "][" + posicionMax[1] + "]");

        System.out.println("Notas fuera de rango: " + contarNotasFueraDeRango(notas));
    }
}
