Prueba Final Lógica – “Análisis de Resultados Académicos”
Contexto:
Una institución quiere analizar el desempeño de estudiantes. Cada fila de una matriz notas[][] representa un grupo de estudiantes, y cada columna una nota final (entre 0 y 100).
🔧 Enunciado:

Implementa los siguientes métodos:

1) public static int contarEstudiantesAprobados(int[][] matriz)
 Cuenta cuántos estudiantes tienen una nota mayor o igual a 60.

    -)para empezar con el primer metodo lo que debemos hacer es recorrer la matriz con un for y agregando la exepcion y de esta manera sacar a los estudiantes que tienen una nota mayor o igual a 60 (que estan aprobados ) y de esta ,manera mostrarlos poder mostrarlos por  consola.usamos (for ,if . y asi sacamos a los estudiantes aprobados,contador que va almacenando la cantidad de estudiantes aprobados).

2) public static double promedioNotasAltas(int[][] matriz)
 Calcula el promedio de las notas mayores o iguales a 80.
    -) en este metodo recorremos la matriz con un for y asi sacamos solo las notas >= 80 ; y en ese mismo hallamos el promedio de las notas,utilizamos  suma para almacenar la suma de las  notas y cantidad que va guardando el numero de personas que sacan nota mayor igual a 80

3) public static void imprimirNotasBajas(int[][] matriz)
Imprime las posiciones [i][j] de las notas menores a 50:
"Nota baja en [i][j]: X puntos".
    -)igualmente creamos el for  y asi recorremos la matriz con el if hacemos la exepcion de las notas menores a 50 y asi imprimirlas en su posicion cumpliendo con que su (matriz[i][j]<50 && martriz [i][j]>=0).

4) public static int[] posicionNotaMaxima(int[][] matriz)
Devuelve un arreglo con la posición [fila, columna] de la nota más alta.
    -)debemos crear unas variables que almacenen nuestras nota maxima y fila.al momento de recorrer nuestra matriz con el for

🎯 BONUS:
public static int contarNotasFueraDeRango(int[][] matriz)
Cuenta cuántas notas están fuera del rango [0, 100].

inicializamos un contador , recorremos la matriz con un for y con el if buscamos las notas que no cumplan en el rango de 0 a 100. (if(nota<0|| nota>100))

-) en la parte final se encuentra el main el cual imprime los resultados :D, y la matriz que utilizamos 
resultados esperados :
1) mostrar el numero de estuidiantes que tienen una nota mayor o igual a 60(estudiantes aprobados).

2) seperar las notas mayores o iguales a 80 y promediarlas, mostrando el resultado por consola.

3) imprimir las notas menores a 50 en su posicion

4) mostrar un arreglo con la fila y columna de la nota mas alta por consola.

  -) PARA EL BONUS: 
  }MOSTRAMOS POR CONSOLA CUANTAS NOTAS FUERA DE RANGO EXISTEN 

 