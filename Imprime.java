public class imprime{
    //public int[];
    //public int[][];
    public int n;
    public int m;

    public imprime(int[] arr){
        this.n = arr.length;
        for(int i = 0; i < n;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public imprime(int[][] arr){
        this.m = arr.length;
        this.n = arr[0].length;
        for(int i = 0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(j!=n-1) {
					System.out.print(""+arr[i][j]+"\t");
				}else {
					System.out.print(""+arr[i][j]+"\n");	
				}
			}
		}
        
    }
}