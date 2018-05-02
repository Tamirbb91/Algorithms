package lab2c.prob6;

import java.util.*;

public class Solution {
    private static int counter = 0;

    private HashMap<Integer, Integer> countZerosAndOnes(List<Integer> A){
        HashMap<Integer, Integer> counts = new HashMap<>();
        int totalZeros = countZeros(A, 0, A.size() - 1);
        counts.put(0, totalZeros);
        counts.put(1, A.size() - totalZeros);
        return counts;
    }

    private int countZeros(List<Integer> A, int lower, int upper){
        if(lower > upper) return 0;
        if(lower == upper) return A.size();
        int mid = (lower + upper)/2;
        if(A.get(mid) == 0){
            if(A.get(mid + 1) == 1){
                return mid + 1;
            } else {
                return countZeros(A, mid+1, upper);
            }
        } else {
            if(A.get(mid - 1) == 0){
                return mid;
            } else {
                return countZeros(A, lower, mid-1);
            }
        }
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1));
        System.out.println(new Solution().countZerosAndOnes(list));
    }
}
