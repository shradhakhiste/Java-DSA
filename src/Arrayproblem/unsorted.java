package Arrayproblem;

public class unsorted {
    public static void main(String[] args) {
        int [] arr={2,4,6,2,7};
        int unsorted=arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[i+1]){
                unsorted=arr[i+1];
                break;
            }
        }
        System.out.println( "Unsorted element is " + unsorted);
    }
}
