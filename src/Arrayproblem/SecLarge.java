package Arrayproblem;

public class SecLarge {
    public static void main(String[] args) {
        int []arr={10,5,20,8,15};
        int max1=arr[0];
        int max2=arr[1];

        for(int i=2;i<arr.length;i++){
            if(arr[i]>max1){
                int temp=max1;
                max1=arr[i];
                max2=temp;
            }else if( arr[i]>max2){
                max2=arr[i];
            }

        }
        System.out.println(max1);
        System.out.println(max2);



}
}