package Arrayproblem;

public class MinArray {
    public static void main(String[] args) {
        int [] arr={8,3,12,5,1,9};
        int min=arr[0];

        for(int i=0; i< arr.length; i++){
            if(arr[i] < min){
                min=arr[i];

            }

        }
        System.out.println(min);

    }
}
