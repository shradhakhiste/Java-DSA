package Arrayproblem;

public class PositiveNegative {
    public static void main(String[] args) {
        int [] arr={1,-3,-4,5,7,-9,7,-4};
        int Pos=0;
        int Nev=0;
        for(int i=0; i<arr.length; i++){

            if(arr[i] > 0){
                Pos=Pos+arr[i];
            }else{
                Nev=Nev+arr[i] ;
            }
        }
        System.out.println("sum of Postive number is = " + Pos);
        System.out.println("Sum of negative number is = " + Nev);
    }
}
