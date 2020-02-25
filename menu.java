import java.util.Scanner;
import java.util.InputMismatchException;
public class Menu {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        boolean entrar = true;
        int opcion;
        int n;
        int m;
 
        while (entrar) {
 
            System.out.println("\n\n");
            System.out.println("1. Sumar matrices");
            System.out.println("2. Diagonal principal");
            System.out.println("3. Diagonal inversa");
            System.out.println("4. Salir");
            //variables y clases para las operaciones y guardado de elementos
            Matriz matriz = new Matriz();
            int[][] matriz1;
            int[][] matriz2;
            int[][] resultadoMatriz;
            int[] resultadoVector;
            Calculadora opera = new Calculadora();

            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has decidido sumar");
                        System.out.println("Ingresa las dimensiones de las matrices");
                        System.out.println("Numero de renglones");
                        m = sn.nextInt();
                        System.out.println("Numero de columnas");
                        n = sn.nextInt();
                        matriz1 = matriz.Matriz(n, m);
                        matriz2 = matriz.Matriz(n, m);
                        resultadoMatriz = opera.suma(matriz1, matriz2);
                        Imprime prin1 = new Imprime(resultadoMatriz);
                        break;
                    case 2:
                        System.out.println("Has decidido calcular la diagonal principal");
                        System.out.println("Ingresa la dimension de la matriz");
                        n = sn.nextInt();
                        matriz1 = matriz.Matriz(n,n);
                        resultadoVector = opera.getDiagonal(matriz1);
                        Imprime prin2 = new Imprime(resultadoVector);
                        break;
                    case 3:
                        System.out.println("Has decidido calcular la diagonal inversa");
                        System.out.println("Ingresa la dimension de la matriz");
                        n = sn.nextInt();
                        matriz1 = matriz.Matriz(n,n);
                        resultadoVector = opera.getDiagonalInv(matriz1);
                        Imprime prin3 = new Imprime(resultadoVector);
                        break;
                    case 4:
                        entrar = false;
                        System.out.println("Hasta pronto! ");
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número del 1-4");
                sn.next();
            }
        } 
       
	}
}