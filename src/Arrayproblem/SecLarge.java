package Arrayproblem;

public class SecLarge {
    public static void main(String[] args) {

        int[] arr = {10, 5, 8, 20, 15};

        int max1 = arr[0];
        int max2 = arr[1];

        if (max1 < max2) {
            int temp = max1;
            max1 = max2;
            max2 = temp;
        }

        for (int i = 2; i < arr.length; i++) {

            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];

            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }

        System.out.println("Largest = " + max1);
        System.out.println("Second Largest = " + max2);
    }
}