package lab3.prob2;

import java.util.Arrays;

public class Solution {

    public int[] sortArray(int[] A){
        int index0 = 0;
        int index2 = A.length-1;
        for(int i=0; i<A.length; i++){
            if(index2 <= i) break;
            if(A[i] == 0){
                swap(A, index0, i);
                index0++;
                if(A[i] == 2){
                    swap(A, index2, i);
                    index2--;
                }
            } else if(A[i] == 2) {
                swap(A, index2, i);
                index2--;
                if(A[i] == 0){
                    swap(A, index0, i);
                    index0++;
                }
            }
        }
        return A;
    }

    private void swap(int[] A, int pos1, int pos2){
        int temp = A[pos1];
        A[pos1] = A[pos2];
        A[pos2] = temp;
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        int[] arr = {2,2,1,1,0,1};
        System.out.println(Arrays.toString(sol.sortArray(arr)));
    }
}
