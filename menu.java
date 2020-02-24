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
                        Matriz obj1 = new Matriz(m,n);
                        Matriz obj2 = new Matriz(m,n);
                        Calculadora resultado1 = new Calculadora();
                        resultado1.suma(obj1.matrix, obj2.matrix);
                        Imprime prin1 = new Imprime(resultado1.sum);
                        break;
                    case 2:
                        System.out.println("Has decidido calcular la diagonal principal");
                        System.out.println("Ingresa la dimension de la matriz");
                        n = sn.nextInt();
                        Matriz obj = new Matriz(n,n);
                        Calculadora resultado2 = new Calculadora();
                        resultado2.getDiagonal(obj.matrix);
                        Imprime prin2 = new Imprime(resultado2.diag);
                        break;
                    case 3:
                        System.out.println("Has decidido calcular la diagonal inversa");
                        System.out.println("Ingresa la dimension de la matriz");
                        n = sn.nextInt();
                        Matriz obje = new Matriz(n,n);      
                        Calculadora resultado3 = new Calculadora();
                        resultado3.getDiagonalInv(obje.matrix);
                        Imprime prin3 = new Imprime(resultado3.diagInv);
                        break;
                    case 4:
                        entrar = false;
                        System.out.println("Hasta pronto!");
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