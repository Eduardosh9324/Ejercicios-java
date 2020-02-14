import java.util.Scanner;
public class matriz{
    
    public int n;
    public int m;
    public int[][] matrix = new int[n][n];

    /*public matriz(int n){
        this.n = n;
        int[][] matrix = new int[n][n];
        this.matrix = matrix;
        Scanner myObj = new Scanner(System.in);
        for(int i = 0;i < n; i++) {
			for(int j=0;j < n; j++) {
                    System.out.print("Ingrese ["+i+"]["+j+"]: ");
					matrix[i][j] = myObj.nextInt();
			}
		}
    }*/

    public matriz(int m, int n){
        this.n = n;
        this.m = m;
        int[][] matrix = new int[m][n];
        this.matrix = matrix;
        Scanner myObj = new Scanner(System.in);
        for(int i = 0;i < m; i++) {
			for(int j = 0;j < n; j++) {
                    System.out.print("Ingrese ["+i+"]["+j+"]: ");
					matrix[i][j] = myObj.nextInt();
			}
		}
    }
}