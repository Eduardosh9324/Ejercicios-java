import java.util.Scanner;
public class Matriz{
    public int[][] matrix;
    public int[][] Matriz(int row, int col){
        matrix = new int[row][col];
        Scanner myObj = new Scanner(System.in);
        for(int i = 0;i < row; i++) {
			for(int j = 0;j < col; j++) {
                    System.out.print("Ingrese ["+i+"]["+j+"]: ");
					matrix[i][j] = myObj.nextInt();
			}
        }
        return matrix; 
    }
}