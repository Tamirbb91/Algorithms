package lab3.prob3;

public class Solution {

    private int[] BubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }

    private void swap(int[] A, int pos1, int pos2){
        int temp = A[pos1];
        A[pos1] = A[pos2];
        A[pos2] = temp;
    }

    public static void main(String[] args){
        lab3.prob2.Solution sol = new lab3.prob2.Solution();
        int[] arr = {1,23,446,7,74,423,45,346,45675,68,678,679,4,6456,4,564,56,456,345,34,53,564,56};
        System.out.println(sol.sortArray(arr));
    }
}
