public class opera {
    public int[][] array1;
    public int[][] array2;
    public int[][] sum;
    public int[] diag;
    public int[] diagInv;

    public void suma(int[][] array1, int[][] array2){
        this.array1 = array1;
        this.array2 = array2;
        int[][] sum = new int[array1.length][array1[0].length];
        this.sum = sum;
        for (int x=0; x < array1.length; x++) {
            for (int y=0; y < array1[x].length; y++) {				
              sum[x][y] = array1[x][y] + array2[x][y];								
            }
          }    
    }

    public void diagonal(int[][] array1){
        int n = array1.length;
        int[] diag = new int[n];
        this.diag = diag;
        for(int x = 0; x < n; x++){
            diag[x] = array1[x][x];
        }
    }

    public void diagonalInv(int[][] array1){
        int n = array1.length;
        int[] diagInv = new int[n];
        this.diagInv = diagInv;
        for(int x = 0; x < n; x++){
            diagInv[x] = array1[x][n-1-x];
        }
    }
 }