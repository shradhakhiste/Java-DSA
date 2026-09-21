package Arrayproblem;

public class MaxEle {
    public static void main(String[] args) {
        int arr[]={6,70,4,89,10,2,1};
        int max= arr[0] ;

        for(int i=0;i<arr.length; i++){

            if(max < arr[i]){
                max = arr[i];
            }

        }
        System.out.println(max);


    }
}
