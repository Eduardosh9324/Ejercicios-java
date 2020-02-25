
public class Main {
    public static void main(String args[]) {

        int numero1 = 10;
        int numero2 = 20;
        int result;

        Operation operation = new Operation();
        result = operation.getSum(numero1, numero2);

        System.out.println("Result = "+ result);

    }
}