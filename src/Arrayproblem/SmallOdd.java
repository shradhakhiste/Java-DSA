package Arrayproblem;

public class SmallOdd {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 3, 12, 7, 2};
        int min=Integer.MAX_VALUE;

        for(int i=0; i< arr.length; i++){
            if(arr[i]%2 != 0 && arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
