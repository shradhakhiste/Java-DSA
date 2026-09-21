package Arrayproblem;

public class EvenMax {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 3, 12, 7, 16, 9};
        int max=arr[0];

        for(int i=0; i< arr.length; i++){
            if(arr[i]%2==0 && arr[i]>max ){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
