public class Calculadora {
    public int[][] array1;
    public int[][] array2;
    public int[][] sum;
    public int[] diag;
    public int[] diagInv;

    public void suma(int[][] array1, int[][] array2){
        sum = new int[array1.length][array1[0].length];
        this.sum = sum;
        for (int x=0; x < array1.length; x++) {
            for (int y=0; y < array1[x].length; y++) {				
              sum[x][y] = array1[x][y] + array2[x][y];								
            }
          }    
    }

    public void getDiagonal(int[][] array1){
        diag = new int[array1.length];
        this.diag = diag;
        for(int x = 0; x < array1.length; x++){
            diag[x] = array1[x][x];
        }
    }

    public void getDiagonalInv(int[][] array1){
        diagInv = new int[array1.length];
        this.diagInv = diagInv;
        for(int x = 0; x < array1.length; x++){
            diagInv[x] = array1[x][array1.length-1-x];
        }
    }
 }