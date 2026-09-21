package Arrayproblem;

public class ZerosOnes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0, 1, 1, 0};
        int zero = 0;
        int one = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero = zero + 1;
            } else {
                one = one + 1;
            }

        }
        System.out.println("zeros are " + zero);
        System.out.println("One are " + one);
    }
}
