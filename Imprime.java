public class Imprime{
    public int n;
    public int m;

    public Imprime(int[] arr){
        n = arr.length;
        for(int i = 0; i < n;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public Imprime(int[][] arr){
        m = arr.length;
        n = arr[0].length;
        for(int i = 0;i < m;i++) {
			for(int j = 0;j < n;j++) {
				if(j!=n-1) {
					System.out.print(""+arr[i][j]+"\t");
				}else {
					System.out.print(""+arr[i][j]+"\n");	
				}
			}
		}
        
    }
}