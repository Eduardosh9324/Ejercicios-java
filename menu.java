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
                        Matriz Obj1 = new Matriz(m,n);
                        Matriz Obj2 = new Matriz(m,n);
                        Opera resultado1 = new Opera();
                        resultado1.suma(Obj1.matrix, Obj2.matrix);
                        //System.out.println(resultado1.sum[0][0]);
                        imprime prin1 = new imprime(resultado1.sum);

                        break;
                    case 2:
                        //System.out.println("Has seleccionado la opcion 2");
                        System.out.println("Has decidido calcular la diagonal principal");
                        System.out.println("Ingresa la dimension de la matriz");
                        n = sn.nextInt();
                        Matriz Obj = new Matriz(n,n);
                        Opera resultado2 = new Opera();
                        resultado2.getDiagonal(Obj.matrix);
                        //System.out.println(resultado2.diag[0]);
                        imprime prin2 = new imprime(resultado2.diag);
                        break;
                    case 3:
                        //System.out.println("Has seleccionado la opcion 3");
                        System.out.println("Has decidido calcular la diagonal inversa");
                        System.out.println("Ingresa la dimension de la matriz");
                        n = sn.nextInt();
                        Matriz Obje = new Matriz(n,n);
                        Opera resultado3 = new Opera();
                        resultado3.getDiagonalInv(Obje.matrix);
                        //System.out.println(resultado3.diagInv[0]);
                        imprime prin3 = new imprime(resultado3.diagInv);
                        break;
                    case 4:
                        entrar = false;
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