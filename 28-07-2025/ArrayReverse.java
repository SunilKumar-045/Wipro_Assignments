package pack2;

public class ArrayReverse {
    public void reverseArray(int[] arr){
        int length = arr.length;
        int[] reverse_array = new int[length];
        int j = length-1;
        for(int i=0;i<length;i++){
            reverse_array[j] = arr[i];
            j--;
        }
        for(int arr1 : reverse_array){
            System.out.print(arr1+" ");
        }

    }
    public static void main(String args[]){
        int[] arr = {45,55,35};
        ArrayReverse arrayReverse = new ArrayReverse();
        arrayReverse.reverseArray(arr);
    }
}
