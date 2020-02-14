public class principal {
    public static void main(String args[]){
       /* matriz Obj1 = new matriz(2,3);
        System.out.print(Obj1.matrix[0][0]);
        int array[][] = { {1,2,3,4}, {5,6,7,8}};
        System.out.println(array[1][0]);*/
        int array1[][] = {{1,2}, {5,6}};
        int array2[][] = {{1,2}, {0,0}};
        /*opera Obj1 = new opera();
        Obj1.suma(array1, array2);
        System.out.print(Obj1.sum[1][1]);*/
        opera Obj1 = new opera();
        Obj1.diagonalInv(array1);
        System.out.print(Obj1.diagInv[1]);
    }
 }