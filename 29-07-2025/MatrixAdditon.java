package pack2;

public class MatrixAdditon {
    public void matrixAddition(int[][] arr1,int[][] arr2){
        int rowLength = arr1.length;
        int colLength = arr1[0].length;
        int[][] resultArray = new int[rowLength][colLength];
        for(int i=0;i<rowLength;i++){
            for(int j=0;j<colLength;j++){
                resultArray[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<rowLength;i++){
            for(int j=0;j<colLength;j++){
                System.out.print(resultArray[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        MatrixAdditon matrix = new MatrixAdditon();
        int[][] arr1 = {{1,2,3},{4,5,6}};
        int[][] arr2 = {{1,2,3},{4,5,6}};
        matrix.matrixAddition(arr1,arr2);
    }
}
