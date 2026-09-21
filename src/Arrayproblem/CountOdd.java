package Arrayproblem;

public class CountOdd {
    public static void main(String[] args) {
        int []arr={10, 5, 8, 3, 12, 7};

        int count=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
