package Arrayproblem;

public class SumEven {
    public static void main(String[] args) {
        int []arr={10,5,8,3,12,7};

        int sum=0;

        for(int i=0; i< arr.length; i++){
            if(arr[i]%2==0){
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);
    }
}
