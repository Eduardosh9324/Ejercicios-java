import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("---  Ingresa la dimension de la matriz ---\n");
        System.out.print("Ingresa numero de columnas: \n");
        int n = myObj.nextInt();
        System.out.print("Ingresa numero de filas: \n");
        int m = myObj.nextInt();
        
        int[][] matrix = new int[m][n];
		for(int i = 0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(j<n-1) {
                    //System.out.print(""+(++s)*2+"\t");
                    System.out.print("Ingrese ["+i+"]["+j+"]: ");
					matrix[i][j] = myObj.nextInt();
					//System.out.print(""+matrix[i][j]+"\t");
				}else {
					//System.out.print(""+(++s)*2+"\n");
                    System.out.print("Ingrese ["+i+"]["+j+"]: ");
                    matrix[i][j] = myObj.nextInt();
                    //System.out.print(""+matrix[i][j]+"\n");
				}
			}
		}
	}
}