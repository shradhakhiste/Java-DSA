package Arrayproblem;

public class PrintExtreme {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};

        int i=0;
        int j=arr.length-1;

        while(i<=j) {
            System.out.println(arr[i]);


            if (i != j) {
                System.out.println(arr[j]);
            }
            i++;
            j--;
        }
    }
}
