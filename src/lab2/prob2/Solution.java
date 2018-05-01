package lab2.prob2;

import java.util.Arrays;

public class Solution {

    private int[] merge(int[] arr1, int[] arr2){
        int[] arrM = new int[arr1.length + arr2.length];
        int counter1 = 0, counter2 = 0, counterM = 0;
        while(counter1 < arr1.length || counter2 < arr2.length){
            if(counter1 == arr1.length){
                arrM[counterM] = arr2[counter2];
                counter2++;
            } else if(counter2 == arr2.length){
                arrM[counterM] = arr1[counter1];
                counter1++;
            } else if(arr1[counter1] >= arr2[counter2]){
                arrM[counterM] = arr2[counter2];
                counter2++;
            } else if(arr1[counter1] < arr2[counter2]){
                arrM[counterM] = arr1[counter1];
                counter1++;
            }
            counterM++;
        }

        return arrM;
    }

    public static void main(String[] args){
        int[] arr1 = new int[]{1,2,30,48,51,52,63,65,71,82};
        int[] arr2 = new int[]{1,2,3,46,50,51,61,62,71,81,90};
        System.out.println(Arrays.toString(new Solution().merge(arr1, arr2)));
    }
}
