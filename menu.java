import java.util.Scanner;
import java.util.InputMismatchException;
public class menu {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        boolean entrar = true;
        int opcion; //Guardaremos la opcion del usuario
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
                        matriz Obj1 = new matriz(m,n);
                        matriz Obj2 = new matriz(m,n);
                        opera resultado1 = new opera();
                        resultado1.suma(Obj1.matrix, Obj2.matrix);
                        //System.out.println(resultado1.sum[0][0]);

                        break;
                    case 2:
                        //System.out.println("Has seleccionado la opcion 2");
                        System.out.println("Has decidido calcular la diagonal principal");
                        System.out.println("Ingresa la dimension de la matriz");
                        n = sn.nextInt();
                        matriz Obj = new matriz(n,n);
                        opera resultado2 = new opera();
                        resultado2.diagonal(Obj.matrix);
                        System.out.println(resultado2.diag[0]);
                        break;
                    case 3:
                        //System.out.println("Has seleccionado la opcion 3");
                        System.out.println("Has decidido calcular la diagonal invsersa");
                        System.out.println("Ingresa la dimension de la matriz");
                        n = sn.nextInt();
                        matriz Obje = new matriz(n,n);
                        opera resultado3 = new opera();
                        resultado3.diagonalInv(Obje.matrix);
                        System.out.println(resultado3.diagInv[0]);
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