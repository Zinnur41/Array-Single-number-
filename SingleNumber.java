package Sandbox;

import java.util.Arrays;

public class SingleNumber {
    static int checkOfNumber(int number){
        for (int i = 2; i < number; i++) {
            if(number % i == 0 || number == 1){
                return 0;
            }
            else return 1;
        }
        return 0;
    }
    static void singleNumber(int[] arr){
       for (int i = 0; i < arr.length; i++){
           if(checkOfNumber(arr[i]) == 1){
               System.out.print(arr[i] + " ");
           }
       }
    }
    public static void main(String[] args) {
           int [] arr = {1,3,5,6,8,9,11,12,13,14,55,987,567,5551,7};
            singleNumber(arr);
    }
}
