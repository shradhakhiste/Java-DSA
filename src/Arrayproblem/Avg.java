package Arrayproblem;

public class Avg {
   public static void main(String[] args) {
       int[] arr={1,2,3,4,5};
       int sum=0;

       for(int i:arr){
           sum=sum+i;
       }
       double Average = (double) sum/ arr.length;
       System.out.println("Average " + Average);
    }

}
