package pack2;

public class Greatest {
    public void findGreatest(int[] arr){

        int maxValue = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        System.out.println("Greatest Value:" + maxValue);
    }

    public static void main(String args[]){
        int[] arr = {1,2,5,45,75,15,18,25,35,55};

        Greatest greatest = new Greatest();
        greatest.findGreatest(arr);
    }
}
